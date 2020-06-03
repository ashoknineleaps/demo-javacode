package com.program.dp.adapter1;

public class ChromeDriver implements WebDriver {

	@Override
	public void getElement() {
		System.out.println("Get Element from Chrome");
	}

	@Override
	public void selectElement() {
		System.out.println("Select Element from Chrome");
	}

}
