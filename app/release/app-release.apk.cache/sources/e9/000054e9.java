package com.p7700g.p99005;

import android.os.Bundle;
import android.view.View;
import com.p7700g.p99005.i2;

/* compiled from: AccessibilityViewCommand.java */
/* loaded from: classes.dex */
public interface os {

    /* compiled from: AccessibilityViewCommand.java */
    /* loaded from: classes.dex */
    public static abstract class a {
        public Bundle a;

        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public void a(@z1 Bundle bundle) {
            this.a = bundle;
        }
    }

    /* compiled from: AccessibilityViewCommand.java */
    /* loaded from: classes.dex */
    public static final class b extends a {
        public boolean b() {
            return this.a.getBoolean(ls.N);
        }

        public int c() {
            return this.a.getInt(ls.L);
        }
    }

    /* compiled from: AccessibilityViewCommand.java */
    /* loaded from: classes.dex */
    public static final class c extends a {
        @z1
        public String b() {
            return this.a.getString(ls.M);
        }
    }

    /* compiled from: AccessibilityViewCommand.java */
    /* loaded from: classes.dex */
    public static final class d extends a {
        public int b() {
            return this.a.getInt(ls.U);
        }

        public int c() {
            return this.a.getInt(ls.V);
        }
    }

    /* compiled from: AccessibilityViewCommand.java */
    /* loaded from: classes.dex */
    public static final class e extends a {
        public int b() {
            return this.a.getInt(ls.S);
        }

        public int c() {
            return this.a.getInt(ls.R);
        }
    }

    /* compiled from: AccessibilityViewCommand.java */
    /* loaded from: classes.dex */
    public static final class f extends a {
        public float b() {
            return this.a.getFloat(ls.T);
        }
    }

    /* compiled from: AccessibilityViewCommand.java */
    /* loaded from: classes.dex */
    public static final class g extends a {
        public int b() {
            return this.a.getInt(ls.P);
        }

        public int c() {
            return this.a.getInt(ls.O);
        }
    }

    /* compiled from: AccessibilityViewCommand.java */
    /* loaded from: classes.dex */
    public static final class h extends a {
        @z1
        public CharSequence b() {
            return this.a.getCharSequence(ls.Q);
        }
    }

    boolean a(@x1 View view, @z1 a aVar);
}