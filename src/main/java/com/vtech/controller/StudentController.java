package com.vtech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.vtech.dtos.AddressDTO;
import com.vtech.dtos.StudentDTO;
import com.vtech.models.Student;
import com.vtech.service.StudentService;

@RestController
@RequestMapping("student/api/v1/")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("students")
	public StudentDTO students() {
		StudentDTO studentDTO = new StudentDTO(123, "Venkat Reddy", new AddressDTO("Hasthinpuram", "Telangana", 501506));
		return studentDTO;
	}

	@GetMapping("getStudents")
	public StudentDTO getStudents() {
		StudentDTO studentDTO = new StudentDTO(123, "John", new AddressDTO("City", "State", 501506));
		return studentDTO;
	}

	//@RequestMapping(value = "findAllStudents", method = RequestMethod.GET, produces = "application/json")
	@GetMapping(value = "findAllStudents", produces = "application/json")
	public List<Student> findAllStudents() {
		return studentService.findAllStudents();
	}

	//@RequestMapping(value = "findStudentById/{studId}", method = RequestMethod.GET, produces = "application/json")
	@GetMapping(value = "findStudentById/{studId}", produces = "application/json")
	public Student findStudentById(@PathVariable Integer studId) {
		return studentService.findStudentById(studId);
	}

	//@RequestMapping(value = "createStudent", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@PostMapping(value = "createStudent", consumes = "application/json", produces = "application/json")
	public Student createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}

	//@RequestMapping(value = "updateStudent", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	@PutMapping(value = "updateStudent", consumes = "application/json", produces = "application/json")
	public Student updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student);
	}

	@RequestMapping(value = "updatePartialRecordsFromStudent", method = RequestMethod.PATCH, consumes = "application/json", produces = "application/json")
	public Student updatePartialRecordsFromStudent(@RequestBody Student student) {
		return studentService.updatePartialRecordsFromStudent(student);
	}

	@RequestMapping(value = "deleteStudent", method = RequestMethod.DELETE, consumes = "application/json", produces = "application/json")
	public void deleteStudent(@RequestBody Student student) {
		studentService.deleteStudent(student);
	}

	@RequestMapping(value = "deleteStudentById/{studId}", method = RequestMethod.DELETE)
	public void deleteStudentById(@PathVariable Integer studId) {
		studentService.deleteStudentById(studId);
	}

	@RequestMapping(value = "findByQualification/{qualification}", method = RequestMethod.GET)
	public List<Student> findByQualification(@PathVariable String qualification) {
		return studentService.findByQualification(qualification);
	}

	@RequestMapping(value = "findByQualificationAndEmailId/{qualification}/{emailId}", method = RequestMethod.GET)
	public List<Student> findByQualificationAndEmailId(@PathVariable String qualification,
			@PathVariable String emailId) {
		return studentService.findByQualificationAndEmailId(qualification, emailId);
	}

	@RequestMapping(value = "findByQualificationOrEmailId/{qualification}/{emailId}", method = RequestMethod.GET)
	public List<Student> findByQualificationOrEmailId(@PathVariable String qualification,
			@PathVariable String emailId) {
		return studentService.findByQualificationOrEmailId(qualification, emailId);
	}

	@RequestMapping(value = "findByQualificationStartingWith/{qualification}", method = RequestMethod.GET)
	public List<Student> findByQualificationStartingWith(@PathVariable String qualification) {
		return studentService.findByQualificationStartingWith(qualification);
	}

	@RequestMapping(value = "findByQualificationOrderByPhoneNumber/{qualification}", method = RequestMethod.GET)
	public List<Student> findByQualificationOrderByPhoneNumber(@PathVariable String qualification) {
		return studentService.findByQualificationOrderByPhoneNumber(qualification);
	}

	@RequestMapping(value = "findByQualificationOrderByPhoneNumberDesc/{qualification}", method = RequestMethod.GET)
	public List<Student> findByQualificationOrderByPhoneNumberDesc(@PathVariable String qualification) {
		return studentService.findByQualificationOrderByPhoneNumberDesc(qualification);
	}

	@RequestMapping(value = "fetchAllStudents", method = RequestMethod.GET, produces = "application/json")
	public List<Student> fetchAllStudents() {
		return studentService.fetchAllStudents();
	}

	@RequestMapping(value = "fetchAllStudentNames", method = RequestMethod.GET, produces = "application/json")
	public List<String> fetchAllStudentNames() {
		return studentService.fetchAllStudentNames();
	}

	@RequestMapping(value = "fetchStudentByStudId/{studId}", method = RequestMethod.GET, produces = "application/json")
	public Student fetchStudentByStudId(@PathVariable Integer studId) {
		return studentService.fetchStudentByStudId(studId);
	}

	@RequestMapping(value = "fetchStudentNameByStudId/{studId}", method = RequestMethod.GET, produces = "application/json")
	public String fetchStudentNameByStudId(@PathVariable Integer studId) {
		return studentService.fetchStudentNameByStudId(studId);
	}

	@RequestMapping(value = "fetchByQualificationOrderByPhoneNumber/{qualification}", method = RequestMethod.GET)
	public List<Student> fetchByQualificationOrderByPhoneNumber(@PathVariable String qualification) {
		return studentService.fetchByQualificationOrderByPhoneNumber(qualification);
	}

	@RequestMapping(value = "fetchByQualificationOrderByPhoneNumberDesc/{qualification}", method = RequestMethod.GET)
	public List<Student> fetchByQualificationOrderByPhoneNumberDesc(@PathVariable String qualification) {
		return studentService.fetchByQualificationOrderByPhoneNumberDesc(qualification);
	}

	@RequestMapping(value = "fetchByQualificationAndEmailId/{qualification}/{emailId}", method = RequestMethod.GET)
	public List<Student> fetchByQualificationAndEmailId(@PathVariable String qualification,
			@PathVariable String emailId) {
		return studentService.fetchByQualificationAndEmailId(qualification, emailId);
	}
}