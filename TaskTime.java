package javaPrograms;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TaskTime {

	public static void main(String[] args) {
		LocalDate currentDate=LocalDate.now();
		LocalDate twoDaysLater = currentDate.plusDays(3); 
		DayOfWeek dayOfWeek = twoDaysLater.getDayOfWeek();
		if (dayOfWeek == DayOfWeek.MONDAY||dayOfWeek == DayOfWeek.TUESDAY||dayOfWeek == DayOfWeek.WEDNESDAY||dayOfWeek == DayOfWeek.THURSDAY) 
		{
			String expectedDisplayDate=twoDaysLater.format(DateTimeFormatter.ofPattern("M/d/yyyy")); 
			System.out.println("the display date : "+expectedDisplayDate);
			LocalDate threeDaysLater = currentDate.plusDays(4);
			String expectedDueDate=threeDaysLater.format(DateTimeFormatter.ofPattern("M/d/yyyy")); 
			System.out.println("the due date : "+expectedDueDate);
		} 
		
		else if (dayOfWeek == DayOfWeek.FRIDAY) 
		{
			String expectedDisplayDate=twoDaysLater.format(DateTimeFormatter.ofPattern("M/d/yyyy"));
			System.out.println("the display date : "+expectedDisplayDate);
			LocalDate threeDaysLater = currentDate.plusDays(6);
			String expectedDueDate=threeDaysLater.format(DateTimeFormatter.ofPattern("M/d/yyyy"));
			System.out.println("the due date : "+expectedDueDate);
		} 

		else if (dayOfWeek == DayOfWeek.SATURDAY) 
		{
			LocalDate sixDaysLater = currentDate.plusDays(5);
			String expectedDisplayDate=sixDaysLater.format(DateTimeFormatter.ofPattern("M/d/yyyy"));
			System.out.println("the display date : "+expectedDisplayDate);
			LocalDate sevenDaysLater = currentDate.plusDays(6);
			String expectedDueDate=sevenDaysLater.format(DateTimeFormatter.ofPattern("M/d/yyyy"));
			System.out.println("the due date : "+expectedDueDate);
		} 
		else
		{
			LocalDate fourDaysLater = currentDate.plusDays(4);
			String expectedDisplayDate=fourDaysLater.format(DateTimeFormatter.ofPattern("M/d/yyyy"));
			System.out.println("the display date : "+expectedDisplayDate);
			LocalDate fiveDaysLater = currentDate.plusDays(5);
			String expectedDueDate=fiveDaysLater.format(DateTimeFormatter.ofPattern("M/d/yyyy"));
			System.out.println("the due date : "+expectedDueDate);
		}


	}

}
