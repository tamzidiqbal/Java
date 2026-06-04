package exception;
import classes.Login;
import java.lang.*;

public class MyException extends Exception  
{
	public String getMessage(){return "Enter password at least 8 charecters";}
}