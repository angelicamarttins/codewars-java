public class OppositesAttract {

  /*
   * Timmy & Sarah think they are in love, but around where they live, they will only know once they
   *  pick a flower each. If one of the flowers has an even number of petals and the other has an
   * odd number of petals it means they are in love.
   * Write a function that will take the number of petals of each flower and return true if they are
   * in love and false if they aren't.
   */

  public static void main(String[] args) {
    System.out.println(isLove(1, 4));
    System.out.println(isLove(2, 2));
    System.out.println(isLove(1, 1));
    System.out.println(isLove(0, 1));
  }

  public static boolean isLove(final int flower1, final int flower2) {
    boolean isFLower1Even = isEven(flower1);
    boolean isFLower2Even = isEven(flower2);
    return (isFLower1Even && !isFLower2Even) || (isFLower2Even && !isFLower1Even);
  }

  public static boolean isEven(int number) {
    return number % 2 == 0;
  }

}
