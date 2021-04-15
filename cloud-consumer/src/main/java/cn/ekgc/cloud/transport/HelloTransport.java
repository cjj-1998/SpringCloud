package cn.ekgc.cloud.transport;


import cn.ekgc.cloud.pojo.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "cloud-provider")
@RequestMapping("/hello/trans")
public interface HelloTransport {
	@PostMapping("/say01")
	String sayHelloDemo01() throws Exception;

	@PostMapping("/say02")
	String sayHelloDemo02(@RequestParam String name) throws Exception;

	@PostMapping("/say03")
	String sayHelloDemo03(@RequestBody User user) throws Exception;
}
