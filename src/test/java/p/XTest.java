package p;

import java.util.Properties;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;

import org.junit.Test;

public class XTest {

	@Test
	public void x() throws Exception {

        final Properties p = new Properties();
        p.put("mediatords", "new://Resource?type=DataSource");
        p.put("mediatords.JdbcDriver", "com.mysql.jdbc.Driver");
        p.put("mediatords.JdbcUrl", "jdbc:mysql://localhost/x");
        p.put("mediatords.uName", "x");
        p.put("mediatords.PassWord", "x");
        try {
            Context context = EJBContainer.createEJBContainer(p).getContext();
            System.out.println(context);
        } catch (Exception e) {
        	for (Throwable c = e; c != null; c = c.getCause()) {
        		System.out.println(c.getMessage());
        	}
        	throw e;
        }
        System.out.println("EJBContainer Created");
	}
}
