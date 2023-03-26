package com.p7700g.p99005;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.p7700g.p99005.dv;
import com.p7700g.p99005.i2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: EmojiCompat.java */
@o0
/* loaded from: classes.dex */
public class fv {
    public static final String a = "android.support.text.emoji.emojiCompat_metadataVersion";
    public static final String b = "android.support.text.emoji.emojiCompat_replaceAll";
    public static final int c = 3;
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 0;
    public static final int k = 1;
    public static final int l = 0;
    public static final int m = 1;
    public static final int n = 2;
    @i2({i2.a.LIBRARY})
    public static final int o = Integer.MAX_VALUE;
    private static final Object p = new Object();
    private static final Object q = new Object();
    @z1
    @k1("INSTANCE_LOCK")
    private static volatile fv r = null;
    @k1("CONFIG_LOCK")
    private static volatile boolean s = false;
    private static final String t = "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.";
    public final boolean A;
    public final boolean B;
    @z1
    public final int[] C;
    private final boolean D;
    private final int E;
    private final int F;
    private final e G;
    @x1
    @k1("mInitLock")
    private final Set<f> v;
    @x1
    private final c y;
    @x1
    public final i z;
    @x1
    private final ReadWriteLock u = new ReentrantReadWriteLock();
    @k1("mInitLock")
    private volatile int w = 3;
    @x1
    private final Handler x = new Handler(Looper.getMainLooper());

    /* compiled from: EmojiCompat.java */
    @i2({i2.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    /* compiled from: EmojiCompat.java */
    @e2(19)
    /* loaded from: classes.dex */
    public static final class b extends c {
        private volatile iv b;
        private volatile mv c;

        /* compiled from: EmojiCompat.java */
        /* loaded from: classes.dex */
        public class a extends j {
            public a() {
            }

            @Override // com.p7700g.p99005.fv.j
            public void a(@z1 Throwable th) {
                b.this.a.s(th);
            }

            @Override // com.p7700g.p99005.fv.j
            public void b(@x1 mv mvVar) {
                b.this.h(mvVar);
            }
        }

        public b(fv fvVar) {
            super(fvVar);
        }

        @Override // com.p7700g.p99005.fv.c
        public String a() {
            String N = this.c.g().N();
            return N == null ? "" : N;
        }

        @Override // com.p7700g.p99005.fv.c
        public int b(CharSequence charSequence, int i) {
            return this.b.d(charSequence, i);
        }

        @Override // com.p7700g.p99005.fv.c
        public boolean c(@x1 CharSequence charSequence) {
            return this.b.c(charSequence) == 1;
        }

        @Override // com.p7700g.p99005.fv.c
        public boolean d(@x1 CharSequence charSequence, int i) {
            return this.b.d(charSequence, i) == 1;
        }

        @Override // com.p7700g.p99005.fv.c
        public void e() {
            try {
                this.a.z.a(new a());
            } catch (Throwable th) {
                this.a.s(th);
            }
        }

        @Override // com.p7700g.p99005.fv.c
        public CharSequence f(@x1 CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return this.b.j(charSequence, i, i2, i3, z);
        }

        @Override // com.p7700g.p99005.fv.c
        public void g(@x1 EditorInfo editorInfo) {
            editorInfo.extras.putInt(fv.a, this.c.h());
            editorInfo.extras.putBoolean(fv.b, this.a.A);
        }

        public void h(@x1 mv mvVar) {
            if (mvVar == null) {
                this.a.s(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.c = mvVar;
            mv mvVar2 = this.c;
            l lVar = new l();
            e eVar = this.a.G;
            fv fvVar = this.a;
            this.b = new iv(mvVar2, lVar, eVar, fvVar.B, fvVar.C);
            this.a.t();
        }
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static class c {
        public final fv a;

        public c(fv fvVar) {
            this.a = fvVar;
        }

        public String a() {
            return "";
        }

        public int b(CharSequence charSequence, int i) {
            return 0;
        }

        public boolean c(@x1 CharSequence charSequence) {
            return false;
        }

        public boolean d(@x1 CharSequence charSequence, int i) {
            return false;
        }

        public void e() {
            this.a.t();
        }

        public CharSequence f(@x1 CharSequence charSequence, @p1(from = 0) int i, @p1(from = 0) int i2, @p1(from = 0) int i3, boolean z) {
            return charSequence;
        }

        public void g(@x1 EditorInfo editorInfo) {
        }
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static abstract class d {
        @x1
        public final i a;
        public boolean b;
        public boolean c;
        @z1
        public int[] d;
        @z1
        public Set<f> e;
        public boolean f;
        public int g = -16711936;
        public int h = 0;
        @x1
        public e i = new ev();

        public d(@x1 i iVar) {
            jp.m(iVar, "metadataLoader cannot be null.");
            this.a = iVar;
        }

        @x1
        public final i a() {
            return this.a;
        }

        @x1
        public d b(@x1 f fVar) {
            jp.m(fVar, "initCallback cannot be null");
            if (this.e == null) {
                this.e = new r7();
            }
            this.e.add(fVar);
            return this;
        }

        @x1
        public d c(@w0 int i) {
            this.g = i;
            return this;
        }

        @x1
        public d d(boolean z) {
            this.f = z;
            return this;
        }

        @x1
        public d e(@x1 e eVar) {
            jp.m(eVar, "GlyphChecker cannot be null");
            this.i = eVar;
            return this;
        }

        @x1
        public d f(int i) {
            this.h = i;
            return this;
        }

        @x1
        public d g(boolean z) {
            this.b = z;
            return this;
        }

        @x1
        public d h(boolean z) {
            return i(z, null);
        }

        @x1
        public d i(boolean z, @z1 List<Integer> list) {
            this.c = z;
            if (z && list != null) {
                this.d = new int[list.size()];
                int i = 0;
                for (Integer num : list) {
                    this.d[i] = num.intValue();
                    i++;
                }
                Arrays.sort(this.d);
            } else {
                this.d = null;
            }
            return this;
        }

        @x1
        public d j(@x1 f fVar) {
            jp.m(fVar, "initCallback cannot be null");
            Set<f> set = this.e;
            if (set != null) {
                set.remove(fVar);
            }
            return this;
        }
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public interface e {
        boolean a(@x1 CharSequence charSequence, @p1(from = 0) int i, @p1(from = 0) int i2, @p1(from = 0) int i3);
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static abstract class f {
        public void onFailed(@z1 Throwable th) {
        }

        public void onInitialized() {
        }
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static class g implements Runnable {
        private final List<f> s;
        private final Throwable t;
        private final int u;

        public g(@x1 f fVar, int i) {
            this(Arrays.asList((f) jp.m(fVar, "initCallback cannot be null")), i, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.s.size();
            int i = 0;
            if (this.u != 1) {
                while (i < size) {
                    this.s.get(i).onFailed(this.t);
                    i++;
                }
                return;
            }
            while (i < size) {
                this.s.get(i).onInitialized();
                i++;
            }
        }

        public g(@x1 Collection<f> collection, int i) {
            this(collection, i, null);
        }

        public g(@x1 Collection<f> collection, int i, @z1 Throwable th) {
            jp.m(collection, "initCallbacks cannot be null");
            this.s = new ArrayList(collection);
            this.u = i;
            this.t = th;
        }
    }

    /* compiled from: EmojiCompat.java */
    @i2({i2.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface h {
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public interface i {
        void a(@x1 j jVar);
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static abstract class j {
        public abstract void a(@z1 Throwable th);

        public abstract void b(@x1 mv mvVar);
    }

    /* compiled from: EmojiCompat.java */
    @i2({i2.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface k {
    }

    /* compiled from: EmojiCompat.java */
    @e2(19)
    @i2({i2.a.LIBRARY})
    /* loaded from: classes.dex */
    public static class l {
        public jv a(@x1 hv hvVar) {
            return new ov(hvVar);
        }
    }

    private fv(@x1 d dVar) {
        this.A = dVar.b;
        this.B = dVar.c;
        this.C = dVar.d;
        this.D = dVar.f;
        this.E = dVar.g;
        this.z = dVar.a;
        this.F = dVar.h;
        this.G = dVar.i;
        r7 r7Var = new r7();
        this.v = r7Var;
        Set<f> set = dVar.e;
        if (set != null && !set.isEmpty()) {
            r7Var.addAll(dVar.e);
        }
        this.y = new b(this);
        r();
    }

    @i2({i2.a.TESTS})
    @z1
    public static fv A(@z1 fv fvVar) {
        fv fvVar2;
        synchronized (p) {
            r = fvVar;
            fvVar2 = r;
        }
        return fvVar2;
    }

    @i2({i2.a.TESTS})
    public static void B(boolean z) {
        synchronized (q) {
            s = z;
        }
    }

    @x1
    public static fv b() {
        fv fvVar;
        synchronized (p) {
            fvVar = r;
            jp.o(fvVar != null, t);
        }
        return fvVar;
    }

    public static boolean g(@x1 InputConnection inputConnection, @x1 Editable editable, @p1(from = 0) int i2, @p1(from = 0) int i3, boolean z) {
        return iv.e(inputConnection, editable, i2, i3, z);
    }

    public static boolean h(@x1 Editable editable, int i2, @x1 KeyEvent keyEvent) {
        return iv.f(editable, i2, keyEvent);
    }

    @z1
    public static fv k(@x1 Context context) {
        return l(context, null);
    }

    @i2({i2.a.LIBRARY})
    @z1
    public static fv l(@x1 Context context, @z1 dv.a aVar) {
        fv fvVar;
        if (s) {
            return r;
        }
        if (aVar == null) {
            aVar = new dv.a(null);
        }
        d c2 = aVar.c(context);
        synchronized (q) {
            if (!s) {
                if (c2 != null) {
                    m(c2);
                }
                s = true;
            }
            fvVar = r;
        }
        return fvVar;
    }

    @x1
    public static fv m(@x1 d dVar) {
        fv fvVar = r;
        if (fvVar == null) {
            synchronized (p) {
                fvVar = r;
                if (fvVar == null) {
                    fvVar = new fv(dVar);
                    r = fvVar;
                }
            }
        }
        return fvVar;
    }

    public static boolean n() {
        return r != null;
    }

    private boolean p() {
        return f() == 1;
    }

    private void r() {
        this.u.writeLock().lock();
        try {
            if (this.F == 0) {
                this.w = 0;
            }
            this.u.writeLock().unlock();
            if (f() == 0) {
                this.y.e();
            }
        } catch (Throwable th) {
            this.u.writeLock().unlock();
            throw th;
        }
    }

    @x1
    public static fv z(@x1 d dVar) {
        fv fvVar;
        synchronized (p) {
            fvVar = new fv(dVar);
            r = fvVar;
        }
        return fvVar;
    }

    public void C(@x1 f fVar) {
        jp.m(fVar, "initCallback cannot be null");
        this.u.writeLock().lock();
        try {
            this.v.remove(fVar);
        } finally {
            this.u.writeLock().unlock();
        }
    }

    public void D(@x1 EditorInfo editorInfo) {
        if (!p() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.y.g(editorInfo);
    }

    @x1
    public String c() {
        jp.o(p(), "Not initialized yet");
        return this.y.a();
    }

    public int d(@x1 CharSequence charSequence, @p1(from = 0) int i2) {
        jp.o(p(), "Not initialized yet");
        jp.m(charSequence, "sequence cannot be null");
        return this.y.b(charSequence, i2);
    }

    @i2({i2.a.LIBRARY_GROUP})
    @w0
    public int e() {
        return this.E;
    }

    public int f() {
        this.u.readLock().lock();
        try {
            return this.w;
        } finally {
            this.u.readLock().unlock();
        }
    }

    @Deprecated
    public boolean i(@x1 CharSequence charSequence) {
        jp.o(p(), "Not initialized yet");
        jp.m(charSequence, "sequence cannot be null");
        return this.y.c(charSequence);
    }

    @Deprecated
    public boolean j(@x1 CharSequence charSequence, @p1(from = 0) int i2) {
        jp.o(p(), "Not initialized yet");
        jp.m(charSequence, "sequence cannot be null");
        return this.y.d(charSequence, i2);
    }

    @i2({i2.a.LIBRARY_GROUP})
    public boolean o() {
        return this.D;
    }

    public void q() {
        jp.o(this.F == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (p()) {
            return;
        }
        this.u.writeLock().lock();
        try {
            if (this.w == 0) {
                return;
            }
            this.w = 0;
            this.u.writeLock().unlock();
            this.y.e();
        } finally {
            this.u.writeLock().unlock();
        }
    }

    public void s(@z1 Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.u.writeLock().lock();
        try {
            this.w = 2;
            arrayList.addAll(this.v);
            this.v.clear();
            this.u.writeLock().unlock();
            this.x.post(new g(arrayList, this.w, th));
        } catch (Throwable th2) {
            this.u.writeLock().unlock();
            throw th2;
        }
    }

    public void t() {
        ArrayList arrayList = new ArrayList();
        this.u.writeLock().lock();
        try {
            this.w = 1;
            arrayList.addAll(this.v);
            this.v.clear();
            this.u.writeLock().unlock();
            this.x.post(new g(arrayList, this.w));
        } catch (Throwable th) {
            this.u.writeLock().unlock();
            throw th;
        }
    }

    @u0
    @z1
    public CharSequence u(@z1 CharSequence charSequence) {
        return v(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    @u0
    @z1
    public CharSequence v(@z1 CharSequence charSequence, @p1(from = 0) int i2, @p1(from = 0) int i3) {
        return w(charSequence, i2, i3, Integer.MAX_VALUE);
    }

    @u0
    @z1
    public CharSequence w(@z1 CharSequence charSequence, @p1(from = 0) int i2, @p1(from = 0) int i3, @p1(from = 0) int i4) {
        return x(charSequence, i2, i3, i4, 0);
    }

    @u0
    @z1
    public CharSequence x(@z1 CharSequence charSequence, @p1(from = 0) int i2, @p1(from = 0) int i3, @p1(from = 0) int i4, int i5) {
        boolean z;
        jp.o(p(), "Not initialized yet");
        jp.j(i2, "start cannot be negative");
        jp.j(i3, "end cannot be negative");
        jp.j(i4, "maxEmojiCount cannot be negative");
        jp.b(i2 <= i3, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        jp.b(i2 <= charSequence.length(), "start should be < than charSequence length");
        jp.b(i3 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i2 == i3) {
            return charSequence;
        }
        if (i5 != 1) {
            z = i5 != 2 ? this.A : false;
        } else {
            z = true;
        }
        return this.y.f(charSequence, i2, i3, i4, z);
    }

    public void y(@x1 f fVar) {
        jp.m(fVar, "initCallback cannot be null");
        this.u.writeLock().lock();
        try {
            if (this.w != 1 && this.w != 2) {
                this.v.add(fVar);
            }
            this.x.post(new g(fVar, this.w));
        } finally {
            this.u.writeLock().unlock();
        }
    }
}