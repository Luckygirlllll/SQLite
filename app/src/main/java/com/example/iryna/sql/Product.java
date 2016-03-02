package com.example.iryna.sql;

/**
 * Created by Iryna on 29.02.2016.
 */
//Each row in the database can be represented by an object
//Columns will represent the objects properties
public class Product {

    private int _id;
    private String _productname;

    public Product(){
    }

    public Product(String productname){
        this._productname = productname;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_productname(String _productname) {
        this._productname = _productname;
    }

    public int get_id() {
        return _id;
    }

    public String get_productname() {
        return _productname;
    }

}