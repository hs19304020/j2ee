package tera;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ex.XException;

public class WebApplicationController implements ApplicationController {
	public RequestContext getRequest(Object request) {
		RequestContext reqc = new WebRequestContext();

		reqc.setRequest(request);

		return reqc;
	}

	public ResponseContext handleRequest(RequestContext req) {
		AbstractCommand comm = CommandFactory.getCommand(req);

		comm.init(req);

		ResponseContext resc = comm.execute(new WebResponseContext());

		return resc;
	}

	public void handleResponse(RequestContext reqc,ResponseContext resc) {
		HttpServletRequest req = (HttpServletRequest)reqc.getRequest();
		HttpServletResponse res = (HttpServletResponse)resc.getResponse();

		req.setAttribute("data",resc.getResult());

		RequestDispatcher rd = req.getRequestDispatcher(resc.getTarget());

		try {
			rd.forward(req,res);
		}catch(ServletException e) {
			throw new XException(e.getMessage(),e);
		}catch(IOException e) {
			throw new XException(e.getMessage(),e);
		}
	}
}