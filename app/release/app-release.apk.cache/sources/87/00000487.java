package com.anythink.basead.e;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class b {
    public static final String a = "b";
    private Map<String, InterfaceC0030b> b;

    /* loaded from: classes2.dex */
    public static class a {
        private static final b a = new b((byte) 0);

        private a() {
        }
    }

    /* renamed from: com.anythink.basead.e.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0030b extends Serializable {
        void a();

        void a(int i);

        void a(com.anythink.basead.c.e eVar);

        void a(boolean z);

        void b();

        void c();

        void d();

        void e();
    }

    public /* synthetic */ b(byte b) {
        this();
    }

    public static b a() {
        return a.a;
    }

    public final void b(String str) {
        this.b.remove(str);
    }

    private b() {
        this.b = new HashMap(2);
    }

    public final void a(String str, InterfaceC0030b interfaceC0030b) {
        this.b.put(str, interfaceC0030b);
    }

    public final InterfaceC0030b a(String str) {
        return this.b.get(str);
    }
}