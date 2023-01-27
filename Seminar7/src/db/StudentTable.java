//Создать класс StudentTable
//        - Реализовать метод удаления по имени boolean removeByName (String name),
//        который бы удалял студента из таблицы по имени
//        - Создать в классе StudentRepository зависимость класса StudentTable
//        - Вызывать метод removeByName из одноименного метода класса


package db;

import data.Student;

public class StudentTable extends Table<Student> { // раз Класс тейбл использует дженерики, то и мы используем дженерик, который работает только со студентами
    public boolean deleteByFio(String fio){
        for (Student student : elements)
            if (student.getFio().equals(fio)) {
                elements.remove(student);
                return true;
            }
    }
}
