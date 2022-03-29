package com.mnb.testing.common;

public class StubServerMain {

    public static Stubs stubs = new Stubs();

    public static void main(String[] args) {
        stubs.setUp()
            .stubForAddProduct("AddProductRequest.json","AddProductResponse.json")
            .stubForPutProduct("PutProductRequest.json","PutProductResponse.json")
            .stubForDeleteProduct()
            .status();
    }
}