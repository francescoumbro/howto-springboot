package it.umbrofrancesco.service.impl;

import it.umbrofrancesco.dto.User;
import it.umbrofrancesco.service.api.IUserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementazione del servizio per la gestione degli utenti.
 */
@Service
public class UserServiceImpl implements IUserService {

    private final List<User> users = new ArrayList<>();

    /**
     * {@inheritDoc}
     */
    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(this.users);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User getUserByEmail(String email) {
        return this.users.stream()
                .filter(user -> user.email().equals(email))
                .findFirst()
                .orElse(null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User createUser(User user) {
        this.users.add(user);
        return user;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User updateUser(String email, User updatedUser) {
        for (int i = 0; i < this.users.size(); i++) {
            if (this.users.get(i).email().equals(email)) {
                this.users.set(i, updatedUser);
                return updatedUser;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean deleteUser(String email) {
        return this.users.removeIf(user -> user.email().equals(email));
    }
}
