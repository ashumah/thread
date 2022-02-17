package thread;



class A extends Thread
{
	public void run() {
		System.out.println("cuurent id of A:" + Thread.currentThread().getId());
	}
	
}
class B extends Thread
{
	public void run() {
		System.out.println("cuurent id of B:" + Thread.currentThread().getId());

	}
}
class C extends Thread
{
	public void run() {
		System.out.println("cuurent id of C:" + Thread.currentThread().getId());

	}
}
class D implements Runnable{
	  public void run() {
		  System.out.println("current Id of D:" + Thread.currentThread().getId());
	  }
}

public class multithread {
	

	public static void main(String[] args) {
		A a = new A();
		a.setPriority(3);
		a.start();
		B b = new B();
		b.start();
		C c = new C();
		c.start();
		D d = new D();
		Thread th = new Thread(d);
		th.start();
		System.out.println("Id of main method" + Thread.currentThread().getId());
		
		
		// TODO Auto-generated method stub

	}

}
