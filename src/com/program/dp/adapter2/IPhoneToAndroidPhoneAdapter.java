package com.program.dp.adapter2;

public class IPhoneToAndroidPhoneAdapter implements AndroidPhone {

	private IPhone iPhone;
	
	public IPhoneToAndroidPhoneAdapter(IPhone iPhone) {
		this.iPhone = iPhone;
	}
	
	@Override
	public void charge() {
		iPhone.charge();
	}

}
