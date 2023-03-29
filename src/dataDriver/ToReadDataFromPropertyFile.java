package dataDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		//Step 1: Creating INNput Straem type object
		File absPath= new File("./TestData/configuration.properties");
		FileInputStream fis=new FileInputStream(absPath);
		
		//Step 2:Creating ObjectOf File Type
		
		Properties property=new Properties();
		property.load(fis);
		
		//Step :Read methods
		
		String name=property.get("name").toString();
		System.out.println(name);
		System.out.println(property.get("url").toString());
	}

}
