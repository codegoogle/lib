package com.p7700g.p99005;

/* compiled from: SdkInfo.java */
/* loaded from: classes.dex */
public class b51 {
    @x1
    private final String a;

    public b51(@x1 String str) {
        this.a = str;
    }

    @x1
    public String a() {
        return this.a;
    }

    public String toString() {
        StringBuilder K = wo1.K("SdkInfo{", "deviceId='");
        K.append(this.a);
        K.append('\'');
        K.append('}');
        return K.toString();
    }
}