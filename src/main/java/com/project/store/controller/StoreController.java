package com.project.store.controller;

import com.project.store.controller.dto.StoreDto;
import com.project.store.repository.document.Store;
import com.project.store.store.StoreServiceMongoDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
@RequestMapping("/store")
public class StoreController
{
    private final StoreServiceMongoDb storeServiceMongoDb;

    public StoreController(@Autowired StoreServiceMongoDb storeServiceMongoDb) {
        this.storeServiceMongoDb = storeServiceMongoDb;
    }

    @PostMapping
    public Store create (@RequestBody StoreDto storeDto)
    {
        return storeServiceMongoDb.create(new Store(storeDto));
    }

    @GetMapping
    public Store findById (@PathVariable String id)
    {
        Optional<Store> optionalStore = Optional.ofNullable(storeServiceMongoDb.findById(id));
        if(optionalStore.isPresent())
        return optionalStore.get();
        else
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Product with id: " +id+ " not found!"
            );
    }




















}