package lk.ijse.gdse2023.classproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "department")
public class Department implements SuperEntity {
    @Id
    private String depId;
    @Column(nullable = false)
    private String depName;

}
