package io.javabrains.utils;

public class CricketScorer {
    private int score;

    public void four(){
        score=score+4;
    }
    public int six(){
        score=score+6;
        return score;
    }
    public int getScore(){

        return score;
    }
}
