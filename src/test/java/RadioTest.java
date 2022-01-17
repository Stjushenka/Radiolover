import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RadioTest {

    @Test
    public void shouldUseConstructor() {
        Radio rad0 = new Radio(20);
        int actual = rad0.setCurrentStation(15);

        assertEquals(15, actual);

        Radio rad1 = new Radio(5);
        actual = rad1.setCurrentStation(2);

        assertEquals(2, actual);

        Radio rad2 = new Radio(30);
        actual = rad2.setCurrentStation(22);

        assertEquals(22, actual);

        Radio rad3 = new Radio(1);
        actual = rad3.setCurrentStation(1);

        assertEquals(1, actual);

        Radio rad4 = new Radio(43);
        actual = rad4.setCurrentStation(43);

        assertEquals(43, actual);
    }


    @Test
    public void setCurrentStation() {
        Radio rad = new Radio();
        rad.maxStation = 9;
        int actual = rad.setCurrentStation(10);
        assertEquals(9, actual);
    }

    @Test
    public void setCurrentStation2() {
        Radio rad = new Radio();
        int actual = rad.setCurrentStation(0);
        assertEquals(0, actual);
    }

    @Test
    public void nextStation() {
        Radio rad = new Radio();
        rad.currentStation = 9;
        int actual = rad.nextStation();
        assertEquals(0, actual);
    }

    @Test
    public void nextStation2() {
        Radio rad = new Radio();
        rad.currentStation = 0;
        int actual = rad.nextStation();
        assertEquals(1, actual);
    }


    @Test
    public void prewStation() {
        Radio rad = new Radio();
        rad.currentStation = 0;
        int actual = rad.prevStation();
        assertEquals(9, actual);
    }

    @Test
    public void prewStation2() {
        Radio rad = new Radio();
        rad.currentStation = 9;
        int actual = rad.prevStation();
        assertEquals(8, actual);
    }

    @Test
    public void volumeUp() {
        Radio rad = new Radio();
        rad.currentVolume = 100;
        int actual = rad.volumeUp();
        assertEquals(100, actual);
    }

    @Test
    public void volumeUp2() {
        Radio rad = new Radio();
        rad.currentVolume = 0;
        int actual = rad.volumeUp();
        assertEquals(1, actual);
    }

    @Test
    public void volumeDown() {
        Radio rad = new Radio();
        rad.currentVolume = 0;
        int actual = rad.volumeDown();
        assertEquals(0, actual);
    }

    @Test
    public void volumeDown2() {
        Radio rad = new Radio();
        rad.currentVolume = 100;
        int actual = rad.volumeDown();
        assertEquals(99, actual);
    }

}