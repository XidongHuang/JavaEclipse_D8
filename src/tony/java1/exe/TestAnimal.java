package tony.java1.exe;

public class TestAnimal {
	public static void main(String[] args) {
		TestAnimal t = new TestAnimal();
		t.func(new Animal());
		
		Animal a = new Dog();
		
		t.func(a);
		
		
		
	}
	public void func(Animal a){
		a.eat();
		a.jump();
		
		if(a instanceof Dog){
			Dog d = (Dog)a;
			d.bark();
		}
		if(a instanceof Cat){
			Cat c = (Cat)a;
			c.habbit();
		}
		
	}
	
}

class Animal{
	private String name;
	private int age;
	
	public void eat(){
		System.out.println("Eat!");
	}
	
	public void jump(){
		System.out.println("Jump!");
	}
}


class Dog extends Animal{
	public void eat(){
		System.out.println("Dog is eating!");
	}
	public void jump(){
		System.out.println("Dog is jumping!");
	}
	public void bark(){
		System.out.println("Dog is barking!");
	}
}


class Cat extends Animal{
	public void eat(){
		System.out.println("Cat is eating!");
	}
	
	public void jump(){
		System.out.println("Cat is jumping!");
	}
	
	public void habbit(){
		System.out.println("Cat catch mouse");
	}
	
}

