package org.springframework.samples.jpetstore.services;

import org.springframework.samples.jpetstore.dao.AccountDao;
import org.springframework.samples.jpetstore.dao.ItemDao;

public class PetStoreServiceImpl {

	private AccountDao accountDao;
	private ItemDao    itemDao;
	
	public PetStoreServiceImpl(ItemDao itemDao) {
		this.itemDao = itemDao;
	}
	public void  petTest(){
		System.out.println("this is ioc test service");
	}
	/**
	 * 通过set方法注入
	 * 用法：
	 * 1. 该PetStoreServiceImpl类需要提供accountDao的set方法
	 * 2.需要在xml文件中配置
	 * <bean name="petStore" class="org.springframework.samples.jpetstore.services.PetStoreServiceImpl">
	 *      <property name="accountDao" ref="accountDao"></property>
	 *  </bean>
	 */
	public void petToAccountDao(){
		accountDao.test();
	}
	/**
	 * 通过带参构造器注入
	 * 1. 该PetStoreServiceImpl类需要提供带参数itemDao的构造器
	 * 2.需要在xml文件中配置
	 * <bean name="petStore" class="org.springframework.samples.jpetstore.services.PetStoreServiceImpl">
	 *      <constructor-arg ref="itemDao"></constructor-arg>
	 *  </bean>
	 */
	public void petToItemDao(){
		itemDao.test();
	}
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
}
