package com.program.dp.facade;

public class FacadeDesignPattern {

	//Used when there is multiple interface of similar kind of jobs, then we add a Facade interface
	//Facade helper class route to method related to specific class
	
	public static void main(String[] args) {
		
		String test = "Check Element Present";
		
		WebExplorerHelperFacade.geterateReports("Firefox", "html", test);
		WebExplorerHelperFacade.geterateReports("Firefox", "junit", test);
		
		System.out.println();
		
		WebExplorerHelperFacade.geterateReports("Chrome", "html", test);
		WebExplorerHelperFacade.geterateReports("Chrome", "junit", test);
		
		System.out.println();
		
		WebExplorerHelperFacade.geterateReports("Safari", "html", test);
		
	}
}
