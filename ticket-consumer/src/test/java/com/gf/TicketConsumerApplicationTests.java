package com.gf;

import com.gf.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TicketConsumerApplicationTests {

	@Autowired
	private UserService userService;

	@Test
	public void contextLoads() {
		String result = userService.hello( "张三" );
		System.out.println("result :" + result);
	}

}
