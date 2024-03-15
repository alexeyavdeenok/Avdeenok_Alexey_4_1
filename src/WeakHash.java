import java.util.HashSet;

public class WeakHash implements Hash {
  @Override
  public int hash(String str) {
    Hash hash1 =
        string -> {
          HashSet<Character> set = new HashSet<>();
          int setSize;
          char[] charArray = string.toCharArray();
          for (char c : charArray) {
            set.add(c);
          }
          setSize = set.size();
          return setSize;
        };
    return hash1.hash(str);
  }
}
