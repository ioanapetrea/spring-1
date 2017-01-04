package org.springframework.samples.jpetstore.services;

import org.springframework.samples.jpetstore.dao.AccountDao;
import org.springframework.samples.jpetstore.dao.ItemDao;

public class PetStoreServiceImpl {

	private AccountDao accountDao;//set����ע��
	private ItemDao    itemDao;//������ע��
	private int year;//���캯�������Ĭ��ֵ��ͨ�����캯��ע�룩
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
	 * ͨ��set����ע��
	 * �÷���
	 * 1. ��PetStoreServiceImpl����Ҫ�ṩaccountDao��set����
	 * 2.��Ҫ��xml�ļ�������
	 * <bean name="petStore" class="org.springframework.samples.jpetstore.services.PetStoreServiceImpl">
	 *      <property name="accountDao" ref="accountDao"></property>
	 *  </bean>
	 */
	public void petToAccountDao(){
		accountDao.test();
	}
	/**
	 * ͨ�����ι�����ע��
	 * 1. ��PetStoreServiceImpl����Ҫ�ṩ������itemDao�Ĺ�����
	 * 2.��Ҫ��xml�ļ�������
	 * <bean name="petStore" class="org.springframework.samples.jpetstore.services.PetStoreServiceImpl">
	 *      <constructor-arg ref="itemDao"></constructor-arg>
	 *  </bean>
	 */
	public void petToItemDao(){
		itemDao.test();
	}
	/**
	 * ͨ�����ι�����ע��
	 * 1. ��PetStoreServiceImpl����Ҫ�ṩ������int year�Ĺ�����
	 * 2.��Ҫ��xml�ļ�������
	 * <bean name="petStore" class="org.springframework.samples.jpetstore.services.PetStoreServiceImpl">
	 *      <constructor-arg type="int" value="2017"></constructor-arg>
	 *  </bean>
	 */
	public void getYear(){
		System.out.println("year="+year);
	}
	/**
	 * ͨ�����ι�����ע��
	 * 1. ��PetStoreServiceImpl����Ҫ�ṩ������int year�Ĺ�����
	 * 2.��Ҫ��xml�ļ�������
	 * <bean name="petStore" class="org.springframework.samples.jpetstore.services.PetStoreServiceImpl">
	 *      <constructor-arg index="1" value="2"></constructor-arg>
	 *  </bean>
	 */
	public void getCount(){
		System.out.println("count="+count);
	}
	/**
	 * ͨ�����ι�����ע��
	 * 1. ��PetStoreServiceImpl����Ҫ�ṩ������int year�Ĺ�����
	 * 2.��Ҫ��xml�ļ�������
	 * <bean name="petStore" class="org.springframework.samples.jpetstore.services.PetStoreServiceImpl">
	 *      <!--�Ƽ����ô��ַ���ע��-->
	 *      <constructor-arg name="samename" value="Ϊ�˷�ֹ���캯����������һ�����͵Ĳ���������name��������"></constructor-arg>
	 *  </bean>
	 */
	public void getSamename(){
		System.out.println("samename="+samename);
	}
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
}
