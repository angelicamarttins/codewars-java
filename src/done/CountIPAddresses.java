package done;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public class CountIPAddresses {

  /*
    Implement a function that receives two IPv4 addresses, and returns the number of addresses
    between them (including the first one, excluding the last one).

     All inputs will be valid IPv4 addresses in the form of strings. The last address will
     always be greater than the first one.

     Examples
     With input "10.0.0.0", "10.0.0.50"  => return   50
     With input "10.0.0.0", "10.0.1.0"   => return  256
     With input "20.0.0.10", "20.0.1.0"  => return  246
  */

  public static void main(String[] args) {
    System.out.println(ipsBetween("10.0.0.0", "10.0.0.50"));
    System.out.println(ipsBetween("10.0.0.0", "10.0.1.0"));
    System.out.println(ipsBetween("20.0.0.10", "20.0.1.0"));
    System.out.println(ipsBetween("150.0.0.0", "150.0.0.1"));
    System.out.println(ipsBetween("0.0.0.0", "255.255.255.255"));
  }

  public static long ipsBetween(String start, String end) {
    long startIpAddress = calculateIpAddress(start);
    long endIpAddress = calculateIpAddress(end);

    return endIpAddress - startIpAddress;
  }

  private static long calculateIpAddress(String ipAddress) {
    return Arrays.stream(ipAddress.split("[.]"))
        .mapToLong(Integer::parseInt)
        .reduce(0L, (total, octet) -> total * 256 + octet);
  }

}
