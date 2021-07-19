package week3;
class Queueclass{
	public int arr[];
	public int size;
	public int index;
	
	public Queueclass(int size) {
		this.size=size;
		arr=new int[size];		
	}
	public void enqueue(int x) {
		if(isfull()) {
			System.out.println("queue is full"); ;
			
		}else {		
		arr[index]=x;
		index=index+1;
		
		}
	}
	
	public void dequeue() {
		if(isempty()) {
			System.out.println("queue is empty");
			
		}else {
			int x=arr[0];
			for(int i=0;i<index-1;i++) {
				arr[i]=arr[i+1];
			}
			index=index-1;
			System.out.println("the removed element is: "+x);
		
	}}
	 public boolean isempty() {
	        if (index == 0) {
	            return true;
	        }
	        return false;
	    }
	 
	    public boolean isfull() {
	        if (index == size) {
	            return true;
	        }
	        return false;
	    }
	    public void printlist() {
			for (int i=0;i<index;i++) {
				System.out.println(arr[i]);
			}
			
		}
		
}
public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queueclass q= new Queueclass(4);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.printlist();
		System.out.println("--------------------");
		q.dequeue();
		q.dequeue();
		System.out.println("--------------------");
		q.printlist();
		

	}

}
