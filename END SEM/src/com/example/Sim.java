
package com.example;

public interface Sim {
    void calling();
    void data();
}
package com.example;

public class Airtel implements Sim {
    @Override
    public void calling() {
        System.out.println("Airtel calling...");
    }

    @Override
    public void data() {
        System.out.println("Airtel data...");
    }
}

public class Voda implements Sim {
    @Override
    public void calling() {
        System.out.println("Voda calling...");
    }

    @Override
    public void data() {
        System.out.println("Voda data...");
    }
}
  

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans 
           http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="airtel" class="com.example.Airtel"/>
    <bean id="voda" class="com.example.Voda"/>

</beans>
package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Load the Spring context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Retrieve the Airtel bean
        Sim airtel = (Sim) context.getBean("airtel");
        airtel.calling();
        airtel.data();

        // Retrieve the Voda bean
        Sim voda = (Sim) context.getBean("voda");
        voda.calling();
        voda.data();
    }
}
