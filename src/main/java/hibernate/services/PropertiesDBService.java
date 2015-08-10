package hibernate.services;

import org.hibernate.Session;
import util.hibernate.HibernateSessionFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by liker on 10/08/2015 0010.
 * Group iTailor.hunters.neu.edu.cn
 */
public class PropertiesDBService {
    public static List<String> takeOutAListOf(String property, String entity) {
        List<String> properties = new ArrayList<>();
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        try {
            String hql = "select c." + property + " from " + entity + " c";
            properties = session.createQuery(hql).list();
            Iterator<String> iterator = properties.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().equals("")) {
                    iterator.remove();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
            return properties;
        }
    }
}
