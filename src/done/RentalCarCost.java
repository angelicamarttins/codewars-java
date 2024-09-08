package done;

public class RentalCarCost {

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
