package paintJob;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    getBucketCount(3.4,2.1,1.5,2);
    getBucketCount(3.4,2.1,1.5);
    getBucketCount(3.4,1.5);
    }

        public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets)
         {


            if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
                return -1;

            }
            else{
                double areaOfWall = width * height;
                double bucket = areaOfWall / areaPerBucket;
                double buyBucket = Math.ceil((bucket - extraBuckets));
                int buy = (int) buyBucket;
                System.out.println("bucket = " + buy);
                return buy;
            }
        }

        public static int getBucketCount(double width, double height, double areaPerBucket){


            if(width <= 0 || height <= 0 || areaPerBucket <= 0 ) {
                return -1;

            }
            else {
                double areaOfWall = width * height;
                double bucket = Math.ceil((areaOfWall / areaPerBucket));
                int buy = (int) bucket;
                System.out.println("Number of Bucket when Bob doesn't have any Extra bucket : " + buy);
                return buy;

            }
        }

        public static int getBucketCount(double area,double areaPerBucket) {

            if(area <= 0 || areaPerBucket <= 0){
                return -1;
            }
            else {
                double numberOfBucket = Math.ceil(area / areaPerBucket);
                int buy = (int) numberOfBucket;
                System.out.println("Number of bucket when Bob only knows the area of wall : " + buy);
                return buy;
            }
        }

}
