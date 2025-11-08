package persistence;

import domain.User;

public interface UserDao {
    User getUser(Long id);
    void insert(User user);
}
