package com.company;

public class ProductId<T> {
    // T stands for "Type"
    private T t;

    public ProductId(T t) {
        this.t = t;
    }

    public void set(T t) { this.t = t; }
    public T get() { return t; }
}
