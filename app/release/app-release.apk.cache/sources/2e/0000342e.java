package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.p7700g.p99005.zg2;
import java.util.Locale;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class IronSourceSegment {
    public static final String AGE = "age";
    public static final String GENDER = "gen";
    public static final String IAPT = "iapt";
    public static final String LEVEL = "lvl";
    public static final String PAYING = "pay";
    public static final String USER_CREATION_DATE = "ucd";
    private String a;
    private String g;
    private int b = 999999;
    private double c = 999999.99d;
    private final String d = "custom";
    private final int e = 5;
    private int f = -1;
    private int h = -1;
    private AtomicBoolean i = null;
    private double j = -1.0d;
    private long k = 0;
    private Vector<Pair<String, String>> l = new Vector<>();

    private static boolean b(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    private static boolean c(String str, int i, int i2) {
        return str != null && str.length() > 0 && str.length() <= 32;
    }

    public final Vector<Pair<String, String>> a() {
        Vector<Pair<String, String>> vector = new Vector<>();
        if (this.f != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f);
            vector.add(new Pair<>("age", sb.toString()));
        }
        if (!TextUtils.isEmpty(this.g)) {
            vector.add(new Pair<>(GENDER, this.g));
        }
        if (this.h != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.h);
            vector.add(new Pair<>(LEVEL, sb2.toString()));
        }
        if (this.i != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.i);
            vector.add(new Pair<>(PAYING, sb3.toString()));
        }
        if (this.j != -1.0d) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.j);
            vector.add(new Pair<>(IAPT, sb4.toString()));
        }
        if (this.k != 0) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(this.k);
            vector.add(new Pair<>(USER_CREATION_DATE, sb5.toString()));
        }
        if (!TextUtils.isEmpty(this.a)) {
            vector.add(new Pair<>("segName", this.a));
        }
        vector.addAll(this.l);
        return vector;
    }

    public int getAge() {
        return this.f;
    }

    public String getGender() {
        return this.g;
    }

    public double getIapt() {
        return this.j;
    }

    public AtomicBoolean getIsPaying() {
        return this.i;
    }

    public int getLevel() {
        return this.h;
    }

    public String getSegmentName() {
        return this.a;
    }

    public long getUcd() {
        return this.k;
    }

    public void setAge(int i) {
        if (i > 0 && i <= 199) {
            this.f = i;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setAge( " + i + " ) age must be between 1-199", 2);
    }

    public void setCustom(String str, String str2) {
        try {
            if (b(str) && b(str2) && c(str, 1, 32) && c(str2, 1, 32)) {
                String str3 = "custom_" + str;
                if (this.l.size() >= 5) {
                    this.l.remove(0);
                }
                this.l.add(new Pair<>(str3, str2));
                return;
            }
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setCustom( " + str + " , " + str2 + " ) key and value must be alphanumeric and 1-32 in length", 2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setGender(String str) {
        if (!TextUtils.isEmpty(str)) {
            Locale locale = Locale.ENGLISH;
            if (str.toLowerCase(locale).equals("male") || str.toLowerCase(locale).equals("female")) {
                this.g = str;
                return;
            }
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setGender( " + str + " ) is invalid", 2);
    }

    public void setIAPTotal(double d) {
        if (d > zg2.s && d < this.c) {
            this.j = Math.floor(d * 100.0d) / 100.0d;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setIAPTotal( " + d + " ) iapt must be between 0-" + this.c, 2);
    }

    public void setIsPaying(boolean z) {
        if (this.i == null) {
            this.i = new AtomicBoolean();
        }
        this.i.set(z);
    }

    public void setLevel(int i) {
        if (i > 0 && i < this.b) {
            this.h = i;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setLevel( " + i + " ) level must be between 1-" + this.b, 2);
    }

    public void setSegmentName(String str) {
        if (b(str) && c(str, 1, 32)) {
            this.a = str;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setSegmentName( " + str + " ) segment name must be alphanumeric and 1-32 in length", 2);
    }

    public void setUserCreationDate(long j) {
        if (j > 0) {
            this.k = j;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "setUserCreationDate( " + j + " ) is an invalid timestamp", 2);
    }
}