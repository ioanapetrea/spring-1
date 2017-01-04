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
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
}
