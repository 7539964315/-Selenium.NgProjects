package testng;

import org.testng.annotations.Test;

public class Prioritation {
	@Test(priority=1)
	public void f1(){
	System.out.println("Executimg f1.....");
	}

	@Test(priority=4)
	public void f2(){
	System.out.println("Executimg f2.....");
	}

	@Test(priority=2)
	public void f3(){
	System.out.println("Executimg f3.....");
	}

	@Test(priority=3)
	public void f4(){
	System.out.println("Executimg f4.....");
	}

}
