package com.cityTrading.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cityTrading.dao.MerchantDao;
import com.cityTrading.domain.Merchant;
import com.mysql.fabric.xmlrpc.base.Data;

@Service
public class MerchantService {

	@Autowired
	private MerchantDao merchantDao;
	
	public void addMerchant(Merchant merchant) {
		merchant.setCreateTime(new Date());
		merchant.setUpdateTime(new Date());
		merchantDao.save(merchant);
	}
	
	public void editMerchant(Merchant merchant) {
		merchant.setUpdateTime(new Date());
		merchantDao.save(merchant);
	}
	
	public Merchant getMerchant(Long id) {
		return merchantDao.findOne(id);
	}
	
	public void deleteMerchant(Long id) {
		Merchant merchant = getMerchant(id);
		if (null != merchant) {
			merchantDao.delete(id);
		}
	}
	
	/**
	 * 分页查询
	 * @param username
	 * @param fullname
	 * @param phone
	 * @return
	 */
	public List<Merchant> getMerchants(String username,String fullname,String phone) {
		
		return null;
		
	}
}
