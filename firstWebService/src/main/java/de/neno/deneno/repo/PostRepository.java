package de.neno.deneno.repo;

import de.neno.deneno.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
