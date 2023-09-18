package assignments.eregistrar.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    @Column(nullable = false)
    @NotEmpty(message = "student number can not be empty")
    private String studentNumber;
    @Column(nullable = false)
    @NotEmpty(message = "first name can not be empty")
    private String firstName;
    private String middleName;
    @Column(nullable = false)
    @NotEmpty(message = "last name can not be empty")
    private String lastName;
    private Double cgpa;
    private LocalDate dateOfEnrollment;
    @Column(nullable = false)
    @NotEmpty(message = "last name can not be empty")
    private String isInternational;

}
