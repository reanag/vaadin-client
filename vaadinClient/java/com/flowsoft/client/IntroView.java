package com.flowsoft.client;

import com.flowsoft.client.CountView;
import com.flowsoft.client.LoginView;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Link;
import com.vaadin.ui.Panel;

public class IntroView extends Panel implements View {

	public static final String NAME = "";

	public IntroView() {

		Link lnk = new Link("Login",
				new ExternalResource("#!" + LoginView.NAME));
		Link lnk2 = new Link("Count", new ExternalResource("#!"
				+ CountView.NAME));
		addComponent(lnk);
		addComponent(lnk2);

	}

	public void enter(ViewChangeEvent event) {

	}
}