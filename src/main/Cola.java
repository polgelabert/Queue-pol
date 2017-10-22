public interface Cola<T> {

    public void push(T d) throws ColaLlenaException;

    public T pop() throws ColaVaciaException;

    public int size();

}
