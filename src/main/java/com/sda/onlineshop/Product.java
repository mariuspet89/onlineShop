package com.sda.onlineshop;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Product {


    @Id
    @GeneratedValue
    private int id;
    @Column
    private String name;
    @Column
    private String provider;
    @Column
    private Double price;
    @Column
    private Integer quantity;
    @Column
    private String description;
    @Column
    private String image;
    @Column
    private String story;


    public Product() {
    }



    public Product(int id, String name, String provider, Double price, Integer quantity, String description, String image, String story) {
        this.id = id;
        this.name = name;
        this.provider = provider;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.image = image;
        this.story = story;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }



}
