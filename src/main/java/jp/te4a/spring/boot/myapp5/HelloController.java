package jp.te4a.spring.boot.myapp5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
