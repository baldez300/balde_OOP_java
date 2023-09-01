package viikko_2.Task_1;

public class Television {
    private boolean on;
    private int channel;

    public Television() {
        on = false;
        channel = 0;
    }

    public void pressOnOff() {
        on = !on;
    }

    public boolean isOn() {
        return on;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int newChannel) {
        channel = newChannel;
    }
}