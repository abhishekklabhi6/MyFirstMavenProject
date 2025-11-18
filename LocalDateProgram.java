package javaPrograms;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateProgram {

	public static void main(String[] args) {
		LocalDate currentDate=LocalDate.now();
		LocalDate twoDaysLater = currentDate.plusDays(3); 
		DayOfWeek dayOfWeek = twoDaysLater.getDayOfWeek();
		if (dayOfWeek == DayOfWeek.MONDAY) 
		{
			String displayDate=twoDaysLater.format(DateTimeFormatter.ofPattern("M/d/yyyy")); 
			System.out.println("the display date : "+displayDate);
			LocalDate threeDaysLater = currentDate.plusDays(4);
			String dueDate=threeDaysLater.format(DateTimeFormatter.ofPattern("M/d/yyyy")); 
			System.out.println("the due date : "+dueDate);
		} 
		else if (dayOfWeek == DayOfWeek.TUESDAY) 
		{
			String displayDate=twoDaysLater.format(DateTimeFormatter.ofPattern("M/d/yyyy"));  
			System.out.println("the display date : "+displayDate);
			LocalDate threeDaysLater = currentDate.plusDays(4);
			String dueDate=threeDaysLater.format(DateTimeFormatter.ofPattern("M/d/yyyy"));
			System.out.println("the due date : "+dueDate);
		} 

		else if (dayOfWeek == DayOfWeek.WEDNESDAY) 
		{
			String displayDate=twoDaysLater.format(DateTimeFormatter.ofPattern("M/d/yyyy"));  
			System.out.println("the display date : "+displayDate);
			LocalDate threeDaysLater = currentDate.plusDays(4);
			String dueDate=threeDaysLater.format(DateTimeFormatter.ofPattern("M/d/yyyy"));
			System.out.println("the due date : "+dueDate);
		} 

		else if (dayOfWeek == DayOfWeek.THURSDAY) 
		{
			String displayDate=twoDaysLater.format(DateTimeFormatter.ofPattern("M/d/yyyy"));  
			System.out.println("the display date : "+displayDate);
			LocalDate threeDaysLater = currentDate.plusDays(4);
			String dueDate=threeDaysLater.format(DateTimeFormatter.ofPattern("M/d/yyyy"));
			System.out.println("the due date : "+dueDate);
		} 

		else if (dayOfWeek == DayOfWeek.FRIDAY) 
		{
			String displayDate=twoDaysLater.format(DateTimeFormatter.ofPattern("M/d/yyyy"));
			System.out.println("the display date : "+displayDate);
			LocalDate threeDaysLater = currentDate.plusDays(6);
			String dueDate=threeDaysLater.format(DateTimeFormatter.ofPattern("M/d/yyyy"));
			System.out.println("the due date : "+dueDate);
		} 

		else if (dayOfWeek == DayOfWeek.SATURDAY) 
		{
			LocalDate sixDaysLater = currentDate.plusDays(5);
			String displayDate=sixDaysLater.format(DateTimeFormatter.ofPattern("M/d/yyyy"));
			System.out.println("the display date : "+displayDate);
			LocalDate sevenDaysLater = currentDate.plusDays(6);
			String dueDate=sevenDaysLater.format(DateTimeFormatter.ofPattern("M/d/yyyy"));
			System.out.println("the due date : "+dueDate);
		} 
		else
		{
			LocalDate fourDaysLater = currentDate.plusDays(4);
			String displayDate=fourDaysLater.format(DateTimeFormatter.ofPattern("M/d/yyyy"));
			System.out.println("the display date : "+displayDate);
			LocalDate fiveDaysLater = currentDate.plusDays(5);
			String dueDate=fiveDaysLater.format(DateTimeFormatter.ofPattern("M/d/yyyy"));
			System.out.println("the due date : "+dueDate);
		}

		
	}

}
