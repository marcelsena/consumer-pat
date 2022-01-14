package br.com.alelo.consumer.consumerpat.respository;

import br.com.alelo.consumer.consumerpat.model.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsumerRepository extends JpaRepository<Consumer, Long> {

}
