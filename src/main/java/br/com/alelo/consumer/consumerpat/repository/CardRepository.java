package br.com.alelo.consumer.consumerpat.repository;

import br.com.alelo.consumer.consumerpat.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;
import java.util.Optional;

public interface CardRepository extends JpaRepository<Card, Long> {

    public Optional<Card> findByNumber(BigInteger number);
}
