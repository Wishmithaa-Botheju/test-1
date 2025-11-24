package lk.zerocode.bank_rest_api.controller.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountDepositRequest {

    private int accountId;
    private Double amount;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

//    JsonProperty("bcjd")
}
