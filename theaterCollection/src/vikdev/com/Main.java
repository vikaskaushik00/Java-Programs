package vikdev.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	Theater theater = new Theater("Wave",8,12);

	if (theater.reserveSeat("D12")){
	    System.out.println("Please pay for D12");
    }else {
	    System.out.println("Seat is taken");
    }
        if (theater.reserveSeat("D12")){
            System.out.println("Please pay for D12");
        }else {
            System.out.println("Seat is taken");
        }

        List<Theater.Seat> list = new ArrayList<>(theater.getSeats());
        Collections.reverse(list);
        printList(list);
        List<Theater.Seat> list1 = new ArrayList<>(theater.getSeats());
        list1.add(theater.new Seat("A00",13.00));
        list1.add(theater.new Seat("B00",13.00));

        Collections.sort(list1,Theater.PRICE_ORDER);
        printList(list1);


//        ArrayList<FindNumber> numbers = new ArrayList<>();
//
//        FindNumber findNumber = new FindNumber(51);
//        FindNumber findNumber1 = new FindNumber(52);
//        FindNumber findNumber2 = new FindNumber(5);
//        FindNumber findNumber3 = new FindNumber(58);
//        FindNumber findNumber4 = new FindNumber(2);
//
//
//        numbers.add(findNumber);
//        numbers.add(findNumber1);
//        numbers.add(findNumber2);
//        numbers.add(findNumber3);
//        numbers.add(findNumber4);
//
//       // Collections.sort(numbers);
//        FindNumber search = new FindNumber(52);
//        int n = Collections.binarySearch(numbers,search,null);
//        System.out.println(n);
//        System.out.println(numbers.get(n).getNum());
//        for (int i = 0;i < numbers.size();i++){
//            System.out.println(numbers.get(i).getNum());
//        }
    }


    public static void printList(List<Theater.Seat> list){
        for (Theater.Seat seat : list){
            System.out.print(" "+seat.getSeatNumber()+" : "+seat.getPrice());
        }
        System.out.println("");
        System.out.println("=====================================");
    }
}
