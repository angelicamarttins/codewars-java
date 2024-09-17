package done;

public class RoundToTheNextMultipleOf5 {

  public static void main(String[] args) {
    System.out.println(roundToNext5(0));
    System.out.println(roundToNext5(1));
    System.out.println(roundToNext5(3));
    System.out.println(roundToNext5(5));
    System.out.println(roundToNext5(7));
    System.out.println(roundToNext5(10));
    System.out.println(roundToNext5(39));
    System.out.println(roundToNext5(-2));
  }

  public static int roundToNext5(int number) {
    return number == 0
        ? 0
        : number % 5 == 0
        ? number
        : roundToNext5(number + 1);
  }

}
