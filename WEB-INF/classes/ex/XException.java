package ex;

public class XException extends RuntimeException {
	public XException(String mess,Throwable e) {
		super(mess,e);
	}
}