public class ColaImpl<T> implements Cola<T>{

    int i, leng;
    T[] data;

    // Constructor
    public ColaImpl(int len) {
        data = (T[])new Object[len];
        i = 0;
        leng = len;
    }

    private boolean estaPlena()
    {
        if(i == leng-1)
            return true;
        else
            return false;
    }


    @Override
    public void push(T d) throws PilaLlenaException {
        //log.info (d)

        if (estaPlena()) throw new PilaLlenaException();
        data[i++] = d;
    }

    @Override
    public T pop() throws Exception {
        return data[i];
    }

    @Override
    public int size() {

        return i;
    }
}
