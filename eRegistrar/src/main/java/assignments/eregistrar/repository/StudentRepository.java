package assignments.eregistrar.repository;

import assignments.eregistrar.entity.Student;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Member;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findAllByStudentNumberOrFirstNameOrMiddleNameOrLastName(String studentNumber, String firstName, String middleName, String lastName);

//    CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
//    CriteriaQuery<Member> query = criteriaBuilder.createQuery(Member.class);
//    Root<Member> memberRoot = query.from(Member.class);
//    query.select(memberRoot);
//    query.where(criteriaBuilder.equal(memberRoot.get("memberNumber"),
//    number));

}
