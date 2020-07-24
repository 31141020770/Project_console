package test;

public class SV {
	private String name;
	private String hotenString;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHotenString() {
		return hotenString;
	}
	public void setHotenString(String hotenString) {
		this.hotenString = hotenString;
	}
	public SV(String name, String hotenString) {
		super();
		this.name = name;
		this.hotenString = hotenString;
	}
}
