package cn.edu.ujn.ch5;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.edu.ujn.ch5.aop.IHello;

public class TestHello {
	
	@Test
	public void testHello(){
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		IHello hello = (IHello) classPathXmlApplicationContext.getBean("speaker");
		hello.helloAop("Jack");
		hello.sayHello("Jack");
	}
	
	@Test
	public void testProxy() {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		IHello hello = (IHello) classPathXmlApplicationContext.getBean("helloProxy");
		hello.helloAop("Jack");
		hello.sayHello("Jack");
	}

}
