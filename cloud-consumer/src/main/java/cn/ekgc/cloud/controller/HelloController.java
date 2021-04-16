package cn.ekgc.cloud.controller;


import cn.ekgc.cloud.pojo.entity.User;
import cn.ekgc.cloud.transport.HelloTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("helloController")
@RequestMapping("/hello")
public class HelloController {
	@Autowired
	private HelloTransport helloTransport;
	@GetMapping("/say01")
	public String sayHelloDemo01() throws Exception {
		return helloTransport.sayHelloDemo01();
	}

	@GetMapping("/say02")
	public String sayHelloDemo02(String name) throws Exception {
		return helloTransport.sayHelloDemo02(name);
	}

	@GetMapping("/say03")
	public String sayHelloDemo03(User user) throws Exception {
		return helloTransport.sayHelloDemo03(user);
	}
}
