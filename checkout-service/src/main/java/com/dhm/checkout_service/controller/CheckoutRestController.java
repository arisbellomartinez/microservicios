package com.dhm.checkout_service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dhm.checkout_service.service.ICheckoutService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value = "/checkout")
public class CheckoutRestController {
    private ICheckoutService checkoutService;

    public CheckoutRestController(ICheckoutService checkoutService) {
        super();
        this.checkoutService = checkoutService;
    }

    @GetMapping()
    public String getCheckout(@RequestParam List<String> productIds) {
        return checkoutService.buildCheckout(productIds);
    }
    
}
