package com.example.waste.repositories;


import java.util.List;

import com.example.waste.entities.Item;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ItemRepository extends CrudRepository<Item, Integer>{


}
