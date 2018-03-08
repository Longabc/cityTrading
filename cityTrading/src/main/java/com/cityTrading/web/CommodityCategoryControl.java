package com.cityTrading.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.support.DaoSupport;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cityTrading.domain.CommodityCategory;
import com.cityTrading.service.CommodityCategoryService;
import com.cityTrading.util.BaseResult;
import com.cityTrading.util.StatusEnum;

/**
 * 商品分类控制器
 * 
 * @author Administrator
 *
 */
@RequestMapping("/manager/commodityCategory")
@Controller
public class CommodityCategoryControl {

	@Autowired
	private CommodityCategoryService service;

	@Value("${manager.pageSize}")
	private int defaultPageSize;

	@RequestMapping("")
	public String showPage(Model model) {

		List<CommodityCategory> query = service.query(null, 0, defaultPageSize);
		model.addAttribute("list", query);
		// TODO 出现懒加载问题
		List<CommodityCategory> categories = service.queryCategoryByLevels(0L,
				"-", 0);
		model.addAttribute("categoryList", categories);
		return "manager/commodityCategory";
	}

	/**
	 * 查询
	 * 
	 * @param parentId
	 *            商品分类的父类
	 * @param title
	 *            商品分类的模糊名字
	 * @param page
	 *            开始页
	 * @param pageSize
	 *            一页展示的数据量
	 * @return
	 */
	@RequestMapping("/query")
	@ResponseBody
	public BaseResult<CommodityCategory> query(Long parentId, 
			@RequestParam(defaultValue = "0") Integer page,
			Integer pageSize ) {
		if (null == pageSize) {
			pageSize = defaultPageSize;
		}
		List categories = service.query(parentId, 
				page, pageSize);
		BaseResult<CommodityCategory> result = new BaseResult<CommodityCategory>();
		result.setData(categories);
		return result;
	}

	/**
	 * 删除分类
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public boolean deleteCategory(Long id) {
		return service.deleteCategory(id);
	}

	/**
	 * 修改 保存分类
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/save")
	@ResponseBody
	public boolean saveCategory(CommodityCategory commodityCategory) {
		return service.saveCategory(commodityCategory);
	}
}
