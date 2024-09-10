package done;

public class RentalCarCost {

  /*
  After a hard quarter in the office you decide to get some rest on a vacation. So you will book a
  flight for you and your girlfriend and try to leave all the mess behind you.

  You will need a rental car in order for you to get around in your vacation. The manager of the car
   rental makes you some good offers.

  Every day you rent the car costs $40. If you rent the car for 7 or more days, you get $50 off your
  total. Alternatively, if you rent the car for 3 or more days, you get $20 off your total.

  Write a code that gives out the total amount for different days(d).
  */

  public static void main(String[] args) {
    System.out.println(rentalCost(1));
    System.out.println(rentalCost(2));
    System.out.println(rentalCost(3));
    System.out.println(rentalCost(4));
    System.out.println(rentalCost(5));
    System.out.println(rentalCost(6));
    System.out.println(rentalCost(7));
    System.out.println(rentalCost(8));
    System.out.println(rentalCost(9));
    System.out.println(rentalCost(10));
  }

  private static int rentalCost(int days) {
    int totalCost = 40 * days;

    return days < 3 ? totalCost : days < 7 ? totalCost - 20 : totalCost - 50;
  }

}
