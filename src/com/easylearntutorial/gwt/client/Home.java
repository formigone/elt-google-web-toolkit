package com.easylearntutorial.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.gwt.user.client.ui.RootPanel;

public class Home implements EntryPoint {

	public void onModuleLoad() {

		MenuBar menu = new MenuBar();
		Command cmd = new Command(){

			@Override
			public void execute() {
				Window.alert("Click'd");
			}
		};
		
		MenuBar menuFile = new MenuBar(true /* Vertical */);
		
		menuFile.addItem(new MenuItem("New", cmd));
		menuFile.addItem(new MenuItem("Open File", cmd));
		menuFile.addItem(new MenuItem("Close", cmd));
		
		menu.addItem("File", menuFile);
		menu.addItem(new MenuItem("Edit", cmd));
		menu.addItem(new MenuItem("Refactor", cmd));
		
		RootPanel.get().add(menu);
	}
}
