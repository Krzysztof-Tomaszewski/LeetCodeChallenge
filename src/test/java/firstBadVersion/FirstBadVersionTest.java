package firstBadVersion;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FirstBadVersionTest {

    @Test
    void testSingleVersion() {
        int badVersion = 1;
        assertEquals(badVersion, new FirstBadVersion(badVersion).firstBadVersion(1));
    }

    @Test
    void testLastVersionBad() {
        int badVersion = 10;
        assertEquals(badVersion, new FirstBadVersion(badVersion).firstBadVersion(10));
    }

    @Test
    void testFirstVersionBad() {
        int badVersion = 1;
        assertEquals(badVersion, new FirstBadVersion(badVersion).firstBadVersion(10));
    }

    @Test
    void testMiddleVersionBad() {
        int badVersion = 5;
        assertEquals(badVersion, new FirstBadVersion(badVersion).firstBadVersion(10));
    }

    @Test
    void testLargeInput() {
        int badVersion = 1702766719;
        assertEquals(badVersion, new FirstBadVersion(badVersion).firstBadVersion(2000000000));
    }
}