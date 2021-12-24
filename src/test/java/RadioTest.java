import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    @Test
    void  setCurrentStation() {
        Radio rad = new Radio();
        int currentStation = 15;
        int actual = currentStation;
        assertEquals(9, actual);
    }

    @Test
    void nextStation() {
        Radio rad = new Radio();
        int actual = rad.nextStation(9);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void prewStation() {
        Radio rad = new Radio();
        int actual = rad.prewStation(0);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void volumeUp() {
        Radio rad = new Radio();
        int actual = rad.volumeUp(10);
        assertEquals(10, actual);
    }

    @Test
    void volumeDown() {
        Radio rad = new Radio();
        int actual = rad.volumeDown(0);
        assertEquals(0, actual);
    }

}