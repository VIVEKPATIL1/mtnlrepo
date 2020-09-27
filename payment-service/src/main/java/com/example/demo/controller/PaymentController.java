package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.consumer.CartConsumer;
import com.example.demo.model.Cart;

@RestController
@RequestMapping("/payment-service")
public class PaymentController {
	
	@Autowired
	private CartConsumer feignClient;
	
	@GetMapping("/get-msg")
	public String getMsg() {
		return feignClient.getMsg();
	}
	
	@GetMapping("/get-cart")
	public Cart getRow() {
		return feignClient.getObj();
	}
	
	@GetMapping("/get-carts")
	public List<Cart> getRows(){
		return feignClient.getObjs();
	}
}
