package sales.savvy.sales.savvy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sales.savvy.sales.savvy.entity.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

}
