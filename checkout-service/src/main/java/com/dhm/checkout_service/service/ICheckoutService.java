package com.dhm.checkout_service.service;

import java.util.List;

import com.dhm.checkout_service.model.Checkout;

public interface ICheckoutService {
    public Checkout buildCheckout(List<String> productIds)
}
