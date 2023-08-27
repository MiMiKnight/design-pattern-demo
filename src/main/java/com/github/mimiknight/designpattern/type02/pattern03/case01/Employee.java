package com.github.mimiknight.designpattern.type02.pattern03.case01;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
@Getter
public class Employee {

    /**
     * 员工姓名
     */
    private String name;
    /**
     * 员工所属部门
     */
    private String dept;
    /**
     * 员工月薪资
     */
    private int salary;

    /**
     * 下属
     */
    private final List<Employee> subordinates;

    //构造函数
    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<>();
    }

    /**
     * 添加下属员工
     *
     * @param employee 下属员工
     */
    public void add(Employee employee) {
        this.subordinates.add(employee);
    }

    /**
     * 获取下属员工集合
     *
     * @return {@link List}<{@link Employee}>
     */
    public List<Employee> getSubordinates(){
        return this.subordinates;
    }

}
