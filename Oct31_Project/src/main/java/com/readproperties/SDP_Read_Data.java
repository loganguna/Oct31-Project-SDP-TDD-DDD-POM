package com.readproperties;

import java.io.IOException;

public class SDP_Read_Data {
	
	private SDP_Read_Data() { //restrict to create a object in another class
	
	}
	
	public static SDP_Read_Data getInstanceSDP_RD() { // return current class objects
		
		SDP_Read_Data reader = new SDP_Read_Data();
		
		return reader;
	}
	
	public Read_Data getInstanceRD() throws IOException { // return other class objects
		
		Read_Data reader = new Read_Data();
		
		return reader;
	}
		
}
