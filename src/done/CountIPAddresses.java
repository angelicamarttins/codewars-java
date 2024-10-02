package done;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public class CountIPAddresses {

  public static void main(String[] args) {
    System.out.println(ipsBetween("20.0.0.10", "20.0.1.0"));
  }

  public static long ipsBetween(String start, String end) {
    long firstIpAddress = calculateIpAddress(start);
    long secondIpAddress = calculateIpAddress(end);

//    System.out.println(firstIpAddress - secondIpAddress);

    return -1;
  }

  private static long calculateIpAddress(String ipAddress) {
    String[] splittedAddress = ipAddress.split("[/.]");
    AtomicReference<Double> octetPosition = new AtomicReference<>((double) 3);

    var a = Arrays.stream(splittedAddress).mapToInt(octet -> {
          double doubledOctet = Double.parseDouble(octet);
          System.out.println(doubledOctet * Math.pow(256, octetPosition.get()));
          octetPosition.updateAndGet(v -> v - 1);
          return (int) (doubledOctet * Math.pow(256, octetPosition.get()));
        })
        .reduce(Integer::sum);

//    System.out.println(Arrays.toString(a));
    System.out.println(a);
    return 1L;
  }

}

/*
 * Separa a string e transforma em array a partir dos pontos
 * Passa em cada octeto realizando o cálculo
 * Realiza a somatória da conversão dos octetos
 * Retorna o cálculo
 * Subtrai os valores dos IPs e retorna
 */
