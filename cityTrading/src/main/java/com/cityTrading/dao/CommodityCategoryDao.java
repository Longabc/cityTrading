package com.cityTrading.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cityTrading.domain.CommodityCategory;

public interface CommodityCategoryDao extends
		JpaRepository<CommodityCategory, Long> {

	List<CommodityCategory> findCommodityCategoryByParentIdAndTitle(
			Long parentId, String title);

	List<CommodityCategory> findCommodityCategoryByParentId(Long parentId);

	@Query(value = "select * from commodity_category where parent_id = ?1 order by id desc limit ?2 , ?3 ",nativeQuery=true)
	List<CommodityCategory> findCategorysPageByParentId(Long parentId,
			 int index, Integer size);
	
	@Query(value = "select * from commodity_category order by id desc limit ?1 , ?2 ",nativeQuery=true)
	List<CommodityCategory> findCategorysPage( int index, Integer size);
	
}
