package javaPrograms;

import java.util.ArrayList;
import java.util.List;

public class Tests {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(56667);
		list.add(54565);
		list.add(12334);
		list.stream().forEach(e -> {
	            boolean b = true;
	            if (b) 
	            {
	                System.out.println(e);
	            }
	            
	        });
		
	}

}
