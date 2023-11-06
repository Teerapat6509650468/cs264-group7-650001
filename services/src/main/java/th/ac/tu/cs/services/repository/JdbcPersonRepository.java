package th.ac.tu.cs.services.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import th.ac.tu.cs.services.model.Person;
@Repository
public class JdbcPersonRepository implements PersonRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Person findByFirstName(String fName) {
        try {
            Person p = jdbcTemplate.queryForObject("select * from Persons where FirstName = ? ;",
                    BeanPropertyRowMapper.newInstance(Person.class), fName);
            return p;
        }catch(IncorrectResultSizeDataAccessException e){ //- if the query does not return exactly one row
            return null ;
        }
    }

    @Override
    public int save(Person person) {
        return jdbcTemplate.update("INSERT INTO Persons (PersonID, LastName, FirstName, Address, City)\n" +
                "VALUES (?,?,?,?,?);",
            new Object[] {person.getPersonID(), person.getLastName() , person.getFirstName() ,
                    person.getAddress(), person.getCity()
            });
    }


}
