package springdata.onetomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public abstract class AbstractBaseService<T, ID extends Serializable> implements BaseService<T, ID>{

    @Autowired
    private BaseRepository<T, ID> repository;

    protected Class<T> entityClass;

    public AbstractBaseService(){
        Class clazz = getClass();
        Type type = clazz.getGenericSuperclass();
        if(type instanceof ParameterizedType){
            ParameterizedType parameterizedType = (ParameterizedType) type;
            entityClass = (Class<T>) parameterizedType.getActualTypeArguments()[0];
        }
    }

    @Override
    @Transactional
    public T save(T t) {
        return repository.save(t);
    }

    @Override
    @Transactional
    public T saveAndPlush(T t) {
        return repository.saveAndFlush(t);
    }

    @Override
    @Transactional
    public List<T> save(Iterable<T> entities) {
        return repository.save(entities);
    }

    @Override
    @Transactional
    public void delete(T t) {
        repository.delete(t);
    }

    @Override
    @Transactional
    public void delete(ID id) {
        repository.delete(id);
    }

    @Override
    @Transactional
    public void deleteAll() {
        repository.deleteAll();
    }
}
