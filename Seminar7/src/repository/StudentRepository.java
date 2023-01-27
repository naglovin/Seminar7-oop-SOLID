package repository;

import data.Student;
import db.StudentTable;

public class StudentRepository implements UserRepository<Student,Integer>{
    private StudentTable studentTable;

    public StudentRepository(StudentTable studentTable) {
        this.studentTable = studentTable;
    }
    public StudentRepository(){

    }
    @Override
    public void delete(Student entity){
        studentTable.deleteByFio(entity.getFio);
    }

    @Override
    public Student save(Student entity) {
        return null;
    }

    @Override
    public Student findById(Integer id) {
        return null;
    }

    @Override
    public Student findByLastName(String LastName) {
        return null;
    }
}
