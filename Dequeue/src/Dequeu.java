
public class Dequeu {
	private int maxSize;
	private int front;
	private int rear;
	private int[] dequeArray;
	private int nItems;
	
	public Dequeu(int s) {
		maxSize = s;
		dequeArray = new int[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public void insertLeft(int value) {
		if(rear == maxSize-1) {
			rear = -1;
		}
		if(rear == -1) {
			dequeArray[++rear] = value;
		}else {
			for(int i = nItems; i>0; i--) {
				dequeArray[i] = dequeArray[i-1];
			}
			dequeArray[front] = value;
			rear++;
		}
		nItems++;
	}
	
	public void insertRight(int value) {
		if(rear > maxSize ) {
			rear = -1;
		}
		dequeArray[++rear] = value;
		nItems++;
				
	}
	
	public int removeLeft() {
		int temp = dequeArray[front++];
		if(front == maxSize) {
			front = 0;
		}
		nItems--;
		return temp;
	}
	
	public int removeRight() {
		int temp = dequeArray[rear--];
		if(rear == 0 ){
			rear = maxSize;
		}
		nItems--;
		return temp;
	}
	
	public boolean isFull() {
		return (nItems == maxSize ); }
	
	public boolean isEmpty() { return (nItems == 0 );
	}
	
	public void display() {
		int j;
//		if(front == rear) {
//			System.out.println(array[front]);
//			//System.out.print(" ");
//		}
		//print single Item or empty array
		if(front == 0 && rear == -1) {
			System.out.print("Array is Empty");
			System.out.println("");
		}
		if(front == rear) {
			System.out.print(dequeArray[front]);
			System.out.println("");
		}
		if(rear > front) {
			for(j=front; j<=rear;j++) {
				System.out.print(dequeArray[j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
		if(rear < front && rear != -1) {
			for(j=front; j<maxSize; j++) {
			System.out.print(dequeArray[j]);
			System.out.print(" ");
			}
			for(j=0; j<=rear; j++) {
				System.out.print(dequeArray[j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}