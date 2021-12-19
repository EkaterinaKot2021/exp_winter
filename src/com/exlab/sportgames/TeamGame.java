package com.exlab.sportgames;

public class TeamGame extends Game {
    private String name = "TeamGame";
    private String category = "Junior";

    public TeamGame() {
    }

    public TeamGame(String name) {
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