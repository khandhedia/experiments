package com.nc.rnd.comparable;

/**
 * Created by nirk0816 on 2/6/2017.
 */
public class EmployeeComparableEntity implements Comparable{

    //You call me

    private int age;
    private String name;
    private String dept;

    public EmployeeComparableEntity(int age, String name, String dept) {
        this.age = age;
        this.name = name;
        this.dept = dept;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("EmployeeEntity{");
        sb.append("age=").append(age);
        sb.append(", name='").append(name).append('\'');
        sb.append(", dept='").append(dept).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeComparableEntity that = (EmployeeComparableEntity) o;

        if (getAge() != that.getAge()) return false;
        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        return getDept() != null ? getDept().equals(that.getDept()) : that.getDept() == null;

    }

    @Override
    public int hashCode() {
        int result = getAge();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getDept() != null ? getDept().hashCode() : 0);
        return result;
    }


    @Override
    public int compareTo(Object o) {
        if (o instanceof EmployeeComparableEntity) {
            EmployeeComparableEntity e = (EmployeeComparableEntity) o;

            return this.getName().compareTo(e.getName());
//            return this.getAge() - e.getAge();
        } else
            return 0;
    }
}
