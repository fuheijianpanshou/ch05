package cn.edu.ujn.ch5;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHuman {
	
	@Test
	public void speak() {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		IHuman iHuman = (IHuman) (classPathXmlApplicationContext.getBean("chinese"));
		iHuman.speak();
		IHuman iHuman2 = (IHuman) classPathXmlApplicationContext.getBean("chinese");
		if(iHuman==iHuman2) {
			System.out.println("单利");
		}else {
			System.out.println("原型");
		}
		
	}
}
