package lk.ijse.gdse2023.classproject.entityDTOConversion;

import lk.ijse.gdse2023.classproject.WebAppInitializer;
import lk.ijse.gdse2023.classproject.dto.DepartmentDTO;
import lk.ijse.gdse2023.classproject.dto.EmployeeDTO;
import lk.ijse.gdse2023.classproject.entity.Department;
import lk.ijse.gdse2023.classproject.entity.Employee;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@Component
public class EntityDTOConversion {

    private final ModelMapper modelMapper;

    public EntityDTOConversion(ModelMapper modelMapper){
        this.modelMapper = modelMapper;
    }

    public Department getDepEntity (DepartmentDTO departmentDTO){
        return modelMapper.map(departmentDTO, Department.class);
    }
    public DepartmentDTO getDepartmentDTO(Department department){
        return modelMapper.map(department, DepartmentDTO.class);
    }

    public Employee getEmployee(EmployeeDTO employeeDTO){
       return modelMapper.map(employeeDTO,Employee.class);
    }

    public EmployeeDTO getEmployeeDTO(Employee employeeEntity){
        return modelMapper.typeMap(Employee.class, EmployeeDTO.class)
                .addMapping(emp -> emp.getDepartment().getDepId(),EmployeeDTO::setEmpDepID)
                .map(employeeEntity);
    }
//    public ToDoDTO getToDoDTO(Todo todoEntity){
//        return modelMapper.typeMap(Todo.class, ToDoDTO.class)
//                .addMapping(todo -> todo.getUser().getId(),ToDoDTO::setUserIdTodo)
//                .map(todoEntity);
//    }
}
