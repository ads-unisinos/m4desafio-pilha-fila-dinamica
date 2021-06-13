package PilhaFilaDinamica;

public class OverflowException extends RuntimeException
{
	public OverflowException()
	{
		super("Overflow!");
	}

}