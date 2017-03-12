package main.java.model;

import java.util.List;

public class Floor {
	private int nr;
	private int consumers;
	private List<PowerDrainer> listOfPowerDrainers;
	
	public Floor(int nr, int consumers, List<PowerDrainer> listOfPowerDrainers) {
		this.setNr(nr);
		this.setConsumers(consumers);
		this.setListOfPowerDrainers(listOfPowerDrainers);
	}

	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

	public int getConsumers() {
		return consumers;
	}

	public void setConsumers(int consumers) {
		this.consumers = consumers;
	}

	public List<PowerDrainer> getListOfPowerDrainers() {
		return listOfPowerDrainers;
	}

	public void setListOfPowerDrainers(List<PowerDrainer> listOfPowerDrainers) {
		this.listOfPowerDrainers = listOfPowerDrainers;
	}
}
