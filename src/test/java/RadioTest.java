import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RadioTest {


    @Test
    public void shouldUseConstructor() {
        Radio rad5 = new Radio(0, 9, 0, 100, 50, 5);

        assertEquals(5, rad5.currentStation);

        Radio rad1 = new Radio(0, 9, 0, 100, 100, 9);

        assertEquals(100, rad1.currentVolume);

        Radio rad2 = new Radio(0, 9, 0, 100, 0, 0);

        assertEquals(0, rad2.currentStation);

        Radio rad3 = new Radio(0, 9, 0, 100, 0, 0);

        assertEquals(0, rad3.currentVolume);

        Radio rad4 = new Radio(0, 9, 0, 100, 0, 9);

        assertEquals(9, rad4.currentStation);
    }


    @Test
    public void setCurrentStation() {
        Radio rad = new Radio(0,9, 0, 100, 9, 9);
        int actual = rad.currentStation;
        assertEquals(9, actual);
    }

    @Test
    public void setCurrentStation2() {
        Radio rad = new Radio(0,9,0,100,50,0);
        int actual = rad.currentStation;
        assertEquals(0, actual);
    }

    @Test
    public void nextStation() {
        Radio rad = new Radio(0,9,0,100,50,9);
        int actual = rad.nextStation(9);
        assertEquals(0, actual);
    }

    @Test
    public void nextStation2() {
        Radio rad = new Radio(0,9,0,100,50,0);
        rad.minRadio = 0;
        rad.maxRadio = 9;
        int actual = rad.nextStation(0);
        assertEquals(1, actual);
    }


    @Test
    public void prewStation() {
        Radio rad = new Radio(0,9,0,100,50,0);
        int actual = rad.prewStation(0);
        assertEquals(9, actual);
    }

    @Test
    public void prewStation2() {
        Radio rad = new Radio(0,9,0,100,50,9);
        int actual = rad.prewStation(9);
        assertEquals(8, actual);
    }

    @Test
    public void volumeUp() {
        Radio rad = new Radio(0,9,0,100,100,0);
        int actual = rad.volumeUp(100);
        assertEquals(100, actual);
    }

    @Test
    public void volumeUp2() {
        Radio rad = new Radio(0,9,0,100,0,0);
        int actual = rad.volumeUp(0);
        assertEquals(1, actual);
    }

    @Test
    public void volumeDown() {
        Radio rad = new Radio(0,9,0,100,0,0);
        int actual = rad.volumeDown(0);
        assertEquals(0, actual);
    }

    @Test
    public void volumeDown2() {
        Radio rad = new Radio(0,9,0,100,100,0);
        int actual = rad.volumeDown(100);
        assertEquals(99, actual);
    }

}