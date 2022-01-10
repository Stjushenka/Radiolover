import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RadioTest {
    @Test
    public void setCurrentStation() {
        Radio rad = new Radio();
        rad.minRadio = 0;
        rad.maxRadio = 9;
        int currentStation = 9;
        int actual = currentStation;
        assertEquals(9, actual);
    }

    @Test
    public void setCurrentStation2() {
        Radio rad = new Radio();
        rad.minRadio = 0;
        rad.maxRadio = 9;
        int currentStation = 0;
        int actual = currentStation;
        assertEquals(0, actual);
    }

    @Test
    public void nextStation() {
        Radio rad = new Radio();
        rad.minRadio = 0;
        rad.maxRadio = 9;
        int actual = rad.nextStation(9);
        assertEquals(0, actual);
    }

    @Test
    public void nextStation2() {
        Radio rad = new Radio();
        rad.minRadio = 0;
        rad.maxRadio = 9;
        int actual = rad.nextStation(0);
        assertEquals(1, actual);
    }


    @Test
    public void prewStation() {
        Radio rad = new Radio();
        rad.minRadio = 0;
        rad.maxRadio = 9;
        int actual = rad.prewStation(0);
        assertEquals(9, actual);
    }

    @Test
    public void prewStation2() {
        Radio rad = new Radio();
        rad.minRadio = 0;
        rad.maxRadio = 9;
        int actual = rad.prewStation(9);
        assertEquals(8, actual);
    }

    @Test
    public void volumeUp() {
        Radio rad = new Radio();
        rad.minVolume = 0;
        rad.maxVolume = 10;
        int actual = rad.volumeUp(10);
        assertEquals(10, actual);
    }

    @Test
    public void volumeUp2() {
        Radio rad = new Radio();
        rad.minVolume = 0;
        rad.maxVolume = 10;
        int actual = rad.volumeUp(0);
        assertEquals(1, actual);
    }

    @Test
    public void volumeDown() {
        Radio rad = new Radio();
        rad.minVolume = 0;
        rad.maxVolume = 10;
        int actual = rad.volumeDown(0);
        assertEquals(0, actual);
    }

    @Test
    public void volumeDown2() {
        Radio rad = new Radio();
        rad.minVolume = 0;
        rad.maxVolume = 10;
        int actual = rad.volumeDown(10);
        assertEquals(9, actual);
    }

}