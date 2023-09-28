package Student.example.Student.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
   private Long StudentId;
    private String first_name;
   private String last_name;
    private Integer age;
    private Dep department;
}
