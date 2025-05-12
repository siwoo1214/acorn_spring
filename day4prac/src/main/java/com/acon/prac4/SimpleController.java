package com.acon.prac4;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class SimpleController {
	
	// 사용자 입력 화면 
	@GetMapping("/uploadForm")
	public String uploadForm() {
		return "form";
	}
	
	// 사용자 입력 처리, 파일 업로드 진행
	/*
	@PostMapping("/upload")
	public String upload(@RequestParam String goodsname, @ModelAttribute MultipartFile file) throws IllegalStateException, IOException {
		
		String fileDir="C:\\Users\\siwoo\\Desktop\\test\\";
		
		System.out.println(goodsname);
		String fileName = file.getOriginalFilename();  //그냥 파일이름을 갖고오는것
		
		String fullPath = fileDir+fileName;  //근데 사용자가 보내는 파일이름이 겹칠 수 있으니까 
		file.transferTo(new File(fullPath));
		
		return "uploadok";
	}
	*/
	
	@PostMapping("/upload")
	public String upload(@RequestParam String goodsname, @ModelAttribute MultipartFile file) throws IllegalStateException, IOException {
		
		String fileDir="C:\\Users\\siwoo\\Desktop\\test\\";
		
		System.out.println(goodsname);
		String fileName = file.getOriginalFilename();  //그냥 파일이름을 갖고오는것
		
		// 저장할 이름 만들기 (겹치지 않는 이름이 필요함)
		String saveName = UUID.randomUUID().toString();
		
		// 확장자
		System.out.println(fileName);
		int index = fileName.lastIndexOf(".");
		String ext = fileName.substring(index+1);
		System.out.println("확장자 = "+ext);
		
		saveName = saveName+"."+ext;
		
		//귀여운이미지.jpg <- 원본 파일의 이름
		//qwesajkhsd.jpg <- 저장되는 이름
		
		String fullPath = fileDir+saveName; 
		file.transferTo(new File(fullPath));
		
		return "uploadok";
	}
}
