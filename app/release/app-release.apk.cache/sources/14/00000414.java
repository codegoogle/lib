package com.anythink.basead.a.a;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.anythink.basead.a.a.c;
import com.anythink.basead.c.f;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.k;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class a implements c.a {
    public static final String a = "a";
    private String b;
    private boolean c;
    private int d;
    private String e;
    private List<String> f;
    private InterfaceC0017a g;
    private Handler h;
    private AtomicBoolean i = new AtomicBoolean(false);

    /* renamed from: com.anythink.basead.a.a.a$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (a.this.i.get()) {
                return;
            }
            a.this.a(f.a(f.d, f.n));
        }
    }

    /* renamed from: com.anythink.basead.a.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0017a {
        void a();

        void a(com.anythink.basead.c.e eVar);
    }

    public a(String str, boolean z, int i) {
        this.b = str;
        this.c = z;
        this.d = i;
    }

    private void b() {
        c.a().b(this);
        Handler handler = this.h;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.h = null;
        }
    }

    private void c() {
        if (this.h == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            this.h = handler;
            handler.postDelayed(new AnonymousClass1(), this.d);
        }
    }

    public final void a(i iVar, k kVar, InterfaceC0017a interfaceC0017a) {
        this.e = iVar.k();
        this.g = interfaceC0017a;
        List<String> b = iVar.b((i) kVar);
        if (b == null) {
            a(f.a(f.l, f.C));
            return;
        }
        int size = b.size();
        if (size == 0) {
            a();
            return;
        }
        this.f = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = b.get(i);
            if (!b.b(str) && !this.f.contains(str)) {
                this.f.add(str);
            }
        }
        int size2 = this.f.size();
        if (size2 == 0) {
            String str2 = a;
            com.anythink.core.common.j.e.a(str2, "Offer(" + this.e + "), all files have already exist");
            a();
            return;
        }
        c.a().a(this);
        if (this.h == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            this.h = handler;
            handler.postDelayed(new AnonymousClass1(), this.d);
        }
        synchronized (this) {
            for (int i2 = 0; i2 < size2; i2++) {
                String str3 = this.f.get(i2);
                if (!TextUtils.isEmpty(str3)) {
                    if (b.a(str3)) {
                        com.anythink.core.common.j.e.a(a, "file is loading -> ".concat(String.valueOf(str3)));
                    } else if (b.b(str3)) {
                        com.anythink.core.common.j.e.a(a, "file exist -> ".concat(String.valueOf(str3)));
                        b.a(str3, 0);
                        c.a().a(str3);
                    } else {
                        b.a(str3, 1);
                        com.anythink.core.common.j.e.a(a, "file not exist -> ".concat(String.valueOf(str3)));
                        new d(this.b, this.c, iVar, str3).d();
                    }
                }
            }
        }
    }

    @Override // com.anythink.basead.a.a.c.a
    public final void a(String str) {
        synchronized (this) {
            b.a(str, 0);
            List<String> list = this.f;
            if (list != null) {
                list.remove(str);
                if (this.f.size() == 0 && !this.i.get()) {
                    a();
                }
            }
        }
    }

    @Override // com.anythink.basead.a.a.c.a
    public final void a(String str, com.anythink.basead.c.e eVar) {
        b.a(str, 0);
        a(eVar);
    }

    private void a() {
        this.i.set(true);
        if (this.g != null) {
            String str = a;
            com.anythink.core.common.j.e.a(str, "Offer load success, OfferId -> " + this.e);
            this.g.a();
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.anythink.basead.c.e eVar) {
        this.i.set(true);
        if (this.g != null) {
            String str = a;
            com.anythink.core.common.j.e.a(str, "Offer load failed, OfferId -> " + this.e);
            this.g.a(eVar);
        }
        b();
    }
}