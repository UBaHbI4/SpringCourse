package softing.ubah4ukdev.jee.view;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
/**
 * Project: JEE Maven WebApp
 *
 * Package: softing.ubah4ukdev.jee.model
 *
 * Created by Ivan Sheynmaer
 *
 * Description:
 * Стартовый сервлет
 *
 * 2021.10.12
 *
 * v1.0
 */

/**
 * Сделаем сервлет от jakarta.servlet
 */
@WebServlet(name = "MainServlet", urlPatterns = "/main_servlet")
public class MainServlet implements Servlet {
    private static final Logger logger = LoggerFactory.getLogger(MainServlet.class);

    private transient ServletConfig config;

    @Override
    public void init(ServletConfig servletConfig) {
        this.config = servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws IOException {
        logger.info("MainServlet request");

        //Почему-то UTF-8 тут не пошло, хотя в сервлете на основе HttpServlet ставиться UTF-8 нормально.
        servletResponse.setCharacterEncoding("Cp1251");
        servletResponse.getWriter().printf("<html>");
        servletResponse.getWriter().printf("<head>");
        servletResponse.getWriter().printf("<title>WEB-APPLICATION</title>");
        servletResponse.getWriter().printf("<style type='text/css'>");
        servletResponse.getWriter().printf("a {");
        servletResponse.getWriter().printf("    margin: 10pt;");
        servletResponse.getWriter().printf("    text-decoration: none;");
        servletResponse.getWriter().printf("    font-family: comic sans ms;");
        servletResponse.getWriter().printf("    font-size: 15pt;");
        servletResponse.getWriter().printf("}");
        servletResponse.getWriter().printf("</style>");
        servletResponse.getWriter().printf("</head>");
        servletResponse.getWriter().printf("<body>");
        servletResponse.getWriter().printf("<h2 align='center' style='font-family: comic sans ms;'>" +
                "<font color='#787474'>Добро пожаловать!</font></h2>");
        servletResponse.getWriter().printf("<p><a href='../../jee/products_servlet'>Список продуктов</a></p>");
        servletResponse.getWriter().printf("<p><a href='../../jee/about_servlet'>О приложении</a></p>");
        servletResponse.getWriter().printf("<body><html>");
    }

    @Override
    public String getServletInfo() {
        return "MainServlet";
    }

    @Override
    public void destroy() {
        logger.info("Servlet {} destroyed", getServletInfo());
    }
}