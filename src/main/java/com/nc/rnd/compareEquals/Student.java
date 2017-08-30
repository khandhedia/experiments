package com.nc.rnd.compareEquals;

/**
 * Created by nirk0816 on 8/22/2017.
 */
public class Student implements Comparable<Student>
{
    int rollno;

    String name;

    public Student(int rollno, String name)
    {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }

        Student student = (Student) o;

        if (rollno != student.rollno) { return false; }
        return name.equals(student.name);
    }

    @Override
    public int hashCode()
    {
        int result = rollno;
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public int compareTo(Student o)
    {
        return this.rollno - o.rollno;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("rollno=").append(rollno);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
