public class StrongHash implements Hash {
  @Override
  public int hash(String str) {
    Hash hash1 =
        string -> {
          int calculatedHash = 0;
          for (int i = 0; i < string.length(); i++) {
            calculatedHash += (i + 1) * (int) string.charAt(i);
          }
          return calculatedHash;
        };
    return hash1.hash(str);
  }
}
