package main.java.controller;

import java.util.ArrayList;
import java.util.List;

import main.java.model.Building;
import main.java.model.Floor;
import main.java.model.PowerDrainer;

public class BuildingManager {
	private Building building;
	
	public BuildingManager(){
		createBuilding("Nameless Building");
	}
	
	public String createBuilding(String name){
		List<Floor> listOfFloors = new ArrayList<Floor>();
		List<PowerDrainer> listOfPowerDrainers = new ArrayList<PowerDrainer>();
		this.building = new Building(name, listOfFloors, listOfPowerDrainers);
		return "building '"+this.building.getName()+"' has been created";
	}
	
	public Building getBuilding(){
		return this.building;
	}
	public void setBuilding(Building b){
		this.building = b;
	}

	public String addFloor(int consumers, int usage) {
		List<PowerDrainer> floorsockets = new ArrayList<PowerDrainer>();
		floorsockets.add(new PowerDrainer("Sockets", usage));
		int nr = this.building.getListOfFloors().size()+1;
		
		return this.building.addFloor(new Floor(nr, consumers, floorsockets));
	}
	
}
