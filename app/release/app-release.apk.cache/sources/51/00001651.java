package com.facebook.soloader;

import java.util.List;
import javax.annotation.Nullable;

/* compiled from: NativeLibrary.java */
/* loaded from: classes2.dex */
public abstract class s {
    private static final String a = "com.facebook.soloader.s";
    @Nullable
    private List<String> c;
    private final Object b = new Object();
    private Boolean d = Boolean.TRUE;
    private boolean e = false;
    @Nullable
    private volatile UnsatisfiedLinkError f = null;

    public s(List<String> list) {
        this.c = list;
    }

    public void a() throws UnsatisfiedLinkError {
        if (!d()) {
            throw this.f;
        }
    }

    @Nullable
    public UnsatisfiedLinkError b() {
        return this.f;
    }

    public void c() throws UnsatisfiedLinkError {
    }

    @Nullable
    public boolean d() {
        synchronized (this.b) {
            if (!this.d.booleanValue()) {
                return this.e;
            }
            try {
                List<String> list = this.c;
                if (list != null) {
                    for (String str : list) {
                        w.k(str);
                    }
                }
                c();
                this.e = true;
                this.c = null;
            } catch (UnsatisfiedLinkError e) {
                this.f = e;
                this.e = false;
            }
            this.d = Boolean.FALSE;
            return this.e;
        }
    }
}