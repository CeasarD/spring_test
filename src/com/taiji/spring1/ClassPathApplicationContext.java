package com.taiji.spring1;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jaxen.*;
import org.dom4j.Document;
//import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class ClassPathApplicationContext implements BeanFactory{
	private Map<String,Object> beans = new HashMap<String,Object>();
	public ClassPathApplicationContext() throws Exception{
		SAXReader sb = new SAXReader();
		Document doc = sb.read(this.getClass().getClassLoader().getResourceAsStream("beans.xml"));
		Element root = doc.getRootElement();
		List list = root.elements("bean");
		for(int i = 0;i<list.size();i++){
			Element ele = (Element)list.get(i);
			String id = ele.attributeValue("id");
			String clazz = ele.attributeValue("class");
			System.out.println("id: "+id+"\nclass: "+clazz);
			Object o = Class.forName(clazz).newInstance();
			beans.put(id, o);
			for(Element propertyElement:(List<Element>)ele.elements("property")){
				String name = propertyElement.attributeValue("name");
				String bean = propertyElement.attributeValue("bean");
				Object beanObject = beans.get(bean);
				String methodName = "set"+name.substring(0, 1).toUpperCase()+name.substring(1);
				System.out.println("method name: "+methodName);
				Method m = o.getClass().getMethod(methodName, beanObject.getClass().getInterfaces()[0]);
				m.invoke(o, beanObject);
			}
		}
	}
	
	public Object getBean(String id) {
		return beans.get(id);
	}

}
