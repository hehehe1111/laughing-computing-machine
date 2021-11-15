//hemanta Parajuli
//nov 14
import java.util.EmptyStackException;

public class LinkedDeque<T> implements DequeInterface<T> {
	private DLNode firstNode;
	private DLNode lastNode;
	
	private class DLNode
	{
		private T data;
		private DLNode nextNode;
		private DLNode previousNode;
		
		public DLNode(T dataPortion)
		{
			this(dataPortion, null, null);
		}
		
		public DLNode(T dataPortion, DLNode frontNode, DLNode backNode)
		{
			data = dataPortion;
			nextNode = frontNode;
			previousNode = backNode;
		}

		public T getData()
		{
			return data;
		}

		public void setData(T data)
		{
			this.data = data;
		}

		public DLNode getNextNode() 
		{
			return nextNode;
		}

		public void setNextNode(DLNode nextNode) 
		{
			this.nextNode = nextNode;
		}

		public DLNode getPreviousNode() 
		{
			return previousNode;
		}

		public void setPreviousNode(DLNode previousNode) 
		{
			this.previousNode = previousNode;
		}
	}
	
	public LinkedDeque() 
	{
		firstNode = null;
		lastNode = null;
	}
	@Override
	public void addToFront(T newEntry) {
		DLNode newNode = new DLNode(newEntry, firstNode, null);
		firstNode = newNode;
	}

	@Override
	public void addToBack(T newEntry) {
		DLNode newNode = new DLNode(newEntry, null, lastNode);
		lastNode = newNode;

	}

	@Override
	public T removeFront() {
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		else
		{
			T top = firstNode.getData();
			firstNode = firstNode.getNextNode();
			return top;
		}
	}

	@Override
	public T removeBack() {
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		else
		{
			T last = lastNode.getData();
			lastNode = lastNode.getPreviousNode();
			return last;
		}
	}

	@Override
	public T getFront() {
		if(isEmpty())
		{
			return (T) "No data Entered";
		}
		else
		{
			return firstNode.getData();
		}
	}

	@Override
	public T getBack() {
		if(isEmpty())
		{
			return (T) "No data Entered";
		}
		else
		{
			return lastNode.getData();
		}
	}

	@Override
	public boolean isEmpty() {
		return firstNode == null && lastNode == null;
	}

	@Override
	public void clear() {
		firstNode = null;
		lastNode = null;

	}

}
