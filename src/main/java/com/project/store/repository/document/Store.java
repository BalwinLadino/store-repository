package com.project.store.repository.document;

import com.project.store.controller.dto.StoreDto;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Store
{
    @Id
    private String id ;
    private String name;
    private long price;

    public Store() {
    }

    public Store(String id, String name, long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Store(StoreDto storeDto)
    {
        this(null, storeDto.getName(), storeDto.getPrice());
    }


    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
