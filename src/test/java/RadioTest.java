import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RadioTest {

    @Test
    public void shouldUseConstructor() {
        Radio rad1 = new Radio(0,9, 0,100,5, 5);

        assertEquals(5, rad1.currentStation);

        Radio rad2 = new Radio(0,9, 0,100,9, 9);

        assertEquals(9, rad2.currentStation);

        Radio rad3 = new Radio(0,9, 0,100,100, 1);

        assertEquals(100, rad3.currentVolume);

        Radio rad4 = new Radio(0,9, 0,100,0, 0);

        assertEquals(0, rad4.currentVolume);
    }


    @Test
    public void setCurrentStation() {
        Radio rad = new Radio(0,9, 0,100,9, 9);
        int actual = rad.setCurrentStation();
        assertEquals(9, actual);
    }

    @Test
    public void setCurrentStation2() {
        Radio rad = new Radio(0,9, 0,100,0, 0);
        int actual = rad.setCurrentStation();
        assertEquals(0, actual);
    }

    @Test
    public void nextStation() {
        Radio rad = new Radio(0,9, 0,100,9, 9);
        int actual = rad.nextStation();
        assertEquals(0, actual);
    }

    @Test
    public void nextStation2() {
        Radio rad = new Radio(0,9, 0,100,0, 0);
        int actual = rad.nextStation();
        assertEquals(1, actual);
    }


    @Test
    public void prevStation() {
        Radio rad = new Radio(0,9, 0,100,0, 0);
        int actual = rad.prevStation();
        assertEquals(9, actual);
    }

    @Test
    public void prevStation2() {
        Radio rad = new Radio(0,9, 0,100,9, 9);
        int actual = rad.prevStation();
        assertEquals(8, actual);
    }

    @Test
    public void volumeUp() {
        Radio rad = new Radio(0,9, 0,100,100, 10);
        int actual = rad.volumeUp();
        assertEquals(100, actual);
    }

    @Test
    public void volumeUp2() {
        Radio rad = new Radio(0,9, 0,100,0, 0);
        int actual = rad.volumeUp();
        assertEquals(1, actual);
    }

    @Test
    public void volumeDown() {
        Radio rad = new Radio(0,9, 0,100,0, 0);
        int actual = rad.volumeDown();
        assertEquals(0, actual);
    }

    @Test
    public void volumeDown2() {
        Radio rad = new Radio(0,9, 0,100,100, 10);
        int actual = rad.volumeDown();
        assertEquals(99, actual);
    }

}