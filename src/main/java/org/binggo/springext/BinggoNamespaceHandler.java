package org.binggo.springext;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class BinggoNamespaceHandler extends NamespaceHandlerSupport {

	public void init() {
		registerBeanDefinitionParser("person", new PersonBeanDefinitionParser());
	}

}