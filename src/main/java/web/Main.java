package web;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import web.config.DataConfig;
import web.dao.UserDao;
import web.model.User;

public class Main {
    public static void main(String[] args) {
       /*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataConfig.class);
        UserDao userDao = context.getBean(UserDao.class);
        userDao.add(new User("Test","SurnameTest","email12"));
        context.close();*/

    }
}
