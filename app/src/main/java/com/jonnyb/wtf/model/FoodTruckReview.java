package com.jonnyb.wtf.model;

/**
 * Created by jonnyb on 11/21/16.
 */

public class FoodTruckReview {

    private String id = "";
    private String title = "";
    private String text = "";

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public FoodTruckReview(String id, String title, String text) {
        this.id = id;
        this.title = title;
        this.text = text;
    }
}
