package oops4;

public class Maruti_zen extends Maruti {

	@Override
	public void foglamps() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void powerwindows() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		Maruti_zen obj = new Maruti_zen();
		//Maruti obj1 = new Maruti(); //can't instantiate abstract class
		 //Car1 obj2 = new Car1(); // can't instantiate interface
		
		Maruti obj3 = new Maruti_zen();
		// class instantiated and object type is abstract class
		Car1 obj4 = new Maruti_zen();
// class instantiated and object type is interface
		}

}
