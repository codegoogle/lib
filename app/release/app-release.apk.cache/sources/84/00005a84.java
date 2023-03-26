package com.p7700g.p99005;

import java.util.ArrayList;
import java.util.List;

/* compiled from: VideoClicks.java */
/* loaded from: classes3.dex */
public class rp5 {
    private String a;
    private List<String> b;
    private List<String> c;

    private String d(List<String> list) {
        StringBuffer stringBuffer = new StringBuffer();
        if (list == null) {
            return "";
        }
        for (int i = 0; i < list.size(); i++) {
            stringBuffer.append(list.get(i).toString());
        }
        return stringBuffer.toString();
    }

    public String a() {
        return this.a;
    }

    public List<String> b() {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        return this.b;
    }

    public List<String> c() {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        return this.c;
    }

    public void e(String clickThrough) {
        this.a = clickThrough;
    }

    public String toString() {
        StringBuilder G = wo1.G("VideoClicks [clickThrough=");
        G.append(this.a);
        G.append(", clickTracking=[");
        G.append(d(this.b));
        G.append("], customClick=[");
        return wo1.C(G, d(this.c), "] ]");
    }
}