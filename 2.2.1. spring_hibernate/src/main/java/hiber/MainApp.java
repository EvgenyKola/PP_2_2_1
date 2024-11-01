package hiber;

import hiber.config.AppConfig;
import hiber.dao.UserDao;
import hiber.dao.UserDaoImp;
import hiber.model.User;
import hiber.model.Car;
import hiber.service.UserService;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;








public class MainApp {
   public static void main(String[] args) throws SQLException {

      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);

      /*userService.add(new User("User1", "Lastname1", "user1@mail.ru", new Car("Toyota", 2021)));
      userService.add(new User("User2", "Lastname2", "user2@mail.ru", new Car("Honda", 2020)));
      userService.add(new User("User3", "Lastname3", "user3@mail.ru", new Car("Ford", 2019)));
      userService.add(new User("User4", "Lastname4", "user4@mail.ru", new Car("BMW", 2022)));

      List<User> users = userService.listUsers();

      for (User user : users) {
         System.out.println("Id = "+user.getId());
         System.out.println("First Name = "+user.getFirstName());
         System.out.println("Last Name = "+user.getLastName());
         System.out.println("Email = "+user.getEmail());
         System.out.println();
      }

      context.close();*/

      User ul = userService.getUserByCarModelAndSeries("Toyota", 2021);
      System.out.println(ul.getFirstName());


   }

}
