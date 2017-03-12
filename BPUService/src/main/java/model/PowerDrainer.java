package main.java.model;

public class PowerDrainer {
	private String name;
	private int usage;
	
	public PowerDrainer(String name, int usage) {
		this.setName(name);
		this.setUsage(usage);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUsage() {
		return usage;
	}

	public void setUsage(int usage) {
		this.usage = usage;
	}

}
