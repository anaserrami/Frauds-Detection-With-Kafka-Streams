package com.errami.fraudesdetectionwithkafkastreams;

import com.fasterxml.jackson.annotation.JsonProperty;

class Transaction {
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("amount")
    private double amount;
    @JsonProperty("timestamp")
    private String timestamp;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
