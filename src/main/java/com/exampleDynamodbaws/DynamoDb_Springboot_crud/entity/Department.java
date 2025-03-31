package com.exampleDynamodbaws.DynamoDb_Springboot_crud.entity;


import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@DynamoDBDocument //this indicates that this is not will be a table, it will be a document instead as a json format
public class Department {
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    @DynamoDBAttribute
    private String departmentName;

    @DynamoDBAttribute
    private String departmentCode;

}
