package com.p7700g.p99005;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.SparseArray;
import com.p7700g.p99005.i2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: MetadataRepo.java */
@e2(19)
@o0
/* loaded from: classes.dex */
public final class mv {
    private static final int a = 1024;
    private static final String b = "EmojiCompat.MetadataRepo.create";
    @x1
    private final gw c;
    @x1
    private final char[] d;
    @x1
    private final a e = new a(1024);
    @x1
    private final Typeface f;

    /* compiled from: MetadataRepo.java */
    @i2({i2.a.LIBRARY})
    /* loaded from: classes.dex */
    public static class a {
        private final SparseArray<a> a;
        private hv b;

        private a() {
            this(1);
        }

        public a a(int i) {
            SparseArray<a> sparseArray = this.a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i);
        }

        public final hv b() {
            return this.b;
        }

        public void c(@x1 hv hvVar, int i, int i2) {
            a a = a(hvVar.b(i));
            if (a == null) {
                a = new a();
                this.a.put(hvVar.b(i), a);
            }
            if (i2 > i) {
                a.c(hvVar, i + 1, i2);
            } else {
                a.b = hvVar;
            }
        }

        public a(int i) {
            this.a = new SparseArray<>(i);
        }
    }

    private mv(@x1 Typeface typeface, @x1 gw gwVar) {
        this.f = typeface;
        this.c = gwVar;
        this.d = new char[gwVar.K() * 2];
        a(gwVar);
    }

    private void a(gw gwVar) {
        int K = gwVar.K();
        for (int i = 0; i < K; i++) {
            hv hvVar = new hv(this, i);
            Character.toChars(hvVar.g(), this.d, i * 2);
            k(hvVar);
        }
    }

    @x1
    public static mv b(@x1 AssetManager assetManager, @x1 String str) throws IOException {
        try {
            in.b(b);
            return new mv(Typeface.createFromAsset(assetManager, str), lv.b(assetManager, str));
        } finally {
            in.d();
        }
    }

    @i2({i2.a.TESTS})
    @x1
    public static mv c(@x1 Typeface typeface) {
        try {
            in.b(b);
            return new mv(typeface, new gw());
        } finally {
            in.d();
        }
    }

    @x1
    public static mv d(@x1 Typeface typeface, @x1 InputStream inputStream) throws IOException {
        try {
            in.b(b);
            return new mv(typeface, lv.c(inputStream));
        } finally {
            in.d();
        }
    }

    @x1
    public static mv e(@x1 Typeface typeface, @x1 ByteBuffer byteBuffer) throws IOException {
        try {
            in.b(b);
            return new mv(typeface, lv.d(byteBuffer));
        } finally {
            in.d();
        }
    }

    @i2({i2.a.LIBRARY})
    @x1
    public char[] f() {
        return this.d;
    }

    @i2({i2.a.LIBRARY})
    @x1
    public gw g() {
        return this.c;
    }

    @i2({i2.a.LIBRARY})
    public int h() {
        return this.c.S();
    }

    @i2({i2.a.LIBRARY})
    @x1
    public a i() {
        return this.e;
    }

    @i2({i2.a.LIBRARY})
    @x1
    public Typeface j() {
        return this.f;
    }

    @i2({i2.a.LIBRARY})
    @r2
    public void k(@x1 hv hvVar) {
        jp.m(hvVar, "emoji metadata cannot be null");
        jp.b(hvVar.c() > 0, "invalid metadata codepoint length");
        this.e.c(hvVar, 0, hvVar.c() - 1);
    }
}