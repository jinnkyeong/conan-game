package characters;

import clue.Fact;

public class Criminal extends Suspect{
    public String motive_murder; // 살해동기
    public Fact keyfact_criminal; // 그가 범인이라는 것을 증명할 결정적인 사리
    public String method_murder; // 살해방법

    @Override
    public void introduceSelf() { // 자기 소개 하기
        super.introduceSelf();
    }


    public Fact commitMurder() { // 범죄 저지르기
        Fact a = new Fact();
        return a;
    }

    @Override
    public void denyGuilt(Fact a) {
        super.denyGuilt(a);
    }

    @Override
    public void admitGuilt(Fact a) {
        super.admitGuilt(a);
    }
}
