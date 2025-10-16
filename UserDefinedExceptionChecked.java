class MyCheckedException extends Exception
{
    public MyCheckedException() {
        super("This is a default checked Exception");
    }

    public MyCheckedException(String message) {
        super(message);
    }
}

public class UserDefinedExceptionChecked {
    static void demoProc() throws MyCheckedException {
        System.out.println("Trying checked Exception");
        throw new MyCheckedException();
    }

    static void demoProc2() throws MyCheckedException {
        System.out.println("Trying parameterised checked Exception");
        throw new MyCheckedException("This is Parameterised Checked Exception");
    }

    public static void main(String[] args) {
        try{
            demoProc();
        }
        catch (MyCheckedException e)
        {
            System.out.println("message from demoProc = "+e.getMessage());
        }

        try {
            demoProc2();
        } catch (MyCheckedException e) {
            System.out.println("message from demoProc2 = "+e.getMessage());
        }
    }
}
