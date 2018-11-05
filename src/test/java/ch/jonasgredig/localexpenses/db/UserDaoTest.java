package ch.jonasgredig.localexpenses.db;

import ch.jonasgredig.localexpenses.controller.dao.UserDao;
import ch.jonasgredig.localexpenses.model.User;
import org.junit.jupiter.api.Test;

public class UserDaoTest {

    @Test
    public void testCreateUser() {
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
