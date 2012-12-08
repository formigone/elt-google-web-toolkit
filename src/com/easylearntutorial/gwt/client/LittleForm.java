package com.easylearntutorial.gwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class LittleForm extends Composite {

	private static LittleFormUiBinder uiBinder = GWT
			.create(LittleFormUiBinder.class);

	interface LittleFormUiBinder extends UiBinder<Widget, LittleForm> {
	}

	public LittleForm() {
		initWidget(uiBinder.createAndBindUi(this));
	}
}
