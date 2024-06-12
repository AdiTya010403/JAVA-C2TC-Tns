package Day15;

import java.util.PriorityQueue;

public class ProrityQueueDemo {

	public static void main(String[] args) 
	{
	
		// TODO Auto-generated method stub

		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		
		pQueue.add(50);
		pQueue.add(60);
		pQueue.add(20);
		pQueue.add(100);
		pQueue.add(40);
		pQueue.add(90);
		pQueue.add(10);
		
		System.out.println(pQueue);
		System.out.println("-------------------------------------------------");
		
		while(!pQueue.isEmpty())
			{
				System.out.println(pQueue.remove());
			}
		
	}

}
