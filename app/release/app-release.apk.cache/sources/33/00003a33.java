package com.p7700g.p99005;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.greedygame.mystique.models.Layer;
import com.greedygame.mystique.models.Placement;
import com.greedygame.mystique.models.Position;
import com.greedygame.mystique.models.TemplateModel;
import com.p7700g.p99005.g33;
import com.p7700g.p99005.ry2;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@s2
/* loaded from: classes3.dex */
public final class b33 {
    @NotNull
    public static final a a = new a(null);
    @NotNull
    private static final String b = "AdUniPr";
    @NotNull
    private final Context c;
    @NotNull
    private final gz2 d;
    @NotNull
    private final TemplateModel e;
    @NotNull
    private final xx2 f;
    @NotNull
    private Bitmap g;
    @Nullable
    private String h;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public b33(@NotNull Context context, @NotNull gz2 gz2Var, @NotNull TemplateModel templateModel, @NotNull xx2 xx2Var) {
        c25.p(context, "context");
        c25.p(gz2Var, "nativeAdAsset");
        c25.p(templateModel, "templateModel");
        c25.p(xx2Var, "assetInterface");
        this.c = context;
        this.d = gz2Var;
        this.e = templateModel;
        this.f = xx2Var;
        if (templateModel.g()) {
            List<Layer> f = templateModel.f();
            c25.m(f);
            int i = 0;
            int i2 = 0;
            for (Layer layer : f) {
                Position c = layer.c().c();
                c25.m(c);
                i = c.h() + c.a() > ((float) i) ? ((int) c.a()) + ((int) c.h()) : i;
                if (c.g() + c.f() > i2) {
                    i2 = ((int) c.f()) + ((int) c.g());
                }
            }
            xz2.c(b, wo1.o("Container height: ", i, " and width: ", i2));
            this.g = ry2.a.b(i2, i, Bitmap.Config.ARGB_8888);
            return;
        }
        xz2.c(b, "TemplateModel not valid.");
        throw new f33();
    }

    private final g33 a(Layer layer) {
        return new g33.a(this.c).b(this.g).d(this.d).c(this.f).e(layer).j();
    }

    @Nullable
    public final String b() {
        return this.h;
    }

    @Nullable
    public final Bitmap c() {
        g33 a2;
        List<Layer> f = this.e.f();
        c25.m(f);
        int size = f.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                Layer layer = this.e.f().get(i);
                a2 = a(layer);
                if (a2 == null) {
                    this.h = "invalid layer found";
                    return null;
                }
                Bitmap c = a2.c();
                if (c == null) {
                    Layer d = this.e.d(layer);
                    if (!layer.s() || d == null) {
                        break;
                    }
                    xz2.c(b, "Layer processor failed and Default Layer processor available");
                    g33 a3 = a(d);
                    if (a3 == null) {
                        this.h = "invalid default layer found";
                        return null;
                    }
                    c = a3.c();
                    if (c == null) {
                        this.h = a3.k();
                        return null;
                    }
                }
                Placement o = layer.o();
                if (layer.s() && this.e.d(layer) != null) {
                    Layer d2 = this.e.d(layer);
                    c25.m(d2);
                    o = d2.o();
                }
                ry2.a aVar = ry2.a;
                int width = this.g.getWidth();
                int height = this.g.getHeight();
                Bitmap.Config config = this.g.getConfig();
                c25.o(config, "bitmap.config");
                Bitmap b2 = aVar.b(width, height, config);
                Canvas canvas = new Canvas(b2);
                canvas.drawBitmap(this.g, new Matrix(), null);
                Position c2 = o.c();
                c25.m(c2);
                float g = c2.g();
                Position c3 = o.c();
                c25.m(c3);
                canvas.drawBitmap(c, g, c3.h(), (Paint) null);
                aVar.g(this.g);
                this.g = b2;
                if (this.e.f().size() == i2) {
                    xz2.c(b, "Reached the final layer");
                    break;
                }
                xz2.c(b, c25.C("Processed layers: ", Integer.valueOf(i2)));
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
            this.h = a2.k();
            return null;
        }
        return this.g;
    }
}