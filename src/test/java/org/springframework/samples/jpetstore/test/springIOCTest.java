package org.springframework.samples.jpetstore.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.samples.jpetstore.services.PetStoreServiceImpl;
/**
 * spring IOC��DI������
 * @author lijun
 *
 */
public class springIOCTest {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"services.xml","daos.xml"});
		PetStoreServiceImpl services = context.getBean("petStoreAlias1",PetStoreServiceImpl.class);
		services.petToAccountDao();//����set����ע��
		services.petToItemDao();//���Թ�����ע��
		services.getYear();//�����ڹ��캯�������Ĭ��ֵ
		services.getCount();//�����ڹ��캯�������Ĭ��ֵ����������
		services.getSamename();
		
	}

}
