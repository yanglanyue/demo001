package com.example.demo001;

import com.example.demo001.beans.Person;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

/*
*spring boot单元测试
* 以编码的形式将单元注入进行测试
* */

@SpringBootTest
class Demo001ApplicationTests {

	//打印已配置属性值的类的各属性值
	//@Autowired注入单元
	@Autowired
	Person person;
	@Test
	void contextLoads() {
		System.out.println(person);
	}

	//单元@ApplicationContext用于测试spring容器中是否含有已添加的bean，加入bean的ID（"helloService"）
	@Autowired
	ApplicationContext a;
	@Test
	public void testHelloService(){
		boolean b = a.containsBean("helloService");
		System.out.println(b);
	}
}
