package Day17;

//Functional Interface Annotation are single method interfaces
//Annotation supplies additional information to the compiler to the JVM(Java Virtual Machine).
//Lambda Expression is created with help of arrow(->) Symbol 
//function arguments(parameters)---Lambda Expression(->------function definition
//lambda function is used to refer functional interface 
//There is no need to create a implementable class in functional interface
//

public class FunctionalInterfaceDemo
{
	public static void main(String[] args) 
	
	{
		System.out.println("--------- in main---------");
		
		Runnable r = ()-> 
		{
			for (int i = 1;i<50;i++)
				System.out.println(Thread.currentThread().getName() + "Hello");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e)
				{
					// TODO: handle exception
					e.printStackTrace();
				}
				
		};
		
		Thread t1 = new Thread(r,"thread1");
		
		Thread t2 = new Thread(r ,"thread2");
		
		t1.start();
		t2.start();
		
		r = ()->
		{
			int i = 2;
			while(i<=100)
		
			{
				System.out.println(Thread.currentThread().getName() + "Thread 2");
				i+=2;
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		};
		
		Thread t3 = new Thread(r, "Thread 3");
		t3.start();
		
		r = ()->
		{
			int i = 3;
			while (i<= 300)
			{
				System.out.println(Thread.currentThread().getName() +"World");
				i+=3;
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
		
		Thread t4 = new Thread(r,"Thread 4");
		t4.start();
		
	}
}