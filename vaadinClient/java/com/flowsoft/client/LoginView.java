package com.flowsoft.client;

import com.flowsoft.client.MainView;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Panel;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;

public class LoginView extends Panel implements View {

	private static final long serialVersionUID = 1L;
	public static final String NAME = "login";
	public Navigator navigator;

	Button b;
	TextField tf;
	PasswordField pf;

	public LoginView(Navigator n) {
		navigator = n;

		tf = new TextField("Username: ");
		pf = new PasswordField("Password:");
		b = new Button("Login", new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				MainView.setUsername(tf.getValue());
				MainView.setPassword(pf.getValue());
				LoginView.this.navigator.navigateTo(MainView.NAME);

			}
		});

		addComponent(tf);
		addComponent(pf);
		addComponent(b);
	}

	@Override
	public void enter(ViewChangeEvent event) {

	}

}
