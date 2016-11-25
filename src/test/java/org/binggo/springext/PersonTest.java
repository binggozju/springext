package org.binggo.springext;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class PersonTest {
    
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("springext.xml"));
		Person pd = (Person) beanFactory.getBean("p1");
		System.out.println(pd.getName());
		System.out.println(pd.getAge());
	}
}
