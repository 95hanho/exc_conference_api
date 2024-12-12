package me._hanho.conference.model;

import java.util.List;

public class Application {
	private int appli_id;
	private String c2gi_address;
	private String c2gi_address_detail;
	private String c2gi_company;
	private String c2gi_post;
	private String c2pi_cellphone1;
	private String c2pi_email1;
	private String c2pi_name1;
	private String c2pi_position1;
	private String c2pi_team1;
	private boolean privacy_check;
	private String c2pi_cashphone1;
	private String c2pi_paydate1;
	private int c2pi_paymethod1;
	private String c2pi_payname1;
	private int c2pi_proof1;
	private int c2pi_proof2;
	private List<String> etcs;
	private String etcs_JSON;
	private List<String> options;
	private String options_JSON;
	private String sido;
	private String sigungu;
	
	private String conference_code;
	
	public Application() {
		// TODO Auto-generated constructor stub
	}

	public Application(int appli_id, String c2gi_address, String c2gi_address_detail, String c2gi_company,
			String c2gi_post, String c2pi_cellphone1, String c2pi_email1, String c2pi_name1, String c2pi_position1,
			String c2pi_team1, boolean privacy_check, String c2pi_cashphone1, String c2pi_paydate1, int c2pi_paymethod1,
			String c2pi_payname1, int c2pi_proof1, int c2pi_proof2, List<String> etcs, String etcs_JSON,
			List<String> options, String options_JSON, String sido, String sigungu, String conference_code) {
		super();
		this.appli_id = appli_id;
		this.c2gi_address = c2gi_address;
		this.c2gi_address_detail = c2gi_address_detail;
		this.c2gi_company = c2gi_company;
		this.c2gi_post = c2gi_post;
		this.c2pi_cellphone1 = c2pi_cellphone1;
		this.c2pi_email1 = c2pi_email1;
		this.c2pi_name1 = c2pi_name1;
		this.c2pi_position1 = c2pi_position1;
		this.c2pi_team1 = c2pi_team1;
		this.privacy_check = privacy_check;
		this.c2pi_cashphone1 = c2pi_cashphone1;
		this.c2pi_paydate1 = c2pi_paydate1;
		this.c2pi_paymethod1 = c2pi_paymethod1;
		this.c2pi_payname1 = c2pi_payname1;
		this.c2pi_proof1 = c2pi_proof1;
		this.c2pi_proof2 = c2pi_proof2;
		this.etcs = etcs;
		this.etcs_JSON = etcs_JSON;
		this.options = options;
		this.options_JSON = options_JSON;
		this.sido = sido;
		this.sigungu = sigungu;
		this.conference_code = conference_code;
	}
	
	public String getSido() {
		return sido;
	}

	public void setSido(String sido) {
		this.sido = sido;
	}

	public String getSigungu() {
		return sigungu;
	}

	public void setSigungu(String sigungu) {
		this.sigungu = sigungu;
	}

	public int getAppli_id() {
		return appli_id;
	}

	public void setAppli_id(int appli_id) {
		this.appli_id = appli_id;
	}

	public String getC2gi_address() {
		return c2gi_address;
	}

	public void setC2gi_address(String c2gi_address) {
		this.c2gi_address = c2gi_address;
	}

	public String getC2gi_address_detail() {
		return c2gi_address_detail;
	}

	public void setC2gi_address_detail(String c2gi_address_detail) {
		this.c2gi_address_detail = c2gi_address_detail;
	}

	public String getC2gi_company() {
		return c2gi_company;
	}

	public void setC2gi_company(String c2gi_company) {
		this.c2gi_company = c2gi_company;
	}

	public String getC2gi_post() {
		return c2gi_post;
	}

	public void setC2gi_post(String c2gi_post) {
		this.c2gi_post = c2gi_post;
	}

	public String getC2pi_cellphone1() {
		return c2pi_cellphone1;
	}

	public void setC2pi_cellphone1(String c2pi_cellphone1) {
		this.c2pi_cellphone1 = c2pi_cellphone1;
	}

	public String getC2pi_email1() {
		return c2pi_email1;
	}

	public void setC2pi_email1(String c2pi_email1) {
		this.c2pi_email1 = c2pi_email1;
	}

	public String getC2pi_name1() {
		return c2pi_name1;
	}

	public void setC2pi_name1(String c2pi_name1) {
		this.c2pi_name1 = c2pi_name1;
	}

	public String getC2pi_position1() {
		return c2pi_position1;
	}

	public void setC2pi_position1(String c2pi_position1) {
		this.c2pi_position1 = c2pi_position1;
	}

	public String getC2pi_team1() {
		return c2pi_team1;
	}

	public void setC2pi_team1(String c2pi_team1) {
		this.c2pi_team1 = c2pi_team1;
	}

	public boolean getPrivacy_check() {
		return privacy_check;
	}

	public void setPrivacy_check(boolean privacy_check) {
		this.privacy_check = privacy_check;
	}

	public String getConference_code() {
		return conference_code;
	}

	public void setConference_code(String conference_code) {
		this.conference_code = conference_code;
	}

	public String getC2pi_cashphone1() {
		return c2pi_cashphone1;
	}

	public void setC2pi_cashphone1(String c2pi_cashphone1) {
		this.c2pi_cashphone1 = c2pi_cashphone1;
	}

	public String getC2pi_paydate1() {
		return c2pi_paydate1;
	}

	public void setC2pi_paydate1(String c2pi_paydate1) {
		this.c2pi_paydate1 = c2pi_paydate1;
	}

	public int getC2pi_paymethod1() {
		return c2pi_paymethod1;
	}

	public void setC2pi_paymethod1(int c2pi_paymethod1) {
		this.c2pi_paymethod1 = c2pi_paymethod1;
	}

	public String getC2pi_payname1() {
		return c2pi_payname1;
	}

	public void setC2pi_payname1(String c2pi_payname1) {
		this.c2pi_payname1 = c2pi_payname1;
	}

	public int getC2pi_proof1() {
		return c2pi_proof1;
	}

	public void setC2pi_proof1(int c2pi_proof1) {
		this.c2pi_proof1 = c2pi_proof1;
	}

	public int getC2pi_proof2() {
		return c2pi_proof2;
	}

	public void setC2pi_proof2(int c2pi_proof2) {
		this.c2pi_proof2 = c2pi_proof2;
	}
	
	public List<String> getEtcs() {
		return etcs;
	}

	public void setEtcs(List<String> etcs) {
		this.etcs = etcs;
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}
	
	

	public String getEtcs_JSON() {
		return etcs_JSON;
	}

	public void setEtcs_JSON(String etcs_JSON) {
		this.etcs_JSON = etcs_JSON;
	}

	public String getOptions_JSON() {
		return options_JSON;
	}

	public void setOptions_JSON(String options_JSON) {
		this.options_JSON = options_JSON;
	}

	@Override
	public String toString() {
		return "Application [appli_id=" + appli_id + ", c2gi_address=" + c2gi_address + ", c2gi_address_detail="
				+ c2gi_address_detail + ", c2gi_company=" + c2gi_company + ", c2gi_post=" + c2gi_post
				+ ", c2pi_cellphone1=" + c2pi_cellphone1 + ", c2pi_email1=" + c2pi_email1 + ", c2pi_name1=" + c2pi_name1
				+ ", c2pi_position1=" + c2pi_position1 + ", c2pi_team1=" + c2pi_team1 + ", privacy_check="
				+ privacy_check + ", c2pi_cashphone1=" + c2pi_cashphone1 + ", c2pi_paydate1=" + c2pi_paydate1
				+ ", c2pi_paymethod1=" + c2pi_paymethod1 + ", c2pi_payname1=" + c2pi_payname1 + ", c2pi_proof1="
				+ c2pi_proof1 + ", c2pi_proof2=" + c2pi_proof2 + ", etcs=" + etcs + ", etcs_JSON=" + etcs_JSON
				+ ", options=" + options + ", options_JSON=" + options_JSON + ", sido=" + sido + ", sigungu=" + sigungu
				+ ", conference_code=" + conference_code + "]";
	}

}
