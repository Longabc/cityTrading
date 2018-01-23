package com.cityTrading.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cityTrading.domain.Merchant;

public interface MerchantDao extends JpaRepository<Merchant, Long>{

}
