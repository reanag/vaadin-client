package com.flowsoft.client;

import java.util.List;

import com.flowsoft.controller.MyFirstController;
import com.flowsoft.wanda.WandaUser;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Link;
import com.vaadin.ui.Panel;
import com.vaadin.ui.Table;

public class UserListView extends Panel implements View {

	private static final long serialVersionUID = 1L;
	public static final String NAME = "userList";

	public UserListView(MyFirstController c) {
		List<WandaUser> w = c.findAllUser();
		Table table = new Table("Users from database:");
		table.addContainerProperty("Username", String.class, null);
		table.addContainerProperty("First Name", String.class, null);
		table.addContainerProperty("Last Name", String.class, null);
		table.addContainerProperty("Created:", String.class, null);
		table.setSizeFull();

		for (WandaUser u : w) {

			table.addItem(new String[] { u.getUsername().toString(),
					u.getFirstName().toString(), u.getLastName().toString(),
					u.getCreatedTS().toString() }, u.getUsername());
		}
		addComponent(table);
		Link lnk2 = new Link("Back",
				new ExternalResource("#!" + IntroView.NAME));
		addComponent(lnk2);

	}

	@Override
	public void enter(ViewChangeEvent event) {

	}

}
