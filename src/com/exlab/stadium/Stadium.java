package com.exlab.stadium;

import com.exlab.sportgames.Basketball;
import com.exlab.sportgames.SingleGame;
import com.exlab.sportgames.TeamGame;

import java.util.ArrayList;
import java.util.List;

public class Stadium implements IChampionship{
    private IChampionship game;
    private String name;
    private List<Basketball> listBasketball;
    private List<SingleGame> listSingleGame;
    private List<TeamGame> listTeamGame;



    public Stadium() {
        listBasketball = new ArrayList<Basketball>();
        listSingleGame = new ArrayList<SingleGame>();
        listTeamGame = new ArrayList<TeamGame>();

    }

    public Stadium(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }


    public void setGame(IChampionship game) {
        this.game = game;
    }


    public IChampionship getGame() {
        return this.game;
    }


    @Override
    public String printInfoChampionship() {
        return this.name;
    }


    public void setBasketball(Basketball basketball){
        this.listBasketball.add(basketball);
    }
    public List<Basketball>getListBasketball(){
        return this.listBasketball;
    }


    public void setSingleGame(SingleGame singleGame){
        this.listSingleGame.add(singleGame);
    }
    public List<SingleGame>getListSingleGame(){
        return this.listSingleGame;
    }


    public void setTeamGame(TeamGame teamGame){
        this.listTeamGame.add(teamGame);
    }
    public List<TeamGame>getListTeamGame(){
        return this.listTeamGame;
    }


    public void printListNameSingleGame() {
        for(SingleGame singleGame : this.getListSingleGame()) {
            System.out.println(singleGame.getName());
        }
    }
    public void printListNameTeamGame() {
        for(TeamGame teamGame : this.getListTeamGame()) {
            System.out.println(teamGame.getName());
        }
    }
}
