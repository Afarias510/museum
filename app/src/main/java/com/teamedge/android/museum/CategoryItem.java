package com.teamedge.android.museum;

public class CategoryItem {

    String text;
    int  image;

    public CategoryItem(String text, int image) {
        this.text = text;
        this.image = image;

    }

    public String getText() {
        return text;
    }

    public int getImage() {
        return image;
    }
}

