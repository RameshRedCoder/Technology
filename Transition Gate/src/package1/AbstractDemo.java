package package1;

abstract class Vehicle
{
	abstract void drive();
}
class Car extends Vehicle
{
	void drive()
	{
		System.out.println("Driving a car");
		
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Car();
		v.drive();

	}

}

