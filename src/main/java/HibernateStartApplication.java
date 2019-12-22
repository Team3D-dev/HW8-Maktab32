
import config.hibernate.HibernateUtil;
import org.hibernate.SessionFactory;

public class HibernateStartApplication {

    public static void main(String[] args) {
        SessionFactory session = HibernateUtil.getSession();


    }
}
