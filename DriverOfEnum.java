package javaPrograms;

public class DriverOfEnum {

	public static void main(String[] args) {
		Days day=Days.SATURDAY;
		
		System.out.println("type of the enum saturady : "+ day.name());
		System.out.println("value of the enum saturday : "+ day.getValue());
		
		for(Days allday:Days.values())
		{
			System.out.println("value of the all enum :"+allday.getValue());
		}
		}	
	}

