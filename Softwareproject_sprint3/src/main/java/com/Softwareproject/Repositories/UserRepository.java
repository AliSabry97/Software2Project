package com.Softwareproject.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.Softwareproject.User.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	 
}
