package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	@GetMapping("/hello")
	public String getHello() {
		return "hello";
	}

}

// https://rainbow-engine.com/java-spring-boot-404error-fix/
// Spring Bootで404エラーが出たときの対処
//　直接原因はコントローラークラス（HewlloController）がスキャンの対象に含まれていなかった。