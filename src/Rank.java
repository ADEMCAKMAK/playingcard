public enum Rank {

    ACE(1),
    C2(2),
    C3(3),
    C4(4),
    C5(5),
    C6(6),
    C7(7),
    C8(8),
    C9(9),
    C10(10),
    JACK(10),
    QUEEN(10),
    KING(10);

    private Integer value;

    Rank(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
