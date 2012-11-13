package com.flowsoft.client;

import com.flowsoft.controller.MyFirstController;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;

//@Theme("hello-theme")
public class WandaVaadinClient extends UI {

	private static final long serialVersionUID = 1L;
	Navigator navigator;

	@Override
	public void init(VaadinRequest request) {

		MyFirstController controller = new MyFirstController();
		Navigator navigator = new Navigator(this, getContent());
		navigator.addView(IntroView.NAME, new IntroView());
		navigator.addView(CountView.NAME, CountView.class);
		navigator.addView(MainView.NAME, MainView.class);
		navigator.addView(LoginView.NAME, new LoginView(navigator));
		navigator.addView(UserListView.NAME, new UserListView(controller));
		navigator.addView(CreateUserView.NAME, new CreateUserView(controller));
		navigator.navigate();

	}
}
