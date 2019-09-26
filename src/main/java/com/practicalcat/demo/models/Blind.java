package com.practicalcat.demo.models;

public class Blind {
    private int blindDateId;
    private String reason;

    public Blind(int blindDateId, String reason) {
        this.blindDateId = blindDateId;
        this.reason = reason;
    }

    public int getblindDateId() {
        return blindDateId;
    }

    public void setblindDateId(int blindDateIdId) {
        this.blindDateId = blindDateId;
    }

    public String getreason() {
        return reason;
    }

    public void setFirstName(String reason) {
        this.reason = reason;
    }
}
