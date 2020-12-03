package com.anon.last30dayspayments.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class Payment {
    private Date date;
    private BigDecimal amount;
    private BigInteger accountId;

    public Payment(Date date, BigDecimal amount, BigInteger accountId) {
        this.date = date;
        this.amount = amount;
        this.accountId = accountId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigInteger getAccountId() {
        return accountId;
    }

    public void setAccountId(BigInteger accountId) {
        this.accountId = accountId;
    }
}
