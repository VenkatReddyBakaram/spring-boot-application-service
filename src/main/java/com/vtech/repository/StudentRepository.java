package com.vtech.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vtech.models.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

	List<Student> findByQualification(String qualification);

	List<Student> findByQualificationAndEmailId(String qualification, String emailId);

	List<Student> findByQualificationOrEmailId(String qualification, String emailId);

	List<Student> findByQualificationStartingWith(String qualification);

	List<Student> findByQualificationOrderByPhoneNumber(String qualification);

	List<Student> findByQualificationOrderByPhoneNumberDesc(String qualification);

	/*
	 * @Query("select stud from Student stud") List<Student> fetchAllStudents();
	 */

	@Query(value = "select * from student", nativeQuery = true)
	List<Student> fetchAllStudents();

	@Query("select stud.studName from Student stud")
	List<String> fetchAllStudentNames();

	@Query("select stud from Student stud where stud.studId=?1")
	Student fetchStudentByStudId(Integer studId);

	@Query("select stud.studName from Student stud where stud.studId=?1")
	String fetchStudentNameByStudId(Integer studId);

	@Query("select stud from Student stud where stud.qualification=?1")
	List<Student> fetchByQualificationOrderByPhoneNumber(String qualification, Sort sort);

	@Query("select stud from Student stud where stud.qualification=?1")
	List<Student> fetchByQualificationOrderByPhoneNumberDesc(String qualification, Sort sort);

	@Query("select stud from Student stud where stud.emailId=:emailId and stud.qualification=:qualification")
	List<Student> fetchByQualificationAndEmailId(@Param("qualification") String qualification,
			@Param("emailId") String emailId);
}