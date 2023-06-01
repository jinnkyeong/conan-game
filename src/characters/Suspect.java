package characters;

import clue.Fact;

public class Suspect extends Character{

    public Fact allegations; // 혐의 사실
    public boolean have_alibi; // 알리바이가 있는지 여부
    public boolean is_criminal; // 그가 범인인지 여부

    @Override
    public void introduceSelf() {

    }
    public void denyGuilt(Fact a){ // 혐의를 부인하기

    }

    public void admitGuilt(Fact a){ // 혐의를 인정하기

    }
}
