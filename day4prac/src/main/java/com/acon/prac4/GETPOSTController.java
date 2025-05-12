package com.acon.prac4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GETPOSTController {
	
	@GetMapping("/formView")
	public String formView() {
		return "formView";
	}
	
	// get요청
	// a태그, url 직접 요청, form의 method="get" => get요청
	// 자바스크립트 location.href=""
	// 요청 시 보내는 데이터는 요청라인에 쿼리스트링으로 제공됨
	// 서버가 주로 제공하는 서비스들은 get요청으로 처리된다
	@GetMapping("/form1")
	public String form1(HttpServletRequest request) {
		// get요청의 데이터
		// request객체의 getParameter()로 얻어옴
		// spring에서는 @RequestParam
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		// Http
		// 요청라인 (한 줄)
		// 요청헤드
		// 빈 줄
		// 요청 바디
		
		int length = request.getContentLength();
		System.out.println(length);
		return "redirect:/";
	}
	
	@PostMapping("/form2")
	public String form2(HttpServletRequest request) throws IOException {
		
		// form, post -> .getParameter("id"); 로 데이터를 얻어올 수 있다, 요청바디의 내용을 읽어서 map형태로 제공함
		/*String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		System.out.println(id);
		System.out.println(pw);
		*/
		
		//getInputStream얘가 기반스트림이고 나머지는 다 보조스트림
		BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
		
		String line = "";
		StringBuilder builder= new StringBuilder();
		while((line=br.readLine())!=null) {
			builder.append(line);
		}
		
		//str+=line;
		
		System.out.println(builder.toString());
		
		return "redirect:/";
	}
}
