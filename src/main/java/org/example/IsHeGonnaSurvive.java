package org.example;

public class IsHeGonnaSurvive {
    public static void main(String[] args) {
        System.out.println("Is he gonna survive?");
        Boolean isHeGonnaSurvive = hero(10, 1073741826);
        System.out.println(isHeGonnaSurvive);
    }

    public static boolean hero(int bullets, int dragons) {
        return (long) dragons * 2 <= (long) bullets;

//        public static boolean hero(int bullets, int dragons) {
//            long bulletsLong = bullets;
//            long dragonsLong = dragons;
//            if(dragonsLong * 2 <= bulletsLong){
//                return true;
//            }
//            return false;
    }
}