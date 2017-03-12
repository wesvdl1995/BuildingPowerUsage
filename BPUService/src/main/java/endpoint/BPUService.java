package main.java.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebService;

import main.java.controller.BuildingManager;
import main.java.model.Building;

@WebService( //endpointInterface="main.java.endpoint.BPUServiceInterface",
portName="BPUServiceePort",
serviceName="BPUServicee")

public class BPUService implements BPUServiceInterface {
	BuildingManager bm = new BuildingManager();
	
	@Override
	public Building getBuilding(){
		return bm.getBuilding();
	}

	@Override
	@WebMethod(exclude=true)
	public String createBuilding(String name) {
		return bm.createBuilding(name);
	}

	@Override
	public String addFloor(int consumers, int usage) {
		return bm.addFloor(consumers, usage);
	}

}
