package me._hanho.conference.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me._hanho.conference.model.Admin;
import me._hanho.conference.model.Application;
import me._hanho.conference.model.Conference;
import me._hanho.conference.model.Sido;
import me._hanho.conference.model.Sigu;
import me._hanho.conference.repository.CustomRepository;
import me._hanho.conference.util.JsonUtil;

@Service
public class CustomServiceImpl implements CustomService {

	@Autowired
	private CustomRepository customDAO;
	
	@Override
	public Conference getConferenceInfo(String code) {
		return customDAO.getConferenceInfo(code);
	}

	@Override
	public List<Sido> getSidos() {
		return customDAO.getSidos();
	}

	@Override
	public List<Sigu> getSigus() {
		return customDAO.getSigus();
	}

	@Override
	public void applyConference(Application appli) {
		customDAO.applyConference(appli);
	}

	@Override
	public void setConferenceAdmin(Admin admin) {
		admin.setConference_addition_json(JsonUtil.convertListToJson(admin.getConference_addition()));
		customDAO.setConferenceAdmin(admin);
	}

}
