package org.binggo.springext;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils; 
import org.w3c.dom.Element;

public class PersonBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
	
	protected Class getBeanClass(Element element) {
		return Person.class;
	}
	
	protected void doParse(Element element, BeanDefinitionBuilder bdBuilder) {
		String id = element.getAttribute("id");
		String name = element.getAttribute("name");
		String age = element.getAttribute("age");
		
		if (StringUtils.hasText(id)) {
			bdBuilder.addPropertyValue("id", id);
		}
		
		if (StringUtils.hasText(name)) {
			bdBuilder.addPropertyValue("name", name);
		}
		
		if (StringUtils.hasText(age)) {
			bdBuilder.addPropertyValue("age", Integer.valueOf(age));
		}	
	}
	
}
