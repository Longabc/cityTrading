package com.cityTrading.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cityTrading.domain.Commodity;

public interface CommodityDao extends JpaRepository<Commodity, Long>{

}
