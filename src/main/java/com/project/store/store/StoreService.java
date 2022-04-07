package com.project.store.store;

import com.project.store.controller.dto.StoreDto;
import com.project.store.repository.document.Store;

import java.util.Optional;

public interface StoreService
{
    Store create (Store store);
    Store findById(String id);
    Store update (Store store, StoreDto storeDto);
    boolean delete (String id);
}
