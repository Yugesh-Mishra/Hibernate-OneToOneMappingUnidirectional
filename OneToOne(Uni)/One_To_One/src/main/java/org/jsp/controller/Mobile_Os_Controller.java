package org.jsp.controller;

import java.util.List;

import org.jsp.dao.Mobile_Os_Dao;
import org.jsp.dto.Mobile;
import org.jsp.dto.Os;

public class Mobile_Os_Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mobile = new Mobile();
		mobile.setColor("white");
		mobile.setName("Apple");
		mobile.setId(101);
		mobile.setPrice(65000);
		
		Os os=new Os();
		os.setBit("126");
		os.setId(15);
		os.setName("window");
		
		mobile.setOs(os);
		
		Mobile_Os_Dao dao=new Mobile_Os_Dao();
	//	dao.saveMobile(mobile);
	//	dao.saveOs(os);
	//	dao.updateMobile(mobile);
		dao.findMobile(101);
	//	dao.fetchAllMobile(mobile);
	//	dao.deleteMobile(101);
	//	List<Mobile>m=dao.fetchAllMobile();
	//	System.out.println(m);

	}

}
