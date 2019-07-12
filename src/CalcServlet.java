import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CalcServlet")
public class CalcServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String metr = request.getParameter("metr");
        String cent = request.getParameter("cent");
        String mili = request.getParameter("mili");
        double centymetr = 0;
        double metry = 0;
        double milimetry = 0;
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        if (metr.equals(null) && cent.equals(null) && !mili.equals(null)) {
            double a = Double.valueOf(mili);
            centymetr = a / 100;
            metry = a / 1000;
        }
       else if (!metr.equals(null) && cent.equals(null) && mili.equals(null)) {
            double a = Double.valueOf(metr);
            centymetr = a * 100;
            milimetry = a * 1000;
        }
        else if (metr.equals(null) && !cent.equals(null) && !mili.equals(null)) {
            double a = Double.valueOf(cent);
            metry = a / 100;
            milimetry = a * 10;
        }


        response.getWriter().println(centymetr + " " +  metry + " " + milimetry);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String metr = request.getParameter("metr");
        String cent = request.getParameter("cent");
        String mili = request.getParameter("mili");
        double centymetr = 0;
        double metry = 0;
        double milimetry = 0;
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        if (metr.equals(null) && cent.equals(null) && !mili.equals(null)) {
            double a = Double.valueOf(mili);
            centymetr = a / 10;
            metry = a / 1000;
        }


        response.getWriter().println(centymetr + " " +  metry);
    }
}
