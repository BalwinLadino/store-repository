package com.project.store.controller.dto;

public class StoreDto
{
    private String id ;
    private String name;
    private long price;

    public StoreDto() {
    }

    public StoreDto(String id, String name, long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }



    public String getName() {
        return name;
    }



    public long getPrice() {
        return price;
    }


}


