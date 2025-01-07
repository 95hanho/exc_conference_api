package me._hanho.conference.model;

import java.util.Date;
import java.util.List;

public class Conference {

	private List<String> conference_addition_input_info;
	private String conference_addition_input_info_JSON;
	private String conference_addition_input_info_value;
	private String conference_addition_input_info_value_JSON;
	private String conference_addition_title;
	private String conference_background_color;
	private String conference_code;
	private String conference_cus_data_tablename;
	private String conference_entry_fee;
	private int conference_idx;
	private String conference_inquiry;
	private String conference_link_url;
	private int conference_max_num;
	private String conference_name;
	private String conference_open_state;
	private String conference_over_state;
	private int conference_person_reserve_count;
	private String conference_place;
	private String conference_proc_date_title;
	private Date conference_proc_enddate;
	private Date conference_proc_startdate;
	private Date conference_recv_enddate;
	private Date conference_recv_startdate;
	private Date conference_regdate;
	private String conference_sub_text;	
	private String conference_thumb_filename;
	private String conference_update;
	private boolean remote_status;
	private List<Sido> sido_area_info;
	private List<Sigu> sigu_area_info;
	
	public Conference() {
		// TODO Auto-generated constructor stub
	}

	public Conference(List<String> conference_addition_input_info, String conference_addition_input_info_value,
			String conference_addition_title, String conference_background_color, String conference_code,
			String conference_cus_data_tablename, String conference_entry_fee, int conference_idx,
			String conference_inquiry, String conference_link_url, int conference_max_num, String conference_name,
			String conference_open_state, String conference_over_state, int conference_person_reserve_count,
			String conference_place, String conference_proc_date_title, Date conference_proc_enddate,
			Date conference_proc_startdate, Date conference_recv_enddate, Date conference_recv_startdate,
			Date conference_regdate, String conference_sub_text, String conference_thumb_filename,
			String conference_update, boolean remote_status, List<Sido> sido_area_info, List<Sigu> sigu_area_info) {
		super();
		this.conference_addition_input_info = conference_addition_input_info;
		this.conference_addition_input_info_value = conference_addition_input_info_value;
		this.conference_addition_title = conference_addition_title;
		this.conference_background_color = conference_background_color;
		this.conference_code = conference_code;
		this.conference_cus_data_tablename = conference_cus_data_tablename;
		this.conference_entry_fee = conference_entry_fee;
		this.conference_idx = conference_idx;
		this.conference_inquiry = conference_inquiry;
		this.conference_link_url = conference_link_url;
		this.conference_max_num = conference_max_num;
		this.conference_name = conference_name;
		this.conference_open_state = conference_open_state;
		this.conference_over_state = conference_over_state;
		this.conference_person_reserve_count = conference_person_reserve_count;
		this.conference_place = conference_place;
		this.conference_proc_date_title = conference_proc_date_title;
		this.conference_proc_enddate = conference_proc_enddate;
		this.conference_proc_startdate = conference_proc_startdate;
		this.conference_recv_enddate = conference_recv_enddate;
		this.conference_recv_startdate = conference_recv_startdate;
		this.conference_regdate = conference_regdate;
		this.conference_sub_text = conference_sub_text;
		this.conference_thumb_filename = conference_thumb_filename;
		this.conference_update = conference_update;
		this.remote_status = remote_status;
		this.sido_area_info = sido_area_info;
		this.sigu_area_info = sigu_area_info;
	}


	public Conference(List<String> conference_addition_input_info, String conference_addition_input_info_JSON,
			String conference_addition_input_info_value, String conference_addition_input_info_value_JSON,
			String conference_addition_title, String conference_background_color, String conference_code,
			String conference_cus_data_tablename, String conference_entry_fee, int conference_idx,
			String conference_inquiry, String conference_link_url, int conference_max_num, String conference_name,
			String conference_open_state, String conference_over_state, int conference_person_reserve_count,
			String conference_place, String conference_proc_date_title, Date conference_proc_enddate,
			Date conference_proc_startdate, Date conference_recv_enddate, Date conference_recv_startdate,
			Date conference_regdate, String conference_sub_text, String conference_thumb_filename,
			String conference_update, boolean remote_status, List<Sido> sido_area_info, List<Sigu> sigu_area_info) {
		super();
		this.conference_addition_input_info = conference_addition_input_info;
		this.conference_addition_input_info_JSON = conference_addition_input_info_JSON;
		this.conference_addition_input_info_value = conference_addition_input_info_value;
		this.conference_addition_input_info_value_JSON = conference_addition_input_info_value_JSON;
		this.conference_addition_title = conference_addition_title;
		this.conference_background_color = conference_background_color;
		this.conference_code = conference_code;
		this.conference_cus_data_tablename = conference_cus_data_tablename;
		this.conference_entry_fee = conference_entry_fee;
		this.conference_idx = conference_idx;
		this.conference_inquiry = conference_inquiry;
		this.conference_link_url = conference_link_url;
		this.conference_max_num = conference_max_num;
		this.conference_name = conference_name;
		this.conference_open_state = conference_open_state;
		this.conference_over_state = conference_over_state;
		this.conference_person_reserve_count = conference_person_reserve_count;
		this.conference_place = conference_place;
		this.conference_proc_date_title = conference_proc_date_title;
		this.conference_proc_enddate = conference_proc_enddate;
		this.conference_proc_startdate = conference_proc_startdate;
		this.conference_recv_enddate = conference_recv_enddate;
		this.conference_recv_startdate = conference_recv_startdate;
		this.conference_regdate = conference_regdate;
		this.conference_sub_text = conference_sub_text;
		this.conference_thumb_filename = conference_thumb_filename;
		this.conference_update = conference_update;
		this.remote_status = remote_status;
		this.sido_area_info = sido_area_info;
		this.sigu_area_info = sigu_area_info;
	}

	public List<String> getConference_addition_input_info() {
		return conference_addition_input_info;
	}

	public void setConference_addition_input_info(List<String> conference_addition_input_info) {
		this.conference_addition_input_info = conference_addition_input_info;
	}

	public String getConference_addition_input_info_value() {
		return conference_addition_input_info_value;
	}

	public void setConference_addition_input_info_value(String conference_addition_input_info_value) {
		this.conference_addition_input_info_value = conference_addition_input_info_value;
	}

	public String getConference_addition_title() {
		return conference_addition_title;
	}

	public void setConference_addition_title(String conference_addition_title) {
		this.conference_addition_title = conference_addition_title;
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

	public String getConference_cus_data_tablename() {
		return conference_cus_data_tablename;
	}

	public void setConference_cus_data_tablename(String conference_cus_data_tablename) {
		this.conference_cus_data_tablename = conference_cus_data_tablename;
	}

	public String getConference_entry_fee() {
		return conference_entry_fee;
	}

	public void setConference_entry_fee(String conference_entry_fee) {
		this.conference_entry_fee = conference_entry_fee;
	}

	public int getConference_idx() {
		return conference_idx;
	}

	public void setConference_idx(int conference_idx) {
		this.conference_idx = conference_idx;
	}

	public String getConference_inquiry() {
		return conference_inquiry;
	}

	public void setConference_inquiry(String conference_inquiry) {
		this.conference_inquiry = conference_inquiry;
	}

	public String getConference_link_url() {
		return conference_link_url;
	}

	public void setConference_link_url(String conference_link_url) {
		this.conference_link_url = conference_link_url;
	}

	public int getConference_max_num() {
		return conference_max_num;
	}

	public void setConference_max_num(int conference_max_num) {
		this.conference_max_num = conference_max_num;
	}

	public String getConference_name() {
		return conference_name;
	}

	public void setConference_name(String conference_name) {
		this.conference_name = conference_name;
	}

	public String getConference_open_state() {
		return conference_open_state;
	}

	public void setConference_open_state(String conference_open_state) {
		this.conference_open_state = conference_open_state;
	}

	public String getConference_over_state() {
		return conference_over_state;
	}

	public void setConference_over_state(String conference_over_state) {
		this.conference_over_state = conference_over_state;
	}

	public int getConference_person_reserve_count() {
		return conference_person_reserve_count;
	}

	public void setConference_person_reserve_count(int conference_person_reserve_count) {
		this.conference_person_reserve_count = conference_person_reserve_count;
	}

	public String getConference_place() {
		return conference_place;
	}

	public void setConference_place(String conference_place) {
		this.conference_place = conference_place;
	}

	public String getConference_proc_date_title() {
		return conference_proc_date_title;
	}

	public void setConference_proc_date_title(String conference_proc_date_title) {
		this.conference_proc_date_title = conference_proc_date_title;
	}

	public Date getConference_proc_enddate() {
		return conference_proc_enddate;
	}

	public void setConference_proc_enddate(Date conference_proc_enddate) {
		this.conference_proc_enddate = conference_proc_enddate;
	}

	public Date getConference_proc_startdate() {
		return conference_proc_startdate;
	}

	public void setConference_proc_startdate(Date conference_proc_startdate) {
		this.conference_proc_startdate = conference_proc_startdate;
	}

	public Date getConference_recv_enddate() {
		return conference_recv_enddate;
	}

	public void setConference_recv_enddate(Date conference_recv_enddate) {
		this.conference_recv_enddate = conference_recv_enddate;
	}

	public Date getConference_recv_startdate() {
		return conference_recv_startdate;
	}

	public void setConference_recv_startdate(Date conference_recv_startdate) {
		this.conference_recv_startdate = conference_recv_startdate;
	}

	public Date getConference_regdate() {
		return conference_regdate;
	}

	public void setConference_regdate(Date conference_regdate) {
		this.conference_regdate = conference_regdate;
	}

	public String getConference_sub_text() {
		return conference_sub_text;
	}

	public void setConference_sub_text(String conference_sub_text) {
		this.conference_sub_text = conference_sub_text;
	}

	public String getConference_thumb_filename() {
		return conference_thumb_filename;
	}

	public void setConference_thumb_filename(String conference_thumb_filename) {
		this.conference_thumb_filename = conference_thumb_filename;
	}

	public String getConference_update() {
		return conference_update;
	}

	public void setConference_update(String conference_update) {
		this.conference_update = conference_update;
	}

	public boolean getRemote_status() {
		return remote_status;
	}

	public void setRemote_status(boolean remote_status) {
		this.remote_status = remote_status;
	}

	public List<Sido> getSido_area_info() {
		return sido_area_info;
	}

	public void setSido_area_info(List<Sido> sido_area_info) {
		this.sido_area_info = sido_area_info;
	}

	public List<Sigu> getSigu_area_info() {
		return sigu_area_info;
	}

	public void setSigu_area_info(List<Sigu> sigu_area_info) {
		this.sigu_area_info = sigu_area_info;
	}
	
	public String getConference_addition_input_info_JSON() {
		return conference_addition_input_info_JSON;
	}

	public void setConference_addition_input_info_JSON(String conference_addition_input_info_JSON) {
		this.conference_addition_input_info_JSON = conference_addition_input_info_JSON;
	}

	public String getConference_addition_input_info_value_JSON() {
		return conference_addition_input_info_value_JSON;
	}

	public void setConference_addition_input_info_value_JSON(String conference_addition_input_info_value_JSON) {
		this.conference_addition_input_info_value_JSON = conference_addition_input_info_value_JSON;
	}

	@Override
	public String toString() {
		return "Conference [conference_addition_input_info=" + conference_addition_input_info
				+ ", conference_addition_input_info_JSON=" + conference_addition_input_info_JSON
				+ ", conference_addition_input_info_value=" + conference_addition_input_info_value
				+ ", conference_addition_input_info_value_JSON=" + conference_addition_input_info_value_JSON
				+ ", conference_addition_title=" + conference_addition_title + ", conference_background_color="
				+ conference_background_color + ", conference_code=" + conference_code
				+ ", conference_cus_data_tablename=" + conference_cus_data_tablename + ", conference_entry_fee="
				+ conference_entry_fee + ", conference_idx=" + conference_idx + ", conference_inquiry="
				+ conference_inquiry + ", conference_link_url=" + conference_link_url + ", conference_max_num="
				+ conference_max_num + ", conference_name=" + conference_name + ", conference_open_state="
				+ conference_open_state + ", conference_over_state=" + conference_over_state
				+ ", conference_person_reserve_count=" + conference_person_reserve_count + ", conference_place="
				+ conference_place + ", conference_proc_date_title=" + conference_proc_date_title
				+ ", conference_proc_enddate=" + conference_proc_enddate + ", conference_proc_startdate="
				+ conference_proc_startdate + ", conference_recv_enddate=" + conference_recv_enddate
				+ ", conference_recv_startdate=" + conference_recv_startdate + ", conference_regdate="
				+ conference_regdate + ", conference_sub_text=" + conference_sub_text + ", conference_thumb_filename="
				+ conference_thumb_filename + ", conference_update=" + conference_update + ", remote_status="
				+ remote_status + ", sido_area_info=" + sido_area_info + ", sigu_area_info=" + sigu_area_info + "]";
	}

}
