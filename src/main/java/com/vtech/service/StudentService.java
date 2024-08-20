package com.vtech.service;

import java.util.List;

import com.vtech.models.Student;

public interface StudentService {

	Student createStudent(Student student);

	List<Student> findAllStudents();

	Student findStudentById(Integer studId);

	Student updateStudent(Student student);

	Student updatePartialRecordsFromStudent(Student student);

	void deleteStudentById(Integer studId);

	void deleteStudent(Student student);

	// programmer's own methods

	List<Student> findByQualification(String qualification);

	List<Student> findByQualificationAndEmailId(String qualification, String emailId);

	List<Student> findByQualificationOrEmailId(String qualification, String emailId);

	List<Student> findByQualificationStartingWith(String qualification);

	List<Student> findByQualificationOrderByPhoneNumber(String qualification);

	List<Student> findByQualificationOrderByPhoneNumberDesc(String qualification);

	List<Student> fetchAllStudents();

	List<String> fetchAllStudentNames();

	Student fetchStudentByStudId(Integer studId);

	String fetchStudentNameByStudId(Integer studId);

	List<Student> fetchByQualificationOrderByPhoneNumber(String qualification);

	List<Student> fetchByQualificationOrderByPhoneNumberDesc(String qualification);

	List<Student> fetchByQualificationAndEmailId(String qualification, String emailId);
}