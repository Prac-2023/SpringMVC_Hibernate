package lk.ijse.gdse2023.classproject.repository.util;

import lk.ijse.gdse2023.classproject.entity.Department;
import lk.ijse.gdse2023.classproject.entity.Employee;
import lk.ijse.gdse2023.classproject.repository.EmployeeRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class EmployeeRepositoryIMPL implements EmployeeRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Employee saveEmployee(Employee employee) {
        Employee empToDb = new Employee();

//        empToDb.setEmpID(employee.getEmpID());
//        empToDb.setEmpName(employee.getEmpName());
//        empToDb.setEmpEmail(employee.getEmpEmail());
//        empToDb.setEmpProfile(employee.getEmpProfile());


        return entityManager.merge(employee);
    }

    @Override
    public List<Employee> getAll() {
        return null;
    }

    @Override
    public void deleteEmployee(String id) {

    }

    @Override
    public void updateEmployee(String id, Employee employee) {

    }
}
