package com.project.store.store;

import com.project.store.controller.dto.StoreDto;
import com.project.store.repository.StoreRepositoryMongo;
import com.project.store.repository.document.Store;
import org.springframework.stereotype.Service;

@Service
public class StoreServiceMongoDb implements StoreService
{
    private final StoreRepositoryMongo storeRepositoryMongo;

    public StoreServiceMongoDb(StoreRepositoryMongo storeRepositoryMongo) {
        this.storeRepositoryMongo = storeRepositoryMongo;
    }


    @Override
    public Store create(Store store) {
        return storeRepositoryMongo.save(store);
    }

    @Override
    public Store findById(String id) {
        return null;
    }

    @Override
    public Store update(Store store, StoreDto storeDto) {
        return null;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }
}
