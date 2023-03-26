package com.anythink.expressad.foundation.g.i;

import android.media.MediaPlayer;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class a {
    private static final ConcurrentHashMap<String, b> a = new ConcurrentHashMap<>();

    private a() {
    }

    public static void a(String str, b bVar) {
        a.put(str, bVar);
    }

    public static b b(String str) {
        b remove = a.remove(str);
        if (remove != null) {
            remove.a((MediaPlayer.OnPreparedListener) null);
        }
        return remove;
    }

    public static boolean c(String str) {
        return a.containsKey(str);
    }

    public static b a(String str) {
        return a.get(str);
    }

    private static void a() {
        a.clear();
    }
}