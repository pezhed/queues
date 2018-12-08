
public class dequeApp {
	public static void main(String[] args) {
		
		Dequeu deque = new Dequeu(5);
		
		
		deque.insertLeft(4);
		deque.insertLeft(5);
		deque.insertLeft(6);
		deque.insertLeft(3);
		deque.insertLeft(4);

		deque.display();
		
		deque.removeLeft();
		
		deque.display();
		
		deque.insertLeft(40);
		deque.display();

	}
}
