import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedHashMapTest {
    @Test
    public void givenASentenceWhenWordsAddedToHashMapShouldReturnWordFrequency() {
        String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for(String word : words){
            Integer value = linkedHashMap.get(word);
            if (value == null) {
                value = 1;
            } else {
                value = value + 1;
            }
            linkedHashMap.add(word, value);
        }
        int timesRepeated = linkedHashMap.get("paranoid");
        System.out.println(linkedHashMap);
        Assertions.assertEquals(3, timesRepeated);
    }

    @Test
    public void givenASentenceWhenWordsAddedToLinkedHashMapShouldReturnWordFrequency() {
        String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for(String word : words){
            Integer value = linkedHashMap.get(word);
            if (value == null) {
                value = 1;
            } else {
                value = value + 1;
            }
            linkedHashMap.add(word, value);
        }
        int timesRepeated = linkedHashMap.get("are");
        System.out.println(linkedHashMap);
        Assertions.assertEquals(2, timesRepeated);
    }
}
