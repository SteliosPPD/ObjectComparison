package objectcomparison;

import java.util.Objects;

public class Student implements Comparable {
    
    private String name;
    private int age;
    private int grade;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", grade=" + grade + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.age != other.age) {
            return false;
        }
        if (this.grade != other.grade) {
            return false;
        }
        if (!this.name.equals(other.name)) {
            return false;
        }
        return true;
        
        
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.name);
        hash = 43 * hash + this.age;
        hash = 43 * hash + this.grade;
        return hash;
    }

    @Override
    public int compareTo(Object o) {
        int result = this.age - ((Student)o).age;
        //int result = this.grade - ((Student)o).grade;
        //int result = this.name.compareTo((Student)o));
    return result;
    }
}
