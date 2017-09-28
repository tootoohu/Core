package springdata;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
//import org.hibernate.annotations.GenericGenerator;
/**
 * Created by HL on 17/9/20.
 */
@Entity
@Table(name="spring_Customer")
public class Customer {

    @Id
    @GeneratedValue(generator="uuidGenerator")
   @GenericGenerator(name="uuidGenerator", strategy="uuid")
    @Column(length=40)
    private String id;

    @Column(length = 40)
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
