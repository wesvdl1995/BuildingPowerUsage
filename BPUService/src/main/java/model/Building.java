package main.java.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Building")
public class Building {
	private String name;
	private List<Floor> listOfFloors;
	private List<PowerDrainer> listOfPowerDrainers;
	
	
	public Building(String name, List<Floor> listOfFloors, List<PowerDrainer> listOfPowerDrainers){
		this.setName(name);
		this.setListOfFloors(listOfFloors);
		this.setListOfPowerDrainers(listOfPowerDrainers);
	}
	
	@XmlElement(name="buildingName")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement(name="buildingFloors")
	public List<Floor> getListOfFloors() {
		return listOfFloors;
	}

	public void setListOfFloors(List<Floor> listOfFloors) {
		this.listOfFloors = listOfFloors;
	}
	public String addFloor(Floor f){
		this.listOfFloors.add(f);
		return "Floor '"+f.getNr()+"' with '"+f.getConsumers()+"' consumers and a a socket-usage of '"+f.getListOfPowerDrainers().get(0).getUsage()+" KWh' was added to '"+this.name+"'";
	}
	
	@XmlElement(name="buildingPowerDrainers")
	public List<PowerDrainer> getListOfPowerDrainers() {
		return listOfPowerDrainers;
	}

	public void setListOfPowerDrainers(List<PowerDrainer> listOfPowerDrainers) {
		this.listOfPowerDrainers = listOfPowerDrainers;
	}

	public String addDeviceToBuilding(String device, int usage) {
		listOfPowerDrainers.add(new PowerDrainer(device, usage));
		return device +" with usage '"+usage+" KWh' was added to '"+this.name+"'";
	}

	public String addDeviceToFloor(int floorNr, String device, int usage) {
	    for(Floor f : listOfFloors) {
	        if(f.getNr() == floorNr) {
	        	return f.addPowerDrainer(new PowerDrainer(device, usage));
	        }
	    }
	    return "floor does not exist";
		
	}

	public String calculateUsageForBuilding() {
		int total = 0;
	    for(Floor f : listOfFloors) {
	    	for(PowerDrainer p : f.getListOfPowerDrainers()) {
	    		total += p.getUsage();
	    	}
	    }
    	for(PowerDrainer p : listOfPowerDrainers) {
    		total += p.getUsage();
    	}
		return "The total power usage of "+this.name+" is '"+total+" KWh'";
	}
}
