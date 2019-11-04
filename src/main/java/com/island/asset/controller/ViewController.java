package com.island.asset.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ViewController {

	@RequestMapping("/changeAssetMainPage")
	public String changePage() {
		
		return "changeAssetMainPage";
	}
	
	@RequestMapping("/changeAssetDetailPage")
	public String changeDetailPage() {
		
		return "changeAssetDetailPage";
	}
	
	@RequestMapping("/scrapAssetMainPage")
	public String scrapPage() {
		
		return "scrapAssetMainPage";
	}
	
	@RequestMapping("/assetAdvanceSearch")
	public String assetAdvanceSearch() {
		
		return "assetAdvanceSearch";
	}
	
	@RequestMapping("/employeeAdvanceSearch")
	public String employeeAdvanceSearch() {
		
		return "employeeAdvanceSearch";
	}
}
