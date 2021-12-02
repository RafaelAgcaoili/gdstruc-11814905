//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.gdsturc.module4;

import java.util.Objects;

public class Player {
    private int playerId;
    private String userName;
    private int level;

    public Player(int playerId, String userName, int level) {
        this.playerId = playerId;
        this.userName = userName;
        this.level = level;
    }

    public int getPlayerId() {
        return this.playerId;
    }

    public Player setPlayerId(int playerId) {
        this.playerId = playerId;
        return this;
    }

    public String getUserName() {
        return this.userName;
    }

    public Player setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public int getLevel() {
        return this.level;
    }

    public Player setLevel(int level) {
        this.level = level;
        return this;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Player player = (Player)o;
            return this.playerId == player.playerId && this.level == player.level && Objects.equals(this.userName, player.userName);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.playerId, this.userName, this.level});
    }

    public String toString() {
        return "Player{playerId=" + this.playerId + ", userName='" + this.userName + "', level=" + this.level + "}";
    }
}
