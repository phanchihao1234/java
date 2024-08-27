import java.util.*;
import java.util.stream.Collectors;

public class HashMap {
    public static void test(){
        java.util.HashMap<String, String> map = new java.util.HashMap<>();
        map.put("USA", "Wangshington ,D.C");
        map.put("France", "Paris");
        map.put("Japan", "Tokyo");

        //kiem tra ton tai cuaa 1 khoa
        if(map.containsKey("France")){
            System.out.println("Capital of France: "+ map.get("France"));
        }

        //Kiem tra su ton tai cua 1 gia tri
        if(map.containsValue("Tokyo")){
            System.out.println("Tokyo is in the map");
        }
        //Xóa 1 phần tử
        map.remove("Japan");
        System.out.println("--------------------------");
        //In ra các phần tử còn lại trong hashmap
        for (String key : map.keySet()){
            System.out.println(key+" : "+ map.get(key));
        }
        System.out.println("--------------------------");
        // Lặp qua các cặp khóa giá trị bằng cách sử dụng entrySet()
        for(Map.Entry<String, String> entry: map.entrySet()){
            String key = entry.getKey();
            String value= entry.getValue();
            System.out.println(" Country: "+key+" ### Capital: "+value);
        }

    }
    public static  void  countWords(){
        String s="xin chao xin chao xin pho phuong bao pho phuong";
        java.util.HashMap<String,Integer> map = new java.util.HashMap<>();
        String []words = s.split(" ");
        for(String x:words){
            int count=map.getOrDefault(x,0);
            map.put(x,count+1);
        }
        for (String key : map.keySet()){
            System.out.println(key+" : "+map.get(key));
        }
    }
    public static  void  countWords_2(){
        String s="xin chao xin chao xin pho phuong bao pho phuong";
        java.util.HashMap<String,Integer> map = new java.util.HashMap<>();
        StringTokenizer token =  new StringTokenizer(s);
        while (token.hasMoreTokens()){
            String word = token.nextToken();
            map.put(word, map.getOrDefault(word,0)+1);
        }
        for (String key : map.keySet()){
            System.out.println(key+" : "+map.get(key));
        }
    }
    public static void dictionary(){
        java.util.HashMap<String,String> dictionary= new java.util.HashMap<>();
        dictionary.put("apple","sdasdsadushadsadhasdhasdauisdha");
        dictionary.put("kiwi","2133213213232132133333330000000");
        dictionary.put("lemon","ssda8sdyasdasd98sdaras5dsad4a6da");

        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap tu khoa de tim kiem");
        String name= sc.nextLine();
        String res = dictionary.get(name);
        if(res != null){
            System.out.println(name+" : "+res);
        }else {
            System.out.println("not found");
        }

    }
    public static void test_stream(){
        java.util.HashMap<String,Integer> map = new java.util.HashMap<>();
        map.put("USA",3);
        map.put("VietNam",18);
        map.put("Japan",9);
        map.put("Korea",11);

        System.out.println("###################");
        for (String key:map.keySet()){
            System.out.println(key+" : "+map.get(key) );
        }
        System.out.println("#######################");
        //Tính tổng số lượng các công ty trên
        int kq=map.values().stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("KQ tong: "+kq);
        System.out.println("#######################");
        //Lọc quốc gia có số lượng công ty >5
        Map<String,Integer> newMap = map.entrySet().stream()
                .filter(item-> item.getValue()>5)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(newMap);
        System.out.println("###################");
        for (String key:newMap.keySet()){
            System.out.println(key+" : "+newMap.get(key) );
        }
        //Lọc quốc gia có số lượng công ty >10
        Map<String,Integer> newMap1 = map.entrySet().stream()
                .filter(item-> item.getValue()>10)
                .collect(Collectors.toMap(
                        entry -> entry.getKey(),
                        entry -> entry.getValue()
                ));
        System.out.println(newMap1);
    }
    public static void linkedHashMap(){
        Map<String, Integer>linkedHashMap = new LinkedHashMap<>();
        //Thêm phần tử
        linkedHashMap.put("one",1);
        linkedHashMap.put("two",2);
        linkedHashMap.put("three",3);
        //Cập nhật từ khóa
        linkedHashMap.put("two",233333);

//        //Truy cập 1 phần tử
//        linkedHashMap.get("two");
//        //Xóa phần tử với khóa "two"
//        linkedHashMap.remove("two");


        //In ra
        for (Map.Entry<String,Integer> entry :linkedHashMap.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }
    public static void test_treemap(){
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Banana",2);
        treeMap.put("Apple",3);
        treeMap.put("Cherry",1);

        //In ra treemap
        for (Map.Entry<String,Integer> entry : treeMap.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        //Tạo treemap vs khóa là tên và giá trị là tuổi
        TreeMap<String,Integer> ageMap=new TreeMap<>();
        ///Thêm các phần tử vào tree map
        ageMap.put("Hao",20);
        ageMap.put("Chao",21);
        ageMap.put("Nao",22);
        ageMap.put("HHao",23);

        System.out.println("~~~~~~~~~~~~~~~~");
        for(Map.Entry<String,Integer> entry : ageMap.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println("~~~~~~~~~~~~~~~~");
        //Tìm kiếm các phần tử
        System.out.println("First kEy: " +ageMap.firstKey());
        System.out.println("last Key: " + ageMap.lastKey());
        System.out.println("SubMap from Chao to HHao"+ ageMap.subMap("Chao","HHao"));
    }


    public static void main(String[] args) {
//        test();
//        countWords();
//        countWords_2();
//        dictionary();
//        test_stream();
//        linkedHashMap();
        test_treemap();
    }

}
