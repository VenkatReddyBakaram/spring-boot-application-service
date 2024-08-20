package com.vtech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.vtech.models.Student;
import com.vtech.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Student> findAllStudents() {
		return (List<Student>) studentRepository.findAll();
	}

	@Override
	public Student findStudentById(Integer studId) {
		Optional<Student> student = studentRepository.findById(studId);
		return student.get();
	}

	@Override
	public Student updateStudent(Student student) {

		Student existingStudent = studentRepository.findById(student.getStudId()).get();
		existingStudent.setStudName(student.getStudName());
		existingStudent.setEmailId(student.getEmailId());
		existingStudent.setPhoneNumber(student.getPhoneNumber());
		existingStudent.setQualification(student.getQualification());

		return studentRepository.save(existingStudent);
	}

	@Override
	public Student updatePartialRecordsFromStudent(Student student) {
		Student existingStudent = studentRepository.findById(student.getStudId()).get();
		existingStudent.setStudName(student.getStudName());
		existingStudent.setEmailId(student.getEmailId());

		return studentRepository.save(existingStudent);
	}

	@Override
	public void deleteStudentById(Integer studId) {
		studentRepository.deleteById(studId);
	}

	@Override
	public void deleteStudent(Student student) {
		studentRepository.delete(student);
	}

	// programmer's own methods

	@Override
	public List<Student> findByQualification(String qualification) {
		return studentRepository.findByQualification(qualification);
	}

	@Override
	public List<Student> findByQualificationAndEmailId(String qualification, String emailId) {
		return studentRepository.findByQualificationAndEmailId(qualification, emailId);
	}

	@Override
	public List<Student> findByQualificationOrEmailId(String qualification, String emailId) {
		return studentRepository.findByQualificationOrEmailId(qualification, emailId);
	}

	@Override
	public List<Student> findByQualificationStartingWith(String qualification) {
		return studentRepository.findByQualificationStartingWith(qualification);
	}

	@Override
	public List<Student> findByQualificationOrderByPhoneNumber(String qualification) {
		return studentRepository.findByQualificationOrderByPhoneNumber(qualification);
	}

	@Override
	public List<Student> findByQualificationOrderByPhoneNumberDesc(String qualification) {
		return studentRepository.findByQualificationOrderByPhoneNumberDesc(qualification);
	}

	@Override
	public List<Student> fetchAllStudents() {
		return studentRepository.fetchAllStudents();
	}

	@Override
	public List<String> fetchAllStudentNames() {
		return studentRepository.fetchAllStudentNames();
	}

	@Override
	public Student fetchStudentByStudId(Integer studId) {
		return studentRepository.fetchStudentByStudId(studId);
	}

	@Override
	public String fetchStudentNameByStudId(Integer studId) {
		return studentRepository.fetchStudentNameByStudId(studId);
	}

	@Override
	public List<Student> fetchByQualificationOrderByPhoneNumber(String qualification) {

		return studentRepository.fetchByQualificationOrderByPhoneNumber(qualification,
				Sort.by("phoneNumber").ascending());
	}

	@Override
	public List<Student> fetchByQualificationOrderByPhoneNumberDesc(String qualification) {
		return studentRepository.fetchByQualificationOrderByPhoneNumber(qualification,
				Sort.by("phoneNumber").descending());
	}

	@Override
	public List<Student> fetchByQualificationAndEmailId(String qualification, String emailId) {
		return studentRepository.fetchByQualificationAndEmailId(qualification, emailId);
	}
}