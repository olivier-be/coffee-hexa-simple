package org.formation.coffee.adapter.out.persistence;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CoffeeJpaRepository extends JpaRepository<CoffeeJpaEntity, Long> {

    @EntityGraph(attributePaths = "reviews")
    Optional<CoffeeJpaEntity> findWithReviewsById(Long id);

    @EntityGraph(attributePaths = "reviews")
    Optional<CoffeeJpaEntity> findAllbyOrderByIdAsc();
}