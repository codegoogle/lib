package com.p7700g.p99005;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import com.greedygame.mystique.models.Alignment;
import com.greedygame.mystique.models.Operation;
import com.greedygame.mystique.models.Position;
import com.p7700g.p99005.g33;
import com.p7700g.p99005.ry2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class d33 extends g33 {
    @NotNull
    public static final a j = new a(null);
    @Nullable
    private Operation k;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            jz2.values();
            int[] iArr = new int[3];
            iArr[jz2.CENTER.ordinal()] = 1;
            iArr[jz2.LEFT.ordinal()] = 2;
            iArr[jz2.RIGHT.ordinal()] = 3;
            a = iArr;
            kz2.values();
            int[] iArr2 = new int[3];
            iArr2[kz2.CENTER.ordinal()] = 1;
            iArr2[kz2.TOP.ordinal()] = 2;
            iArr2[kz2.BOTTOM.ordinal()] = 3;
            b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d33(@NotNull g33.a aVar) {
        super(aVar);
        c25.p(aVar, "builder");
    }

    private final Bitmap l() {
        Resources resources = d().getResources();
        ay2 ay2Var = ay2.a;
        String b2 = f().b();
        if (b2 == null && (b2 = f().g()) == null) {
            b2 = "";
        }
        Bitmap decodeResource = BitmapFactory.decodeResource(d().getResources(), resources.getIdentifier(ay2Var.b(b2), com.anythink.expressad.foundation.h.h.c, d().getPackageName()));
        try {
            Position c = e().o().c();
            c25.m(c);
            Position c2 = e().o().c();
            c25.m(c2);
            return Bitmap.createScaledBitmap(decodeResource, (int) c.f(), (int) c2.a(), false);
        } catch (Exception unused) {
            return null;
        }
    }

    private final Bitmap m(Bitmap bitmap, int i, int i2, int i3, int i4, float f, float f2, float f3) {
        ry2.a aVar = ry2.a;
        Bitmap b2 = aVar.b(i2, i, Bitmap.Config.ALPHA_8);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), new RectF(0.0f, 0.0f, i2 - f, i - f2), Matrix.ScaleToFit.CENTER);
        Matrix matrix2 = new Matrix(matrix);
        matrix2.postTranslate(f, f2);
        Canvas canvas = new Canvas(b2);
        Paint paint = new Paint(1);
        paint.setAlpha((int) (255 * f3));
        canvas.drawBitmap(bitmap, matrix, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
        canvas.drawBitmap(bitmap, matrix2, paint);
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(i4, BlurMaskFilter.Blur.NORMAL);
        paint.reset();
        paint.setAntiAlias(true);
        paint.setColor(i3);
        paint.setMaskFilter(blurMaskFilter);
        paint.setFilterBitmap(true);
        Bitmap b3 = aVar.b(i2, i, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(b3);
        canvas2.drawBitmap(b2, 0.0f, 0.0f, paint);
        canvas2.drawBitmap(bitmap, matrix, null);
        b2.recycle();
        return b3;
    }

    private final void n(Canvas canvas) {
        int i;
        Paint paint = new Paint(1);
        try {
            Operation operation = this.k;
            c25.m(operation);
            i = Color.parseColor(String.valueOf(operation.i()));
        } catch (Exception unused) {
            i = -1;
        }
        paint.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        new Canvas(j()).drawBitmap(j(), 0.0f, 0.0f, paint);
        canvas.drawBitmap(j(), 0.0f, 0.0f, (Paint) null);
    }

    private final void o(Canvas canvas, Bitmap bitmap) {
        int width;
        Alignment a2 = e().o().a();
        c25.m(a2);
        jz2 a3 = a2.a();
        Alignment a4 = e().o().a();
        c25.m(a4);
        kz2 b2 = a4.b();
        int i = a3 == null ? -1 : b.a[a3.ordinal()];
        int i2 = 0;
        if (i != 1) {
            width = (i == 2 || i != 3) ? 0 : canvas.getWidth() - j().getWidth();
        } else {
            width = (canvas.getWidth() - j().getWidth()) / 2;
        }
        int i3 = b2 != null ? b.b[b2.ordinal()] : -1;
        if (i3 == 1) {
            i2 = (canvas.getHeight() - j().getHeight()) / 2;
        } else if (i3 != 2 && i3 == 3) {
            i2 = canvas.getHeight() - j().getHeight();
        }
        c25.m(bitmap);
        canvas.drawBitmap(bitmap, width, i2, (Paint) null);
    }

    private final Bitmap p() {
        String uri = g().b(e().n()).toString();
        c25.o(uri, "assetInterface.getCachedPath(layer.path).toString()");
        Bitmap c = wz2.c(uri);
        if (c != null) {
            Position c2 = e().o().c();
            c25.m(c2);
            Position c3 = e().o().c();
            c25.m(c3);
            return Bitmap.createScaledBitmap(c, (int) c2.f(), (int) c3.a(), false);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c1 A[LOOP:0: B:18:0x00c1->B:38:0x019b, LOOP_START, PHI: r0 
      PHI: (r0v21 int) = (r0v16 int), (r0v48 int) binds: [B:17:0x00bf, B:38:0x019b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.p7700g.p99005.g33
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bitmap c() {
        Bitmap bitmap;
        Bitmap l;
        int size;
        Integer k;
        Integer h;
        Integer h2;
        xz2.c("FrmLayr", "Frame layer started");
        ry2.a aVar = ry2.a;
        Position c = e().o().c();
        c25.m(c);
        Position c2 = e().o().c();
        c25.m(c2);
        Bitmap.Config config = h().getConfig();
        c25.o(config, "baseContainer.config");
        a(aVar.b((int) c.f(), (int) c2.a(), config));
        Canvas canvas = new Canvas(j());
        if (c25.g(e().p(), "frame")) {
            l = p();
            if (l == null) {
                b("Frame not available");
                xz2.c("FrmLayr", "[ERROR] Frame not available");
                e().u(true);
                return null;
            }
        } else if (c25.g(e().p(), h33.e)) {
            l = l();
            if (l == null) {
                b("Cta icon not available");
                xz2.c("FrmLayr", "[ERROR] Cta icon not available");
                e().u(true);
                return null;
            }
        } else {
            bitmap = null;
            o(canvas, bitmap);
            int i = 0;
            size = i().size() - 1;
            if (size >= 0) {
                while (true) {
                    int i2 = i + 1;
                    Operation operation = i().get(i);
                    this.k = operation;
                    c25.m(operation);
                    String l2 = operation.l();
                    i33 i33Var = i33.a;
                    if (c25.g(l2, i33Var.b())) {
                        n(canvas);
                    } else if (c25.g(l2, i33Var.c())) {
                        Operation operation2 = this.k;
                        c25.m(operation2);
                        float intValue = operation2.k() == null ? 1.0f : k.intValue();
                        Operation operation3 = this.k;
                        c25.m(operation3);
                        c25.m(operation3.h());
                        double d = intValue;
                        float cos = (int) (Math.cos(Math.toRadians(h.intValue())) * d);
                        Operation operation4 = this.k;
                        c25.m(operation4);
                        c25.m(operation4.h());
                        float sin = (int) (Math.sin(Math.toRadians(h2.intValue())) * d);
                        Bitmap j2 = j();
                        int height = j().getHeight();
                        int width = j().getWidth();
                        Operation operation5 = this.k;
                        c25.m(operation5);
                        Float m = operation5.m();
                        a(m(j2, height, width, sr.t, 2, cos, sin, m == null ? 1.0f : m.floatValue()));
                    } else if (c25.g(l2, i33Var.i())) {
                        xz2.c("FrmLayr", "Stroke operation not supported");
                    } else {
                        xz2.c("FrmLayr", "Operation not supported");
                    }
                    if (i2 > size) {
                        break;
                    }
                    i = i2;
                }
            }
            ry2.a aVar2 = ry2.a;
            c25.m(bitmap);
            aVar2.g(bitmap);
            xz2.c("FrmLayr", "Frame layer finished");
            return j();
        }
        bitmap = l;
        o(canvas, bitmap);
        int i3 = 0;
        size = i().size() - 1;
        if (size >= 0) {
        }
        ry2.a aVar22 = ry2.a;
        c25.m(bitmap);
        aVar22.g(bitmap);
        xz2.c("FrmLayr", "Frame layer finished");
        return j();
    }
}