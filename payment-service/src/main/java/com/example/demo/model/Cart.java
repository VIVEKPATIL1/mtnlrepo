package com.example.demo.model;

public class Cart {

	private Integer cardId;
	private String cartName;
	private Double cartFinalCost;

	public Cart() {
		super();
	}

	public Cart(Integer cardId, String cartName, Double cartFinalCost) {
		super();
		this.cardId = cardId;
		this.cartName = cartName;
		this.cartFinalCost = cartFinalCost;
	}

	public Integer getCardId() {
		return cardId;
	}

	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}

	public String getCartName() {
		return cartName;
	}

	public void setCartName(String cartName) {
		this.cartName = cartName;
	}

	public Double getCartFinalCost() {
		return cartFinalCost;
	}

	public void setCartFinalCost(Double cartFinalCost) {
		this.cartFinalCost = cartFinalCost;
	}

	@Override
	public String toString() {
		return "Cart [cardId=" + cardId + ", cartName=" + cartName + ", cartFinalCost=" + cartFinalCost + "]";
	}

}
