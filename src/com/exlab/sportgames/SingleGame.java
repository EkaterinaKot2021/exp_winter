package com.exlab.sportgames;

public class SingleGame extends Game {
    private String name = "SingleGame";
    private String category = "Adult";


    public SingleGame() {
    }
    public SingleGame(String name) {
            this.name = name;

    }
    public String getName() {
        return this.name;
    }

    public void setCategory(String type) {
        this.category = category;
    }

    public String getCategory() {
        return this.category;

    }



}

