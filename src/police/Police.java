package police;

import state.State;

public class Police {
    State state = new State(1,1,1); // 싱글톤으로만들어야하나?
    public void gather(){ // 사람들을 모으다

    }
    public void arrest(String criminal){ // 체포하기

    }
    public void missCriminal(String criminal){ // 범인을 놓치다

    }
    public void warn(){ // 경고하기

        state.decreaseHP(1);
    }
}
