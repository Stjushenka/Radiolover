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
        rad.currentStation = 9;
        int actual = rad.nextStation();
        assertEquals(0, actual);
    }

    @Test
    public void nextStation2() {
        Radio rad = new Radio();
        rad.minRadio = 0;
        rad.maxRadio = 9;
        rad.currentStation = 0;
        int actual = rad.nextStation();
        assertEquals(1, actual);
    }


    @Test
    public void prevStation() {
        Radio rad = new Radio();
        rad.minRadio = 0;
        rad.maxRadio = 9;
        rad.currentStation = 0;
        int actual = rad.prevStation();
        assertEquals(9, actual);
    }

    @Test
    public void prevStation2() {
        Radio rad = new Radio();
        rad.minRadio = 0;
        rad.maxRadio = 9;
        rad.currentStation = 9;
        int actual = rad.prevStation();
        assertEquals(8, actual);
    }

    @Test
    public void volumeUp() {
        Radio rad = new Radio();
        rad.minVolume = 0;
        rad.maxVolume = 10;
        rad.currentVolume = 0;
        int actual = rad.volumeUp();
        assertEquals(1, actual);
    }

    @Test
    public void volumeUp2() {
        Radio rad = new Radio();
        rad.minVolume = 0;
        rad.maxVolume = 10;
        rad.currentVolume = 10;
        int actual = rad.volumeUp();
        assertEquals(10, actual);
    }

    @Test
    public void volumeDown() {
        Radio rad = new Radio();
        rad.minVolume = 0;
        rad.maxVolume = 10;
        rad.currentVolume = 0;
        int actual = rad.currentVolume;
        assertEquals(0, actual);
    }

    @Test
    public void volumeDown2() {
        Radio rad = new Radio();
        rad.minVolume = 0;
        rad.maxVolume = 10;
        rad.currentVolume = 10;
        int actual = rad.volumeDown();
        assertEquals(9, actual);
    }

}