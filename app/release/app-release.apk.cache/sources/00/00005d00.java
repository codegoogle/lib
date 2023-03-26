package com.p7700g.p99005;

import java.util.Locale;

/* compiled from: CIDRIP.java */
/* loaded from: classes3.dex */
public class sy3 {
    public String a;
    public int b;

    public sy3(@x1 String str, @x1 String str2) {
        this.a = str;
        long c = c(str2) + 4294967296L;
        int i = 0;
        while ((1 & c) == 0) {
            i++;
            c >>= 1;
        }
        if (c != (8589934591 >> i)) {
            this.b = 32;
        } else {
            this.b = 32 - i;
        }
    }

    public static int a(String str) {
        long c = c(str) + 4294967296L;
        int i = 0;
        while ((1 & c) == 0) {
            i++;
            c >>= 1;
        }
        if (c != (8589934591 >> i)) {
            return 32;
        }
        return 32 - i;
    }

    public static long c(@x1 String str) {
        String[] split = str.split("\\.");
        return (Long.parseLong(split[0]) << 24) + 0 + (Integer.parseInt(split[1]) << 16) + (Integer.parseInt(split[2]) << 8) + Integer.parseInt(split[3]);
    }

    public long b() {
        return c(this.a);
    }

    public boolean d() {
        long c = c(this.a);
        long j = (4294967295 << (32 - this.b)) & c;
        if (j != c) {
            this.a = String.format("%d.%d.%d.%d", Long.valueOf(((-16777216) & j) >> 24), Long.valueOf((16711680 & j) >> 16), Long.valueOf((65280 & j) >> 8), Long.valueOf(j & 255));
            return true;
        }
        return false;
    }

    @x1
    public String toString() {
        return String.format(Locale.ENGLISH, "%s/%d", this.a, Integer.valueOf(this.b));
    }

    public sy3(@x1 String str, int i) {
        this.b = i;
        this.a = str;
    }
}