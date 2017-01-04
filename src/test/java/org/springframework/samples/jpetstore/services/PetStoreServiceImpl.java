package org.springframework.samples.jpetstore.services;

import org.springframework.samples.jpetstore.dao.AccountDao;
import org.springframework.samples.jpetstore.dao.ItemDao;

public class PetStoreServiceImpl {

	private AccountDao accountDao;//set方法注入
	private ItemDao    itemDao;//构造器注入
	private int year;//构造函数中添加默认值（通过构造函数注入）
	private int count;
	private String samename;
	
	public PetStoreServiceImpl(int year,int count,String samename,ItemDao itemDao) {
		this.itemDao = itemDao;
		this.year=year;
		this.count=count;
		this.samename=samename;
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
	/**
	 * 通过带参构造器注入
	 * 1. 该PetStoreServiceImpl类需要提供带参数int year的构造器
	 * 2.需要在xml文件中配置
	 * <bean name="petStore" class="org.springframework.samples.jpetstore.services.PetStoreServiceImpl">
	 *      <constructor-arg type="int" value="2017"></constructor-arg>
	 *  </bean>
	 */
	public void getYear(){
		System.out.println("year="+year);
	}
	/**
	 * 通过带参构造器注入
	 * 1. 该PetStoreServiceImpl类需要提供带参数int year的构造器
	 * 2.需要在xml文件中配置
	 * <bean name="petStore" class="org.springframework.samples.jpetstore.services.PetStoreServiceImpl">
	 *      <constructor-arg index="1" value="2"></constructor-arg>
	 *  </bean>
	 */
	public void getCount(){
		System.out.println("count="+count);
	}
	/**
	 * 通过带参构造器注入
	 * 1. 该PetStoreServiceImpl类需要提供带参数int year的构造器
	 * 2.需要在xml文件中配置
	 * <bean name="petStore" class="org.springframework.samples.jpetstore.services.PetStoreServiceImpl">
	 *      <!--推荐采用此种方法注入-->
	 *      <constructor-arg name="samename" value="为了防止构造函数中有两个一样类型的参数，采用name进行区分"></constructor-arg>
	 *  </bean>
	 */
	public void getSamename(){
		System.out.println("samename="+samename);
	}
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
}
