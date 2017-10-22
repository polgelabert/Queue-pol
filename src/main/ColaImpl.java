public class ColaImpl<T> implements Cola<T>{

    int i, leng;
    T[] data;
    //final static Logger log = Logger.getLogger(ColaImpl.class);

    // Constructor
    public ColaImpl(int len) {
        data = (T[])new Object[len];
        i = 0;
        leng = len;
        //log.info("Constructor con" + len + "objetos") ;
    }

    private boolean estaPlena()
    {
        return (i >= leng);
    }


    @Override
    public void push(T d) throws ColaLlenaException {
        //log.info (d)

        if (estaPlena()) throw new ColaLlenaException();
        data[i] = d; i++;
    }

    @Override
    public T pop() throws ColaVaciaException {
        if(i==0) throw new ColaVaciaException();
        return data[0];
    }

    @Override
    public int size() {
        return i;
    }
}
