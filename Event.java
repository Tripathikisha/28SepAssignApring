package Student.example.Student.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Event {
   private Integer eventId;
            private String eventName;
     private String locationOfEvent;
            private LocalDate date;
    private LocalTime startTime;
           private Double endTime;

}
