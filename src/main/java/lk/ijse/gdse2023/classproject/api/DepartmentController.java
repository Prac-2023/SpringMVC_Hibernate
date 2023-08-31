package lk.ijse.gdse2023.classproject.api;

import lk.ijse.gdse2023.classproject.dto.DepartmentDTO;
import lk.ijse.gdse2023.classproject.dto.EmployeeDTO;
import lk.ijse.gdse2023.classproject.service.DepartmentService;
import lk.ijse.gdse2023.classproject.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/department")
public class DepartmentController {

    @Bean
    ModelMapper modelMapper(){
        return new ModelMapper();
    }

    @Autowired
    private DepartmentService departmentService;

   @ResponseStatus(HttpStatus.CREATED)
   @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    DepartmentDTO saveDepartment(@RequestBody DepartmentDTO department) throws Exception {
        return departmentService.saveDepartment(department);
    }


   @ResponseStatus(HttpStatus.NO_CONTENT)
   @DeleteMapping("{id}")
   void deleteEmployee(@PathVariable String id){
       departmentService.deleteDepartment(id);
   }

   @ResponseStatus(HttpStatus.NO_CONTENT)
   @PatchMapping("{id}")
   void updateDepartment(@PathVariable String id,@RequestBody EmployeeDTO employee){
       System.out.println(id);
       System.out.println(employee);
   }

   @GetMapping
   List<DepartmentDTO>getAllEmployee(){
      return departmentService.getAllDepartments();
   }

}
