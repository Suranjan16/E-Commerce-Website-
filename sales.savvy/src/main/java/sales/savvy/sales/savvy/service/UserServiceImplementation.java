package sales.savvy.sales.savvy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sales.savvy.sales.savvy.entity.Users;
import sales.savvy.sales.savvy.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService {

     @Autowired
     UserRepository repo;

     public void addUser(Users users) {
         repo.save(users);
     }
}
