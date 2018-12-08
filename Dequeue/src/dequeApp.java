
public class dequeApp {
	public static void main(String[] args) {
		
		Dequeu deque = new Dequeu(5);
		
		
		deque.insertLeft(10);
		deque.insertLeft(20);
		deque.insertLeft(30);
		deque.insertLeft(40);
		deque.insertLeft(50);

		deque.display();
		
		deque.removeLeft();
		deque.removeLeft();
		
		deque.display();
		
		deque.insertLeft(60);
		deque.insertLeft(70);
		deque.display();

		deque.removeLeft();
		deque.removeLeft();
		deque.removeLeft();
		deque.display();
		
		deque.insertLeft(90);
		deque.insertLeft(80);
		deque.insertLeft(150);
		deque.display();

	}
}
