package bt2.phanbietHashMapVaTreeMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//  B1: Tạo một lớp Student chứa thông tin về tên, tuổi, địa chỉ.
        Student stu1=new Student("Duc",30,"HN");
        Student stu2=new Student("Ha",20,"HN");
        Student stu3=new Student("Cao",40,"HN");

//  B2: Sử dụng HashMap và HashSet để lưu các đối tượng Student.
        System.out.println("***** Map *****");
        Map<Integer,Student> stuMap=new HashMap<Integer,Student>();
        stuMap.put(2,stu3);
        stuMap.put(1,stu2);
        stuMap.put(3,stu1);
//        stuMap.put(4,stu3);
        System.out.println(stuMap);
        for (Map.Entry<Integer,Student> student:stuMap.entrySet()) {
            System.out.println(student.toString());
        }
        System.out.println("----- SET -----");
        Set<Student> set=new HashSet<Student>();
        set.add(stu3);
        set.add(stu1);
        set.add(stu2);

        set.add(stu1);

//  B3: Hiển thị tất cả thông tin sau khi đã lưu.
        for (Student stu:set) {
            System.out.println(stu.toString());

        }
    }
}
