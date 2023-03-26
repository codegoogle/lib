package com.p7700g.p99005;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.view.ViewGroup;
import com.greedygame.mystique2.adapters.StyleJsonAdapter;
import com.greedygame.mystique2.models.LayerType;
import com.greedygame.mystique2.models.MediationType;
import com.greedygame.mystique2.models.Style;
import com.greedygame.mystique2.models.StyleType;
import com.greedygame.mystique2.models.Template;
import com.greedygame.mystique2.models.ViewLayer;
import com.p7700g.p99005.o33;
import com.squareup.moshi.JsonDataException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class n33 {
    @NotNull
    private static final String b = "MystqV2";
    private Context d;
    private xx2 e;
    private zx2 f;
    @Nullable
    private jy2 g;
    @NotNull
    private final HashMap<String, Template> h;
    private String i;
    @Nullable
    private Typeface j;
    @NotNull
    public static final b a = new b(null);
    @NotNull
    private static final String c = c25.C("templates-v2", File.separator);

    /* loaded from: classes3.dex */
    public static final class a {
        @NotNull
        private final Context a;
        @Nullable
        private xx2 b;
        @Nullable
        private zx2 c;
        @Nullable
        private gz2 d;
        @Nullable
        private jy2 e;
        @Nullable
        private String f;
        @Nullable
        private MediationType g;

        public a(@NotNull Context context) {
            c25.p(context, "context");
            this.a = context;
        }

        @NotNull
        public final a a(@NotNull xx2 xx2Var) {
            c25.p(xx2Var, "assetInterface");
            this.b = xx2Var;
            return this;
        }

        @Nullable
        public final n33 b() {
            if (this.b == null || this.c == null || this.d == null || this.g == null) {
                return null;
            }
            b bVar = n33.a;
            bVar.a().n(this);
            return bVar.a();
        }

        @NotNull
        public final a c(@NotNull zx2 zx2Var) {
            c25.p(zx2Var, "crashInterface");
            this.c = zx2Var;
            return this;
        }

        @Nullable
        public final xx2 d() {
            return this.b;
        }

        @NotNull
        public final Context e() {
            return this.a;
        }

        @Nullable
        public final zx2 f() {
            return this.c;
        }

        @Nullable
        public final MediationType g() {
            return this.g;
        }

        @Nullable
        public final gz2 h() {
            return this.d;
        }

        @Nullable
        public final jy2 i() {
            return this.e;
        }

        @Nullable
        public final String j() {
            return this.f;
        }

        @NotNull
        public final a k(@NotNull MediationType mediationType) {
            c25.p(mediationType, "mediationType");
            this.g = mediationType;
            return this;
        }

        @NotNull
        public final a l(@NotNull gz2 gz2Var) {
            c25.p(gz2Var, "nativeAdAsset");
            this.d = gz2Var;
            return this;
        }

        public final void m(@Nullable xx2 xx2Var) {
            this.b = xx2Var;
        }

        public final void n(@Nullable zx2 zx2Var) {
            this.c = zx2Var;
        }

        public final void o(@Nullable MediationType mediationType) {
            this.g = mediationType;
        }

        public final void p(@Nullable gz2 gz2Var) {
            this.d = gz2Var;
        }

        public final void q(@Nullable jy2 jy2Var) {
            this.e = jy2Var;
        }

        public final void r(@Nullable String str) {
            this.f = str;
        }

        @NotNull
        public final a s(@NotNull jy2 jy2Var) {
            c25.p(jy2Var, "templateListener");
            this.e = jy2Var;
            return this;
        }

        @NotNull
        public final a t(@NotNull String str) {
            c25.p(str, "templateUrl");
            this.f = str;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final n33 a() {
            return c.a.a();
        }

        @NotNull
        public final String b() {
            return n33.c;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        @NotNull
        public static final c a = new c();
        @NotNull
        private static final n33 b = new n33(null);

        private c() {
        }

        @NotNull
        public final n33 a() {
            return b;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements wx2 {
        public final /* synthetic */ jy2 a;

        public d(jy2 jy2Var) {
            this.a = jy2Var;
        }

        @Override // com.p7700g.p99005.wx2
        public void a(@NotNull ez2 ez2Var) {
            c25.p(ez2Var, "cacheResModel");
            if (ez2Var.d().isEmpty()) {
                jy2 jy2Var = this.a;
                if (jy2Var == null) {
                    return;
                }
                jy2Var.b("Template Asset download failed");
                return;
            }
            jy2 jy2Var2 = this.a;
            if (jy2Var2 == null) {
                return;
            }
            jy2Var2.a();
        }
    }

    /* loaded from: classes3.dex */
    public static final class e implements r33 {
        @Nullable
        private jy2 a;
        public final /* synthetic */ String c;

        public e(String str) {
            this.c = str;
            this.a = n33.this.g;
        }

        @Override // com.p7700g.p99005.wx2
        public void a(@NotNull ez2 ez2Var) {
            c25.p(ez2Var, "cacheResModel");
            xz2.c(n33.b, "Templates download completed");
            if (ez2Var.d().isEmpty()) {
                xz2.c(n33.b, "All the templates download failed. Will use default templates");
                jy2 b = b();
                if (b == null) {
                    return;
                }
                b.b("Template download failed");
                return;
            }
            for (String str : ez2Var.d()) {
                if (n33.this.o(str)) {
                    xx2 xx2Var = n33.this.e;
                    if (xx2Var == null) {
                        c25.S("assetInterface");
                        throw null;
                    }
                    byte[] d = xx2Var.d(str);
                    if (d == null) {
                        return;
                    }
                    try {
                        Template template = (Template) rz2.a.a(new StyleJsonAdapter()).adapter(Template.class).fromJson(new String(d, f85.b));
                        if (template != null) {
                            n33.this.h.put(str, template);
                        }
                    } catch (JsonDataException e) {
                        xz2.b(n33.b, "Template model creation error", e);
                    } catch (IOException e2) {
                        xz2.b(n33.b, "Template Model creation error", e2);
                    }
                } else {
                    xz2.c(n33.b, "All the templates download failed. Will use default templates");
                    jy2 b2 = b();
                    if (b2 == null) {
                        return;
                    }
                    b2.b("Template has invalid structure or has empty views");
                    return;
                }
            }
            if (!n33.this.h.isEmpty()) {
                n33.this.i(b());
                return;
            }
            xz2.c(n33.b, "Template models not able to create. Will use default templates");
            jy2 b3 = b();
            c25.m(b3);
            b3.b("Template json processing error");
            xx2 xx2Var2 = n33.this.e;
            if (xx2Var2 == null) {
                c25.S("assetInterface");
                throw null;
            }
            xx2Var2.a(is4.l(this.c));
        }

        @Nullable
        public jy2 b() {
            return this.a;
        }
    }

    private n33() {
        this.h = new HashMap<>();
    }

    public /* synthetic */ n33(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final void h(ViewLayer viewLayer, List<String> list) {
        Uri parse;
        String type = viewLayer.getType();
        if (c25.g(type, LayerType.TEXT.getValue()) ? true : c25.g(type, LayerType.BUTTON.getValue())) {
            if (this.j != null) {
                return;
            }
            List<Style> styles = viewLayer.getStyles();
            if (styles == null) {
                styles = new ArrayList<>();
            }
            for (Style style : styles) {
                Style style2 = viewLayer.getStyle(StyleType.FONT);
                if ((style2 == null ? null : style2.getValue()) != null && !list.contains(style2.getValue())) {
                    list.add(style2.getValue());
                }
            }
        } else if (c25.g(type, LayerType.IMAGE.getValue()) && viewLayer.getUse() != null && (parse = Uri.parse(viewLayer.getUse())) != null) {
            if ((c25.g(parse.getScheme(), "http") || c25.g(parse.getScheme(), "https")) && !list.contains(viewLayer.getUse())) {
                list.add(viewLayer.getUse());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(jy2 jy2Var) {
        String[] strArr = new String[1];
        String str = this.i;
        if (str != null) {
            strArr[0] = c25.C("Downloading template assets for ", str);
            xz2.c(b, strArr);
            ArrayList arrayList = new ArrayList();
            for (Template template : this.h.values()) {
                List<ViewLayer> component1 = template.component1();
                template.component2();
                if (component1 != null) {
                    for (ViewLayer viewLayer : component1) {
                        h(viewLayer, arrayList);
                    }
                }
            }
            StringBuilder G = wo1.G("Downloading template assets size: ");
            G.append(arrayList.size());
            G.append(" template list: ");
            G.append(this.h.size());
            xz2.c(b, G.toString());
            if (arrayList.isEmpty()) {
                if (jy2Var == null) {
                    return;
                }
                jy2Var.a();
                return;
            }
            xx2 xx2Var = this.e;
            if (xx2Var != null) {
                xx2Var.c(arrayList, c, new d(jy2Var));
                return;
            } else {
                c25.S("assetInterface");
                throw null;
            }
        }
        c25.S("templateUrl");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void n(a aVar) {
        this.d = aVar.e();
        xx2 d2 = aVar.d();
        c25.m(d2);
        this.e = d2;
        zx2 f = aVar.f();
        c25.m(f);
        this.f = f;
        String j = aVar.j();
        c25.m(j);
        this.i = j;
        jy2 i = aVar.i();
        c25.m(i);
        this.g = i;
        String[] strArr = new String[1];
        String str = this.i;
        if (str == null) {
            c25.S("templateUrl");
            throw null;
        } else {
            strArr[0] = c25.C("Initialised Mystiquev2 for ", str);
            xz2.c(b, strArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d1 A[Catch: Exception -> 0x00ea, TryCatch #0 {Exception -> 0x00ea, blocks: (B:3:0x0005, B:5:0x0009, B:8:0x0010, B:34:0x0076, B:39:0x0084, B:41:0x0088, B:43:0x0094, B:44:0x0097, B:37:0x007e, B:46:0x009a, B:48:0x00a1, B:50:0x00ab, B:52:0x00af, B:54:0x00bb, B:55:0x00be, B:56:0x00bf, B:58:0x00c5, B:64:0x00d1, B:66:0x00d5, B:68:0x00e1, B:69:0x00e4, B:32:0x0070, B:29:0x0068, B:21:0x0050, B:23:0x0054, B:25:0x0060, B:26:0x0063, B:17:0x0046, B:14:0x003e, B:11:0x0036, B:71:0x00e6, B:72:0x00e9), top: B:80:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(String str) {
        boolean z;
        try {
            xx2 xx2Var = this.e;
            if (xx2Var == null) {
                c25.S("assetInterface");
                throw null;
            }
            byte[] d2 = xx2Var.d(str);
            if (d2 == null) {
                return false;
            }
            Template template = (Template) rz2.a.a(new StyleJsonAdapter()).adapter(Template.class).fromJson(new String(d2, f85.b));
            Float ratio = template == null ? null : template.getRatio();
            String height = template == null ? null : template.getHeight();
            String width = template == null ? null : template.getWidth();
            if ((height == null || width == null) && ratio == null) {
                xx2 xx2Var2 = this.e;
                if (xx2Var2 != null) {
                    xx2Var2.a(js4.s(str));
                    return false;
                }
                c25.S("assetInterface");
                throw null;
            }
            Integer X0 = height == null ? null : a95.X0(height);
            Integer X02 = width == null ? null : a95.X0(width);
            if ((X0 != null && X0.intValue() < 0) || (X02 != null && X02.intValue() < 0)) {
                xx2 xx2Var3 = this.e;
                if (xx2Var3 != null) {
                    xx2Var3.a(js4.s(str));
                    return false;
                }
                c25.S("assetInterface");
                throw null;
            } else if (ratio != null && (c25.e(ratio, 0.0f) || ratio.floatValue() < -1.0f)) {
                xx2 xx2Var4 = this.e;
                if (xx2Var4 != null) {
                    xx2Var4.a(js4.s(str));
                    return false;
                }
                c25.S("assetInterface");
                throw null;
            } else {
                List<ViewLayer> views = template.getViews();
                if (views != null && !views.isEmpty()) {
                    z = false;
                    if (z) {
                        return true;
                    }
                    xx2 xx2Var5 = this.e;
                    if (xx2Var5 != null) {
                        xx2Var5.a(js4.s(str));
                        return false;
                    }
                    c25.S("assetInterface");
                    throw null;
                }
                z = true;
                if (z) {
                }
            }
        } catch (Exception e2) {
            xz2.c(b, c25.C("Failed to Validate template ", e2));
            xx2 xx2Var6 = this.e;
            if (xx2Var6 != null) {
                xx2Var6.a(js4.s(str));
                return false;
            }
            c25.S("assetInterface");
            throw null;
        }
    }

    @Nullable
    public final Typeface j() {
        return this.j;
    }

    @Nullable
    public final Template k(@NotNull String str) {
        c25.p(str, "templateUrl");
        return this.h.get(str);
    }

    @Nullable
    public final o33 l(int i, @NotNull String str, @NotNull MediationType mediationType, @NotNull gz2 gz2Var, @NotNull q33 q33Var, @NotNull f05<? super String, yq4> f05Var) {
        c25.p(str, "templateUrl");
        c25.p(mediationType, "mediationType");
        c25.p(gz2Var, "nativeAdAsset");
        c25.p(q33Var, "viewProcessed");
        c25.p(f05Var, "customOnClickAction");
        if ((str.length() == 0) || !m(str)) {
            return null;
        }
        Context context = this.d;
        if (context != null) {
            o33.a a2 = new o33.a(context).a(i);
            Template template = this.h.get(str);
            c25.m(template);
            c25.o(template, "templateModelsMap[templateUrl]!!");
            o33.a g = a2.g(template);
            xx2 xx2Var = this.e;
            if (xx2Var != null) {
                o33 i2 = g.c(xx2Var).d(gz2Var).e(q33Var).f(mediationType).h(f05Var).b(this.j).i();
                if (i2 != null) {
                    i2.G();
                }
                return i2;
            }
            c25.S("assetInterface");
            throw null;
        }
        c25.S("context");
        throw null;
    }

    public final boolean m(@NotNull String str) {
        c25.p(str, "url");
        return this.h.containsKey(str);
    }

    public final synchronized void p() {
        String str = this.i;
        if (str != null) {
            boolean z = true;
            xz2.c(b, c25.C("Preparing template assets for ", str));
            if (str.length() != 0) {
                z = false;
            }
            if (z) {
                xz2.c(b, "Url is empty. Will use default templates");
                jy2 jy2Var = this.g;
                if (jy2Var != null) {
                    jy2Var.a();
                }
                return;
            }
            xx2 xx2Var = this.e;
            if (xx2Var != null) {
                xx2Var.c(is4.l(str), c, new e(str));
                return;
            } else {
                c25.S("assetInterface");
                throw null;
            }
        }
        c25.S("templateUrl");
        throw null;
    }

    public final void q(@Nullable Typeface typeface) {
        this.j = typeface;
    }

    @NotNull
    public final o33 r(@NotNull ViewGroup viewGroup, @NotNull q33 q33Var, @NotNull MediationType mediationType, long j) {
        c25.p(viewGroup, com.anythink.expressad.a.B);
        c25.p(q33Var, "viewProcessed");
        c25.p(mediationType, "mediationType");
        return new o33(viewGroup, q33Var, mediationType, j);
    }
}