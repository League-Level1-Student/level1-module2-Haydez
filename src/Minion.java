
public class Minion {
Minion Stuart = new Minion("Bob", 2, "yellow", "yeti");
private String name;
private String color;
private String master;
private int eyes;
	Minion(String name, int eyes, String color, String master) {
		System.out.println("hi");
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
		
	}
}
