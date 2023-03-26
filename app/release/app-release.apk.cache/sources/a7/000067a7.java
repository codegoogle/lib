package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Message;

/* compiled from: MessageCompat.java */
/* loaded from: classes.dex */
public final class ym {
    private static boolean a = true;
    private static boolean b = true;

    /* compiled from: MessageCompat.java */
    @e2(22)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static boolean a(Message message) {
            return message.isAsynchronous();
        }

        @e1
        public static void b(Message message, boolean z) {
            message.setAsynchronous(z);
        }
    }

    private ym() {
    }

    @SuppressLint({"NewApi"})
    public static boolean a(@x1 Message message) {
        if (Build.VERSION.SDK_INT >= 22) {
            return a.a(message);
        }
        if (b) {
            try {
                return a.a(message);
            } catch (NoSuchMethodError unused) {
                b = false;
            }
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    public static void b(@x1 Message message, boolean z) {
        if (Build.VERSION.SDK_INT >= 22) {
            a.b(message, z);
        } else if (a) {
            try {
                a.b(message, z);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }
}