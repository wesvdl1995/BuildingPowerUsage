package main.java.controller;

import main.java.endpoint.BPUService;
import main.java.model.Building;

public class test {
	public static void main(String[] args) { 
		BPUService bpu = new BPUService();
		System.out.println(bpu.renameBuilding("Test Towers"));
		
		System.out.println(bpu.addFloor(15, 40000)); // Floor 1
		//System.out.println(bpu.addFloor(30, 50000)); // Floor 2
		
		System.out.println(bpu.addDeviceToBuilding("lift", 40000));
		//System.out.println(bpu.addDeviceToBuilding("ventilation", 20000));
		
		System.out.println(bpu.addDeviceToFloor(1, "airco", 2000));
		//System.out.println(bpu.addDeviceToFloor(1, "airco & heating", 3000));
		
		System.out.println(bpu.calculateUsageForBuilding());
		
	} 
}
