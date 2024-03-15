import java.util.HashSet;
/**
 *Класс имплементирующий интерфейс Hash,
 *получает значение hash,
 *исходя из количества уникальных символов в строке
 */
public class WeakHash implements Hash {
    /** Фукнция возвращает количество уникальных символов в строке,
     * для поиска уникальных символов использутся множество,
     * элементами которого являются символы строки.
     */
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
