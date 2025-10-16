import java.io.FileNotFoundException;

class MyChainedException2 extends RuntimeException
{
    public MyChainedException2() {
        super("This is a default Unchecked Exception");
    }

    public MyChainedException2(String message) {
        super(message);
    }

    public MyChainedException2(String message, Throwable cause) {
        super(message, cause);
    }
}
public class UserDefinedChainedException1_2 {
    static void demoProc()
    {
        throw new MyChainedException2("top Layer",new NullPointerException());
    }
    static void demoProc2()
    {
        throw new MyChainedException2("top Layer",new FileNotFoundException());
    }

    public static void main(String[] args) {
        try {
            demoProc();
        } catch (MyChainedException2 e) {
//            e.printStackTrace();
            System.out.println("Messaage : "+e.getMessage());
            System.out.println("cause : "+e.getCause());
        }

        try {
            demoProc2();
        } catch (MyChainedException2 e) {
//            e.printStackTrace();
            System.out.println("Messaage : "+e.getMessage());
            System.out.println("cause : "+e.getCause());
        }
    }
}
