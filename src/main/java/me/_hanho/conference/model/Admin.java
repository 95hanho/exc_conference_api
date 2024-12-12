package me._hanho.conference.model;

import java.util.List;

public class Admin {
	
	private List<String> conference_addition;
	private String conference_addition_json;
	private String conference_addition_value;
	private String conference_background_color;
	private String conference_code;
	private String conference_inner_title;
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public Admin(List<String> conference_addition, String conference_addition_value, String conference_background_color,
			String conference_code, String conference_inner_title) {
		super();
		this.conference_addition = conference_addition;
		this.conference_addition_value = conference_addition_value;
		this.conference_background_color = conference_background_color;
		this.conference_code = conference_code;
		this.conference_inner_title = conference_inner_title;
	}
	
	public Admin(List<String> conference_addition, String conference_addition_json, String conference_addition_value,
			String conference_background_color, String conference_code, String conference_inner_title) {
		super();
		this.conference_addition = conference_addition;
		this.conference_addition_json = conference_addition_json;
		this.conference_addition_value = conference_addition_value;
		this.conference_background_color = conference_background_color;
		this.conference_code = conference_code;
		this.conference_inner_title = conference_inner_title;
	}

	public List<String> getConference_addition() {
		return conference_addition;
	}

	public void setConference_addition(List<String> conference_addition) {
		this.conference_addition = conference_addition;
	}

	public String getConference_addition_value() {
		return conference_addition_value;
	}

	public void setConference_addition_value(String conference_addition_value) {
		this.conference_addition_value = conference_addition_value;
	}

	public String getConference_background_color() {
		return conference_background_color;
	}

	public void setConference_background_color(String conference_background_color) {
		this.conference_background_color = conference_background_color;
	}

	public String getConference_code() {
		return conference_code;
	}

	public void setConference_code(String conference_code) {
		this.conference_code = conference_code;
	}

	public String getConference_inner_title() {
		return conference_inner_title;
	}

	public void setConference_inner_title(String conference_inner_title) {
		this.conference_inner_title = conference_inner_title;
	}

	public String getConference_addition_json() {
		return conference_addition_json;
	}

	public void setConference_addition_json(String conference_addition_json) {
		this.conference_addition_json = conference_addition_json;
	}

	@Override
	public String toString() {
		return "Admin [conference_addition=" + conference_addition + ", conference_addition_json="
				+ conference_addition_json + ", conference_addition_value=" + conference_addition_value
				+ ", conference_background_color=" + conference_background_color + ", conference_code="
				+ conference_code + ", conference_inner_title=" + conference_inner_title + "]";
	}

}
