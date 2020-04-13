package vikdev.com;
import java.util.*;

public class Problem1 {
    //Convert list to array
    List<Integer> list = new ArrayList<Integer>();
    Scanner scanner = new Scanner(System.in);

    public void add() {
        list.add(1);
        list.add(2);
        list.add(31);
        list.add(12);
        list.add(11);
        list.add(15);
        System.out.println("List is :\n");
        for (Integer lis : list) {
            System.out.print(" " + lis);
        }
//        System.out.println("Array is : ");
//         int[] all = new int[list.size()];
//        for (int i =0; i < list.size(); i++){
//            all[i] = list.get(i);
//            System.out.println(all[i]);
//        }
        System.out.println("\nArray is : ");
        Integer[] num = list.toArray(new Integer[list.size()]);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(" " + num[i]);
        }
        System.out.println();

        List<Integer> newList = Arrays.asList(num);

        for (Integer i : newList) {
            System.out.println(i);
        }


//        System.out.println("\nEnter the number to find in list : ");
//        int find = scanner.nextInt();
//
//        if (list.contains(find)){
//            System.out.println(find+" Number found ");
//        }else {
//            System.out.println(find+" Number not found ");
//        }

    }

    public void hash() {
        Set<String> names = new HashSet<String>();
        names.add("vikas");
        names.add("akash");
        names.add("ansh");
        names.add("sarthak");
        names.add("archit");
        names.add("shubham");
        names.add("rishab");

        System.out.println(names);
        System.out.println("Enter the string to found : ");
        String find = scanner.nextLine();
        if (names.contains(find)) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");

        }

    }

    public void hasMap () {
        HashMap<String, String> mapList = new HashMap<String, String>();
        mapList.put("vikas", " : Btech");
        mapList.put("akash", " : Mtech");
        mapList.put("ansh", " : Hotel Management");
        mapList.put("sid", " : Manager");
        for (String i : mapList.keySet()) {
            System.out.println(i + mapList.get(i));
        }
        TreeMap<String,String> sorted = new TreeMap<String, String>(mapList);
        for (String i : sorted.keySet()){
            System.out.println(i+sorted.get(i));
        }
        System.out.println("Sorted by value ");
        Map<String,String> map = sort(mapList);
        for (String i : map.keySet()){
            System.out.println(i+map.get(i));
        }

    }

    public HashMap sort(HashMap map){
        List list = new LinkedList(map.entrySet());
        Collections.sort(list,new Comparator(){
            public int compare(Object o1,Object o2){
                return ((Comparable)((Map.Entry)(o1)).getValue()).compareTo(((Map.Entry)(o2)).getValue());
            }
        });

        HashMap sorted = new LinkedHashMap();
        for (Iterator i = list.iterator();i.hasNext();){
            Map.Entry entry = (Map.Entry)i.next();
            sorted.put(entry.getKey(),entry.getValue());
        }
        return sorted;
    }

}