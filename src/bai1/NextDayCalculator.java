package bai1;

public class NextDayCalculator {
    public static void main(String[] args) {

    }
    public static int[] nextDay(int day, int month, int year) {
        int[] arrReturnDay = new int[3];
        if (day == 30) {
            switch (month) {
                case 4:
                case 6:
                case 9:
                case 11:
                    day = 1;
                    month++;
                    break;
                default:
                    System.out.println("nhap sai");
            }
        } else if (day == 31) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                    day = 1;
                    month++;
                    break;
                case 12:
                    day = 1;
                    month = 1;
                    year++;
                    break;
            }
        } else if (day == 28 && month == 2){
            if (year % 4 == 0){
                if (year%100==0){
                    if (year%400==0){
                        day++;
                    } else {
                        day = 1;
                        month++;
                    }
                } else {
                    day++;
                }
            } else {
                day = 1;
                day++;
            }
        } else if (day==29&&month==2){
            if (year%4==0){
                if (year%100==0){
                    if (year%400==0){
                        day=1;
                        month++;
                    } else {
                        System.out.println("khong co ngay nay");
                    }
                } else {
                    day =1;
                    month++;
                }
            } else day++;
        }
        arrReturnDay[0]=day;
        arrReturnDay[1]=month;
        arrReturnDay[2]=year;
        return arrReturnDay;
    }
}
