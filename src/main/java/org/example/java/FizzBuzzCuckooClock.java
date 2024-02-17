package org.example.java;

public class FizzBuzzCuckooClock {
    public static void main(String[] args) {
        // Test the fizzBuzzCuckooClock method with examples
        System.out.println(fizzBuzzCuckooClock("13:34")); // "tick"
        System.out.println(fizzBuzzCuckooClock("21:00")); // "Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo"
        System.out.println(fizzBuzzCuckooClock("11:15")); // "Fizz Buzz"
        System.out.println(fizzBuzzCuckooClock("03:03")); // "Fizz"
        System.out.println(fizzBuzzCuckooClock("14:30")); // "Cuckoo"
        System.out.println(fizzBuzzCuckooClock("08:55")); // "Buzz"
        System.out.println(fizzBuzzCuckooClock("00:00")); // "Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo"
        System.out.println(fizzBuzzCuckooClock("12:00")); // "Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo"
    }

    public static String fizzBuzzCuckooClock(String time) {
        int hour = Integer.parseInt(time.substring(0, 2));
        int minute = Integer.parseInt(time.substring(3));

        if (minute == 0) {
            // On the hour
            return cuckooSounds(hour);
        } else if (minute == 30) {
            // On the half hour
            return "Cuckoo";
        } else {
            // For other minutes
            StringBuilder result = new StringBuilder();

            if (minute % 3 == 0) {
                result.append("Fizz");
            }

            if (minute % 5 == 0) {
                if (result.length() > 0) {
                    result.append(" ");
                }
                result.append("Buzz");
            }

            if (result.length() == 0) {
                result.append("tick");
            }

            return result.toString();
        }
    }

    private static String cuckooSounds(int hour) {
        StringBuilder cuckooString = new StringBuilder();
        int cuckooCount = (hour == 12 || hour == 0) ? 12 : (hour > 12) ? hour - 12 : hour;

        for (int i = 0; i < cuckooCount; i++) {
            cuckooString.append("Cuckoo ");
        }

        return cuckooString.toString().trim();
    }
}