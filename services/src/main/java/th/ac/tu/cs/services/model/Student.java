package th.ac.tu.cs.services.model;

public class Student {
    private Long id ;
    private String description ;
    private String name ;

    public Student(Long id, String description, String name) {
        this.id = id;
        this.description = description;
        this.name = name;
    }

    public Student(String description, String name) {
        this.description = description;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
