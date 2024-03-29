package com.flowsoft.client;

import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;

//@Theme("hello-theme")
public class WandaVaadinClient extends UI {

	private static final long serialVersionUID = 1L;
	Navigator navigator;

	@Override
	public void init(VaadinRequest request) {

		Navigator navigator = new Navigator(this, getContent());
		navigator.addView(IntroView.NAME, new IntroView());
		navigator.addView(CountView.NAME, CountView.class);
		navigator.addView(MainView.NAME, MainView.class);
		navigator.addView(LoginView.NAME, new LoginView(navigator));
		navigator.navigate();

	}
}
