package sk.akademiasovy.library;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import sk.akademiasovy.library.entity.Writer;

import javax.security.auth.login.Configuration;

public class HibernateUtil {

    private static SessionFactory session = new HibernateUtil().builtSession();

    private SessionFactory builtSession() {
        org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration();
        configuration.addAnnotatedClass(Writer.class);

        return configuration.buildSessionFactory(new StandardServiceRegistryBuilder().build());
    }
}
