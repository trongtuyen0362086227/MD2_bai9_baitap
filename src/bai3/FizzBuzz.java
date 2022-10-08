package bai3;

public class FizzBuzz {
    public static String fizzBuzz(int number) {
        String fizzOrBuzz = "";
        if (number % 3 == 0 && number % 5 == 0) {
            fizzOrBuzz = "FizzBuzz";
        } else if (number % 3 == 0 || (number + "").contains("3")) { // co the thay the contains= matches
            fizzOrBuzz = "Fizz";
        } else if (number % 5 == 0 || (number + "").contains("5")) {
            fizzOrBuzz = "Buzz";
        } else {
            fizzOrBuzz = number + "";
        }
        int a, b, c;
        String d = null, e = null, f = null;
        if (number > 0 && number < 10) {
            switch (number) {
                case 0:
                    System.out.println(number + " : khong");
                    break;
                case 1:
                    System.out.println(number + " : mot");
                    break;
                case 2:
                    System.out.println(number + " : hai");
                    break;
                case 3:
                    System.out.println(number + " : ba");
                    break;
                case 4:
                    System.out.println(number + " : bon");
                    break;
                case 5:
                    System.out.println(number + " : nam");
                    break;
                case 6:
                    System.out.println(number + " : sau");
                    break;
                case 7:
                    System.out.println(number + " : bay");
                    break;
                case 8:
                    System.out.println(number + " : tam");
                    break;
                case 9:
                    System.out.println(number + " : chin");
                    break;
            }
        } else if (number >= 10 && number < 20) {
            a = number - 10;
            switch (a) {
                case 0:
                    System.out.println(number + " : muoi");
                    break;
                case 1:
                    System.out.println(number + " :muoi mot");
                    break;
                case 2:
                    System.out.println(number + " :muoi hai");
                    break;
                case 3:
                    System.out.println(number + " :muoi ba");
                    break;
                case 4:
                    System.out.println(number + " :muoi bon");
                    break;
                case 5:
                    System.out.println(number + " :muoi nam");
                    break;
                case 6:
                    System.out.println(number + " :muoi sau");
                    break;
                case 7:
                    System.out.println(number + " :muoi bay");
                    break;
                case 8:
                    System.out.println(number + " :muoi tam");
                    break;
                case 9:
                    System.out.println(number + " :muoi chin");
                    break;

            }
        } else if (number >= 20 && number < 100) {
            a = number / 10;
            b = number % 10;
            switch (a) {
                case 2:
                    d = " : hai muoi";
                    break;
                case 3:
                    d = " : ba muoi";
                    break;
                case 4:
                    d = " : bon muoi";
                    break;
                case 5:
                    d = " : nam muoi";
                    break;
                case 6:
                    d = " : sau muoi";
                    break;
                case 7:
                    d = " : bay muoi";
                    break;
                case 8:
                    d = " : tam muoi";
                    break;
                case 9:
                    d = " : chin muoi";
                    break;
            }
            switch (b) {
                case 0:
                    e = " ";
                    break;
                case 1:
                    e = " mot";
                    break;
                case 2:
                    e = " hai";
                    break;
                case 3:
                    e = " ba ";
                    break;
                case 4:
                    e = " bon ";
                    break;
                case 5:
                    e = " nam ";
                    break;
                case 6:
                    e = " sau ";
                    break;
                case 7:
                    e = " bay ";
                    break;
                case 8:
                    e = " tam ";
                    break;
                case 9:
                    e = " chin ";
                    break;
            }
            System.out.println(number + d + e);

        } else {
            a = number / 100;
            b = (number % 100) / 10;
            c = (number % 100) % 10;
            switch (a) {
                case 1:
                    d = " : mot tram";
                    break;
                case 2:
                    d = " : hai tram";
                    break;
                case 3:
                    d = " : ba tram";
                    break;
                case 4:
                    d = " : bon tram";
                    break;
                case 5:
                    d = " : nam tram";
                    break;
                case 6:
                    d = " : sau tram";
                    break;
                case 7:
                    d = " : bay tram";
                    break;
                case 8:
                    d = " : tam tram";
                    break;
                case 9:
                    d = " : chin trm";
                    break;
            }
            switch (b) {
                case 0:
                    e = "";
                    break;
                case 1:
                    e = " muoi";
                    break;
                case 2:
                    e = " hai muoi";
                    break;
                case 3:
                    e = " ba muoi";
                    break;
                case 4:
                    e = " bon muoi";
                    break;
                case 5:
                    e = " nam muoi";
                    break;
                case 6:
                    e = " sau muoi";
                    break;
                case 7:
                    e = " bay muoi";
                    break;
                case 8:
                    e = " tam muoi";
                    break;
                case 9:
                    e = " chin muoi";
                    break;
            }
            switch (c) {
                case 0:
                    f = "";
                    break;
                case 1:
                    f = " muoi";
                    break;
                case 2:
                    f = " hai ";
                    break;
                case 3:
                    f = " ba ";
                    break;
                case 4:
                    f = " bon ";
                    break;
                case 5:
                    f = " nam ";
                    break;
                case 6:
                    f = " sau ";
                    break;
                case 7:
                    f = " bay ";
                    break;
                case 8:
                    f = " tam ";
                    break;
                case 9:
                    f = " chin ";
                    break;
            }
            System.out.println(number + d + e + f);
        }
        return fizzOrBuzz;
    }

    public static void main(String[] args) {
    }
}
