package softing.ubah4ukdev.jee.view;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Project: JEE Maven WebApp
 *
 * Package: softing.ubah4ukdev.jee
 *
 * Created by Ivan Sheynmaer
 *
 * Description:
 * Сервлет для вывода информации о приложении
 *
 * 2021.10.12
 *
 * v1.0
 */
public class AboutServlet extends HttpServlet {

    private static final Logger logger = LoggerFactory.getLogger(AboutServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        try {
            logger.info("AboutServlet request");
            resp.setHeader("Content-Type", "text/html; charset=utf-8");
            resp.getWriter().printf("<html>");
            resp.getWriter().printf("<head>");
            resp.getWriter().printf("<title>About</title>");
            resp.getWriter().printf("<style type='text/css'>");
            resp.getWriter().printf("a {");
            resp.getWriter().printf("    text-decoration: none;");
            resp.getWriter().printf("    font-family: comic sans ms;");
            resp.getWriter().printf("    font-size: 15pt;");
            resp.getWriter().printf("    margin: 10pt;");
            resp.getWriter().printf("}");
            resp.getWriter().printf("</style>");
            resp.getWriter().printf("</head>");
            resp.getWriter().printf("<body>");
            resp.getWriter().printf("<p><a href='../../jee/main_servlet'>&#9664;</a></p>");
            resp.getWriter().printf("<h2 align='center' style='font-family: comic sans ms;'><font color='#787474'>О приложении</font></h2>");
            resp.getWriter().printf("<div><font size='5pt' color='#787474'> А этот сервлет описан в web.xml и не содержит аннотации @WebServlet</font></div>");
            resp.getWriter().printf("<body><html>");
        } catch (Exception err) {
            logger.info("ERROR: " + err.getMessage());
        }
    }
}