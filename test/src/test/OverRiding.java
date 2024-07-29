package test;

class Animal{
	public void speak()
	{
		System.out.println("동물이 울고있습니다");
	}
}
class Dog extends Animal{
	public void speak(){
		System.out.println("멍멍");
	}
}

public class OverRiding {  
    public static void main(String[] args) {  
        Dog dog = new Dog();
        dog.speak();  
    }
}