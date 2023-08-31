package lk.ijse.gdse2023.classproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDTO {
    private String empID;
    private String empName;
    private String empEmail;
    private String empDepID;
    private String empProfile;

}
