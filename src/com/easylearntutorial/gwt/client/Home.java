package com.easylearntutorial.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class Home implements EntryPoint {

	private LittleForm form = new LittleForm();

	public void onModuleLoad() {
		RootPanel.get().add(form);
	}
}
