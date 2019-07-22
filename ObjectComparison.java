package objectcomparison;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ObjectComparison {

    public static void main(String[] args) {

        Student s1 = new Student("Stelios", 24, 80);
        Student s2 = new Student("George", 25, 85);
        Student s3 = new Student("Nick", 27, 100);
        Student s4 = new Student("Nick", 27, 100);
        
        boolean isEqual;
//            isEqual = (s1==s2);
//        System.out.println("s1 == s2: " + isEqual);
//        isEqual = (s3==s4);
//        System.out.println("s3 == s4: " + isEqual);
//        
//        String name1 = "Jack";
//        String name2 = "Jack";
//        isEqual = (name1==name2);
//        System.out.println("name1 == name2: " + isEqual);
//        
//        String name3 = new String ("Jack");
//        isEqual = (name2 == name3);
//        System.out.println("name3 == name2: " + isEqual);
//        
//        isEqual = name3.equals(name2);
//        System.out.println("name3.equals(name2): " + isEqual);

        isEqual = s1.equals(s2);
        System.out.println("s1.equals(s2): " + isEqual);
        
        isEqual = s3.equals(s4);
        System.out.println("s3.equals(s4): " + isEqual);
        
        Set<Student> h1 = new HashSet();
        
        h1.add(s1);
        h1.add(s2);
        h1.add(s3);
        
        boolean isContains = h1.contains(s4);
        System.out.println("h1.contains(s4): " + isContains);
        isContains = h1.contains(s3);
        System.out.println("h1.contains(s3): " + isContains);
        
        List<Student> list = new ArrayList();
        list.add(s3);
        boolean listContains = list.contains(s4);
        System.out.println("list.contains(s4): " + listContains);
        
        TreeSet<Student> treeSet = new TreeSet();
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        for (Student s: treeSet){
            System.out.println(s);
        }
        
        System.out.println();
        Iterator <Student> it = treeSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
    
}
