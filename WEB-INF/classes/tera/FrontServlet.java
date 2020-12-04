//set classpath=C:\tomcat8\lib\servlet-api.jar;.
package tera;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontServlet extends javax.servlet.http.HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		doPost(req, res);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException {

		req.setCharacterEncoding("UTF-8");

		ApplicationController ac = new WebApplicationController();

		RequestContext reqc = ac.getRequest(req);

		ResponseContext resc = ac.handleRequest(reqc);

		resc.setResponse(res);

		ac.handleResponse(reqc,resc);
	}
}