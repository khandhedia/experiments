package com.nc.polymorhpism;

public class DBLayerDemo {

    public static void main(String[] args) {

        DBLayer dbLayer = new DBLayer();

        DBLayer dbLayerArugment = new DBLayer("amazon.com", 3306);

        dbLayerArugment.executeQuery("select query");
        dbLayerArugment.executeQuery("update query");

    }
}
