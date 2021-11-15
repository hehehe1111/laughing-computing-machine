//ch01_bag.pdf - slide 8& 9
public interface BagInterface<T> {
//gets the current number of entries in the bag
//returns the Integer number of entries
public int getCurrentSize();	
//sees if bag is empty
//returns true or false
public boolean isEmpty();
//add new entry
//@param newEntry the object to be added
//return true if it was added else false
public boolean add(T newEntry);
//remove one occourence of a given entry from this bag
//param anentry is the entry to be removed

public boolean remove(T anEntry);
//removes unspecified entry from this bag
//return the removed entry, or null 
public T remove();
//remove all entries
public void clear();
//counts the number of times given entry appears
//@param anEntry the entry to be counted
public int getFrequencyOf(T anEntry);
//tests wherther bag contains entry
//param is the entry
//returns true or false 
public boolean contains(T anEntry);
//retrieves all entries 
public T[] toArray();
}
