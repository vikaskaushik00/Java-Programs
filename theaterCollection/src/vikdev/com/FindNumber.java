package vikdev.com;


public class FindNumber implements Comparable<FindNumber> {
   private  int num;

   public FindNumber(int num){
       this.num = num;

   }
   public int getNum(){
       return this.num;
   }


   public int compareTo(FindNumber findNumber) {
   return Integer.compare(this.num,findNumber.getNum());
   }
}
