package tv.my_tv;

public interface Tv {
    // 기본 초기값은 내가 정의 를 미리 해둘꺼임.



    // 전원을 껏다가 킬수있는 메소드 나중에 전원에 따라 갑을 변경해야하니 리턴값이 존재해야함.
    void OnOff();

    // 채널을 변경하는 기능
    int change_channel(int channel);
    // 현재 채널을 확인하는 기능
    void getChanne();
    // 리모컨과 TV의 페어링 상태를 관리하는 기능
    int paring(int control);

}
