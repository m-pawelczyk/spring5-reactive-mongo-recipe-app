package guru.springframework.repositories.reactive;

import guru.springframework.domain.Recipe;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 07.05.2020
 * created RecipeReactiveRepository in guru.springframework.repositories.reactive
 * in project spring5-reactive-mongo-recipe-app
 */
public interface RecipeReactiveRepository extends ReactiveMongoRepository<Recipe, String> {
}