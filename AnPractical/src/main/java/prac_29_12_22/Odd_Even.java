/*Q3
 * Create a thread to find if the number is odd or even
 * 
 */


/**Explanation :- In this java code the Thread class to create a 
 * thread in Java to find if a number is odd or even, using the main method as the entry point
 */




package prac_29_12_22;



public class Odd_Even {
	  public static void main(String[] args) {
	    // Create a new thread
	    Thread t = new Thread(new OddEvenThread(5));

	    // Start the thread
	    t.start();
	  }
	}

	class OddEvenThread implements Runnable {
	  private int num;

	  public OddEvenThread(int num) {
	    this.num = num;
	  }

	  @Override
	  public void run() {
	    if (num % 2 == 0) {// for even 
	      System.out.println(num + " is even");
	    } else {
	      System.out.println(num + " is odd");
	    }
	  }
	}


