package listeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionCountListener implements ServletContextListener, HttpSessionListener {
	public SessionCountListener() {
	}

	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("Session Created!");
		ServletContext ctx = se.getSession().getServletContext();
		Integer count = (Integer) ctx.getAttribute("count");
		ctx.setAttribute("count", count + 1);
	}

	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("Session Destroyed!");
		ServletContext ctx = se.getSession().getServletContext();
		Integer count = (Integer) ctx.getAttribute("count");
		ctx.setAttribute("count", count - 1);
	}

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Context Destroyed!");
	}

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Context Created!");
		sce.getServletContext().setAttribute("count", 0);
	}

}
