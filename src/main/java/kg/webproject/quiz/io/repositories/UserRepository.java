package kg.webproject.quiz.io.repositories;

// import org.springframework.stereotype.Repository;

import kg.webproject.quiz.io.entities.UserEntity;

import org.springframework.data.repository.CrudRepository;

// @Repository
public interface UserRepository extends CrudRepository<UserEntity,Long>{
    // UserEntity findByID(long id);
    // UserEntity findByUsername(String username);
}
