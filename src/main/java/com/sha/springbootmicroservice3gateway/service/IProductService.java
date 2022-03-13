package com.sha.springbootmicroservice3gateway.service;

import com.google.gson.JsonElement;

import java.util.List;

public interface IProductService {

    JsonElement svaeProduct(JsonElement requestBody);

    void deleteProduct(Long productId);

    List<JsonElement> getAllProducts();
}
