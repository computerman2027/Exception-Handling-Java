import java.io.FileNotFoundException;

class MyChainedException extends RuntimeException
{
    public MyChainedException() {
        super("This is a default Unchecked Exception");
    }

    public MyChainedException(String message) {
        super(message);
    }

    public MyChainedException(String message, Throwable cause) {
        super(message, cause);
    }
}
public class UserDefinedChainedException {
    static void demoProc()
    {
        throw new MyChainedException("top Layer",new NullPointerException());
    }
    static void demoProc2()
    {
        throw new MyChainedException("top Layer",new FileNotFoundException());
    }

    public static void main(String[] args) {
        demoProc();
        demoProc2();
    }
}
