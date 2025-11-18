package javaPrograms;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
public class CurrentDate {

	public static void main(String[] args) {

		LocalDate currentDate = LocalDate.now();
		LocalDate twoDaysLater = currentDate.plusDays(3);
		DayOfWeek dayOfWeek = twoDaysLater.getDayOfWeek();
		if (dayOfWeek == DayOfWeek.MONDAY) 
		{
			SimpleDateFormat dateFormat = new SimpleDateFormat("M/d/yyyy");  
			String displayDate=dateFormat.format(twoDaysLater);
			System.out.println("the display date : "+displayDate);
			LocalDate threeDaysLater = currentDate.plusDays(4);
			String dueDate=dateFormat.format(threeDaysLater);
			System.out.println("the due date : "+dueDate);
		} 
		else if (dayOfWeek == DayOfWeek.TUESDAY) 
		{
			SimpleDateFormat dateFormat = new SimpleDateFormat("M/d/yyyy");  
			String displayDate=dateFormat.format(twoDaysLater);
			System.out.println("the display date : "+displayDate);
			LocalDate threeDaysLater = currentDate.plusDays(4);
			String dueDate=dateFormat.format(threeDaysLater);
			System.out.println("the due date : "+dueDate);
		} 

		else if (dayOfWeek == DayOfWeek.WEDNESDAY) 
		{
			SimpleDateFormat dateFormat = new SimpleDateFormat("M/d/yyyy");  
			String displayDate=dateFormat.format(twoDaysLater);
			System.out.println("the display date : "+displayDate);
			LocalDate threeDaysLater = currentDate.plusDays(4);
			String dueDate=dateFormat.format(threeDaysLater);
			System.out.println("the due date : "+dueDate);
		} 

		else if (dayOfWeek == DayOfWeek.THURSDAY) 
		{
			SimpleDateFormat dateFormat = new SimpleDateFormat("M/d/yyyy");  
			String displayDate=dateFormat.format(twoDaysLater);
			System.out.println("the display date : "+displayDate);
			LocalDate threeDaysLater = currentDate.plusDays(4);
			String dueDate=dateFormat.format(threeDaysLater);
			System.out.println("the due date : "+dueDate);
		} 

		else if (dayOfWeek == DayOfWeek.FRIDAY) 
		{
			SimpleDateFormat dateFormat = new SimpleDateFormat("M/d/yyyy");  
			String displayDate=dateFormat.format(twoDaysLater);
			System.out.println("the display date : "+displayDate);
			LocalDate threeDaysLater = currentDate.plusDays(6);
			String dueDate=dateFormat.format(threeDaysLater);
			System.out.println("the due date : "+dueDate);
		} 

		else if (dayOfWeek == DayOfWeek.SATURDAY) 
		{
			SimpleDateFormat dateFormat = new SimpleDateFormat("M/d/yyyy"); 
			LocalDate sixDaysLater = currentDate.plusDays(6);
			String displayDate=dateFormat.format(sixDaysLater);
			System.out.println("the display date : "+displayDate);
			LocalDate sevenDaysLater = currentDate.plusDays(7);
			String dueDate=dateFormat.format(sevenDaysLater);
			System.out.println("the due date : "+dueDate);
		} 
		else
		{
			SimpleDateFormat dateFormat = new SimpleDateFormat("M/d/yyyy"); 
			LocalDate fourDaysLater = currentDate.plusDays(4);
			String displayDate=dateFormat.format(fourDaysLater);
			System.out.println("the display date : "+displayDate);
			LocalDate fiveDaysLater = currentDate.plusDays(5);
			String dueDate=dateFormat.format(fiveDaysLater);
			System.out.println("the due date : "+dueDate);
		}

	}

}
