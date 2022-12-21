import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener("/cars")
public class CarListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        String id = se.getSession().getId();
        System.out.println("SESSION CREATED "+id);

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {

    }
}



