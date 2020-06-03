package com.program.dp.adapter2;

public class ChargerAdapterTest {

	public static void main(String[] args)
	{
		AndroidCharger androidCharger = new AndroidCharger();
		AndroidPhone androidPhone = new OnePlus5();
		androidCharger.charger(androidPhone);
		
		IPhoneCharger iPhoneCharger = new IPhoneCharger();
		IPhone iPhone = new IPhoneX();
		iPhoneCharger.charge(iPhone);
		System.out.println();
		AndroidPhoneToIPhoneAdapter androidPhoneToIPhoneAdapter = new AndroidPhoneToIPhoneAdapter(androidPhone);
		androidPhoneToIPhoneAdapter.charge();
		
		IPhoneToAndroidPhoneAdapter iPhoneToAndroidPhoneAdapter = new IPhoneToAndroidPhoneAdapter(iPhone);
		iPhoneToAndroidPhoneAdapter.charge();
	}
}
