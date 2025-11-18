package javaPrograms;

public enum Days {

	SATURDAY("week end"),
	SUNDAY("holiday");
	private String value;
	Days(String value)
	{
		this.value=value;
	}
	public String getValue()
	{
		return value;
	}

}
