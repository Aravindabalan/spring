package com.ragavan.inheritex;

public class MainTest {
	public static void main(String a[]){
		DeveloperBean dBean = ServiceFactory.getDomain();
		ManagerBean dBean1 = ServiceFactory.getmanagerDept();
	System.out.println("EmployeeId	:"+dBean.getEmployeeId());
	System.out.println("EmployeeName:"+dBean.getEmployeeName());
	System.out.println("DeveloperDomain	:"+dBean.getDomain());
	System.out.println("ManagerDept	:"+dBean1.getmanagerDept());
		
	}

}
