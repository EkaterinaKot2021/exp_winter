package com.exlab.sportgames;

public abstract class Game {
    private String type = "indoors";

    public Game() {

    }
    public Game(String type) {
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType(){
        return this.type;

    }
    public abstract void winning();

}



//    public int teamNum = 2;
//    public String country = "Belarus";
//
  //  public void setTeamNum(int teamNumValue) {
    //    this.teamNum = teamNumValue;
//    }
//
 //       public int getTeamNum() {
 //           return this.teamNum;
//        }
//
 //   public void setCountry(String countryValue){
//        this.country = countryValue;
 //       }
//
//       public String getCountry() {
 //           return this.country;
//    }

 //    }


