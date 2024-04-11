package com.example.e_comm;

public class item {
    String Name;
    String Description;
    String price;
    int Image;

    public item(String name, String description, String price, int image) {
        Name = name;
        Description = description;
        this.price = price;
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}
