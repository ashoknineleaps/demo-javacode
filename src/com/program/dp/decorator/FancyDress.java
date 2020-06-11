package com.program.dp.decorator;

public class FancyDress extends DressDecorator {

	public FancyDress(Dress dress) {
		super(dress);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding Fancy Dress Features");
	}
}

