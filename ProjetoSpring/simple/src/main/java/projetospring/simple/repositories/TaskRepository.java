package projetospring.simple.repositories;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import projetospring.simple.models.Task;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import projetospring.simple.models.User;



@Repository
public interface TaskRepository  extends JpaRepository<Task, Long>{

    List<Task>  findByUser_Id (long id);
}
