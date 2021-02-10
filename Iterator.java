/**
 * Interface for an iterator that searches through an array
 */
public interface Iterator {
    /**
     * Method that checks if the array has another value in the next position
     */
    public boolean hasNext();
    /**
     * Method that moves the iterator to the next index in the array
     */
    public Object next();
}
