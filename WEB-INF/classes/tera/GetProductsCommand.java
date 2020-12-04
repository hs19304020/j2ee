package tera;

//import java.util.Map;
import java.util.List;
import dao.AbstractDaoFactory;
import dao.ProductsDao;

public class GetProductsCommand extends AbstractCommand {
	public ResponseContext execute(ResponseContext resc) {
		//WebResponseContext wr = new WebResponseContext();
		//DbDummyのgetDatabaseにリストとしてデータが格納されている
		AbstractDaoFactory factory = AbstractDaoFactory.getFactory();
		ProductsDao dao = factory.getProductsDao();

		List products = dao.getAllProducts();

		resc.setResult(products);
		//飛ばし先を指定
		resc.setTarget("view");
		// String url = "/WEB-INF/jsp/view.jsp";
		return resc;
	}
}