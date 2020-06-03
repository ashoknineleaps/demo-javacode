package com.program.dp.adapter1;

public class WebDriverAdapter implements WebDriver {
	
	private InternetExplorerDriver ieDriver;
	
	public WebDriverAdapter(InternetExplorerDriver ieDriver) {
		this.ieDriver = ieDriver;
	}
	
	@Override
	public void getElement() {
		ieDriver.findElement();
	}

	@Override
	public void selectElement() {
		ieDriver.clickElement();
	}

}
