package me._hanho.conference.model;

public class Sido {
	
	private String name;
	private String code;
	
	public Sido() {
		// TODO Auto-generated constructor stub
	}

	public Sido(String name, String code) {
		super();
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Sido [name=" + name + ", code=" + code + "]";
	}

}
