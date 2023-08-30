package lk.ijse.gdse2023.classproject.entityDTOConversion;

import lk.ijse.gdse2023.classproject.dto.EmployeeDTO;
import lk.ijse.gdse2023.classproject.entity.Employee;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Component
public class EntityDTOConversion {

    private ModelMapper modelMapper;

    public EntityDTOConversion(ModelMapper modelMapper){
        this.modelMapper = modelMapper;
    }

    public EmployeeDTO getEmployeeDTO(Employee employee){
        return modelMapper.map(employee,EmployeeDTO.class);
    }

    public Employee getEmployee(EmployeeDTO employeeDTO){
       return modelMapper.map(employeeDTO,Employee.class);
    }
}
