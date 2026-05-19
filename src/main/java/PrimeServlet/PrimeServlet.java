package PrimeServlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PrimeServlet")
public class PrimeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String input = request.getParameter("number");

        try {

            int num = Integer.parseInt(input);

            if (num <= 1) {

                response.sendError(
                        HttpServletResponse.SC_BAD_REQUEST,
                        "Invalid Number! Enter number greater than 1"
                );

                return;
            }

            boolean prime = true;

            for (int i = 2; i <= num / 2; i++) {

                if (num % i == 0) {

                    prime = false;
                    break;
                }
            }

            out.println("<html><body>");

            if (prime) {

                out.println("<h2>" + num
                        + " is a Prime Number</h2>");

            } else {

                out.println("<h2>" + num
                        + " is NOT a Prime Number</h2>");
            }

            out.println("</body></html>");

        }

        catch (NumberFormatException e) {

            response.sendError(
                    HttpServletResponse.SC_BAD_REQUEST,
                    "Error: Invalid Input! Please enter only numbers."
            );
        }
    }
}

