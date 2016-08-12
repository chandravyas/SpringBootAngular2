package com.chandra.controller;



import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chandra.model.Student;
import com.chandra.repository.StudentRepository;

@RestController
@RequestMapping("api/v1")
public class StudentsController {
	
	@Autowired
	private StudentRepository studentRepository;

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="students",method=RequestMethod.GET)
	public List<Student> list()
	{
		List<Student> tempStudents=studentRepository.findAll();
		printStudents(tempStudents);
		return tempStudents;
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="students/{id}",method=RequestMethod.GET)
	public Student get(@PathVariable Long id)
	{
		return studentRepository.findOne(id);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="students",method=RequestMethod.POST)
	public Student create(@RequestBody Student student)
	{
		return studentRepository.saveAndFlush(student);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="students/{id}",method=RequestMethod.PUT)
	public Student update(@PathVariable Long id,@RequestBody Student student)
	{
		Student existingstudent=studentRepository.findOne(id);
		BeanUtils.copyProperties(student, existingstudent);
		return studentRepository.saveAndFlush(student);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="students/{id}",method=RequestMethod.DELETE)
	public Student delete(@PathVariable Long id)
	{
		Student existingstudent=studentRepository.findOne(id);
		studentRepository.delete(existingstudent);
		return existingstudent;
	}
	
	public void printStudents(List<Student> students)
	{
		for(Student s:students)
		{
			System.out.println(s.getName()+" "+s.getDepartment()+" "+s.getProgramtype()+" "+s.getYearjoined()+" "+s.getYearcomplete());;
		}
	}
}
