package com.p7700g.p99005;

import android.content.Context;
import android.graphics.Bitmap;
import com.greedygame.mystique.models.Layer;
import com.greedygame.mystique.models.Operation;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class g33 {
    @NotNull
    public static final b a = new b(null);
    @NotNull
    private Context b;
    @NotNull
    private Layer c;
    @NotNull
    private gz2 d;
    @NotNull
    private xx2 e;
    @NotNull
    private Bitmap f;
    @NotNull
    private List<Operation> g;
    public Bitmap h;
    @Nullable
    private String i;

    /* loaded from: classes3.dex */
    public static final class a {
        @NotNull
        private final Context a;
        @Nullable
        private Layer b;
        @Nullable
        private gz2 c;
        @Nullable
        private xx2 d;
        @Nullable
        private Bitmap e;

        public a(@NotNull Context context) {
            c25.p(context, "context");
            this.a = context;
        }

        @NotNull
        public final Context a() {
            return this.a;
        }

        @NotNull
        public final a b(@NotNull Bitmap bitmap) {
            c25.p(bitmap, "baseContainer");
            this.e = bitmap;
            return this;
        }

        @NotNull
        public final a c(@NotNull xx2 xx2Var) {
            c25.p(xx2Var, "assetInterface");
            this.d = xx2Var;
            return this;
        }

        @NotNull
        public final a d(@NotNull gz2 gz2Var) {
            c25.p(gz2Var, "nativeAdAsset");
            this.c = gz2Var;
            return this;
        }

        @NotNull
        public final a e(@NotNull Layer layer) {
            c25.p(layer, "layer");
            this.b = layer;
            return this;
        }

        @Nullable
        public final Layer f() {
            return this.b;
        }

        @Nullable
        public final gz2 g() {
            return this.c;
        }

        @Nullable
        public final xx2 h() {
            return this.d;
        }

        @Nullable
        public final Bitmap i() {
            return this.e;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
            if (r0.equals("frame") == false) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
            if (r0.equals(com.p7700g.p99005.h33.e) == false) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
            return new com.p7700g.p99005.d33(r3);
         */
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final g33 j() {
            Layer layer = this.b;
            if (layer != null && this.c != null && this.e != null && this.d != null) {
                c25.m(layer);
                String p = layer.p();
                if (p != null) {
                    switch (p.hashCode()) {
                        case -816235192:
                            break;
                        case 3556653:
                            if (p.equals("text")) {
                                return new bd3(this);
                            }
                            break;
                        case 97692013:
                            break;
                        case 100313435:
                            if (p.equals("image")) {
                                return new e33(this);
                            }
                            break;
                    }
                }
                return null;
            }
            xz2.c("LayrPro", "[ERROR] Need all the objects to create the Object");
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public g33(@NotNull a aVar) {
        c25.p(aVar, "builder");
        this.b = aVar.a();
        Layer f = aVar.f();
        c25.m(f);
        this.c = f;
        gz2 g = aVar.g();
        c25.m(g);
        this.d = g;
        Bitmap i = aVar.i();
        c25.m(i);
        this.f = i;
        xx2 h = aVar.h();
        c25.m(h);
        this.e = h;
        List<Operation> m = this.c.m();
        c25.m(m);
        this.g = m;
    }

    public final void a(@NotNull Bitmap bitmap) {
        c25.p(bitmap, "<set-?>");
        this.h = bitmap;
    }

    public final void b(@Nullable String str) {
        this.i = str;
    }

    @Nullable
    public abstract Bitmap c();

    @NotNull
    public final Context d() {
        return this.b;
    }

    @NotNull
    public final Layer e() {
        return this.c;
    }

    @NotNull
    public final gz2 f() {
        return this.d;
    }

    @NotNull
    public final xx2 g() {
        return this.e;
    }

    @NotNull
    public final Bitmap h() {
        return this.f;
    }

    @NotNull
    public final List<Operation> i() {
        return this.g;
    }

    @NotNull
    public final Bitmap j() {
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            return bitmap;
        }
        c25.S("container");
        throw null;
    }

    @Nullable
    public final String k() {
        return this.i;
    }
}