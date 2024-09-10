package tv.my_tv;

public class SamsungTV implements Tv{
    private boolean everyone;
    private int channel;
    private int control0;

    public boolean isEveryone() {
        return everyone;
    }

    public void setEveryone(boolean everyone) {
        this.everyone = everyone;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getControl0() {
        return control0;
    }

    public void setControl0(int control0) {
        this.control0 = control0;
    }

    @Override
    public void OnOff() {
        everyone = true;
        System.out.println("전원을 킵니다.");
    }

    @Override
    public int change_channel(int channel) {

        return channel;
    }

    @Override
    public void getChanne() {
        if(everyone == false) {
            System.out.println("전원이 꺼져있습니니다.");
        } else {
            System.out.println(channel);
        }

    }

    @Override
    public int paring(int control) {

        return 0;
    }
}
