package it.mirea.repo;

import org.springframework.data.repository.CrudRepository;

import it.mirea.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
