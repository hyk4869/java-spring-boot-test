package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	@Autowired
	private HelloService service;

	@GetMapping("/hello")
	public String getHello() {
		return "hello";
	}

	@PostMapping("/hello")
	public String postRequest(@RequestParam("text1") String str, Model model) {
		model.addAttribute("sample", str);
		return "hello/response";
	}

	@PostMapping("/hello/db")
	public String postDbRequest(@RequestParam("text2") String id, Model model) {
		// 1 件 検索 
		Employee employee = service.getEmployee(id);
		// 検索 結果 を Model に 登録 
		model.addAttribute("employee", employee);
		// db. html に 画面 遷移 
		return "hello/db";
	}

}

// https://rainbow-engine.com/java-spring-boot-404error-fix/
// Spring Bootで404エラーが出たときの対処
//　直接原因はコントローラークラス（HewlloController）がスキャンの対象に含まれていなかった。

// @Controller
// 画面などからHTTPリクエストを受け付けるクラスのことをコントローラー

//@GetMapping
// GetメソッドのHTTPリクエストを受け付ける

// @PostMapping
// PostメソッドのHTTPリクエストを受け取るために使う。

// @RequestParam
// 画面で入力された値をサーバーが受け取る方法

// Model
// Modelクラスを使うことで、別の画面に値を渡すことができる。