package characters;

import item.Item;
import state.State;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class User extends Character{

    public State state; // 사용자의 스탯
    public ArrayList<String> items_keeped;// 보유 아이템 리스트
    public Item item_worn; // 착용한 아이템

    public int selectEpisode(){ // 에피소드 선택하기
        return 1;
    }
    public void lookAround(){ //해당 맵을 둘러보기

    }

    public void lookCloser(int a){ // 자세히 보기

    }
    public void chat(int who, int about){ // ~와 ~에 관해 대화하기

    }
    public void useItem(int item){ // 아이템 활용하기

    }
    public void prove(HashMap<String,String> a){ // 증명하기


    }


    @Override
    public void introduceSelf() {

    }
}
