package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.Entity.Account;
import in.ashokit.Entity.AccountPK;

/**
 * 
 * @author Bhubaneswar Behera @date 05-Jul-2022
 *
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, AccountPK> {

}
