package com.kexin.classify.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kexin.classify.dao.ClassifyDao;

/**
 * 对dao层的方法进行调用，Controller类实列化本类
 * 
 * @author caokexin
 *
 */
@Service(value = "classifyService")
public class ClassifyServiceImpl implements ClassifyService {
	// 声明变量 为变量赋值
	@Autowired
	private ClassifyDao classifyDao;

	/**
	 * 查询商品的分类 （添加，修改商品使用）
	 * 
	 * @return 查询商品的分类，返回商品分类的信息（添加，修改商品使用）
	 * @throws Exception
	 *             抛出异常
	 */
	public List<Map> selectClassify() throws Exception {
		return classifyDao.selectClassify();
	}

	/**
	 * 查询商品分类
	 * 
	 * @return 查询商品的分类信息，返回商品的分类信息表
	 * @throws Exception
	 *             抛出异常
	 */
	public List<Map> findClassify() throws Exception {
		return classifyDao.findClassify();
	}

	/**
	 * 添加商品分类
	 * 
	 * @param category
	 *            分类类别
	 * @param categoryId
	 *            分类ID
	 * @return 添加商品分类，返回商品分类ID和商品分类
	 * @throws Exception
	 *             抛出异常
	 */
	public String addClassify(String category, String categoryId) throws Exception {
		classifyDao.addClassify(category, categoryId);
		return "添加";
	}

	/**
	 * 根据ID查询商品分类（修改商品信息使用）
	 * 
	 * @param categoryid
	 *            商品的ID
	 * @return 根据ID查询商品分类，返回分类的信息
	 * @throws Exception
	 *             抛出异常
	 */
	public List<Map> getClassifybyId(String categoryid) throws Exception {
		return classifyDao.getClassifybyId(categoryid);
	}

	/**
	 * 修改商品的分类
	 * 
	 * @param category
	 *            商品类别
	 * @param categoryId
	 *            商品ID
	 * @return 修改商品的分类，返回修改商品分类的信息
	 * @throws Exception
	 *             抛出异常
	 */
	public String updateClassify(String category, String categoryId) throws Exception {
		classifyDao.updateClassify(category, categoryId);
		return "修改";
	}

	/**
	 * 根据分类ID删除商品分类
	 * 
	 * @param categoryId
	 *            商品分类ID
	 * @return 根据分类ID删除商品分类，返回删除商品分类的信息
	 * @throws Exception
	 *             抛出异常
	 */
	public String deleteClassify(String categoryId) throws Exception {
		classifyDao.deleteClassify(categoryId);
		return "删除";
	}
}
