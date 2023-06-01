package characters;

import java.util.ArrayList;

public abstract class Character { // 이 자체는 객체로 쓰기 안좋음
    public int type_char; // 인물 유형 : 탐정코고로/어린이탐정단/피해자/범인/범인외용의자/목격자/그외
    public String name_char; // 인물 이름
    public int age_char; // 인물 연령
    public String gen_char;
    public String current_location; // 현재위치
    public int point_arrived; // 장소에 도착한 시점
    public int point_out_of_place; // 장소에서 벗어난 시점
    public ArrayList<String> key_features; // 해당 인물의 주요 특징

    public abstract void introduceSelf();
}
