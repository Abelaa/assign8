package edu.mum.cs.cs425.studentmgmt;

import edu.mum.cs.cs425.studentmgmt.model.Student;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date;

@SpringBootApplication
public class StudentMgmtApplication {

    @PersistenceContext
    private static EntityManager em;

    public static void main(String[] args) {
        Student student = new Student("000-61-0001", "Anna", "Lynn", "Smith", 3.45, new Date(119, 4, 24));

        saveStudent(student);
    }

    public static void saveStudent(Student student) {
        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();

        em.close();
    }
}
