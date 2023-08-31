package lk.ijse.gdse2023.classproject.service.util;

import lk.ijse.gdse2023.classproject.dto.DepartmentDTO;
import lk.ijse.gdse2023.classproject.dto.EmployeeDTO;
import lk.ijse.gdse2023.classproject.entity.Employee;
import lk.ijse.gdse2023.classproject.repository.EmployeeRepository;
import lk.ijse.gdse2023.classproject.service.DepartmentService;
import lk.ijse.gdse2023.classproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class DepartmentServiceIMPL implements DepartmentService {

    @Override
    public DepartmentDTO saveDepartment(DepartmentDTO department) throws Exception {
        return null;
    }

    @Override
    public List<DepartmentDTO> getAllDepartments() {
        return null;
    }

    @Override
    public void deleteDepartment(String id) {

    }

    @Override
    public void updateDepartment(String id, DepartmentDTO department) {

    }
}
