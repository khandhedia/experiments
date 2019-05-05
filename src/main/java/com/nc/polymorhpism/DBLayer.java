package com.nc.polymorhpism;

public class DBLayer {

    private String hostname;
    private int port;

    public DBLayer() {

    }

    public DBLayer(String hostname, int port) {
        //left = right
        //class level variable = method input variable
        //this points to class level variable
        this.hostname = hostname;
        this.port = port;

        System.out.println("DB Connection established: hostname: " + hostname + " port: " + port);
    }



    public void executeQuery(String query) {
        System.out.println(query + "is running on " + hostname + ":" + port);
    }
}
