package cn.ekgc.cloud.controller;


import cn.ekgc.cloud.pojo.entity.User;
import cn.ekgc.cloud.transport.HelloTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController("helloController")
@RequestMapping("/hello")
public class HelloController {
	@Autowired
	private HttpSession session;
	@Autowired
	private HttpServletResponse response;
	@Autowired
	private HelloTransport helloTransport;

	@GetMapping("/login")
	public String say() throws Exception {
		session.setAttribute("user", "陈俊杰");
		return "登陆成功！";
	}

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
