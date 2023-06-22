package com.example.appmarvel;

public class Comic {
    private int id;
    private String title;
    private String description;
    private String imageUrl;
    // Adicione outros atributos relevantes dos quadrinhos, como autores, preço, etc.

    public Comic(int id, String title, String description, String imageUrl) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    // Adicione getters e setters para os outros atributos

    @Override
    public String toString() {
        return title;
    }

}