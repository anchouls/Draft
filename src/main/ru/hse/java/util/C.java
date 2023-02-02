package ru.hse.java.util;

import java.util.HashMap;

public class C {
    protected final static HashMap<Integer, String> cmd2String = new HashMap();
    static {
        cmd2String.put(1, "conf");
        cmd2String.put(2, "cons");
        cmd2String.put(3, "crst");
        cmd2String.put(4, "dump");
        cmd2String.put(5, "envi");
    }
    public String b(int x, int y) {
        String cmd = cmd2String.get(3);
        return cmd;
    }
}
