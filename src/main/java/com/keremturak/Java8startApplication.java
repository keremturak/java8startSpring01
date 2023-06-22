package com.keremturak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Bu sınıfın bir spring boot uygulamasına ait olduğu ve gerekli olan bağımlılıkların
 * buradan itibaren tarandığı belirtiliyor..
 */


@SpringBootApplication

public class Java8startApplication {

	@GetMapping ("/message")
	public ResponseEntity<String> getmessage(){
		return ResponseEntity.ok("hello world");
	}

	public static void main(String[] args) {
		SpringApplication.run(Java8startApplication.class, args);
	}

}
