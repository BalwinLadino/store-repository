package com.project.store.repository;

import com.project.store.repository.document.Store;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface StoreRepositoryMongo extends MongoRepository<Store, String>

{


}
