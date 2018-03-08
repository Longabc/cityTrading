package com.cityTrading.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.cityTrading.domain.CommodityCategory;

/**
 * 商品分类
 * @author Administrator
 *
 */
public interface CommodityCategoryService {

	/**
	 * 分页查询 商品分类
	 * @param parentId 为null代表查全部
	 * @param page
	 * @param size
	 * @return
	 */
	List<CommodityCategory> query(Long parentId, Integer page, Integer size);

	/**
	 * 查询 商品分类
	 * @param parentId
	 * @param title
	 * @return
	 */
	List<CommodityCategory> queryAll(Long parentId, String title);
	
	/**
	 * 查询 该分类下的的所有子孙分类
	 * @param parentId
	 * @param character
	 * @param level
	 * @return
	 */
	List<CommodityCategory> queryCategoryByLevels(Long parentId , String  character , int level);

	/**
	 * 删除分类
	 * @param id
	 * @return
	 */
	boolean deleteCategory(Long id);

	/**
	 * 修改或保存 分类 
	 * @param commodityCategory
	 * @return
	 */
	boolean saveCategory(CommodityCategory commodityCategory);
	
	
}
