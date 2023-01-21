package javaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapProgram {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter role");
	String role=s.next();
	String res=getpassword(role);
	System.out.println(res);
	}
	
	public static Map<String, Object> getCredentails()
	{
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("manager","abcd,6676777");
		map.put("admin","yuyyu,778556");
		map.put("user","cvcbvbv,9787");
		map.put("companypresent",false);
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
