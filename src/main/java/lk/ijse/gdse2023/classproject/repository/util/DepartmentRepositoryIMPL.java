package lk.ijse.gdse2023.classproject.repository.util;

import lk.ijse.gdse2023.classproject.entity.Department;
import lk.ijse.gdse2023.classproject.repository.DepartmentRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
public class DepartmentRepositoryIMPL implements DepartmentRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public Department saveDepartment(Department department) {
        return em.merge(department);
    }

    @Override
    public Department findById(String id) {
       return em.find(Department.class,id);
    }

    @Override
    public List<Department> getAll() {
        return null;
    }

    @Override
    public void deleteDepartment(String id) {

    }

    @Override
    public void updateDepartment(String id, Department department) {

    }
}
