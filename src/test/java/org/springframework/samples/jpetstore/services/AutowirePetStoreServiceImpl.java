package org.springframework.samples.jpetstore.services;

import org.springframework.samples.jpetstore.dao.AccountDao;
/**
 * autowire 自动装配测试类
 * 用法：autowire标签有四种形式no,byName,byType,constructor
 * xml配置：    <bean id="autowirePetStore" class="org.springframework.samples.jpetstore.services.AutowirePetStoreServiceImpl" autowire="byType"></bean>
 * @author lijun
 *
 */
public class AutowirePetStoreServiceImpl {

	private AccountDao accountDao;//set方法注入
	public void petToAccountDao(){
		accountDao.test();
	}
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
}
