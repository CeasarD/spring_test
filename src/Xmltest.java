import java.util.*;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.*;


public class Xmltest {
	public static void main(String[] args) throws Exception{
		SAXReader sb = new SAXReader();
		Document doc = sb.read(Xmltest.class.getClassLoader().getResourceAsStream("xmltest.xml"));
		Element root = doc.getRootElement();
		List list = root.elements("disk");
		for(int i = 0;i<list.size();i++)
		{
			Element ele = (Element)list.get(i);
			String name = ele.attributeValue("name");
			String cap = ele.elementText("capacity");
			System.out.println("disk name: "+name);
			System.out.println("disk capacity: "+cap);
		}
		
	}
}
