//package ex2.repository;
//
//import ex2.entity.Account;
//
//import java.util.List;
//import java.util.Optional;
//
//public class AccountRepositoryImpl implements AccountRepository {
//
//    @Override
//    public Account save(Account account) {
//
//        findById(account.getId()).ifPresentOrElse(
//                foundAccount -> foundAccount.update(account),
//                () -> {
//                    account.setId(++autoincrementId);
//                    accountList.add(account);
//                });
//        return account;
//    }
//
//    @Override
//    public Optional<Account> findById(int id) {
//        return accountList.stream().filter(account -> account.getId() == id).findFirtst();
//    }
//
//
//    @Override
//    public Optional<Account> findByAccoountNo(String accoutnNo) {
//        return accountList.stream().filter(account -> account.getAccountNo().equals(accountNo)).findFirtst();
//    }
//
//    @Override
//    public List<Optional<Account>> findAll() {
//        return  accountList.stream().map(account -> Oprional.of(account)).toList;
//    }
//}
