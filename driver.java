//hemanta Parajuli
//nov 14

public class driver {

	public static void main(String[] args) {
		DequeInterface <String> SeriesQueue = new LinkedDeque<>();
		System.out.println("The queue is empty : " + SeriesQueue.isEmpty());
		System.out.println("Front of the queue is : " + SeriesQueue.getFront());
		System.out.println("Back of the queue is : " + SeriesQueue.getBack());
		System.out.println("adding the data .................");
		SeriesQueue.addToFront("The Sopranos");
		SeriesQueue.addToFront("Narcos");
		SeriesQueue.addToBack("Breaking Bad");
		SeriesQueue.addToBack("Family Business");
		SeriesQueue.addToBack("Key and Peele");
		SeriesQueue.addToFront("GameOfThrones");
		System.out.println("The queue is empty : " + SeriesQueue.isEmpty());
		System.out.println("Front of the queue is : " + SeriesQueue.getFront());
		System.out.println("Back of the queue is : " + SeriesQueue.getBack());
		SeriesQueue.removeFront();
		SeriesQueue.removeBack();
		System.out.println("Front of the queue is : " + SeriesQueue.getFront());
		System.out.println("Back of the queue is : " + SeriesQueue.getBack());
		SeriesQueue.clear();
		System.out.println("The queue is empty : " + SeriesQueue.isEmpty());
		System.out.println("Front of the queue is : " + SeriesQueue.getFront());
		System.out.println("Back of the queue is : " + SeriesQueue.getBack());
	}

}
