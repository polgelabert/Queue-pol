import java.lang.*;

public interface Cola<T> {

    public void push(T d) throws PilaLlenaException;

    public T pop() throws Exception;

    public int size();

}
