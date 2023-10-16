package bt3.timPhanTuMin;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
//    -	B1: Khai báo và khởi tạo một đối tượng TreeMap.
    TreeMap<Integer,Integer> treeMap=new TreeMap<>();
//-	B2: Đưa các phần tử vào TreeMap.
    treeMap.put(1,9);
    treeMap.put(2,1);
    treeMap.put(3,2);
    treeMap.put(4,4);
    treeMap.put(5,89);
//            -	B3: Lấy giá trị của phần tử nhỏ nhất trong TreeMap bằng cách sử dụng phương thức firstEntry() của đối tượng TreeMap.
        int min=treeMap.firstKey();
        System.out.println("Min trong tree map là: "+min);
    }

}
