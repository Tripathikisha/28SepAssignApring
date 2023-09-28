package Student.example.Student.Repo;
import Student.example.Student.Model.Dep;
import Student.example.Student.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalTime;
import java.util.List;

public interface StudentRepo extends JpaRepository<Student, Long>{
    List<Student> findByStockTypeAndStockPriceLessThanEqualOrderByStockPriceDesc(Dep department, double price);

    List<Student> findByStockPriceLessThanAndStockCreationTimeStampLessThanOrderByStockOwnerCountDesc(double price, LocalTime time);

    @Modifying
    @Query(value = "UPDATE STUDENT SET STOCK_PRICE = (STOCK_PRICE + STOCK_PRICE*(:hike)) WHERE STOCK_TYPE = :stockType", nativeQuery = true)
    void updateStockByType(float hike, String stockType);

    void deleteAll(List<Student> delStudent);
}
