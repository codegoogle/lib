package com.p7700g.p99005;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.text.TextUtils;
import com.greedygame.mystique.models.Alignment;
import com.greedygame.mystique.models.Operation;
import com.greedygame.mystique.models.Placement;
import com.greedygame.mystique.models.Position;
import com.p7700g.p99005.g33;
import com.p7700g.p99005.ry2;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class e33 extends g33 {
    @NotNull
    public static final a j = new a(null);
    @Nullable
    private Bitmap k;

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
    public e33(@NotNull g33.a aVar) {
        super(aVar);
        c25.p(aVar, "builder");
    }

    private final Bitmap l(Bitmap bitmap, float f) {
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        c25.o(createBitmap, "createBitmap(bitmap, 0, 0, bitmap.width, bitmap.height, matrix, true)");
        return createBitmap;
    }

    private final Bitmap m(Bitmap bitmap, int i) {
        if (!bitmap.isMutable()) {
            bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        }
        new Canvas(bitmap).drawColor((i & 255) << 24, PorterDuff.Mode.DST_OVER);
        c25.o(bitmap, "mutableBitmap");
        return bitmap;
    }

    private final Operation n() {
        for (Operation operation : i()) {
            if (c25.g(operation.l(), i33.a.g())) {
                return operation;
            }
        }
        return null;
    }

    private final void o(Canvas canvas) {
        Bitmap a2 = c33.a.a(d(), this.k, 25.0f);
        if (a2 == null) {
            xz2.c("ImgLayr", "[ERROR] Blur operation failed. So making the campaign unavailable.");
            b("Blur operation failed");
            return;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(m(a2, 255), j().getWidth(), j().getHeight(), false);
        c25.m(createScaledBitmap);
        canvas.drawBitmap(createScaledBitmap, new Matrix(), null);
    }

    private final void p(Operation operation) {
        ry2.a aVar = ry2.a;
        Bitmap bitmap = this.k;
        c25.m(bitmap);
        int width = bitmap.getWidth();
        Bitmap bitmap2 = this.k;
        c25.m(bitmap2);
        int height = bitmap2.getHeight();
        Bitmap bitmap3 = this.k;
        c25.m(bitmap3);
        Bitmap.Config config = bitmap3.getConfig();
        c25.o(config, "selectedBitmap!!.config");
        Bitmap b2 = aVar.b(width, height, config);
        Canvas canvas = new Canvas(b2);
        Paint paint = new Paint(1);
        if (operation.i() != null) {
            xz2.c("ImgLayr", "Argument available in operation");
            paint.setAlpha((int) (Float.parseFloat(operation.i().toString()) * 255));
            Bitmap bitmap4 = this.k;
            c25.m(bitmap4);
            canvas.drawBitmap(bitmap4, 0.0f, 0.0f, paint);
            this.k = b2;
        }
    }

    private final Operation q() {
        for (Operation operation : i()) {
            if (c25.g(operation.l(), i33.a.h())) {
                return operation;
            }
        }
        return null;
    }

    private final void r(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Bitmap bitmap = this.k;
        c25.m(bitmap);
        Placement o = e().o();
        float width = (j().getWidth() - o.b().b()) - o.b().c();
        float height = (j().getHeight() - o.b().d()) - o.b().a();
        if (width >= 0.0f && height >= 0.0f) {
            float width2 = bitmap.getWidth() / bitmap.getHeight();
            if (width2 < width / height) {
                i2 = (int) height;
                i = (int) (width2 * height);
            } else {
                int i6 = (int) (width / width2);
                i = (int) width;
                i2 = i6;
            }
            int i7 = 0;
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, false);
            c25.o(createScaledBitmap, "createScaledBitmap(originalImage, width, height, false)");
            int width3 = createScaledBitmap.getWidth();
            int height2 = createScaledBitmap.getHeight();
            Alignment a2 = e().o().a();
            c25.m(a2);
            jz2 a3 = a2.a();
            Alignment a4 = e().o().a();
            c25.m(a4);
            kz2 b2 = a4.b();
            if (((float) height2) == height) {
                xz2.c("ImgLayr", c25.C("Matched height: ", Integer.valueOf(height2)));
                i3 = a3 != null ? b.a[a3.ordinal()] : -1;
                if (i3 == 1) {
                    i5 = (((int) width) - width3) / 2;
                } else if (i3 != 2) {
                    i5 = i3 != 3 ? 0 : ((int) width) - width3;
                }
                i7 = i5;
            } else {
                xz2.c("ImgLayr", c25.C("Matched width: ", Integer.valueOf(width3)));
                i3 = b2 != null ? b.b[b2.ordinal()] : -1;
                if (i3 == 1) {
                    i4 = (((int) height) - height2) / 2;
                } else if (i3 != 2 && i3 == 3) {
                    i4 = ((int) height) - height2;
                }
                canvas.drawBitmap(createScaledBitmap, i7 + ((int) o.b().b()), i4 + ((int) o.b().d()), new Paint(2));
            }
            i4 = 0;
            canvas.drawBitmap(createScaledBitmap, i7 + ((int) o.b().b()), i4 + ((int) o.b().d()), new Paint(2));
        }
    }

    @Override // com.p7700g.p99005.g33
    @Nullable
    public Bitmap c() {
        xz2.c("ImgLayr", "Image layer started");
        ry2.a aVar = ry2.a;
        Position c = e().o().c();
        c25.m(c);
        Position c2 = e().o().c();
        c25.m(c2);
        Bitmap.Config config = h().getConfig();
        c25.o(config, "baseContainer.config");
        a(aVar.b((int) c.f(), (int) c2.a(), config));
        if (TextUtils.isEmpty(f().e())) {
            xz2.c("ImgLayr", "[ERROR] Icon not available to process");
            b("Icon not available");
            e().u(true);
            return null;
        }
        xx2 g = g();
        String e = f().e();
        c25.m(e);
        Uri b2 = g.b(e);
        if (TextUtils.isEmpty(b2.toString())) {
            xz2.c("ImgLayr", "[ERROR] Icon not cached to process");
            b("Icon not cached");
            e().u(true);
            return null;
        }
        int i = 0;
        xz2.c("ImgLayr", "Native icon uri: " + b2 + " Icon: " + ((Object) f().e()));
        String uri = b2.toString();
        c25.o(uri, "iconUri.toString()");
        Bitmap c3 = wz2.c(uri);
        this.k = c3;
        if (c3 == null && new File(b2.toString()).exists()) {
            b("Image not able to decode");
            return null;
        }
        Operation q = q();
        if ((q == null ? null : q.i()) != null) {
            int parseInt = Integer.parseInt(q.i().toString());
            Bitmap bitmap = this.k;
            c25.m(bitmap);
            this.k = l(bitmap, parseInt);
        }
        Canvas canvas = new Canvas(j());
        int size = i().size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = i + 1;
                if (c25.g(i().get(i).l(), i33.a.a())) {
                    o(canvas);
                }
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        Operation n = n();
        if (n != null) {
            xz2.c("ImgLayr", "Has opacity operation");
            p(n);
        }
        try {
            r(canvas);
            xz2.c("ImgLayr", "Image layer finished");
            ry2.a aVar2 = ry2.a;
            Bitmap bitmap2 = this.k;
            c25.m(bitmap2);
            aVar2.g(bitmap2);
            return j();
        } catch (NullPointerException e2) {
            b("Bitmap Exception");
            xz2.b("ImgLayr", "Bitmap crashed", e2);
            return null;
        }
    }
}