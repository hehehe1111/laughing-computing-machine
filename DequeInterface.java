//hemanta Parajuli
//nov 14
public interface DequeInterface<T> {
	/**
	 * Adds new entry to the front of the dequeue.
	 * @param newEntry - an object is added.
	 */
	public void addToFront(T newEntry);
	
	/**
	 * Adds new entry to the back of the dequeue.
	 * @param newEntry - an object is added.
	 */
	public void addToBack(T newEntry);
	
	/**
	 * Remove and returns the front entry of the dequeue
	 * @return - the object at the front of the dequeue.
	 */
	public T removeFront();
	
	/**
	 * Remove and returns the back entry of the dequeue
	 * @return - the object at the back of the dequeue.
	 */
	public T removeBack();
	
	/**
	 * Retrieves the front entry of the dequeue
	 * @return - the object at the front of the dequeue.
	 */
	public T getFront();
	
	/**
	 * Retrieves the back entry of the dequeue.
	 * @return - the object at the back of the dequeue.
	 */
	public T getBack();
	
	/**
	 * Detects whether the dequeue is empty.
	 * @return - true if empty or false if not empty.
	 */
	public boolean isEmpty();
	
	/**
	 * Removes all the entry from the dequeue.
	 */
	public void clear();
}
