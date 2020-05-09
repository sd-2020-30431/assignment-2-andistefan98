package com.example.waste.repositories;

import com.example.waste.entities.Item;
import com.example.waste.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
