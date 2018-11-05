package ch.jonasgredig.localexpenses.view;

import ch.jonasgredig.localexpenses.controller.dao.UserDao;
import ch.jonasgredig.localexpenses.model.User;

public class JonasIsStupid {

    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        User user = new User();
        user.setFirstname("Gredig");
        user.setName("Jonas");
        user.setEmail("jongredig@gmail.com");
        user.setPassword("1234");
        user.setDeleted(false);
        userDao.createUser(user);
    }
}
