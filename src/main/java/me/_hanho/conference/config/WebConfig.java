package me._hanho.conference.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
        .allowedOrigins("http://localhost:5173", "https://95hanho.pe.kr/", "http://localhost:9370") // 클라이언트 도메인 명시
        .allowedMethods("GET", "POST", "PUT", "DELETE"); // 허용할 HTTP 메서드
	}
	
}
