public class Solution {
  public boolean isPrime(int num) {
    boolean prime = true;
    if (num % 2 == 0 && num != 2)
      prime = false;
    else if (num == 1) 
      prime = false;
    // the sqrt principle
    // not prime number n;
    // n = a * b & n = m * m
    // 3 conditions:
    // a < m && b > m
    // a = m && b = m
    // a > m && a < m
    // any cases, a number is leq to m
    else for (int i = 2; i*i <= numl i++) 
      if (num % i == 0)
        prime = false;
    return prime;

  }
}
