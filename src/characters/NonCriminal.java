package characters;

import clue.Fact;

public class NonCriminal extends Suspect{

    public Fact keyfact_noncriminal; // 그가 범인이 아니라는 것을 증명할 결정적인 사실

    public void actSuspiciously(){ // 의심스러운 행동을 하기

    }

    @Override
    public void denyGuilt(Fact a) { // 혐의를 부인하기
        super.denyGuilt(a);
    }

    @Override
    public void admitGuilt(Fact a) { // 허위자백하기
        super.admitGuilt(a);
    }
}
