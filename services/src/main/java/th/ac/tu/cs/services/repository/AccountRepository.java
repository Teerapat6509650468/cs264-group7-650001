package th.ac.tu.cs.services.repository;

import th.ac.tu.cs.services.model.Account;

public interface AccountRepository {
    Account findAccount(Account acc) ;
    Account findAccount(String userName, String password) ;
}
