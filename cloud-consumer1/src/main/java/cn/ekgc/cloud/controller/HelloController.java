package cn.ekgc.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController("helloController")
@RequestMapping("/hello")
public class HelloController {
	@Autowired
	private HttpSession session;

	@GetMapping("/say")
	public String say() throws Exception {
		String name = (String) session.getAttribute("user");
		System.out.println("name = " + name);
		return name;
	}

}
