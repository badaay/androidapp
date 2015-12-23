package com.example.pc01.myapplication3;

/**
 * Created by PC01 on 18/12/2015.
 */
public  class FeedItem {

    private String mName;
    private int mThumbnail;
    private int mPrice;

    public int getPrice(){ return mPrice; }

    public void setPrice(int price){ this.mPrice = price; }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public int getThumbnail() {
        return mThumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.mThumbnail = thumbnail;
    }
}