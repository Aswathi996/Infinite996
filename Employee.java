package com.infinite;

import java.util.Scanner;
class Emp {

    String Emp_name, Emp_address, Emp_dept ;
    int Emp_id, Emp_age;

    public String getEmp_name() {
        return Emp_name;
    }

    public void setEmp_name(String emp_name) {
        Emp_name = emp_name;
    }

    public String getEmp_address() {
        return Emp_address;
    }

    public void setEmp_address(String emp_address) {
        Emp_address = emp_address;
    }

    public String getEmp_dept() {
        return Emp_dept;
    }

    public void setEmp_dept(String emp_dept) {
        Emp_dept = emp_dept;
    }

    public int getEmp_id() {
        return Emp_id;
    }

    public void setEmp_id(int emp_id) {
        Emp_id = emp_id;
    }

    public int getEmp_age() {
        return Emp_age;
    }

    public void setEmp_age(int emp_age) {
        Emp_age = emp_age;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "Emp_name='" + Emp_name + '\'' +
                ", Emp_address='" + Emp_address + '\'' +
                ", Emp_dept='" + Emp_dept + '\'' +
                ", Emp_id=" + Emp_id +
                ", Emp_age=" + Emp_age +
                '}';
    }
}

    class Test {
        public static void main(String[] args) {
            Test eTest = new Test();
            Emp[] e = new Emp[10];
            for (int i = 1; i <= 10; i++) {
                System.out.println("SI NO" + i);
                e[i] = new Emp();
                eTest.func(e[i]);
            }
            System.out.println("10 employees are entered");
        }

        void func(Emp emp1) {
            setData(emp1);
            getData(emp1);
        }

        void setData(Emp emp1) {
            Scanner sc = new Scanner(System.in);
            int id = Integer.parseInt(sc.next());
            String name = sc.next();
            String age = sc.next();
            String dept = sc.next();
            String address = sc.next();
            emp1.setEmp_id(Integer.parseInt(String.valueOf(id)));
            emp1.setEmp_name(name);
            emp1.setEmp_age(Integer.parseInt(age));
            emp1.setEmp_dept(dept);
            emp1.setEmp_address(address);
        }

        void getData(Emp emp1) {
            System.out.println("emp1 id = " + emp1.getEmp_id()+ "\n"+"emp1 name = " + emp1.getEmp_name()+"\n"+"emp1 age = " + emp1.getEmp_age()+"\n"+"emp1 dept = " + emp1.getEmp_dept()+"\n"+"emp1 address = " + emp1.getEmp_address());
        }
    }

