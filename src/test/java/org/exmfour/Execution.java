package org.exmfour;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

 
 

public class Execution {

	public static void main(String[] args) throws IOException {
	 
		File f = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Day6Example4\\src\\main\\resources\\Example4dec.json");
		
		FileReader r = new FileReader(f);
		
		ObjectMapper objectmapper = new ObjectMapper();
		
		RootFour readValue = objectmapper.readValue(r, RootFour.class);
		
		System.out.println(readValue.getId());
		
		System.out.println(readValue.getName());
		
		System.out.println(readValue.getType());
		
		System.out.println(readValue.getPpu());
		
		
		Batters batters = readValue.getBatters();
		
		ArrayList<Batter> batter = batters.getBatter();
		
		for(int i=0;i<batter.size();i++) {
			
			Batter batter2 = batter.get(i);
			
			System.out.println(batter2.getId());
			
			System.out.println(batter2.getType());
		}
		
		
		ArrayList<Topping> topping = readValue.getTopping();
		
		for(int j=0;j<topping.size();j++) {
			
			Topping topping2 = topping.get(j);
			
			System.out.println(topping2.getId());
			
			System.out.println(topping2.getType());
			
		}
	}

}
