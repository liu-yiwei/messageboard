package club.leva.messageboard.service.impl;

import club.leva.messageboard.entity.User;
import club.leva.messageboard.repository.UserJpaRepository;
import club.leva.messageboard.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserJpaRepository userJpaRepository;
    @Override
    public List<User> findAll() {
        return userJpaRepository.findAll();
    }

    @Override
    public void saveUser(User book) {

    }

    @Override
    public User findOne(long id) {
        return null;
    }

    @Override
    public void delete(long id) {
    }

    @Override
    public List<User> findByName(String name) {
        return null;
    }
}
