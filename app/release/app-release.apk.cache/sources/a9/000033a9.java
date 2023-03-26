package com.ironsource.a;

import android.util.Pair;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class a {
    public String a;
    public boolean b;
    public String c;
    public d d;
    public boolean e;
    public ArrayList<Pair<String, String>> f;

    /* renamed from: com.ironsource.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0108a {
        public String a;
        public d d;
        public boolean b = false;
        public String c = "POST";
        public boolean e = false;
        public ArrayList<Pair<String, String>> f = new ArrayList<>();

        public C0108a(String str) {
            this.a = "";
            if (str == null || str.isEmpty()) {
                return;
            }
            this.a = str;
        }
    }

    public a(C0108a c0108a) {
        this.e = false;
        this.a = c0108a.a;
        this.b = c0108a.b;
        this.c = c0108a.c;
        this.d = c0108a.d;
        this.e = c0108a.e;
        if (c0108a.f != null) {
            this.f = new ArrayList<>(c0108a.f);
        }
    }
}