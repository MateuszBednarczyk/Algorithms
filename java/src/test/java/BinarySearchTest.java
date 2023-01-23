import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.matthew.BinarySearch;

import java.util.Arrays;

public class BinarySearchTest {

    BinarySearch binarySearch = new BinarySearch();

    @Test
    void algorithmTest(){
        //given
        int[] array = {1, 2, 3, 4};
        int item = 1;

        //when
        int i = Arrays.binarySearch(array, item);

        //then
        Assertions.assertEquals(i, binarySearch.algorithm());
    }
}
