package com.crud.crud.services;

import com.crud.crud.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
//ProductRepository will help us read and write that is to add, update, delete, view from the product table.

/*
Explanations
ProductRepository: An interface extending JpaRepository, which provides CRUD operations for the Product entity.
JpaRepository is a Spring Data JPA interface that simplifies database interactions.

    Generics:
        Product: The type of the entity to manage.
        Integer: The type of the entity's primary key.*/
