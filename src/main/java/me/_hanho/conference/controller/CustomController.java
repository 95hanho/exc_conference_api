package me._hanho.conference.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpServletRequest;
import me._hanho.conference.model.Admin;
import me._hanho.conference.model.Application;
import me._hanho.conference.model.Conference;
import me._hanho.conference.model.Sido;
import me._hanho.conference.model.Sigu;
import me._hanho.conference.service.CustomService;

@RestController
@RequestMapping("/api/custom-conference")
public class CustomController {

	private static final Logger logger = LoggerFactory.getLogger(CustomController.class);
	
	@Autowired
	private CustomService customService;
	
	// 컨퍼런스 정보 가져오기
	@GetMapping("/application/{code}")
	public ResponseEntity<Map<String, Object>> getConference(@PathVariable("code") String code) {
		logger.info("getConference");
		Map<String, Object> result = new HashMap<String, Object>();
		
		Conference conference = customService.getConferenceInfo(code);
		List<Sido> Sido_list = customService.getSidos();
		List<Sigu> Sigu_list = customService.getSigus();
		conference.setRemote_status(true);
		conference.setSido_area_info(Sido_list);
		conference.setSigu_area_info(Sigu_list);
		
		System.out.println(conference);
		
		result.put("data", conference);
		result.put("msg", "success");
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	 
	// 컨퍼런스 관리자 설정
	@PostMapping("/extention")
	public ResponseEntity<Map<String, Object>> setConferenceAdmin(@ModelAttribute Admin admin, HttpServletRequest request) {
		logger.info("setConferenceAdmin");
		Map<String, Object> result = new HashMap<String, Object>();
		
		String ipAddress = request.getRemoteAddr();
		logger.info("ipAddress : " + ipAddress);
		
		// 허용 IP 리스트
	    List<String> allowedIps = Arrays.asList("203.245.44.21"); // 허용할 IP를 리스트에 추가
	    
	    // IP 제한 체크
	    if (!allowedIps.contains(ipAddress)) {
	        result.put("msg", "Access denied: Unauthorized IP");
	        return new ResponseEntity<>(result, HttpStatus.FORBIDDEN);
	    }
		
		customService.setConferenceAdmin(admin);
		
		result.put("msg", "success");
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	// 컨퍼런스 신청
	@PostMapping("/application")
	public ResponseEntity<Map<String, Object>> applyConference(@ModelAttribute Application appli,
			@RequestParam(value="c2pi_sauplicense1", required = false) MultipartFile file) {
		logger.info("applyConference");
		Map<String, Object> result = new HashMap<String, Object>();
		
		System.out.println(file);
		System.out.println(appli);
		customService.applyConference(appli);
		
		result.put("msg", "success");
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
}
