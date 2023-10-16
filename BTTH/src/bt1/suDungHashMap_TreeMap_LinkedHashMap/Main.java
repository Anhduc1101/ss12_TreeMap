package bt1.suDungHashMap_TreeMap_LinkedHashMap;

import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("duc",30);
        hashMap.put("huy",27);
        hashMap.put("tu",23);
        hashMap.put("thai",20);
        hashMap.put("dao",35);
        System.out.println(hashMap);
        TreeMap<String,Integer> treeMap=new TreeMap<>(hashMap);
        System.out.println("Thứ tự xuất hiện giảm dần theo tên (A->Z) là: "+treeMap);
        TreeMap<String,Integer> linkedHashMap=new TreeMap<>();
        linkedHashMap.put("tung",29);
        linkedHashMap.put("binh",19);
        System.out.println("Tuổi của binh là: "+linkedHashMap.get("binh"));
    }
}
