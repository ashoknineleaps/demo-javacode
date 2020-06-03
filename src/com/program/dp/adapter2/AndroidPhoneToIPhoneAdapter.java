package com.program.dp.adapter2;

public class AndroidPhoneToIPhoneAdapter implements IPhone
{
	private AndroidPhone androidPhone;
	
	public AndroidPhoneToIPhoneAdapter(AndroidPhone androidPhone) {
		this.androidPhone = androidPhone;
	}
	@Override
	public void charge() {
		androidPhone.charge();
	}
}
