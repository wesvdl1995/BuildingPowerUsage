package main.java.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import main.java.model.Building;

//@WebService
@SOAPBinding(style=Style.DOCUMENT)
public interface BPUServiceInterface {
	//@WebResult(name="Building")
	//@WebMethod 
	public String renameBuilding(String name);
	//@WebMethod 
	public String addFloor(int consumers, int usage);
	//@WebMethod 
	public String addDeviceToBuilding(String device, int usage);
	//@WebMethod 
	public String addDeviceToFloor(int floorNr, String device, int usage);
	//@WebMethod 
	public String calculateUsageForBuilding();
}
