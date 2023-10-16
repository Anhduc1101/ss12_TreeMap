package bt1.suDungHashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        -	B1: khai bảo mảng hoặc list phần từ với bất kỳ kdl nào
        int[] arr={1,2,9,8,5,3,4,2,6,7,1};
//        -	B2: Duyệt từng phần tử trong mảng và kiểm tra xem phần tử đó đã có trong HashMap hay chưa.
        HashMap<Integer,Integer> map=new HashMap<>();
        System.out.println(map);
//        for (int i = 0; i < arr.length; i++) {
//           int element=arr[i];
//           if(map.containsKey(element)){
////               code tiếp theo tương tự như forEach
//           }
//        }
        for (Integer element:arr) {
//            Nếu đã có thì tăng số lần xuất hiện lên 1
            if(map.containsKey(element)){
                int count=map.get(element);
                map.put(element,count+1);
//          , nếu chưa có thì thêm phần tử vào HashMap với số lần xuất hiện ban đầu là 1.
            }else {
                map.put(element,1);
            }
        }
//        -	B3: Duyệt qua các phần tử trong HashMap và in ra số lần xuất hiện của từng phần tử.
        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            int element=entry.getKey();
            int count=entry.getValue();
            System.out.println("Phần tử "+element+" xuất hiện "+ count+" lần");
        }
    }
}
