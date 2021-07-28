

public class constructor extends userdefined {

public void method1() {
	System.out.println("1");
	System.out.println(super.method7());

}
public void method2() {
	System.out.println("2");

}
public void method3() {
	this.method2();
	super.method7();

}
public static void main(String[] args) {
	constructor c= new constructor();
	c.method3();
	
}
	  }
	


