package com.ecoms.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ecoms.dao.CartDAO;
import com.ecoms.dao.ProductDAO;
import com.ecoms.dao.RegisterDAO;
import com.ecoms.model.Cart;
import com.ecoms.model.Product;
import com.ecoms.model.Register;




@Controller
public class CartController {

	@Autowired
	CartDAO cartDAO;
	
	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	RegisterDAO registerDAO;
	
	
	
	
	
	@RequestMapping(value="AddCart/{productId}",method=RequestMethod.GET)
	public String addCart(@PathVariable("productId")int productId,HttpSession session,Model m)
	{
	
		
		
		Product cart1=productDAO.getProduct(productId);
		System.out.println(cart1);
		Cart cart = new Cart();
		
		cart.setProductId(cart1.getProductId());
		cart.setProductUnitPrice(cart1.getUnitPrice());
		cart.setProductName(cart1.getProductName());
	
		//cart.setProductQuantity(1);
		String username=(String)session.getAttribute("Username");
		//Register r=registerDAO.getRegisterBy((String) session.getAttribute("username"));
		//cart.setUserName(r.getUsername());
		cart.setUserName(username);
	

		cartDAO.addCart(cart);
		
		
		return "redirect:/cart";
	}
	
	
	
	
	
	
	
	
	@RequestMapping(value="deleteCart/{citemid}",method=RequestMethod.GET)
	public String deleteCart(@PathVariable("citemid")int  citemid,Model m,HttpSession session)
	{
		Cart cart=cartDAO.getCartId(citemid);
		System.out.println(cart);
		
		
		cartDAO.deleteCart(cart);
		String username=(String)session.getAttribute("Username");
		List<Cart> listCart=cartDAO.retriveCart(username);
		m.addAttribute("cartList",listCart);
		
		Cart cart1=new Cart();
		m.addAttribute(cart1);
		
		return "redirect:/cart";
	}
	
	
	
	@RequestMapping("/cart")
	public String Showcart(Model m,HttpSession session)
	{
		Cart cart=new Cart();
		m.addAttribute(cart);
		String username=(String)session.getAttribute("Username");
		List<Cart> listCart=cartDAO.retriveCart(username);
		m.addAttribute("cartList",listCart);
		return "cart";
	}
	
	
}


