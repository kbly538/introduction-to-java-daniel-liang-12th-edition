/* Listing 9.4 */
package chapter09.ObjectsAndClasses.listings;

public class TV {

    int channel = 1;
    int volume = 1;
    boolean on = false;

    public TV() {

    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 100)
            channel = newChannel;
    }

    public void setVolume(int newVolumeLevel) {
        if (on && newVolumeLevel >= 1 && newVolumeLevel <= 10)
            volume = newVolumeLevel;
    }

    public void channelUp() {
        if (on && channel <= 100)
            channel++;
    }

    public void channelDown() {
        if (on && channel > 1)
            channel--;
    }

    public void volumeUp() {
        if (on && volume <= 10)
            volume++;
    }

    public void volumeDown() {
        if (on && volume > 1)
            volume--;
    }

}
