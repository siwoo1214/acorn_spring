package com.acon.prac4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class 데이터응답하기 {
	
	@RequestMapping(value="/data1", method = RequestMethod.GET)
	public void data1(HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain;charset=utf-8");
		String data="data1";
		resp.setHeader("Content-Length", String.valueOf(data.getBytes().length));
		resp.getWriter().println(data);
	}
	
	@ResponseBody  //return을 view로 인식하지 않음 data로 인식해버림
	@RequestMapping(value="/data2", method = RequestMethod.GET, produces = "text/plain;charset=utf-8")
	public String data2() {
		String data2 = "data2가 보내는 데이터";
		return data2;
	}
	
	//json형태 데이터로 응답하기
	//java객체, 리스트 -> json으로 변환해서 응답하기
	@ResponseBody  //return을 view로 인식하지 않음 data로 인식해버림
	@RequestMapping(value="/data3", method = RequestMethod.GET)
	public Member data3() {
		Member member = new Member();
		member.setId("acorn1");
		member.setPw("0010");
		member.setName("kim");
		
		// java는 json변환을 해줘야하는데 이걸 spring이 대신 해준다
		return member;
	}
	
	//고객정보 여러개 json데이터
	@ResponseBody
	@RequestMapping(value="/data4", method=RequestMethod.GET)
	public List<Member> data4(){
		List<Member> list = new ArrayList<>();
		list.add(new Member("acorn2","1212","lee"));
		list.add(new Member("acorn3","5432","choi"));
		list.add(new Member("acorn4","9873","hwang"));
		return list;
	}
	
	// @ResponseBody를 보다 세밀하게 사용하고 싶을 때는
	// @ResponseEntity로 사용하면 된다
	//그래서 걔를 반환타입으로 사용할 때는 @가 싶요없다
	
	//@responseEntitu<T>
	
	@RequestMapping(value="/data22", method = RequestMethod.GET)
	public ResponseEntity<String> data22(){
		String data2 = "data2 서버가 보내는 데이터 response Entity";
		return ResponseEntity.ok()
				.header("Content-Type","text/plain;charset=utf-8")
				.header("Content-Length",String.valueOf(data2.getBytes().length))
				.body(data2);
	}
}
