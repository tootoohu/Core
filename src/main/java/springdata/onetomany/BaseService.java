package springdata.onetomany;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

public interface BaseService<T, ID extends Serializable> {

    public T save(T t);

    public T saveAndPlush(T t);

    public List<T> save(Iterable<T> entities);

    public void delete(T t);

    public void delete(ID id);

    public void deleteAll();
}
