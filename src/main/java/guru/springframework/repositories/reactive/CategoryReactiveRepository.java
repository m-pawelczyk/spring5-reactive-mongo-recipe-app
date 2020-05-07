package guru.springframework.repositories.reactive;

import guru.springframework.domain.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 07.05.2020
 * created CategoryReactiveRepository in guru.springframework.repositories.reactive
 * in project spring5-reactive-mongo-recipe-app
 */
public interface CategoryReactiveRepository extends ReactiveMongoRepository<Category, String> {

    Mono<Category> findByDescription(String description);
}
