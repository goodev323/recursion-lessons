package dev.goo.array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayImplTest {

    @Test
    void higherThanN() {
        assertEquals(ArrayImpl.higherThanN(new String[]{"the wood", "pecked peckers",
                "at the inn", "tomorrowland"}), 20);
        assertEquals(ArrayImpl.higherThanN(new String[]{"he","fumbled","in",
                "the","darkness","looking","for","the","light","switch"}), 17);
        assertEquals(ArrayImpl.higherThanN(new String[]{"he","is","never","at","home","on","weekends"}), 11);
    }
}