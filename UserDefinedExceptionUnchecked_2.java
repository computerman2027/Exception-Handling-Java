class MyUncheckedException2 extends RuntimeException
{
    public MyUncheckedException2() {
        super("This is a default Unchecked Exception");
    }

    public MyUncheckedException2(String message) {
        super(message);
    }
}
public class UserDefinedExceptionUnchecked_2 {
    static void demoProc() {
        System.out.println("Trying checked Exception");
        throw new MyUncheckedException2();
    }

    static void demoProc2()  {
        System.out.println("Trying parameterised checked Exception");
        throw new MyUncheckedException2("This is Parameterised UnChecked Exception");
    }

    public static void main(String[] args) {
        try{
            demoProc();
        }
        catch (MyUncheckedException2 e)
        {
            System.out.println("message : "+e.getMessage());
        }
        try{
            demoProc2();
        }
        catch (MyUncheckedException2 e)
        {
            System.out.println("message : "+e.getMessage());
        }
    }
}
