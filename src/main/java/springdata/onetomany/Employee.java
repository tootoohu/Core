package springdata.onetomany;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "spring_employee")
public class Employee {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private String password;

    private Department department;
    //one to many: a manager can manage many departments
    @OneToMany(mappedBy = "manager", cascade = CascadeType.REFRESH)
    private Set<Department> departments = new HashSet();

    public Employee(String name, String password){
        this.name = name;
        this.password = password;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
