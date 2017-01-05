package org.springframework.samples.jpetstore.services;

import org.springframework.samples.jpetstore.dao.AccountDao;
/**
 * autowire �Զ�װ�������
 * �÷���autowire��ǩ��������ʽno,byName,byType,constructor
 * xml���ã�    <bean id="autowirePetStore" class="org.springframework.samples.jpetstore.services.AutowirePetStoreServiceImpl" autowire="byType"></bean>
 * @author lijun
 *
 */
public class AutowirePetStoreServiceImpl {

	private AccountDao accountDao;//set����ע��
	public void petToAccountDao(){
		accountDao.test();
	}
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
}
