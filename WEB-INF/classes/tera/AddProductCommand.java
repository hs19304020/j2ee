package tera;

import dao.AbstractDaoFactory;
import dao.ProductsDao;

public class AddProductCommand extends AbstractCommand {
	public ResponseContext execute(ResponseContext resc) {
		RequestContext reqc = getRequestContext();
		Product p = new Product();
		String[] pids = reqc.getParameter("pid");
		String pid = pids[0];
		String[] names = reqc.getParameter("name");
		String name = names[0];
		String[] prices = reqc.getParameter("price");
		String price = prices[0];

		p.setPid(pid);
		p.setName(name);
		p.setPrice(price);

		AbstractDaoFactory factory = AbstractDaoFactory.getFactory();
		ProductsDao dao = factory.getProductsDao();
		dao.addProduct(p);

		//ResponseContext wr = new WebResponseContext();
		resc.setTarget("start");
		// String url = "/WEB-INF/jsp/start.jsp";
		return resc;
	}
}