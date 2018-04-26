package datastructures;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueClass {

	public static void main(String[] args) {
		
		Queue myQueue = new LinkedList(); 

		// add elements in the queue using offer() - return true/false
		
                myQueue.offer("Monday");
		myQueue.offer("Thusday");
//		returns true if wednesday is in queue
		boolean flag = myQueue.offer("Wednesday");
		
		System.out.println("Wednesday inserted successfully? "+flag);
		
		// add more elements using add() - throws IllegalStateException
		try {
			myQueue.add("Thursday");
			myQueue.add("Friday");
			myQueue.add("Weekend");
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
		
		System.out.println("Pick the head of the queue: " + myQueue.peek());
		
		String head = null;
		try {
			// remove head - remove()
//            Remove the first from the queue
			head = (String) myQueue.remove();
			System.out.print("1) Push out " + head + " from the queue "); 
			System.out.println("and the new head is now: "+myQueue.element());
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		
		// remove the head - poll()
        //            Remove the first from the queue again
		head = (String) myQueue.poll();
		System.out.print("2) Push out " + head + " from the queue");
		System.out.println("and the new head is now: "+myQueue.peek());
		
		// find out if the queue contains an object
		System.out.println("Does the queue contain 'Weekend'? " + myQueue.contains("Weekend"));
		System.out.println("Does the queue contain 'Monday'? " + myQueue.contains("Monday"));
	}

}

