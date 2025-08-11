import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        // Create registry builder
        StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder();

        // Configure settings programmatically
        registryBuilder.applySetting("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
        registryBuilder.applySetting("hibernate.connection.url", "jdbc:mysql://localhost:3306/facebook");
        registryBuilder.applySetting("hibernate.connection.username", "root");
        registryBuilder.applySetting("hibernate.connection.password", "root");
        registryBuilder.applySetting("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        registryBuilder.applySetting("hibernate.hbm2ddl.auto", "update"); // creates tables automatically
        registryBuilder.applySetting("hibernate.show_sql", "true");
        registryBuilder.applySetting("hibernate.format_sql", "true");

        StandardServiceRegistry registry = registryBuilder.build();

        // Create Metadata and build session factory
        return new MetadataSources(registry)
                .addAnnotatedClass(User.class) // register annotated entity
                .buildMetadata()
                .buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        getSessionFactory().close();
    }
}
