package com.anon.last30dayspayments.controller;

import com.anon.last30dayspayments.model.Payment;
import com.anon.last30dayspayments.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping(value= "/payments")
public class PaymentsController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping(value= "/last30days")
    @ResponseStatus(HttpStatus.OK)
    List<Payment> last30DaysPayments(@RequestParam(name="accountId") BigInteger accountId){
        return paymentService.last30daysPayment(accountId);
    }
}
