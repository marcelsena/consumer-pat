package br.com.alelo.consumer.consumerpat.respository;

import br.com.alelo.consumer.consumerpat.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExtractRepository extends JpaRepository<Transaction, Long> {
}
