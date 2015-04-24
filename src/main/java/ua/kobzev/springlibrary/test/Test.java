package ua.kobzev.springlibrary.test;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Kostya on 24.04.2015.
 */
@Component
public class Test {
    private int num;

    @Autowired
    private SessionFactory sessionFactory;

    public Test(){
        num = 5;
    }

    public void test(){
        System.out.println("SessionFactory"+sessionFactory);
    }
}
