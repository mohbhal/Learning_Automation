package com.collectionExample.qa;

public class Hosting {
	private int Id;
    private String name;
    private long websites;

    public Hosting(int id, String name, long websites) {
        Id = id;
        this.name = name;
        this.websites = websites;
    }
    public int getId() {
        return this.Id;
    }
    public  String getName() {
    	return this.name;
    }
    public long getWebsite() {
    	return this.websites;
    }
}
