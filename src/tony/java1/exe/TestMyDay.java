package tony.java1.exe;

public class TestMyDay {
	public static void main(String[] args) {
		
	}
}

class MyDate{
	private int day;
	private int month;
	private int year;
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	
//	public boolean equals(Object obj){
//		if(this == obj){
//			return true;
//		} else if(obj instanceof MyDate){
//			MyDate m = (MyDate)obj;
//			return this.day == m.day && this.month == m.month && this.year == m.year;
//		} else{
//			return false;
//		}
//	}
	
}
