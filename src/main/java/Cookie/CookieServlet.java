package Cookie;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
	  protected void doPost(HttpServletRequest request,
              HttpServletResponse response)
throws ServletException, IOException {

response.setContentType("text/html1");

PrintWriter out = response.getWriter();

String name = request.getParameter("username");

Cookie cookies[] = request.getCookies();

int visitCount = 1;
boolean userFound = false;

// Check existing cookies
if (cookies != null) {

for (Cookie c : cookies) {

    if (c.getName().equals("username")
            && c.getValue().equals(name)) {

        userFound = true;
    }

    if (c.getName().equals("visitCount")) {

        visitCount = Integer.parseInt(c.getValue());
        visitCount++;
    }
}
}

// Create username cookie
Cookie userCookie = new Cookie("username", name);

// Cookie expiry time = 60 seconds
userCookie.setMaxAge(60);

response.addCookie(userCookie);

// Create visit count cookie
Cookie visitCookie =
    new Cookie("visitCount",
            String.valueOf(visitCount));

// Expiry time = 60 seconds
visitCookie.setMaxAge(60);

response.addCookie(visitCookie);

// Display Message
out.println("<html><body>");

if (userFound) {

out.println("<h2>Welcome back "
        + name + " !</h2>");

} else {

out.println("<h2>Welcome "
        + name + " !</h2>");
}

out.println("<h3>You have visited this page "
    + visitCount + " times.</h3>");

out.println("<p>Cookie will expire in 60 seconds.</p>");

out.println("</body></html>");
}
}
	

