package main.java.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebService;

import main.java.model.Building;

@WebService //(name="BPUServiceInterface")
public interface BPUServiceInterface {
	@WebMethod(exclude=true)
	String createBuilding(String name);
	
	
	//@WebResult(name="Building")
	@WebMethod
	public Building getBuilding();
	
	@WebMethod
	public String addFloor(int consumers, int usage);
	
	
}
