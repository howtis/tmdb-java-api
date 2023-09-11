package com.howtis.api.client.domain.values;

public class ReleaseType {
    public static final int PREMIERE = 1;
    public static final int THEATRICAL_LIMITED = 2;
    public static final int THEATRICAL = 3;
    public static final int DIGITAL = 4;
    public static final int PHYSICAL = 5;
    public static final int TV = 6;

    public static final String THEATRICAL_ALL = THEATRICAL + "|" + THEATRICAL_LIMITED;
}
