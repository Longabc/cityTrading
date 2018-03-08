package com.cityTrading.service.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.cityTrading.dao.CommodityCategoryDao;
import com.cityTrading.domain.CommodityCategory;
import com.cityTrading.service.CommodityCategoryService;

@Service
public class CommodityCategoryServiceImpl implements CommodityCategoryService{

	@Autowired
	private CommodityCategoryDao dao;
	
	public static List<CommodityCategory> categoryLevelsList = new ArrayList<CommodityCategory>();
	
	@Override
	public List<CommodityCategory> query(Long parentId, 
			Integer page, Integer size) {
		if (null == page) {
			page = 0;
		}
		int index = page * size;
		if (null == parentId) {
			List<CommodityCategory> listPage = dao.findCategorysPage(index,size);
			return listPage;
		}
		List<CommodityCategory> listPage = dao.findCategorysPageByParentId(parentId,index,size);
		return listPage;
	}
	
	@Override
	public List<CommodityCategory> queryAll(Long parentId, String title) {
		List<CommodityCategory> list = dao.findCommodityCategoryByParentIdAndTitle(parentId,title);
		return list;
	}

	@Override
	public List<CommodityCategory> queryCategoryByLevels(Long parentId , String  character , int level){
		
		List<CommodityCategory> list = dao.findCommodityCategoryByParentId(parentId);
		if (!list.isEmpty() && list.size() > 0) {
			for (CommodityCategory category : list) {
				if (parentId != 0L) {
					category.setTitle(character + category.getTitle());
				}
				categoryLevelsList.add(category);
				queryCategoryByLevels(category.getId(), character+character, level + 1);
			}
		}
		return categoryLevelsList;
	}

	@Override
	public boolean deleteCategory(Long id) {
		dao.delete(id);
		return true;
	}

	@Override
	public boolean saveCategory(CommodityCategory commodityCategory) {
		Long parentId = commodityCategory.getParentId();
		if (parentId != null) {
			CommodityCategory parentCategory = dao.findOne(parentId);
			String parentName = parentCategory.getParentName();
			commodityCategory.setParentName(parentName);
		}
		dao.save(commodityCategory);
		return true;
		
	}
	
}
