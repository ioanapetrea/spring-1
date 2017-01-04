package org.springframework.samples.jpetstore.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.samples.jpetstore.services.PetStoreServiceImpl;
/**
 * spring IOC和DI测试类
 * @author lijun
 *
 */
public class springIOCTest {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"services.xml","daos.xml"});
		PetStoreServiceImpl services = context.getBean("petStoreAlias1",PetStoreServiceImpl.class);
		services.petToAccountDao();//测试set方法注入
		services.petToItemDao();//测试构造器注入
		services.getYear();//测试在构造函数中添加默认值
		services.getCount();//测试在构造函数中添加默认值（方法二）
		services.getSamename();
		
	}

}
