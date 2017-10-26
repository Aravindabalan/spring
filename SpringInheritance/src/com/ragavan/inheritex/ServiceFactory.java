package com.ragavan.inheritex;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


public class ServiceFactory {
	public static  BeanFactory factory=new XmlBeanFactory(new ClassPathResource("spconfig.xml"));

	//private static String SERVICE="subClassOne";
	private static String SERVICE="DeveloperClass";
	private static String SERVICE1="ManagerClass";

	public static DeveloperBean getDomain(){
		return (DeveloperBean)factory.getBean(ServiceFactory.SERVICE);
	}
	public static ManagerBean getmanagerDept(){
		return (ManagerBean)factory.getBean(ServiceFactory.SERVICE1);
	}
	
}

