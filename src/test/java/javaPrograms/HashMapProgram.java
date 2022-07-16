package javaPrograms;

import java.util.HashMap;
import java.util.Map;

public class HashMapProgram {

	public static void main(String[] args) {
	System.out.println(getusername("admin"));	
	System.out.println(getpassword("manager"));	
	System.out.println(getCredentails());
	}
	
	public static Map<String, Object> getCredentails()
	{
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("manager","abcd,6676777");
		map.put("admin","yuyyu,778556");
		map.put("user","cvcbvbv,9787");
		map.put("companypresent",true);
		map.put("countrycode",91);
		return map;
		
	}
	public static String getusername(String role)
	{
		if(companypresent("companypresent"))
		{
		return getCredentails().get(role).toString().split(",")[0];
		}
		else
		{
			return "company is not present";
		}
	}
	public static String getpassword(String role)
	{
		if(companypresent("companypresent"))
		{
		return getCredentails().get(role).toString().split(",")[1];
		}
		else
		{
			return "company is not present";
		}
	}
	public static boolean companypresent(String role)
	{
		return (Boolean) getCredentails().get(role);
	}

}
