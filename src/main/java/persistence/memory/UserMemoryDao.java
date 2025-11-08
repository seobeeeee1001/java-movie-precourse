package persistence.memory;

import domain.User;
import persistence.UserDao;

public class UserMemoryDao extends InMemoryDao<User> implements UserDao {
    @Override
    public User getUser(Long userId){
        return findOne(User->User.getId().equals(userId));
    }
}
