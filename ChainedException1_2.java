public class ChainedException1_2 {
    static void demoProc()
    {
        NullPointerException e = new NullPointerException("top Layer");
        e.initCause(new ArithmeticException("cause"));
        throw  e;
    }

    public static void main(String[] args) {
        try{
            demoProc();
        }
        catch (NullPointerException e)
        {
            System.out.println("Caught : "+ e);
            System.out.println("Original Cause : " +e.getCause());
        }
    }
}

