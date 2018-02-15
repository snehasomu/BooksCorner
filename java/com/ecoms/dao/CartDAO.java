package com.ecoms.dao;

import java.util.List;

import com.ecoms.model.Cart;



public interface CartDAO {
	public boolean addCart(Cart cart);
	public boolean deleteCart(Cart cart);
	public void saveOrUpdate(Cart Cart);
	public Cart getCart(int cartId);
	public Cart getCartId(int citemid);
	public List<Cart> retriveCart(String username);

}
