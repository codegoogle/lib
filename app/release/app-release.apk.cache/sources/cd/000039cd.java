package com.p7700g.p99005;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.anythink.basead.b.a;
import com.anythink.expressad.foundation.c.d;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CtaUtils.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR(\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f0\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/p7700g/p99005/ay2;", "", "", a.C0020a.k, "b", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/Context;", "context", "Landroid/graphics/Bitmap;", "a", "(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;", "Ljava/util/HashMap;", "", "c", "Ljava/util/HashMap;", "ctaTextMap", "Ljava/lang/String;", "TAG", "d", "DEFAULT_ICON", "<init>", "()V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class ay2 {
    @NotNull
    private static final String b = "CtaUtil";
    @NotNull
    private static final String d = "gg_learnicon";
    @NotNull
    public static final ay2 a = new ay2();
    @NotNull
    private static final HashMap<String, List<String>> c = new HashMap<>();

    private ay2() {
    }

    @Nullable
    public final Bitmap a(@NotNull Context context, @NotNull String str) {
        c25.p(context, "context");
        c25.p(str, a.C0020a.k);
        return BitmapFactory.decodeResource(context.getResources(), context.getResources().getIdentifier(a.b(str), com.anythink.expressad.foundation.h.h.c, context.getPackageName()));
    }

    @NotNull
    public final String b(@NotNull String str) {
        List<String> F;
        boolean z;
        c25.p(str, a.C0020a.k);
        HashMap<String, List<String>> hashMap = c;
        hashMap.put("gg_knowicon", js4.Q("learn", "read", com.anythink.expressad.foundation.d.c.bY, "started"));
        hashMap.put(d, js4.Q("find", "discover", "check"));
        hashMap.put("gg_downloadicon", js4.Q("download", "install", "app"));
        hashMap.put("gg_playicon", js4.Q("watch", d.a.a));
        hashMap.put("gg_buyicon", js4.Q("shop", "buy", "order"));
        hashMap.put("gg_bookicon", js4.Q("book"));
        hashMap.put("gg_signinicon", js4.Q("sign", "subscribe", "join", "register"));
        List<String> x = new o85("\\s+").x(str, 0);
        if (!x.isEmpty()) {
            ListIterator<String> listIterator = x.listIterator(x.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() == 0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (!z) {
                    F = rs4.E5(x, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        F = js4.F();
        for (String str2 : F) {
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = str2.toLowerCase();
            c25.o(lowerCase, "(this as java.lang.String).toLowerCase()");
            for (Map.Entry<String, List<String>> entry : c.entrySet()) {
                String key = entry.getKey();
                if (entry.getValue().contains(lowerCase)) {
                    return key;
                }
            }
        }
        xz2.c(b, "Going to default icon");
        return d;
    }
}