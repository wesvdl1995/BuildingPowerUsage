package main.java.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import main.java.model.Building;

@WebService
@SOAPBinding(style=Style.DOCUMENT)
public interface BPUServiceInterface {
	//@WebResult(name="Building")
	@WebMethod public abstract String renameBuilding(String name);
	@WebMethod public abstract String addFloor(int consumers, int usage);
	@WebMethod public abstract String addDeviceToBuilding(String device, int usage);
	@WebMethod public abstract String addDeviceToFloor(int floorNr, String device, int usage);
	@WebMethod public abstract String calculateUsageForBuilding();
}
