package ex2.repository;

import ex2.entity.Account;

import java.util.List;
import java.util.Optional;

public interface AccountRepository {
    int save(Account account);
    Optional<Account> findById(Account id);
    Optional<Account> findByAccoountNo(String accoutnNo);
    List<Optional<Account>> findAll();
}
