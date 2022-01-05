package com.exlab.sportgames;

public abstract class SingleGame extends Game {
    private String name = "Default";
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
    @Override
    public void winning() {

    }


}

