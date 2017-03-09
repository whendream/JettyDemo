package com.jwen.JettyDemo;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

import com.jwen.JettyDemo.servlet.MyServlet;


public class Main {

	public static void main(String[] args) throws Exception {
		
		Server server = new Server(80); //初始化一个server，监听80端口
		ServletContextHandler handler = new ServletContextHandler(); //new 一个handler
		server.setHandler(handler); //server关联handler
		handler.addServlet(MyServlet.class, "/*"); //handler关联servlet
		server.start();
	}

}
