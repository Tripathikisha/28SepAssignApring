package Student.example.Student.Repo;

import Student.example.Student.Model.Dep;
import Student.example.Student.Model.Event;
import Student.example.Student.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalTime;
import java.util.List;

public interface EventRepo extends JpaRepository<Event, Integer> {

    default List<Student> findByEvent(Integer eventId, String eventName) {
        return null;
    }

    List<Student> findByEventUpdate(String eventName, LocalTime startTime);

    @Modifying
    @Query(value = "UPDATE STUDENT SET STOCK_PRICE = (STOCK_PRICE + STOCK_PRICE*(:hike)) WHERE STOCK_TYPE = :stockType", nativeQuery = true)
    void updateStockByType(float hike, String stockType);
}

