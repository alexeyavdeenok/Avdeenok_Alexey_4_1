/**
 *Класс имплементирующий интерфейс Hash,
 *вычисляет хэш от строки как сумму кодов всех символов,
 * где каждый символ при суммировании домножается на номер позиции.
 */
public class StrongHash implements Hash {
    /** Фукнция возвращает хэш,
     * вычисленный при помощи кода и номера позиции каждого символа
     */
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
