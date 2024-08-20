package com.vtech.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vtech.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

}