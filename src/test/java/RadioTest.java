import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RadioTest {
    @Test
    public void setCurrentStation() {
        Radio rad = new Radio();

        int actual = rad.setCurrentStation(11);
        assertEquals(9, actual);
    }

    @Test
    public void setCurrentStation2() {
        Radio rad = new Radio();
        int actual = rad.setCurrentStation(0);
        assertEquals(0, actual);
    }

    @Test
    public void setCurrentVolume() {
        Radio rad = new Radio();

        int actual = rad.setCurrentVolume(11);
        assertEquals(10, actual);
    }

    @Test
    public void setCurrentVolume2() {
        Radio rad = new Radio();

        int actual = rad.setCurrentVolume(0);
        assertEquals(0, actual);
    }

    @Test
    public void setCurrentVolume3() {
        Radio rad = new Radio();

        int actual = rad.setCurrentVolume(5);
        assertEquals(5, actual);
    }

    @Test
    public void nextStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        int actual = rad.nextStation();
        assertEquals(0, actual);
    }

    @Test
    public void nextStation2() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        int actual = rad.nextStation();
        assertEquals(1, actual);
    }


    @Test
    public void prevStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        int actual = rad.prevStation();
        assertEquals(9, actual);
    }

    @Test
    public void prevStation2() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        int actual = rad.prevStation();
        assertEquals(8, actual);
    }

    @Test
    public void volumeUp() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        int actual = rad.volumeUp();
        assertEquals(1, actual);
    }

    @Test
    public void volumeUp2() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        int actual = rad.volumeUp();
        assertEquals(10, actual);
    }

    @Test
    public void volumeDown() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        int actual = rad.volumeDown();
        assertEquals(0, actual);
    }

    @Test
    public void volumeDown2() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        int actual = rad.volumeDown();
        assertEquals(9, actual);
    }

    @Test
    public void volumeDown3() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);
        int actual = rad.volumeDown();
        assertEquals(4, actual);
    }

}