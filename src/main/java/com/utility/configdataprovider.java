package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configdataprovider  {
	
	Properties pro;
	
	public configdataprovider() throws IOException {
		String path=System.getProperty("user.dir")+"\\configuration\\config.properties";
		
		FileInputStream fis=new FileInputStream(path);
		pro=new Properties();
		pro.load(fis);
		
		
}

	public String getstageurl () {
		return pro.getProperty("stageurl");
		
		
		
		
		
	}
	
	
	
	
}
