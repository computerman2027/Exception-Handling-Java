public class ChainedException1 {
    static void demoProc()
    {
        NullPointerException e = new NullPointerException("top Layer");
        e.initCause(new ArithmeticException("cause"));
        throw  e;
    }

    public static void main(String[] args) {
        demoProc();
    }
}

