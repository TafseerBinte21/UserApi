package com.tafa.userapi.Repository;

import org.springframework.data.repository.CrudRepository;
import com.tafa.userapi.Entity.User;

public interface UseRepository extends CrudRepository<User, Long> {
}
