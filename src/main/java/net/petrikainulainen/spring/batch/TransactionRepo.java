package net.petrikainulainen.spring.batch;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface TransactionRepo extends CrudRepository<TransactionDTO,Integer> {
}
