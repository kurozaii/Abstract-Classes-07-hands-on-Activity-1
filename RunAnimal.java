import java.util.Scanner;
public class RunAnimal{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose an animal. Press B for bird, C for Cat, or D for Dog: ");
		String select= sc.nextLine();
		
		
		if(select.equalsIgnoreCase("B")){
			Bird bird = new Bird();
			bird.eat();
			System.out.print("and ");
			bird.sleep();
			bird.makeSound();
		}
		else if(select.equalsIgnoreCase("C")){
			Cat cat = new Cat();
			cat.eat();
			System.out.print("and ");
			cat.sleep();
			cat.makeSound();
		}
		else if(select.equalsIgnoreCase("D")){
			Dog dog = new Dog();
			dog.eat();
			System.out.print("and ");
			dog.sleep();
			dog.makeSound();
		}else{
			System.out.println("Incorrect input Please try again later");
		
		}
		
		
		
		
	}
}