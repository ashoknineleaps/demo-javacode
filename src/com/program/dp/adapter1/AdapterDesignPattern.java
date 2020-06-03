package com.program.dp.adapter1;

public class AdapterDesignPattern {

	public static void main(String[] args) {
		
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.getElement();
		chromeDriver.selectElement();
		
		System.out.println();
		
		InternetExplorerDriver ieDriver = new InternetExplorerDriver();
		ieDriver.findElement();
		ieDriver.clickElement();
		
		System.out.println();
		
		WebDriverAdapter adapter = new WebDriverAdapter(ieDriver);
		adapter.getElement();
		adapter.selectElement();
	}
}
