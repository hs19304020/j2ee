package tera;

public class InputCommand extends AbstractCommand {

	public ResponseContext execute(ResponseContext resc) {
		//WebResponseContext wr = new WebResponseContext();
		resc.setTarget("input");
  	//String url = "/WEB-INF/jsp/input.jsp";
		return resc;
	}
}