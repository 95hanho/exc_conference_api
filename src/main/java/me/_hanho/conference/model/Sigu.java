package me._hanho.conference.model;

public class Sigu extends Sido {

	private String parent_code;
	
	public Sigu() {
		// TODO Auto-generated constructor stub
	}

	public Sigu(String parent_code) {
		super();
		this.parent_code = parent_code;
	}

	public String getParent_code() {
		return parent_code;
	}

	public void setParent_code(String parent_code) {
		this.parent_code = parent_code;
	}

	@Override
	public String toString() {
		return "Sigu [parent_code=" + parent_code + "]";
	}
	
}
