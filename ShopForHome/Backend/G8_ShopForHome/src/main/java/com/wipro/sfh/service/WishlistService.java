package com.wipro.sfh.service;
/*
 * @Author: Ritesh Chandra Shukla

 * 
 * Last Modified Date: 29-08-2022
 * 
 * Description:  ShopForHome Wishlist Service Class
 * 
 * Params : ws 
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.sfh.dao.WishlistDao;
import com.wipro.sfh.entity.Wishlist;
import com.wipro.sfh.repositiry.WishlistRepository;


@Service
public class WishlistService {
	@Autowired
	WishlistRepository wishlistrepository;
	
	@Autowired
	WishlistDao wishlistdao;
	
	public String storeDetails(Wishlist ws) {
		if(wishlistdao.storeDetails(ws)) {
			return "details stored successfully";
		}
		else {
			return "storing unsuccessful";
		}
	}

}
