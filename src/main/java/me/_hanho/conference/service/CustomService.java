package me._hanho.conference.service;

import java.util.List;

import me._hanho.conference.model.Conference;
import me._hanho.conference.model.Sido;
import me._hanho.conference.model.Sigu;

public interface CustomService {

	Conference getConferenceInfo(String code);

	List<Sido> getSidos();

	List<Sigu> getSigus();

}
