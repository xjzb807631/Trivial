package trivia.dao;

import trivia.domain.User;

public interface UserDao {
    public abstract User findByUsername(String username);
}