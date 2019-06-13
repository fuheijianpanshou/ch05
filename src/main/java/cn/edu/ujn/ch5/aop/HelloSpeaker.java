package cn.edu.ujn.ch5.aop;

public class HelloSpeaker implements IHello {

	public void helloAop(String name) {
		// TODO Auto-generated method stub
		System.out.println("HelloAop:"+name);

	}

	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println("SayHellop:"+name);

	}

}
