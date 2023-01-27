package repository;

import data.Student;
import data.User;

public interface UserRepository<E extends User, I> extends Repository<E, I> {
    void delete(Student entity);

    E findByLastName(String lastName);
}
