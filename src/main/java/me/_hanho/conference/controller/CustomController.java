package me._hanho.conference.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import me._hanho.conference.model.Admin;
import me._hanho.conference.model.Application;
import me._hanho.conference.model.Conference;
import me._hanho.conference.model.Sido;
import me._hanho.conference.model.Sigu;
import me._hanho.conference.service.CustomService;

@RestController
@RequestMapping("/api/custom-conference")
public class CustomController {

	@Autowired
	private CustomService customService;
	
	// 컨퍼런스 정보 가져오기
	@GetMapping("/application/{code}")
	public ResponseEntity<Map<String, Object>> getConference(@PathVariable("code") String code) {
		System.out.println("getConference");
		Map<String, Object> result = new HashMap<String, Object>();
		
		Conference conference = customService.getConferenceInfo(code);
		List<Sido> Sido_list = customService.getSidos();
		List<Sigu> Sigu_list = customService.getSigus();
		conference.setRemote_status(true);
		conference.setSido_area_info(Sido_list);
		conference.setSigu_area_info(Sigu_list);
		
		result.put("data", conference);
		result.put("msg", "success");
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	// 컨퍼런스 관리자 설정
	@PostMapping("/extention")
	public ResponseEntity<Map<String, Object>> setConferenceAdmin(@ModelAttribute Admin admin) {
		System.out.println("setConferenceAdmin");
		Map<String, Object> result = new HashMap<String, Object>();
		
		customService.setConferenceAdmin(admin);
		
		result.put("msg", "success");
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	// 컨퍼런스 신청
	@PostMapping("/application")
	public ResponseEntity<Map<String, Object>> applyConference(@ModelAttribute Application appli,
			@RequestParam(value="c2pi_sauplicense1", required = false) MultipartFile file) {
		System.out.println("applyConference");
		Map<String, Object> result = new HashMap<String, Object>();
		
		System.out.println(file);
		System.out.println(appli);
		customService.applyConference(appli);
		
		result.put("msg", "success");
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
}
