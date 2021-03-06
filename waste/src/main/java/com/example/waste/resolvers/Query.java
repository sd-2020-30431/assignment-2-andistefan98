package com.example.waste.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.waste.entities.GroceryList;
import com.example.waste.entities.Item;
//import com.example.waste.services.ItemService;
import com.example.waste.entities.User;
import com.example.waste.repositories.ItemRepository;
import com.example.waste.repositories.ListRepository;
import com.example.waste.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class Query implements GraphQLQueryResolver {

    private final ItemRepository itemRepository;
    private final ListRepository listRepository;
    private final UserRepository userRepository;


    public Iterable<Item> allItems(String userId) {
        Iterable<GroceryList> lists = listRepository.findAll();
        List<GroceryList> reqLists = new ArrayList<>();
        Iterable<Item> allItems = itemRepository.findAll();
        List<Item> reqItems = new ArrayList<>();

        for(GroceryList lst : lists){
            int idd = lst.getUser_id();
            if( Integer.parseInt(userId) - idd == 0 ){
                reqLists.add(lst);
            }
        }

        for(Item itm : allItems){

            int itmList = itm.getList();
            for(GroceryList lst : reqLists){
                if(itmList - lst.getList_id() == 0){
                     reqItems.add(itm);
                }
            }
        }

        return reqItems;

    }

    public Iterable<GroceryList> allLists() {
        return listRepository.findAll();
    }

    Item findItemById(int itemId ){
        return itemRepository.findById(itemId).get();
    }

    GroceryList findListById(int listId ){
        return listRepository.findById(listId).get();
    }


    User findUserById(int id){
        return userRepository.findById(id).get();
    }


    Iterable<User> allUsers(){
        return userRepository.findAll();
    }





}