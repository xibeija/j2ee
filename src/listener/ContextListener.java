package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("web Ӧ������  ");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("web Ӧ�ó�ʼ�� ");

	}
}