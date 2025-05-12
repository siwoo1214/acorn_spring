package com.acon.prac4;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class MultiController {
	
	@GetMapping("/uploadFormMulti")
	public String uploadForm() {
		return "multiForm";
	}
	
	@PostMapping("/uploadMulti")
	public String upload(String goodsName, MultipartFile[] a) throws IllegalStateException, IOException {  //a는 form에서의 파일 name
		
		String dir = "C:\\Users\\siwoo\\Desktop\\test\\";
		
		System.out.println(goodsName);
		
		for(MultipartFile file : a) {
			String fileName = file.getOriginalFilename();
			System.out.println(fileName);
			String fullPath = dir+fileName;
			file.transferTo(new File(fullPath));
		}
		
		return "multi-ok";
	}
}
