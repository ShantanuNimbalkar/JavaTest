package javacodechecker;

public class AvoidCatchingGenericException {

    public void badexample()
    {
        try
        {
            Integer.parseInt("Test");
        }

        catch (Exception exception)
        {
            IO.writeLine("Caught Exception");
        }

    }

    public void badexample2()
    {
        try
        {
            Integer.parseInt("Test");
        }

        catch (Throwable throwable)
        {
            IO.writeLine("Caught Exception");
        }

    }


    public void badexample3()
    {
        try
        {
            Integer.parseInt("Test");
        }

        catch (Error error)
        {
            IO.writeLine("Caught Exception");
        }

    }
}