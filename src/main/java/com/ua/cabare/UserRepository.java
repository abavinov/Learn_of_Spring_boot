package com.ua.cabare;

import org.springframework.data.repository.CrudRepository;

import com.ua.cabare.User;

public interface UserRepository extends CrudRepository<User, Long> {

}