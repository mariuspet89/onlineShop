package com.sda.onlineshop;

public class Product {
    private int id;
    private String name;
    private String provider;
    private double price;
    private int quantity;
    private String description;
    private String image;
    private String story;

    public Product() {
    }

    public Product(int id, String name, String provider, double price, int quantity, String description, String image, String story) {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
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
