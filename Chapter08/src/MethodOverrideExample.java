//부모 클래스
class Animal{
	void makeSound() {
		//메서드 정의 : 모든 동물은 소리를 낼 수 있다.
		System.out.println("동물이 소리를 냅니다");
	}
}

//자식 클래스 : 개
class Dog extends Animal{
	//메서드 오버라이딩 : 부모 클래스의 makeSound()를 재정의
	@Override
	void makeSound() {
		System.out.println("멍멍!");
	}
}

//자식 클래스 : 고양이
class Cat extends Animal{
	//메서드 오버라이딩
	@Override
	void makeSound() {
		System.out.println("야옹!");
	}
}

//메인 클래스
public class MethodOverrideExample {
	public static void main(String[] args) {
		//부모 클래스 타입으로 각각의 객체 생성
		Animal myAnimal = new Animal(); //부모 클래스
		Animal myDog = new Dog();//자식 클래스 - Dog
		Animal myCat = new Cat();//자식 클래스 - Cat
		
		//메서드 호출 : 각각의 실제 타입에 따라 오버라이딩된 메서드 실행
		myAnimal.makeSound();//출력:동물이 소리를 냅니다.
		myDog.makeSound();//출력: 멍멍!
		myCat.makeSound();//출력: 야옹!
	
	} 
}
