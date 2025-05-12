package com.acon.prac4;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class SimpleController2 {
	String fileDir = "C:\\Users\\siwoo\\Desktop\\test\\";
	
	//입력폼 보여주기
	@GetMapping("/uploadForm2")
	public String uploadForm() {
		return "upload2";
	}
	
	//실제 파일 업로드하기
	@PostMapping("/upload2")
	public String upload(String goodsName, MultipartFile file, Model model) throws IllegalStateException, IOException {
		
		System.out.println(goodsName);
		String fileName = file.getOriginalFilename();
		String fullPath = fileDir+fileName;
		file.transferTo(new File(fullPath));
		
		model.addAttribute("img",fileName);
		
		return "upload2-ok";
	}
	// C:\\Users\\siwoo\\Desktop\\test\\ 여따가 파일을 업로드중임
	// aws -s3 버킷에다가 파일 업로드하면 클라우드에 파일이 올라가는거임
	
	//저장된 이미지 보여주기 (서버의 특정 자원을 응답하기)
	// images/aaa.jpg -> path variable 방식
	
	// @ResponseBody가 붙으면 view로 응답을 하는것이 아니라 Data로 응답을 하는 것이다
	// pathvariable에다가 :.*을 붙이게 되면 확장자 까지 가져오게 되서 이미지를 정상적으로 조회할 수 있다
	@ResponseBody
	@RequestMapping(value="/images/{fileName:.*}", method=RequestMethod.GET)
	public Resource image(@PathVariable String fileName) throws MalformedURLException {
		System.out.println(fileName);
		return new UrlResource("file:C:\\Users\\siwoo\\Desktop\\test\\"+fileName);
	}
	
}
