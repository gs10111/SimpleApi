package projetospring.simple.repositories;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import projetospring.simple.models.User;



@Repository
public interface UserRepository  extends JpaRepository<User, Long>{

}
