package tera;

import javax.servlet.http.HttpServletResponse;

public class WebResponseContext implements ResponseContext {
	private Object _result;
	private String _target;
	private HttpServletResponse _response;

	public WebResponseContext() {}

	//setTargetにはCommandのサブクラスで飛ばし先を指定する
	public void setTarget(String transferInfo) {
		_target = "/WEB-INF/jsp/" + transferInfo + ".jsp";
	}
	public String getTarget() {
		return _target;
	}
	public void setResult(Object bean) {
		_result = bean;
	}
	public Object getResult() {
		return _result;
	}
	public Object getResponse() {
		return _response;
	}
	public void setResponse(Object obj) {
		_response = (HttpServletResponse)obj;
	}
}