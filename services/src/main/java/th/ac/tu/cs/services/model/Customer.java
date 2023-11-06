package th.ac.tu.cs.services.model;
public class Customer {
    private long id ;
    private String email ;
    private String name ;

    public Customer(long id, String email, String name) {
        this.id = id;
        this.email = email;
        this.name = name;
    }

    public Customer(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
