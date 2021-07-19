package week3;
class Priority{
	public int size;
	public int index;
	public int arr[];
	public Priority(int size) {
		this.size=size;
		arr=new int[size];
	}
	public void enqueue(int x) {
		if(isfull()) {
			System.out.println("queue is full");}
			else {
				arr[index++]=x;
			}
		}
		public void dequeue() {
			if(isempty()) {
			System.out.println("queue is empty");
			
			}
			else {
				int i=0,max=0,x;
				for(i=0;i<index;i++) {
					if(arr[max]<arr[i]) {
						max=i;
					}
				}
				x=arr[max];
				arr[max]=arr[index-1];
				index=index-1;
				System.out.println("removed element is: "+x);
			}
		}
		
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
		    public void printqueue() {
				for (int i=0;i<index;i++) {
					System.out.println(arr[i]);
				}
				
			}
		
		
		
		
	}



public class Priorityqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Priority p=new Priority(5);
            p.enqueue(10);
            p.enqueue(0);
            p.enqueue(100);
            p.enqueue(2);
           // p.enqueue(10);
            
            p.printqueue();
            System.out.println("-------");
            p.dequeue();
            System.out.println("-------");
            p.printqueue();
            System.out.println("-------");
            p.dequeue();
            System.out.println("-------");
            p.printqueue();
	}

}
