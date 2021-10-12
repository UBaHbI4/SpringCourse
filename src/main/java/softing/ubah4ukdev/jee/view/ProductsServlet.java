package softing.ubah4ukdev.jee.view;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import softing.ubah4ukdev.jee.model.Product;

/**
 * Project: JEE Maven WebApp
 *
 * Package: softing.ubah4ukdev.jee.model
 *
 * Created by Ivan Sheynmaer
 *
 * Description:
 * Сервлет для вывода списка продуктов
 *
 * 2021.10.12
 *
 * v1.0
 */
@WebServlet(name = "ProductsServlet", urlPatterns = "/products_servlet")
public class ProductsServlet extends HttpServlet {

    private static final Logger logger = LoggerFactory.getLogger(ProductsServlet.class);
    private static final int COUNT_ITEMS = 10;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        try {
            logger.info("ProductsServlet request");
            resp.setHeader("Content-Type", "text/html; charset=utf-8");
            resp.getWriter().printf("<html>");
            resp.getWriter().printf("<head>");
            resp.getWriter().printf("<title>Список продуктов</title>");
            resp.getWriter().printf("<style type='text/css'>");
            resp.getWriter().printf("nav {");
            resp.getWriter().printf("    width: 960px;");
            resp.getWriter().printf("    position: relative;");
            resp.getWriter().printf("    margin: 0 auto;");
            resp.getWriter().printf("}");
            resp.getWriter().printf("nav ul {");
            resp.getWriter().printf("    position: absolute;");
            resp.getWriter().printf("    left: 50%%;");
            resp.getWriter().printf("    transform: translateX(-50%%);");
            resp.getWriter().printf("}");
            resp.getWriter().printf("nav li {");
            resp.getWriter().printf("    font-family: 'comic sans ms';");
            resp.getWriter().printf("    font-size: 15pt;");
            resp.getWriter().printf("    color: #787474;");
            resp.getWriter().printf("    margin: 6px auto;");
            resp.getWriter().printf("}");
            resp.getWriter().printf("a {");
            resp.getWriter().printf("    text-decoration: none;");
            resp.getWriter().printf("    font-family: comic sans ms;");
            resp.getWriter().printf("    margin: 10pt;");
            resp.getWriter().printf("    font-size: 15pt;");
            resp.getWriter().printf("}");
            resp.getWriter().printf("</style>");
            resp.getWriter().printf("</head>");
            resp.getWriter().printf("<body>");
            resp.getWriter().printf("<p><a href='../../jee/main_servlet'>&#9664;</a></p>");
            resp.getWriter().printf("<h2 align='center' style='font-family: comic sans ms;'><font color='#787474'>Список продуктов:</font></h2>");
            resp.getWriter().printf("<nav>");

            Product products[] = new Product[COUNT_ITEMS];
            resp.getWriter().printf("<ul>");
            for (int i = 0; i < products.length; i++) {
                products[i] = new Product(i, "Продукт " + (i + 1), Math.round(Math.random() * 100 * 100) / 100);
                resp.getWriter().printf("<li>" + products[i] + "</li>");
            }

            resp.getWriter().printf("</ul>");
            resp.getWriter().printf("</nav>");
            resp.getWriter().printf("<body><html>");

        } catch (Exception err) {
            logger.info("ERROR: " + err.getMessage());
        }
    }
}