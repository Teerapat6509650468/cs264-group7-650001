package th.ac.tu.cs.services.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import th.ac.tu.cs.services.model.Account;

public class JdbcAccountRepository implements AccountRepository {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Account findAccount(Account acc) {
        return null;
    }

    @Override
    public Account findAccount(String userName, String password) {
        try {
            Account acc =
                    jdbcTemplate.queryForObject("SELECT * FROM tbl_accounts WHERE userName=?  AND password=? ",
                            BeanPropertyRowMapper.newInstance(Account.class), userName, password);

            return acc;
        } catch (IncorrectResultSizeDataAccessException e) {
            return null;
        }

    }
}
