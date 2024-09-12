package com.crud.crud.models;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;


public class ProductValidation {
    @NotEmpty(message = "Name cannot be empty")
    private String name;

    @NotEmpty(message = "Brand cannot be empty")
    private String brand;

    @NotEmpty(message = "Category cannot be empty")
    private String category;

    @Min(0)
    private int quantity;

    @NotEmpty(message = "Price cannot be empty")
    private double price;

    @Size(min = 10, message = "Description must be at least 10 characters long")
    @Size(max = 2000, message = "Description must be at most 100 characters long")
    private String description;

    private MultipartFile imageFileName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MultipartFile getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(MultipartFile imageFileName) {
        this.imageFileName = imageFileName;
    }
    

}
