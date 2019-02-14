package servlet;

import cdi.ApplicationBean;
import cdi.RequestBean;
import cdi.SessionBean;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet ("/cavera/")
public class CaveraServlet extends HttpServlet {

    @Inject
    private ApplicationBean printableObj1;

    @Inject
    private RequestBean printableObj2;

    @Inject
    private SessionBean printableObj3;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("funfou!");
        resp.getWriter().append("ok, cavera!");

        System.out.println("ApplicationBean: "+printableObj1.contador );
        System.out.println("ApplicationBean: "+printableObj2.contador );
        System.out.println("ApplicationBean: "+printableObj3.contador );
    }
}
