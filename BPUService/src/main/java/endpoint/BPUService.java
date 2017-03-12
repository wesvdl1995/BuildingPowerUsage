package main.java.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import main.java.controller.BuildingManager;
import main.java.model.Building;

//@WebService(endpointInterface="main.java.endpoint.BPUServiceInterface")
public class BPUService implements BPUServiceInterface {
	BuildingManager bm = new BuildingManager();
	
	@Override
	//@WebMethod(action="fetch_buildiing", operationName="fetchBuilding")
	public String renameBuilding(String name){
		return bm.renameBuilding(name);
	}
	
	@Override
	public String addFloor(int consumers, int usage) {
		//if consumers of usage is not int: throw new InvalidInputException("Invalid input",consumers +" is not an integer value")
		
		return bm.addFloor(consumers, usage);
	}
	
	@Override
	public String addDeviceToBuilding(String device, int usage) {
		return bm.addDeviceToBuilding(device, usage);
	}
	
	@Override
	public String addDeviceToFloor(int floorNr, String device, int usage) {
		return bm.addDeviceToFloor(floorNr, device, usage);
	}
	
	@Override
	public String calculateUsageForBuilding() {
		return bm.calculateUsageForBuilding();
	}

}
