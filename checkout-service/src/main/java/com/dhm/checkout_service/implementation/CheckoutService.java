package com.dhm.checkout_service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dhm.checkout_service.model.Checkout;
import com.dhm.checkout_service.service.ICheckoutService;
import com.dhm.checkout_service.service.IProductService;

@Service
public class CheckoutService implements ICheckoutService{

    private IProductService productService;

    public CheckoutService(IProductService productService) {
        
        this.productService = productService;
    }

    @Override
    public Checkout buildCheckout(List<String> productIds) {
        Double total=0.0;
        for(String id:productIds){

            Product product = productService.getProduct(id);
            total+=product.getPrice();
        }
        Checkout checkout = new Checkout("234","www.digitalhouse.com/checkout?code=234",total.toString(),List.of("credit"));

        return checkout;
    }

    
}
