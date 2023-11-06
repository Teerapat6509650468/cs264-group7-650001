package th.ac.tu.cs.services.repository;

import th.ac.tu.cs.services.model.Person;

public interface PersonRepository {
    Person findByFirstName(String fName) ;
    int save(Person person);
}
