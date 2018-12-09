
public class Dequeu {
	private int maxSize;
	private int front;
	private int rear;
	private int[] dequeArray;
	private int nItems;
	
	public Dequeu(int s) {
		maxSize = s;
		dequeArray = new int[maxSize];
		front = -1;
		rear = -1;
		nItems = 0;
	}
	
	public void insertLeft(int value) {

		if(rear == -1 && front == -1 ) {
			dequeArray[++rear] = value;
			front++;
		}
		else if(rear >= front ) {
			shiftTop();
			dequeArray[front] = value;	
	
		}
		else {
			shiftBottom();
			dequeArray[front] = value;	
			rear++;
		}
		
		nItems++;
	}
	private void shiftTop() {
	
		for(int i = rear; i >= front; i--) {
		//	for(int i = nItems; i >= front; i--) {
			if(i == maxSize-1)
				dequeArray[0] = dequeArray[i];
			else 
				dequeArray[i+1] = dequeArray[i];
		}
		if(rear == maxSize-1)
			rear = -1;
		rear++;
	}
	private void shiftBottom() {

		for(int i = rear; i >= 0; i--) {
			dequeArray[i+1] = dequeArray[i];

		}
		for(int j = nItems; j >= front; j--) {
			if(j == maxSize-1)
				dequeArray[0] = dequeArray[j];
			else 
				dequeArray[j+1] = dequeArray[j];
		}

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