import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RadioTest {

    @Test
    public void shouldUseConstructor() {
        Radio rad1 = new Radio(0,9, 0,100,5, 50);

        assertEquals(5, rad1.currentStation);

        Radio rad2 = new Radio(0,9, 0,100,9, 50);

        assertEquals(9, rad2.currentStation);

        Radio rad3 = new Radio(0,9, 0,100,5, 100);

        assertEquals(100, rad3.currentVolume);

        Radio rad4 = new Radio(0,9, 0,100,5, 0);

        assertEquals(0, rad4.currentVolume);
    }


    @Test
    public void setCurrentStation() {
        Radio rad = new Radio(0,9, 0,100,9, 50);
        int currentStation = 9;
        int actual = currentStation;
        assertEquals(9, actual);
    }

    @Test
    public void setCurrentStation2() {
        Radio rad = new Radio(0,9, 0,100,0, 50);
        int currentStation = 0;
        int actual = currentStation;
        assertEquals(0, actual);
    }

    @Test
    public void nextStation() {
        Radio rad = new Radio(0,9, 0,100,9, 50);
        int actual = rad.nextStation(9);
        assertEquals(0, actual);
    }

    @Test
    public void nextStation2() {
        Radio rad = new Radio(0,9, 0,100,0, 50);
        int actual = rad.nextStation(0);
        assertEquals(1, actual);
    }


    @Test
    public void prewStation() {
        Radio rad = new Radio(0,9, 0,100,0, 50);
        int actual = rad.prewStation(0);
        assertEquals(9, actual);
    }

    @Test
    public void prewStation2() {
        Radio rad = new Radio(0,9, 0,100,9, 50);
        int actual = rad.prewStation(9);
        assertEquals(8, actual);
    }

    @Test
    public void volumeUp() {
        Radio rad = new Radio(0,9, 0,100,5, 10);
        int actual = rad.volumeUp(10);
        assertEquals(11, actual);
    }

    @Test
    public void volumeUp2() {
        Radio rad = new Radio(0,9, 0,100,5, 0);
        int actual = rad.volumeUp(0);
        assertEquals(1, actual);
    }

    @Test
    public void volumeDown() {
        Radio rad = new Radio(0,9, 0,100,5, 0);
        int actual = rad.volumeDown(0);
        assertEquals(0, actual);
    }

    @Test
    public void volumeDown2() {
        Radio rad = new Radio(0,9, 0,100,5, 10);
        int actual = rad.volumeDown(10);
        assertEquals(9, actual);
    }

}