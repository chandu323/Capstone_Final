package com.wipro.sfh.service;
/*
 * @Author:Guru Chandrasekhar

 * 
 * Last Modified Date:29-08-2022
 * 
 * Description:  ShopForHome Myorders Service Class
 *  
 *  Params : ord
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.sfh.dao.MyordersDao;
import com.wipro.sfh.entity.Myorders;
import com.wipro.sfh.repositiry.MyordersRepository;


@Service
public class MyordersService {
	@Autowired
	MyordersDao dao;
	
	@Autowired
	MyordersRepository repo;
	
	public String storemyOrderDetails(Myorders ord){
		if(dao.Storemyorrdetails(ord)) {
			return "order details stored successfully";
		}else {
			return "order didn't store";
		}
		
	}
	public List<Myorders> getAllmyOrdersDetails(){
		return repo.findAll();
	}

}
