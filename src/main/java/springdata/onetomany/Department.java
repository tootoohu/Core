package springdata.onetomany;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "spring_department")
public class Department {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    @OneToMany(mappedBy = "department", cascade = CascadeType.REFRESH)
    private Set<Employee> employees = new HashSet<Employee>();

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

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
