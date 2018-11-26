
public class Minion {
private String name;
private String color;
private String master;
private int eyes;
	Minion(String name, int eyes, String color, String master) {
		this.name = name;
		this.color = color;
		this.master = master;
		this.eyes = eyes;
	}

	String getName() {
		 return name;
	}
	int getEyes() {
		return eyes;
	}
	String getColor() {
		return color;
	}
	String getMaster() {
		return master;
	}
	void setMaster(String master) {
		this.master=master;
	}
	void setName(String name) {
		this.name=name;
	}
	void setEyes(int eyes) {
		  this.eyes=eyes;
	  }
}


