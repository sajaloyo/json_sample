package com.org.webapp.repo;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.org.webapp.entity.TransactionEntity;

@Repository
public interface TransactionRepo extends JpaRepository<TransactionEntity, UUID> {
  TransactionEntity findOne(UUID id);
}
