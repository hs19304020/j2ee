package exp;

public class ResourceAccessException extends RuntimeException {
	public ResourceAccessException(String mess,Throwable cause) {
		super(mess,cause);
	}
}