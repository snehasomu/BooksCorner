package com.ecoms.dao;


import java.util.List;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecoms.model.Cart;
import com.ecoms.model.Product;





@Repository("cartDAO")
public class CartDAOImpl implements CartDAO {

	
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public boolean addCart(Cart cart) {
		 
		try
		{
			Session session=sessionFactory.openSession();
			Transaction trans=session.beginTransaction();
			session.persist(cart);
			trans.commit();
			session.flush();
			session.close();
				
			
			
return true;
		}
		catch(Exception e)
		{
		 return false;
		}
	}
	
	@Transactional
	public void saveOrUpdate(Cart cart) {
	 
		try
		{
			Session session=sessionFactory.openSession();
			Transaction trans=session.beginTransaction();
			session.saveOrUpdate(cart);
			trans.commit();
			session.flush();
			session.close();
			
			 
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
			
		}
	 
	}
	

	@Transactional
	public boolean deleteCart(Cart cart) {
		 
		try
		{
			Session session=sessionFactory.openSession();
			Transaction trans=session.beginTransaction();
			session.delete(cart);
			trans.commit();
			session.flush();
			session.close();
			return false;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
			return false;
		}
	}

	public Cart getCart(int cartId) {
		
		Session session=sessionFactory.openSession();
		Cart cart=(Cart)session.get(Cart.class,cartId);
		session.close();
		return cart;
	}

	public List<Cart> retriveCart(String username) {
	 
		Session session=sessionFactory.openSession();
		@SuppressWarnings("rawtypes")
		org.hibernate.Query query=session.createQuery("from Cart where username=:username");
		query.setParameter("username",username);
		@SuppressWarnings("unchecked")
		List<Cart> listCart=query.list();
		return listCart;
	}
	public Cart getCartId(int citemid) {
		Session session=sessionFactory.openSession();	
		Transaction tx=session.beginTransaction();
		Cart p = (Cart) session.load(Cart.class, new Integer(citemid));
		System.out.println("===================> p =" +p);
		tx.commit();
		session.close();
		return p;
	}

}
