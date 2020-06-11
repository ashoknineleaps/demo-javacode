package com.program.dp.decorator;

public class DecoratorPattern {

	public static void main(String[] args) {
		
		Dress sportyDress = new SportyDress(new BasicDress());
		sportyDress.assemble();
		System.out.println();
		
		Dress fancyDress = new FancyDress(new BasicDress());
		fancyDress.assemble();
		System.out.println();
		
		Dress casualDress = new CasualDress(new BasicDress());
		casualDress.assemble();
		System.out.println();
		
		Dress sportFancyDress = new SportyDress(new FancyDress(new BasicDress()));
		sportFancyDress.assemble();
		System.out.println();
		
		
	}
}
