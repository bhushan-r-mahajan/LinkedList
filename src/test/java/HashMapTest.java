import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HashMapTest {
    @Test
    void givenASentenceWhenWordsAddedToHashMapReturnsWordFrequency() {
        String sentence = "to be or not to be";
        HashMap<String , Integer> map = new HashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for(String word : words){
            Integer value = map.get(word);
            if (value == null) {
                value = 1;
            } else {
                value = value + 1;
            }
            map.add(word, value);
        }
        int timesRepeated = map.get("to");
        System.out.println(map);
        Assertions.assertEquals(2, timesRepeated);
    }
}
