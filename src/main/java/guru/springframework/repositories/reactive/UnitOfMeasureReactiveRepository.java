package guru.springframework.repositories.reactive;

import guru.springframework.domain.UnitOfMeasure;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 07.05.2020
 * created UnitOfMeasureReactiveRepository in guru.springframework.repositories.reactive
 * in project spring5-reactive-mongo-recipe-app
 */
public interface UnitOfMeasureReactiveRepository extends ReactiveMongoRepository<UnitOfMeasure, String> {

    Mono<UnitOfMeasure> findByDescription(String description);
}
