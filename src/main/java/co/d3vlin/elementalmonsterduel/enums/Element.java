package co.d3vlin.elementalmonsterduel.enums;

public enum Element {
    EARTH(Group.NATURAL),
    WATER(Group.NATURAL),
    AIR(Group.ETHEREAL),
    ETHER(Group.ETHEREAL),
    VOID(Group.COSMIC),
    PLASMA(Group.COSMIC),
    FIRE(Group.ENERGETIC),
    SULFUR(Group.ENERGETIC),
    FLESH(Group.ORGANIC),
    BLOOD(Group.ORGANIC),
    FUNGI(Group.MATERIAL),
    CARBON(Group.MATERIAL);

    private final Group group;

    Element(Group group) {
        this.group = group;
    }

    public Group group() {
        return group;
    }
}
