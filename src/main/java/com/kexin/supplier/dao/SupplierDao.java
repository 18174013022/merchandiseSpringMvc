package com.kexin.supplier.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

/**
 * 定义接口 实现供货商方法的规范
 * 
 * @author caokexin
 *
 */
@MapperScan
public interface SupplierDao {

	/**
	 * 查询供货商的信息
	 * 
	 * @return 返回供货商信息列表
	 * @throws Exception
	 *             抛出异常
	 */
	public List<Map> findSupplier() throws Exception;

	/**
	 * 根据ID查询供货商的信息
	 * 
	 * @return 返回修改供货商信息列表
	 * @throws Exception
	 *             抛出异常
	 */
	public List<Map> getSupplierbyId(@Param("supplierID") String supplierID) throws Exception;

	/**
	 * 修改供货商信息
	 * 
	 * @param supplierID
	 *            供货商ID
	 * @param supplierName
	 *            供货商姓名
	 * @param supplierAddress
	 *            供货商地址
	 * @param supplierPhone
	 *            供货商电话
	 * @return 返回修改供货商信息
	 * @throws Exception
	 *             抛出异常
	 */
	public void updateSupplier(@Param("supplierID") String supplierID, @Param("supplierName") String supplierName,
			@Param("supplierAddress") String supplierAddress, @Param("supplierPhone") String supplierPhone)
			throws Exception;

	/**
	 * 添加供货商信息
	 * 
	 * @param supplierID
	 *            供货商ID
	 * @param supplierName
	 *            供货商姓名
	 * @param supplierAddress
	 *            供货商地址
	 * @param supplierPhone
	 *            供货商电话
	 * @return 返回添加供货商信息
	 * @throws Exception
	 *             抛出异常
	 */
	public void addSupplier(@Param("supplierID") String supplierID, @Param("supplierName") String supplierName,
			@Param("supplierAddress") String supplierAddress, @Param("supplierPhone") String supplierPhone)
			throws Exception;

	/**
	 * 删除供货商信息
	 * 
	 * @param supplierID
	 *            供货商ID
	 * @return 返回删除信息
	 * @throws Exception
	 *             抛出异常
	 */
	public void deleteSupplier(@Param("supplierID") String supplierID) throws Exception;
}
