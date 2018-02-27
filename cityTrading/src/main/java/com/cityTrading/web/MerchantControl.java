package com.cityTrading.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cityTrading.domain.Merchant;
import com.cityTrading.service.MerchantService;
import com.cityTrading.util.BaseResult;
import com.cityTrading.util.StatusEnum;

@RequestMapping("/merchant")
@RestController
public class MerchantControl {
	
	@Autowired
	private MerchantService merchantService;

	@RequestMapping("/addMerchant")
	public BaseResult addMerchant(@Validated Merchant merchant) {
		
		merchantService.addMerchant(merchant);
		return new BaseResult(StatusEnum.SUCCESS);
	}
	
	@RequestMapping("/editMerchant")
	public BaseResult editMerchant(Merchant merchant) {
		
		merchantService.editMerchant(merchant);;
		return new BaseResult(StatusEnum.SUCCESS);
	}
	
	@RequestMapping("/getMerchant")
	public BaseResult getMerchant(Long id) {
		
		merchantService.getMerchant(id);
		return new BaseResult(StatusEnum.SUCCESS);
	}
	
	@RequestMapping("/deleteMerchant")
	public BaseResult deleteMerchant(Long id) {
		
		merchantService.deleteMerchant(id);;
		return new BaseResult(StatusEnum.SUCCESS);
	}
	
	@RequestMapping("/getMerchants")
	public BaseResult getMerchants() {
		
		merchantService.getMerchants(null, null, null);
		return new BaseResult(StatusEnum.SUCCESS);
	}
}
