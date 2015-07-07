package tony.account.exer;

public class TestInstance {
	public static void main(String[] args) {
		TestInstance ti = new TestInstance();
		ti.method1(new Student());

		ti.method1(new Graduate());
		
	}
	
	public void method1(Person e){
		System.out.println(e.getInfo());
		if(e instanceof Person){
			System.out.println("A person");
		}
		if(e instanceof Student){
			
			System.out.println("A student");
			
		}
		if(e instanceof Graduate){
			System.out.println("A Graduated student");
		}
		
	}
}


class Person{
	protected String name="person";
	protected int age = 50;
	
	public String getInfo(){
		return "Name: " + name +"\n" +"age: " + age; 
	}
	
}

class Student extends Person{
	protected String school = "pku";
	public String getInfo(){
		return "Name: " + name +"\nage:" + age +"\nschool: " +school;
	}
}

class Graduate extends Student {
	public String major = "IT";
	
	public String getInfo(){
		return "Name: " + name + "\nage: " +age+ "\nschool: " +school+"\nmajor: " + major;
	}
}