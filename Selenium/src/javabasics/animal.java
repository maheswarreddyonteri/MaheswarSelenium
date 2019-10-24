package javabasics;

public class animal {

	public static void main(String[] args) {
		
		monkey mon = new monkey();
		mon.run();
		
		tiger tig = new tiger();
		tig.run();
		
		dog dg = new dog();
		dg.burking();

	}

}

class monkey {
	
	void run(){
		System.out.println("monkey run");
	}
}

class tiger {
	void run() {
		System.out.println("tiger run");
		
	}
}

class dog {
	void burking() {
		System.out.println("dog burking");
		
	}
}