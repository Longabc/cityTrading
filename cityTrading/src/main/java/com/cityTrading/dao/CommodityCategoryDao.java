package com.cityTrading.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cityTrading.domain.CommodityCategory;

public interface CommodityCategoryDao extends JpaRepository<CommodityCategory, Long>{

}
