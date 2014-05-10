package com.github.jntakpe.sp.repository;

import com.github.jntakpe.sp.domain.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Resource exposant l'entité {@link com.github.jntakpe.sp.domain.Task}
 *
 * @author jntakpe
 */
@RepositoryRestResource(collectionResourceRel = "task", path = "task")
public interface TaskRepository extends CrudRepository<Task, Integer> {

}
