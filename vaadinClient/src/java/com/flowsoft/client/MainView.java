package com.flowsoft.client;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;

public class MainView extends Panel implements View {

	private static final long serialVersionUID = 1L;
	public static final String NAME = "main";
	private static String username, password;

	public MainView() {
		addComponent(new Label("Username: " + username));
		addComponent(new Label("Password: " + password));
	}

	public MainView(String a, String b) {
		addComponent(new Label("Username: " + username));
		addComponent(new Label("Password: " + password));
	}

	public static void setUsername(String s) {
		username = s;
	}

	public static void setPassword(String s) {
		password = s;
	}

	public void enter(ViewChangeEvent event) {

	}

}
