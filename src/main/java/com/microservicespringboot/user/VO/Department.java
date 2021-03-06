package com.microservicespringboot.user.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    // this is department id
    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
