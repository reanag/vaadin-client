package com.flowsoft.controller;

import java.io.File;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import com.flowsoft.wanda.UserDetailsService;
import com.flowsoft.wanda.UserDetailsServiceImplService;
import com.flowsoft.wanda.WandaUser;

public class MyFirstController implements Serializable {

	private static final long serialVersionUID = 1L;
	private UserDetailsService uds;
	private static final QName SERVICE_NAME = new QName(
			"http://wanda.flowsoft.com/", "UserDetailsServiceImplService");

	public MyFirstController() {

	}

	public void initService() {
		String wsdlName = "http://localhost:8081/WandaWebapp/userDetailsService?wsdl";
		URL wsdlURL = UserDetailsServiceImplService.WSDL_LOCATION;
		File wsdlFile = new File(wsdlName);
		try {
			if (wsdlFile.exists()) {
				wsdlURL = wsdlFile.toURI().toURL();
			} else {
				wsdlURL = new URL(wsdlName);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		UserDetailsServiceImplService ss = new UserDetailsServiceImplService(
				wsdlURL, SERVICE_NAME);
		uds = ss.getUserDetailsServiceImplPort();

	}

	public List<WandaUser> findAllUser() {
		if (uds == null) {
			initService();
		}
		return uds.findAllUser();
	}

	public void createUser(String fn, String ln, String un, String p) {
		if (uds == null) {
			initService();
		}
		uds.createUser(fn, ln, un, p);
	}

}
