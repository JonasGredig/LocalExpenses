package ch.jonasgredig.localexpenses.controller.dao;

import ch.jonasgredig.localexpenses.model.User;

public interface iUserDao {

    public User getUser(int id);
    public User getUser(User user);
    public User getUser(String email);
    public boolean createUser(User user);
    public boolean deleteUser(User user);
    public boolean deleteUser(int id);
    public boolean updateUser(User user);
    public boolean updateUser(int id);


}
