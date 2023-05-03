package org.sid.bankaccountservice.repositories;

import org.sid.bankaccountservice.entities.AccountOperation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountOperationRepository extends JpaRepository<AccountOperation,Long> {
}
