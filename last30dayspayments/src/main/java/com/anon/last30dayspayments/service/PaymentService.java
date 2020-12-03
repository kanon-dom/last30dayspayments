package com.anon.last30dayspayments.service;

import com.anon.last30dayspayments.model.Payment;

import java.math.BigInteger;
import java.util.List;

public interface PaymentService {
    List<Payment> last30daysPayment(BigInteger accountId);

}
