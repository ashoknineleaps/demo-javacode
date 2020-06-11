package com.program.dp.decorator;

public class SportyDress extends DressDecorator {

	public SportyDress(Dress dress) {
		super(dress);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding Casual Dress Features");
	}
}

