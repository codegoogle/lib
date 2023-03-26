package org.xbill.DNS;

import com.p7700g.p99005.wo1;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes4.dex */
public class Mnemonic {
    public static final int CASE_LOWER = 3;
    public static final int CASE_SENSITIVE = 1;
    public static final int CASE_UPPER = 2;
    private static Integer[] cachedInts = new Integer[64];
    private String description;
    private boolean numericok;
    private String prefix;
    private int wordcase;
    private HashMap strings = new HashMap();
    private HashMap values = new HashMap();
    private int max = Integer.MAX_VALUE;

    static {
        int i = 0;
        while (true) {
            Integer[] numArr = cachedInts;
            if (i >= numArr.length) {
                return;
            }
            numArr[i] = Integer.valueOf(i);
            i++;
        }
    }

    public Mnemonic(String str, int i) {
        this.description = str;
        this.wordcase = i;
    }

    private int parseNumeric(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt >= 0) {
                if (parseInt <= this.max) {
                    return parseInt;
                }
                return -1;
            }
            return -1;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private String sanitize(String str) {
        int i = this.wordcase;
        if (i == 2) {
            return str.toUpperCase(Locale.US);
        }
        return i == 3 ? str.toLowerCase(Locale.US) : str;
    }

    public static Integer toInteger(int i) {
        if (i >= 0) {
            Integer[] numArr = cachedInts;
            if (i < numArr.length) {
                return numArr[i];
            }
        }
        return Integer.valueOf(i);
    }

    public void add(int i, String str) {
        check(i);
        Integer integer = toInteger(i);
        String sanitize = sanitize(str);
        this.strings.put(sanitize, integer);
        this.values.put(integer, sanitize);
    }

    public void addAlias(int i, String str) {
        check(i);
        Integer integer = toInteger(i);
        this.strings.put(sanitize(str), integer);
    }

    public void addAll(Mnemonic mnemonic) {
        if (this.wordcase == mnemonic.wordcase) {
            this.strings.putAll(mnemonic.strings);
            this.values.putAll(mnemonic.values);
            return;
        }
        throw new IllegalArgumentException(wo1.C(new StringBuilder(), mnemonic.description, ": wordcases do not match"));
    }

    public void check(int i) {
        if (i < 0 || i > this.max) {
            throw new IllegalArgumentException(this.description + " " + i + "is out of range");
        }
    }

    public String getText(int i) {
        check(i);
        String str = (String) this.values.get(toInteger(i));
        if (str != null) {
            return str;
        }
        String num = Integer.toString(i);
        return this.prefix != null ? wo1.C(new StringBuilder(), this.prefix, num) : num;
    }

    public int getValue(String str) {
        int parseNumeric;
        String sanitize = sanitize(str);
        Integer num = (Integer) this.strings.get(sanitize);
        if (num != null) {
            return num.intValue();
        }
        String str2 = this.prefix;
        if (str2 == null || !sanitize.startsWith(str2) || (parseNumeric = parseNumeric(sanitize.substring(this.prefix.length()))) < 0) {
            if (this.numericok) {
                return parseNumeric(sanitize);
            }
            return -1;
        }
        return parseNumeric;
    }

    public void setMaximum(int i) {
        this.max = i;
    }

    public void setNumericAllowed(boolean z) {
        this.numericok = z;
    }

    public void setPrefix(String str) {
        this.prefix = sanitize(str);
    }
}