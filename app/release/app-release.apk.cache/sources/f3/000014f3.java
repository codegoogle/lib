package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.api.Repairable;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Wh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1080Wh extends C8H {
    public static String[] A03;
    public WeakHashMap<Repairable, Boolean> A00;
    public final WeakReference<Activity> A01;
    public final AtomicReference<C0S> A02;

    static {
        A01();
    }

    public static void A01() {
        A03 = new String[]{"X2XwTp9cKPrsKt8nnsNrr4kzY8H6fo9U", "SYDx4pa2oLtOnCxt4l9slcAsJVX17", "Ktbncp6BUHUyG8VpVa87zDZ4pVgXb", "697llskWaiD0", "zjkPaZGeICZRQbBHOdPJm8zqRs5ofq42", "OjtN7hHvLZrci2lMJuqCcc7IsxYWRGMj", "Pfr7ktMWLkOUKtldLLax33ooDo", "AIe8uS1x9EYXvM4HhYe86uhhSayJeZWe"};
    }

    public C1080Wh(Activity activity, C8J c8j, C0S c0s) {
        super(activity.getApplicationContext(), c8j);
        this.A00 = new WeakHashMap<>();
        this.A02 = new AtomicReference<>();
        this.A02.set(c0s);
        this.A01 = new WeakReference<>(activity);
    }

    public C1080Wh(Context context, C8J c8j, C0S c0s) {
        super(context.getApplicationContext(), c8j);
        this.A00 = new WeakHashMap<>();
        this.A02 = new AtomicReference<>();
        this.A02.set(c0s);
        Activity A00 = A00(context);
        if (A00 != null) {
            this.A01 = new WeakReference<>(A00);
        } else {
            this.A01 = new WeakReference<>(null);
        }
    }

    @Nullable
    public static Activity A00(Context context) {
        while (true) {
            boolean z = context instanceof ContextWrapper;
            if (A03[3].length() != 12) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[6] = "yJQbBA22nGzLcakEAa6nG1va8g";
            strArr[6] = "yJQbBA22nGzLcakEAa6nG1va8g";
            if (z) {
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                if ((context instanceof C1080Wh) && ((C1080Wh) context).A09() != null) {
                    return ((C1080Wh) context).A09();
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return null;
            }
        }
    }

    @Nullable
    public final Activity A09() {
        return this.A01.get();
    }

    public C0S A0A() {
        C0S c0s = this.A02.get();
        if (c0s == null) {
            return new R4();
        }
        return c0s;
    }

    public final void A0B(C0S c0s) {
        this.A02.set(c0s);
    }

    public final void A0C(Repairable repairable) {
        this.A00.put(repairable, true);
    }

    public final void A0D(C1080Wh c1080Wh) {
        c1080Wh.A00.putAll(this.A00);
        this.A00 = c1080Wh.A00;
    }

    public final void A0E(Throwable th) {
        for (Map.Entry<Repairable, Boolean> entry : this.A00.entrySet()) {
            if (A03[3].length() != 12) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[7] = "uNK1zxgBt2FFcnYPdsvApaChXeSIkfOy";
            strArr[7] = "uNK1zxgBt2FFcnYPdsvApaChXeSIkfOy";
            entry.getKey().repair(th);
        }
    }
}