package com.p7700g.p99005;

import java.text.ParseException;
import java.util.Map;

/* compiled from: QualitySourceMediaType.java */
/* loaded from: classes3.dex */
public class gt3 extends tm4 {
    public static final String I = "qs";
    public static final int J = 1000;
    private final int K;

    public gt3(String str, String str2) {
        super(str, str2);
        this.K = 1000;
    }

    private static int i(String str) throws ParseException {
        if (str == null) {
            return 1000;
        }
        try {
            int floatValue = (int) (Float.valueOf(str).floatValue() * 1000.0d);
            if (floatValue >= 0) {
                return floatValue;
            }
            throw new ParseException("The quality source (qs) value, " + str + ", must be non-negative number", 0);
        } catch (NumberFormatException e) {
            ParseException parseException = new ParseException(wo1.u("The quality source (qs) value, ", str, ", is not a valid value"), 0);
            parseException.initCause(e);
            throw parseException;
        }
    }

    private static int j(tm4 tm4Var) {
        try {
            return i(tm4Var.b().get(I));
        } catch (ParseException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int l(tm4 tm4Var) {
        if (tm4Var instanceof gt3) {
            return ((gt3) tm4Var).k();
        }
        return j(tm4Var);
    }

    public static gt3 m(kt3 kt3Var) throws ParseException {
        Map<String, String> map;
        kt3Var.e();
        String p = kt3Var.p();
        kt3Var.o(j14.P);
        String p2 = kt3Var.p();
        int i = 1000;
        if (kt3Var.e()) {
            map = kt3.G(kt3Var);
            if (map != null) {
                i = i(map.get(I));
            }
        } else {
            map = null;
        }
        return new gt3(p, p2, i, map);
    }

    public int k() {
        return this.K;
    }

    public gt3(String str, String str2, int i, Map<String, String> map) {
        super(str, str2, map);
        this.K = i;
    }

    public gt3(tm4 tm4Var) {
        this(tm4Var.d(), tm4Var.c(), j(tm4Var), tm4Var.b());
    }
}