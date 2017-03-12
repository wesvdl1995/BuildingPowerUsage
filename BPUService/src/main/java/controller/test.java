package main.java.controller;

import main.java.endpoint.BPUService;
import main.java.model.Building;

public class test {
	public static void main(String[] args) { 
		BPUService bpu = new BPUService();
		
		//System.out.println(bpu.getBuilding().getName());
		System.out.println(bpu.addFloor(15, 40000));
	} 
}
