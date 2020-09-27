package com.example.demo.consumer;

import java.util.Arrays;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Cart;

@FeignClient(name="CART-SERVICE")
public interface CartConsumer {
	
	@GetMapping("/cart-service/info")
	public String getMsg();
	
	@GetMapping("/cart-service/data")
	public Cart getObj(); 
	
	@GetMapping("/cart-service/list")
	public List<Cart> getObjs();
}
