package person;


import java.nio.charset.CharacterCodingException;
import java.util.regex.MatchResult;


//problem1
class Dog{

    public void speak()
    {
        System.out.println("woof!");
    }
    
}
class Beagle extends Dog{

    public void speak() {
    	super.speak();
    
        System.out.println("arf arf");
    }
}







class Animal{
	private String name;
	private int age;
	private String colour;
	
	
	public Animal(String name, int age, String colour) {
	
		this.name = name;
		this.age = age;
		this.colour = colour;
	}





	public void chare(String name) {
		if(name=="dog") {
			System.out.println("barking!!");
			System.out.println("good family pet");
			System.out.println("loyal companion");
			
		}else if(name=="cat") {
			System.out.println("meows");
			System.out.println("sharp");
			System.out.println("spontaneity");
			
		}else {
			System.out.print("good looking");
		}
		
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getColour() {
		return colour;
	}



	public void setColour(String colour) {
		this.colour = colour;
	}
		
	
	
}




public class dec1 {
	
	public static void main(String[] args) {
		
		
		Animal Animal1=new Animal("dog",4," black");
		Animal animal2=new Animal("cat", 3, "white");
		Animal animal3=new Animal("tiger ", 6, "white");
		
		
		
		animal2.setAge(3);
		animal2.setName("tiger");
		animal2.setColour("white");
		
		System.out.println(animal2.getAge());
		System.out.println(animal2.getName());
		System.out.println(animal2.getColour());
		
		System.out.println();
		
		Animal1.chare("dog");
		
		//___________________problem1
        Dog d = new Dog();
        d.speak();
        Dog b = new Beagle();
        b.speak();
    }

		
		
	}