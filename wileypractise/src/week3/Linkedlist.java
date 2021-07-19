package week3;
class Linkedlistclass{
	public int arr[];
	public int size;
	public int index=0;
	public Linkedlistclass(int size) {
		this.size=size;
		arr=new int[size];
	}
	public void insert(int x) {
		if(isfull()) {
			System.out.println("linked list is full");
		}
		else {
			arr[index]=x;
			index++;
		}
	}
	public void delete(int x) {
		if(isempty()) {
			System.out.println("linked list is empty");	
		}
		else {
			int i;
			for(i=x;i<index-1;i++)
	     	{
	         arr[i]=arr[i+1];
	     }
	     this.index=this.index-1;
	     //System.out.println("indexd:"+index);
	     
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
	public void printlist() {
		for (int i=0;i<index;i++) {
			System.out.println(arr[i]);
		}
		//System.out.println("index:"+index);
	}
	
}

public class Linkedlist {

	public static void main(String[] args) {
		Linkedlistclass l=new Linkedlistclass(4);
		l.insert(1);
		l.insert(3);
		l.insert(2);
		l.insert(4);
		//l.printlist();
		l.delete(0);
		l.printlist();

	}

}
