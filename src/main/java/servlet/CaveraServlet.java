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
    private ApplicationBean printableObj;

    @Inject
    private RequestBean printableObj;

    @Inject
    private SessionBean printableObj;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("funfou!");
        resp.getWriter().append("ok, cavera!");

        System.out.println("ApplicationBean: "+ );
    }
}
