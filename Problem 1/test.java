public class test {
  public static String answer(int n) {
    int numPrimes = 0;
    String _idString = "";
    for (int prime = 2; numPrimes < n + 5; prime++) {
      if (prime(prime)) {
        _idString += prime;
        numPrimes++;
      }
    }
    return _idString.substring(n, n + 5);
  }

  public static void main(String[] args) {
    for (int i = 0; i <= 10000; i+=5)
      System.out.println(i + " " + answer(i));
  }

  public static boolean prime(int n) {
    if (n == 2)
      return true;
    if (n % 2 == 0)
      return false;
    for (int i = 3; i * i <= n; i += 2) {
      if (n % i == 0)
        return false;
    }
    return true;
  }
}
