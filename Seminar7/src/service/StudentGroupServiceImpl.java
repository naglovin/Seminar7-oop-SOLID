package service;

import data.Student;
import data.StudentGroup;
import data.Teacher;

import java.util.Collections;
import java.util.List;
import java.util.Iterator;

import static utils.ReadFromTxt.getStudentsFromTxt;
import static utils.ReadFromTxt.getTeacherFromTxt;

public class StudentGroupServiceImpl implements StudentGroupService {

    @Override
    public StudentGroup getGroup() {
        Teacher teacher = getTeacherFromTxt();
        List<Student> studentList = getStudentsFromTxt();
        return new StudentGroup(teacher, studentList);
    }

    @Override
    public StudentGroup getGroup(int number) {
        Teacher teacher = getTeacherFromTxt();
        List<Student> studentList = getStudentsFromTxt();
        return new StudentGroup(teacher, studentList, number);
    }

    @Override
    public void removeStudent(String firstName, String lastName) {
        Iterator<Student> students = getStudentsFromTxt().iterator();

        while (students.hasNext()) {
            Student student = students.next();
            if (firstName.equals(student.getFirstName()) && lastName.equals(student.getLastName())) {
                students.remove();
            }
        }

    }

    public void sortStudents(StudentGroup studentGroup) {
        Collections.sort(studentGroup.getStudentList());
    }

}
