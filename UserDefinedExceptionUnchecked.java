class MyUncheckedException extends RuntimeException
{
    public MyUncheckedException() {
        super("This is a default Unchecked Exception");
    }

    public MyUncheckedException(String message) {
        super(message);
    }
}
public class UserDefinedExceptionUnchecked {
    static void demoProc() {
        System.out.println("Trying checked Exception");
        throw new MyUncheckedException();
    }

    static void demoProc2()  {
        System.out.println("Trying parameterised checked Exception");
        throw new MyUncheckedException("This is Parameterised UnChecked Exception");
    }

    public static void main(String[] args) {
        demoProc();
        demoProc2();
    }

}
