package javaPrograms;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasic {

	public static void main(String[] args) {

		Map<String,Object> map=new HashMap<String,Object>();
		map.put("manager","abcd,6676777");
		map.put("admin","yuyyu,778556");
		map.put("user","cvcbvbv,9787");
		map.put("companypresent",true);
		map.put("countrycode",91);
		System.out.println(map);
		if(map.containsKey("manager"))
		{
			System.out.println(" present");

		}
		else
		{
			System.out.println(" not present");
		}

		System.out.println(map.get("manager"));

	}

}
