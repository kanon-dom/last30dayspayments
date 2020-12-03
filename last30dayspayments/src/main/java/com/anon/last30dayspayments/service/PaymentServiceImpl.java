package com.anon.last30dayspayments.service;

import com.anon.last30dayspayments.model.Payment;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService{
    @Override
    @ResponseStatus(HttpStatus.OK)
    public List<Payment> last30daysPayment(BigInteger accountId) {
        List<Payment> payments = new ArrayList<Payment>();
        Payment payment = new Payment(new Date(), new BigDecimal(10), accountId);
        payments.add(payment);
        return payments;
    }
}
