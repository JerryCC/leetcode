public class Solution {
  public boolean isGamilPresent(String s) {
    String regex = ".+@gamil\\.com";
    // \\. as . in regex
    Pattern pattern = Pattern.compile(regex);
    // create matcher to find the pattern
    Matcher matcher = pattern.matcher(s);

    if (matcher.find())
      return true;
    else
      return false;

  }
}
