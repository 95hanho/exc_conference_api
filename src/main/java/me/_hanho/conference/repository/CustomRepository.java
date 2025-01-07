package me._hanho.conference.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import me._hanho.conference.mapper.CustomMapper;
import me._hanho.conference.model.Admin;
import me._hanho.conference.model.Application;
import me._hanho.conference.model.Conference;
import me._hanho.conference.model.Sido;
import me._hanho.conference.model.Sigu;
import me._hanho.conference.util.JsonUtil;

@Repository
public class CustomRepository {
	
	@Autowired
	private CustomMapper customMapper;

	public Conference getConferenceInfo(String code) {
		System.out.println(code);
		Conference conference = customMapper.getConferenceInfo(code); 
		if(conference.getConference_addition_input_info_JSON() != null) {
			conference.setConference_addition_input_info(JsonUtil.convertJsonToList(conference.getConference_addition_input_info_JSON()));
		} else {
			conference.setConference_addition_input_info(null);
		}
		return conference;
	}

	public List<Sido> getSidos() {
		return customMapper.getSidos();
	}

	public List<Sigu> getSigus() {
		return customMapper.getSigus();
	}

	public void applyConference(Application appli) {
		appli.setEtcs_JSON(JsonUtil.convertListToJson(appli.getEtcs()));
		appli.setOptions_JSON(JsonUtil.convertListToJson(appli.getOptions()));
		customMapper.applyConference(appli);
	}

	public void setConferenceAdmin(Admin admin) {
		customMapper.setConferenceAdmin(admin);
	}

}
