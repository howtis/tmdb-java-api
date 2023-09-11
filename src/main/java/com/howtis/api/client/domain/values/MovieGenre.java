package com.howtis.api.client.domain.values;

public enum MovieGenre {
    Action(28, "액션"),
    Adventure(12, "모험"),
    Animation(16, "애니메이션"),
    Comedy(35, "코미디"),
    Crime(80, "범죄"),
    Documentary(99, "다큐멘터리"),
    Drama(18, "드라마"),
    Family(10751, "가족"),
    Fantasy(14, "판타지"),
    History(36, "역사"),
    Horror(27, "공포"),
    Music(10402, "음악"),
    Mystery(9648, "미스터리"),
    Romance(10749, "로맨스"),
    ScienceFiction(878, "과학 영화"),
    TVMovie(10770, "TV 영화"),
    Thriller(53, "스릴러"),
    War(10752, "전쟁"),
    Western(37, "서부");

    private final int id;
    private final String name;

    MovieGenre(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}