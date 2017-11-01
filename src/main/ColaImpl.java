import org.apache.log4j.Logger;

import java.util.LinkedList;
import java.util.Queue;


public class ColaImpl<T> implements Cola<T>{

    int i, leng;
    //T[] data;
    Queue<T> data;

    final static Logger log = Logger.getLogger(ColaImpl.class);

    // Constructor
    public ColaImpl(int len) {

        data = new LinkedList<T>();
        i = 0;
        leng = len;
    }

    private boolean estaPlena()
    {
        return (i >= leng);
    }


    @Override
    public void push(T d) throws ColaLlenaException {

        if (estaPlena()) throw new ColaLlenaException();
        data.add(d);
        i++;
    }

    @Override
    public T pop() throws ColaVaciaException {

        if(data.size() == 0) throw new ColaVaciaException();
        i= i-1;
        return data.poll();
    }

    @Override
    public int size() {
        return i;
    }

    @Override
    public boolean contains(T d){
        return data.contains(d);
    }
}
