package com.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	public static void generateJVMReport(String jsonfile) {
		File reportloc = new File(System.getProperty("user.dir")+"src\\test\\resources\\Report");
		
		Configuration con = new Configuration(reportloc, "Adactin");
		
		con.addClassifications("Platformname", "Windows");
		con.addClassifications("Platformversion", "11");
		con.addClassifications("Sprint", "31");
		con.addClassifications("buildno", "6756451");
		con.addClassifications("Author", "Harish");
		
		List<String> li = new ArrayList<String>();
		li.add(jsonfile);
		
		ReportBuilder builder= new ReportBuilder(li, con);
		builder.generateReports();
		
	}
}
