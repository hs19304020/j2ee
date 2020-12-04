package exp;

public class IntegrationException extends RuntimeException {
	public IntegrationException(String mess,Throwable cause) {
		super(mess,cause);
	}
}