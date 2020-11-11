package com.example.workoutapp.area.Client.model;

public class Product {
    private long id;
    private long categoryId;
    private String name;
    private float costOfGoodSold;
    private float salePrice;
    private String imgUrl;
    private String Descriptionl;
    private int quantiy;

    public Product() {
    }

    public Product(long categoryId, String name, float costOfGoodSold, float salePrice, String imgUrl, String descriptionl, int quantiy) {
        this.categoryId = categoryId;
        this.name = name;
        this.costOfGoodSold = costOfGoodSold;
        this.salePrice = salePrice;
        this.imgUrl = imgUrl;
        Descriptionl = descriptionl;
        this.quantiy = quantiy;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCostOfGoodSold() {
        return costOfGoodSold;
    }

    public void setCostOfGoodSold(float costOfGoodSold) {
        this.costOfGoodSold = costOfGoodSold;
    }

    public float getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(float salePrice) {
        this.salePrice = salePrice;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDescriptionl() {
        return Descriptionl;
    }

    public void setDescriptionl(String descriptionl) {
        Descriptionl = descriptionl;
    }

    public int getQuantiy() {
        return quantiy;
    }

    public void setQuantiy(int quantiy) {
        this.quantiy = quantiy;
    }
}
