package me._hanho.conference.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import me._hanho.conference.mapper.CustomMapper;
import me._hanho.conference.model.Conference;
import me._hanho.conference.model.Sido;
import me._hanho.conference.model.Sigu;

@Repository
public class CustomRepository {
	
	@Autowired
	private CustomMapper customMapper;

	public Conference getConferenceInfo(String code) {
		return customMapper.getConferenceInfo(code);
	}

	public List<Sido> getSidos() {
		return customMapper.getSidos();
	}

	public List<Sigu> getSigus() {
		return customMapper.getSigus();
	}

}
