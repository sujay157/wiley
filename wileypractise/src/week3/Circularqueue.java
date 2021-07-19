package week3;
class Circularclass{
	public int arr[];
	public int size;
	public int front=-1,rear=-1;
	public Circularclass(int size) {
		this.size=size;
	    arr=new int[size];
	}
	public void enQueue(int x) {
	    if (isfull()) {
	      System.out.println("Queue is full");
	    } else {
	      if (front == -1)
	        front = 0;
	      rear = (rear + 1) % size;
	      arr[rear] = x;
	      System.out.println("Inserted element is " + x);
	    }
	  }

	public void deQueue() {
	    int x;
	    if (isempty()) {
	      System.out.println("Queue is empty");
	      
	    } else {
	      x = arr[front];
	      if (front == rear) {
	        front = -1;
	        rear = -1;
	      } 
	      else {
	        front = (front + 1) % size;
	      }
	      System.out.println("removed element is: "+x);
	    }
	  }
	boolean isfull() {
	    if ((front == 0 && rear == size - 1)||(front==rear+1)) {
	      return true;
	    }
	  //  if (front == rear + 1) {
	    //  return true;
	   // }
	    return false;
	  }
	
	
	boolean isempty() {
	    if (front == -1)
	      return true;
	    else
	      return false;
	  }
     public void printqueue() {
    	for(int i=front;i<=rear;i++) {
    		System.out.println(arr[i]);
    	}
     }

}
public class Circularqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circularclass c=new Circularclass(5);
		c.enQueue(1);
		c.enQueue(2);
		c.enQueue(3);
		c.enQueue(4);
		c.enQueue(5);
		c.printqueue();
		System.out.println("---------");
		c.deQueue();
		c.deQueue();
		System.out.println("---------");
		c.printqueue();

	}

}
