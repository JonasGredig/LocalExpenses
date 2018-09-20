package ch.jonasgredig.localexpenses.model;

import java.util.ArrayList;
import java.util.Date;

public class Payment {

    public Payment(int id, int userid, float amount, Date date, String category, String opponent, ArrayList<String> tags, boolean isDeleted) {
        this.id = id;
        this.userid = userid;
        this.amount = amount;
        this.date = date;
        this.category = category;
        this.opponent = opponent;
        this.tags = tags;
        this.isDeleted = isDeleted;
    }

    public Payment(int userid, float amount, Date date, String category, String opponent, ArrayList<String> tags, boolean isDeleted) {
        this.userid = userid;
        this.amount = amount;
        this.date = date;
        this.category = category;
        this.opponent = opponent;
        this.tags = tags;
        this.isDeleted = isDeleted;
    }

    private int id;
    private int userid;
    private float amount;
    private Date date;
    private String category;
    private String opponent;
    private ArrayList<String> tags;

    private boolean isDeleted;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getOpponent() {
        return opponent;
    }

    public void setOpponent(String opponent) {
        this.opponent = opponent;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
