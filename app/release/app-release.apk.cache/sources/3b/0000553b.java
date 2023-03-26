package com.p7700g.p99005;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.widget.MediaController;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import pl.droidsonroids.gif.GifInfoHandle;

/* compiled from: GifDrawable.java */
/* loaded from: classes4.dex */
public class ox5 extends Drawable implements Animatable, MediaController.MediaPlayerControl {
    private ColorStateList A;
    private PorterDuffColorFilter B;
    private PorterDuff.Mode C;
    public final boolean D;
    public final cy5 E;
    private final hy5 F;
    private final Rect G;
    public ScheduledFuture<?> H;
    private int I;
    private int J;
    private ly5 K;
    public final ScheduledThreadPoolExecutor s;
    public volatile boolean t;
    public long u;
    private final Rect v;
    public final Paint w;
    public final Bitmap x;
    public final GifInfoHandle y;
    public final ConcurrentLinkedQueue<jx5> z;

    /* compiled from: GifDrawable.java */
    /* loaded from: classes4.dex */
    public class a extends iy5 {
        public a(ox5 ox5Var) {
            super(ox5Var);
        }

        @Override // com.p7700g.p99005.iy5
        public void a() {
            if (ox5.this.y.C()) {
                ox5.this.start();
            }
        }
    }

    /* compiled from: GifDrawable.java */
    /* loaded from: classes4.dex */
    public class b extends iy5 {
        public final /* synthetic */ int t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ox5 ox5Var, int i) {
            super(ox5Var);
            this.t = i;
        }

        @Override // com.p7700g.p99005.iy5
        public void a() {
            ox5 ox5Var = ox5.this;
            ox5Var.y.I(this.t, ox5Var.x);
            this.s.E.sendEmptyMessageAtTime(-1, 0L);
        }
    }

    /* compiled from: GifDrawable.java */
    /* loaded from: classes4.dex */
    public class c extends iy5 {
        public final /* synthetic */ int t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ox5 ox5Var, int i) {
            super(ox5Var);
            this.t = i;
        }

        @Override // com.p7700g.p99005.iy5
        public void a() {
            ox5 ox5Var = ox5.this;
            ox5Var.y.G(this.t, ox5Var.x);
            ox5.this.E.sendEmptyMessageAtTime(-1, 0L);
        }
    }

    public ox5(@x1 Resources resources, @f1 @d2 int i) throws Resources.NotFoundException, IOException {
        this(resources.openRawResourceFd(i));
        float b2 = ay5.b(resources, i);
        this.J = (int) (this.y.i() * b2);
        this.I = (int) (this.y.q() * b2);
    }

    private void C() {
        if (this.D && this.t) {
            long j = this.u;
            if (j != Long.MIN_VALUE) {
                long max = Math.max(0L, j - SystemClock.uptimeMillis());
                this.u = Long.MIN_VALUE;
                this.s.remove(this.F);
                this.H = this.s.schedule(this.F, max, TimeUnit.MILLISECONDS);
            }
        }
    }

    private void L() {
        this.t = false;
        this.E.removeMessages(-1);
        this.y.A();
    }

    private PorterDuffColorFilter N(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e() {
        ScheduledFuture<?> scheduledFuture = this.H;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.E.removeMessages(-1);
    }

    @z1
    public static ox5 f(@x1 Resources resources, @f1 @d2 int i) {
        try {
            return new ox5(resources, i);
        } catch (IOException unused) {
            return null;
        }
    }

    public boolean A(jx5 jx5Var) {
        return this.z.remove(jx5Var);
    }

    public void B() {
        this.s.execute(new a(this));
    }

    public void D(@p1(from = 0, to = 2147483647L) int i) {
        if (i >= 0) {
            synchronized (this.y) {
                this.y.I(i, this.x);
            }
            this.E.sendEmptyMessageAtTime(-1, 0L);
            return;
        }
        throw new IllegalArgumentException("Position is not positive");
    }

    public void E(@p1(from = 0, to = 2147483647L) int i) {
        if (i >= 0) {
            this.s.execute(new c(this, i));
            return;
        }
        throw new IndexOutOfBoundsException("Frame index is not positive");
    }

    public Bitmap F(@p1(from = 0, to = 2147483647L) int i) {
        Bitmap j;
        if (i >= 0) {
            synchronized (this.y) {
                this.y.G(i, this.x);
                j = j();
            }
            this.E.sendEmptyMessageAtTime(-1, 0L);
            return j;
        }
        throw new IndexOutOfBoundsException("Frame index is not positive");
    }

    public Bitmap G(@p1(from = 0, to = 2147483647L) int i) {
        Bitmap j;
        if (i >= 0) {
            synchronized (this.y) {
                this.y.I(i, this.x);
                j = j();
            }
            this.E.sendEmptyMessageAtTime(-1, 0L);
            return j;
        }
        throw new IllegalArgumentException("Position is not positive");
    }

    public void H(@g1(from = 0.0d) float f) {
        ky5 ky5Var = new ky5(f);
        this.K = ky5Var;
        ky5Var.b(this.v);
    }

    public void I(@p1(from = 0, to = 65535) int i) {
        this.y.J(i);
    }

    public void J(@g1(from = 0.0d, fromInclusive = false) float f) {
        this.y.L(f);
    }

    public void K(@z1 ly5 ly5Var) {
        this.K = ly5Var;
        if (ly5Var != null) {
            ly5Var.b(this.v);
        }
    }

    public void M(long j) {
        if (this.D) {
            this.u = 0L;
            this.E.sendEmptyMessageAtTime(-1, 0L);
            return;
        }
        e();
        this.H = this.s.schedule(this.F, Math.max(j, 0L), TimeUnit.MILLISECONDS);
    }

    public void a(@x1 jx5 jx5Var) {
        this.z.add(jx5Var);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return s() > 1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return s() > 1;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@x1 Canvas canvas) {
        boolean z;
        if (this.B == null || this.w.getColorFilter() != null) {
            z = false;
        } else {
            this.w.setColorFilter(this.B);
            z = true;
        }
        ly5 ly5Var = this.K;
        if (ly5Var == null) {
            canvas.drawBitmap(this.x, this.G, this.v, this.w);
        } else {
            ly5Var.a(canvas, this.w, this.x);
        }
        if (z) {
            this.w.setColorFilter(null);
        }
    }

    public long g() {
        return this.y.b() + this.x.getAllocationByteCount();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.w.getAlpha();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        return 100;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.w.getColorFilter();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        return this.y.f();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        return this.y.g();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.J;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.I;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return (!this.y.v() || this.w.getAlpha() < 255) ? -2 : -1;
    }

    @z1
    public String h() {
        return this.y.c();
    }

    @g1(from = zg2.s)
    public float i() {
        ly5 ly5Var = this.K;
        if (ly5Var instanceof ky5) {
            return ((ky5) ly5Var).d();
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        C();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        return this.t;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.t;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        return super.isStateful() || ((colorStateList = this.A) != null && colorStateList.isStateful());
    }

    public Bitmap j() {
        Bitmap bitmap = this.x;
        Bitmap copy = bitmap.copy(bitmap.getConfig(), this.x.isMutable());
        copy.setHasAlpha(this.x.hasAlpha());
        return copy;
    }

    public int k() {
        return this.y.d();
    }

    public int l() {
        int e = this.y.e();
        return (e == 0 || e < this.y.j()) ? e : e - 1;
    }

    @x1
    public rx5 m() {
        return rx5.b(this.y.l());
    }

    public int n() {
        return this.x.getHeight() * this.x.getRowBytes();
    }

    public int o(@p1(from = 0) int i) {
        return this.y.h(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.v.set(rect);
        ly5 ly5Var = this.K;
        if (ly5Var != null) {
            ly5Var.b(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.A;
        if (colorStateList == null || (mode = this.C) == null) {
            return false;
        }
        this.B = N(colorStateList, mode);
        return true;
    }

    public long p() {
        return this.y.p();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        stop();
    }

    public int q() {
        return this.y.j();
    }

    public long r() {
        return this.y.k();
    }

    public int s() {
        return this.y.n();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(@p1(from = 0, to = 2147483647L) int i) {
        if (i >= 0) {
            this.s.execute(new b(this, i));
            return;
        }
        throw new IllegalArgumentException("Position is not positive");
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@p1(from = 0, to = 255) int i) {
        this.w.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@z1 ColorFilter colorFilter) {
        this.w.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated
    public void setDither(boolean z) {
        this.w.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.w.setFilterBitmap(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.A = colorStateList;
        this.B = N(colorStateList, this.C);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@z1 PorterDuff.Mode mode) {
        this.C = mode;
        this.B = N(this.A, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (!this.D) {
            if (z) {
                if (z2) {
                    B();
                }
                if (visible) {
                    start();
                }
            } else if (visible) {
                stop();
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable, android.widget.MediaController.MediaPlayerControl
    public void start() {
        synchronized (this) {
            if (this.t) {
                return;
            }
            this.t = true;
            M(this.y.D());
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        synchronized (this) {
            if (this.t) {
                this.t = false;
                e();
                this.y.F();
            }
        }
    }

    @x1
    public final Paint t() {
        return this.w;
    }

    @x1
    public String toString() {
        return String.format(Locale.ENGLISH, "GIF: size: %dx%d, frames: %d, error: %d", Integer.valueOf(this.y.q()), Integer.valueOf(this.y.i()), Integer.valueOf(this.y.n()), Integer.valueOf(this.y.l()));
    }

    public int u(@p1(from = 0) int i, @p1(from = 0) int i2) {
        if (i < this.y.q()) {
            if (i2 < this.y.i()) {
                return this.x.getPixel(i, i2);
            }
            throw new IllegalArgumentException("y must be < height");
        }
        throw new IllegalArgumentException("x must be < width");
    }

    public void v(@x1 int[] iArr) {
        this.x.getPixels(iArr, 0, this.y.q(), 0, 0, this.y.q(), this.y.i());
    }

    @z1
    public ly5 w() {
        return this.K;
    }

    public boolean x() {
        return this.y.u();
    }

    public boolean y() {
        return this.y.w();
    }

    public void z() {
        L();
        this.x.recycle();
    }

    public ox5(@x1 AssetManager assetManager, @x1 String str) throws IOException {
        this(assetManager.openFd(str));
    }

    public ox5(@x1 String str) throws IOException {
        this(new GifInfoHandle(str), null, null, true);
    }

    public ox5(@x1 File file) throws IOException {
        this(file.getPath());
    }

    public ox5(@x1 InputStream inputStream) throws IOException {
        this(new GifInfoHandle(inputStream), null, null, true);
    }

    public ox5(@x1 AssetFileDescriptor assetFileDescriptor) throws IOException {
        this(new GifInfoHandle(assetFileDescriptor), null, null, true);
    }

    public ox5(@x1 FileDescriptor fileDescriptor) throws IOException {
        this(new GifInfoHandle(fileDescriptor), null, null, true);
    }

    public ox5(@x1 byte[] bArr) throws IOException {
        this(new GifInfoHandle(bArr), null, null, true);
    }

    public ox5(@x1 ByteBuffer byteBuffer) throws IOException {
        this(new GifInfoHandle(byteBuffer), null, null, true);
    }

    public ox5(@z1 ContentResolver contentResolver, @x1 Uri uri) throws IOException {
        this(GifInfoHandle.y(contentResolver, uri), null, null, true);
    }

    public ox5(@x1 by5 by5Var, @z1 ox5 ox5Var, @z1 ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, boolean z, @x1 ux5 ux5Var) throws IOException {
        this(by5Var.b(ux5Var), ox5Var, scheduledThreadPoolExecutor, z);
    }

    public ox5(GifInfoHandle gifInfoHandle, ox5 ox5Var, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, boolean z) {
        this.t = true;
        this.u = Long.MIN_VALUE;
        this.v = new Rect();
        this.w = new Paint(6);
        this.z = new ConcurrentLinkedQueue<>();
        hy5 hy5Var = new hy5(this);
        this.F = hy5Var;
        this.D = z;
        this.s = scheduledThreadPoolExecutor == null ? vx5.a() : scheduledThreadPoolExecutor;
        this.y = gifInfoHandle;
        Bitmap bitmap = null;
        if (ox5Var != null) {
            synchronized (ox5Var.y) {
                if (!ox5Var.y.w() && ox5Var.y.i() >= gifInfoHandle.i() && ox5Var.y.q() >= gifInfoHandle.q()) {
                    ox5Var.L();
                    Bitmap bitmap2 = ox5Var.x;
                    bitmap2.eraseColor(0);
                    bitmap = bitmap2;
                }
            }
        }
        if (bitmap == null) {
            this.x = Bitmap.createBitmap(gifInfoHandle.q(), gifInfoHandle.i(), Bitmap.Config.ARGB_8888);
        } else {
            this.x = bitmap;
        }
        this.x.setHasAlpha(!gifInfoHandle.v());
        this.G = new Rect(0, 0, gifInfoHandle.q(), gifInfoHandle.i());
        this.E = new cy5(this);
        hy5Var.a();
        this.I = gifInfoHandle.q();
        this.J = gifInfoHandle.i();
    }
}