package com.lakecjl;

/**
 * Created by Craig on 1/7/2016.
 */
public class Player {

    private int playerNumber;
    private String playerName;
    private int playerPoints;
    private boolean isOut;


    public Player() {
        playerPoints = 0;
        isOut = false;
    }

    /**
     * Create a new player
     *
     * @param name set the players name
     */
    public Player(String name) {
        playerPoints = 0;
        isOut = false;
        playerName = name;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerPoints() {
        return playerPoints;
    }

    public void setPlayerPoints(int playerPoints) {
        this.playerPoints = playerPoints;
    }

    public boolean isOut() {
        return isOut;
    }

    public void setIsOut(boolean isOut) {
        this.isOut = isOut;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerNumber=" + playerNumber +
                ", playerName='" + playerName + '\'' +
                ", playerPoints=" + playerPoints +
                ", isOut=" + isOut +
                '}';
    }
}
