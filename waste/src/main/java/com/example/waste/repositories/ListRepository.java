package com.example.waste.repositories;

import com.example.waste.entities.GroceryList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListRepository extends CrudRepository<GroceryList, Integer> {


}

