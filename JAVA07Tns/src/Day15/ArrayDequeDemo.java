/**
 * 
 */
package Day15;

import java.util.ArrayDeque;

/**
 * 
 */
public class ArrayDequeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		ArrayDeque<Integer> aQueue = new ArrayDeque<Integer>();
		aQueue.add(50);
		aQueue.add(60);
		aQueue.add(20);
		aQueue.add(100);
		aQueue.add(40);
		aQueue.add(90);
		aQueue.add(10);
		
		System.out.println(aQueue);
		System.out.println("------------------------------------------");
		
		aQueue.addFirst(70);
		aQueue.addLast(10);
		
		System.out.println(aQueue);
		System.out.println("--------------------------------------------");
		
		System.out.println("First Element :" +aQueue.getFirst());
		System.out.println("Last Element" +aQueue.getLast());
		System.out.println("Remove First Element " +aQueue.removeFirst());
		System.out.println("Remove Last Element " +aQueue.removeLast());
		
		while(!aQueue.isEmpty())
		{
			System.out.println("Remove Elements :" +aQueue.remove());
		}
	}

}
