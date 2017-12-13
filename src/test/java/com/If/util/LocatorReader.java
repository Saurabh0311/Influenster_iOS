package com.If.util;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import com.If.util.PropertyReader;

public class LocatorReader {

      // Declare objects and variables
		private Document doc;
		private PropertyReader propObj; 
		public String path=null;
		public String rootpath=null;
		
		public LocatorReader()
		{
			
		}
		public LocatorReader(String xmlName) {
			SAXReader reader = new SAXReader();
			try {
				//URL url = getClass().getResource(xmlName);
				//File file = new File(url.getFile());
				propObj = new PropertyReader();
				String localPath = propObj.getPath();
				localPath = localPath+"//src//test//java//com//If//locator//";			
				doc = reader.read(localPath+xmlName);
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public String getLocator(String locator)
		{ 		
			String loc= doc.selectSingleNode("//" + locator.replace('.', '/')).getText(); 
			System.out.println("Element Is: "+loc);
			return loc;
		}
		public String rootPathofProject()
		{
			path=System.getProperty("user.dir");
			rootpath=path.replace("\\","\\");
		    return rootpath;
		
		}
	}
