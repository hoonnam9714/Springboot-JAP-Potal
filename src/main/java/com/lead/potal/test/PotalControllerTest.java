package com.lead.potal.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //스프링이 com.lead.potal 패키지 이하를 스캔해서 모든 파일을 메모리에 new하는것은 아니고,
// 특정 어노테이션이 붙어있는 클래스 파일을 new(ioc)해서 스프링 컨테이너에서 관리해줍니다.
public class PotalControllerTest {
	
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello potal by spring boot</h1>";
	}
}
