package com.p7700g.p99005;

import android.graphics.Bitmap;
import java.io.IOException;
import pl.droidsonroids.gif.GifInfoHandle;

/* compiled from: GifDecoder.java */
/* loaded from: classes4.dex */
public class nx5 {
    private final GifInfoHandle a;

    public nx5(@x1 by5 by5Var) throws IOException {
        this(by5Var, null);
    }

    private void a(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            if (bitmap.getWidth() >= this.a.q() && bitmap.getHeight() >= this.a.i()) {
                if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
                    return;
                }
                StringBuilder G = wo1.G("Only Config.ARGB_8888 is supported. Current bitmap config: ");
                G.append(bitmap.getConfig());
                throw new IllegalArgumentException(G.toString());
            }
            throw new IllegalArgumentException("Bitmap ia too small, size must be greater than or equal to GIF size");
        }
        throw new IllegalArgumentException("Bitmap is recycled");
    }

    public long b() {
        return this.a.b();
    }

    public String c() {
        return this.a.c();
    }

    public int d() {
        return this.a.g();
    }

    public int e(@p1(from = 0) int i) {
        return this.a.h(i);
    }

    public int f() {
        return this.a.i();
    }

    public int g() {
        return this.a.j();
    }

    public int h() {
        return this.a.n();
    }

    public long i() {
        return this.a.p();
    }

    public int j() {
        return this.a.q();
    }

    public boolean k() {
        return this.a.n() > 1 && d() > 0;
    }

    public void l() {
        this.a.A();
    }

    public void m(@p1(from = 0, to = 2147483647L) int i, @x1 Bitmap bitmap) {
        a(bitmap);
        this.a.G(i, bitmap);
    }

    public void n(@p1(from = 0, to = 2147483647L) int i, @x1 Bitmap bitmap) {
        a(bitmap);
        this.a.I(i, bitmap);
    }

    public nx5(@x1 by5 by5Var, @z1 ux5 ux5Var) throws IOException {
        GifInfoHandle c = by5Var.c();
        this.a = c;
        if (ux5Var != null) {
            c.K(ux5Var.a, ux5Var.b);
        }
    }
}