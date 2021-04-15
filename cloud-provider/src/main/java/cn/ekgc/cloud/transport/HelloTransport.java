package cn.ekgc.cloud.transport;


import cn.ekgc.cloud.pojo.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController("helloTransport")
@RequestMapping("/hello/trans")
public class HelloTransport {
	@PostMapping("/say01")
	public String sayHelloDemo01() throws Exception {
		return "Cloud Provider Say Hello" + new Date();
	}

	@PostMapping("/say02")
	public String sayHelloDemo02(@RequestParam String name) throws Exception {
		return "Cloud Provider Say Hello To " + name + " : " + new Date();
	}

	@PostMapping("/say03")
	public String sayHelloDemo03(@RequestBody User user) throws Exception {
		return "Cloud Provider Say Hello To " + user.getName() + user.getCellphone() + " : " + new Date();
	}
}
