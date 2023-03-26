package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.greedygame.mystique.models.Layer;
import com.greedygame.mystique.models.Operation;
import com.greedygame.mystique.models.TemplateModel;
import com.p7700g.p99005.ry2;
import com.p7700g.p99005.z23;
import com.squareup.moshi.JsonDataException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class z23 {
    public static final float b = 2.0f;
    public static final float c = 2.0f;
    @NotNull
    private static final String d = "TemMngr";
    @SuppressLint({"StaticFieldLeak"})
    @Nullable
    private static Context f;
    @Nullable
    private String g;
    @NotNull
    private final xx2 h;
    @NotNull
    private final zx2 i;
    @NotNull
    private final gz2 j;
    @Nullable
    private final HashMap<String, String> k;
    @NotNull
    private final HashMap<String, TemplateModel> l;
    @Nullable
    private final jy2 m;
    @NotNull
    private final Handler n;
    @NotNull
    public static final c a = new c(null);
    @NotNull
    private static final String e = c25.C("templates", File.separator);

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
        private HashMap<String, String> e;
        @Nullable
        private jy2 f;

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
        public final z23 b() {
            if (this.b != null && this.e != null) {
                return new z23(this, null);
            }
            xz2.c(z23.d, "[ERROR] Need all the objects to create the Object");
            return null;
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
        public final gz2 g() {
            return this.d;
        }

        @Nullable
        public final jy2 h() {
            return this.f;
        }

        @Nullable
        public final HashMap<String, String> i() {
            return this.e;
        }

        @NotNull
        public final a j(@NotNull gz2 gz2Var) {
            c25.p(gz2Var, "nativeAdAsset");
            this.d = gz2Var;
            return this;
        }

        public final void k(@Nullable xx2 xx2Var) {
            this.b = xx2Var;
        }

        public final void l(@Nullable zx2 zx2Var) {
            this.c = zx2Var;
        }

        public final void m(@Nullable gz2 gz2Var) {
            this.d = gz2Var;
        }

        public final void n(@Nullable jy2 jy2Var) {
            this.f = jy2Var;
        }

        public final void o(@Nullable HashMap<String, String> hashMap) {
            this.e = hashMap;
        }

        @NotNull
        public final a p(@NotNull jy2 jy2Var) {
            c25.p(jy2Var, "templateListener");
            this.f = jy2Var;
            return this;
        }

        @NotNull
        public final a q(@NotNull HashMap<String, String> hashMap) {
            c25.p(hashMap, "unitPathMap");
            this.e = hashMap;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public final class b extends AsyncTask<Context, Integer, Boolean> {
        private int a;
        public final /* synthetic */ z23 b;

        public b(z23 z23Var) {
            c25.p(z23Var, "this$0");
            this.b = z23Var;
        }

        public static final void d(Boolean bool, b bVar, z23 z23Var) {
            c25.p(bVar, "this$0");
            c25.p(z23Var, "this$1");
            if (c25.g(bool, Boolean.TRUE) && bVar.a() > 0) {
                jy2 jy2Var = z23Var.m;
                if (jy2Var == null) {
                    return;
                }
                jy2Var.a();
                return;
            }
            xz2.c(z23.d, "Failed processing");
            jy2 jy2Var2 = z23Var.m;
            if (jy2Var2 == null) {
                return;
            }
            String str = z23Var.g;
            if (str == null) {
                str = "";
            }
            jy2Var2.b(str);
        }

        public static /* synthetic */ void e(Boolean bool, b bVar, z23 z23Var) {
            d(bool, bVar, z23Var);
        }

        public final int a() {
            return this.a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:72:0x0092, code lost:
            r11.b.g = r5.b();
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x0101, code lost:
            r11.b.g = "Failed to save the Ad unit image";
         */
        @Override // android.os.AsyncTask
        @Nullable
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Boolean doInBackground(@NotNull Context... contextArr) {
            ry2.a aVar;
            c25.p(contextArr, "params");
            Collection values = this.b.l.values();
            c25.o(values, "templateModelsMap.values");
            List Q5 = rs4.Q5(values);
            int size = Q5.size() - 1;
            if (size >= 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    boolean z = true;
                    xz2.c(z23.d, c25.C("AdUnit Processing started: ", Integer.valueOf(i)));
                    try {
                        Object obj = Q5.get(i);
                        c25.o(obj, "templateModels[i]");
                        TemplateModel templateModel = (TemplateModel) obj;
                        c cVar = z23.a;
                        Context a = cVar.a();
                        c25.m(a);
                        b33 b33Var = new b33(a, this.b.j, templateModel, this.b.h);
                        Bitmap c = b33Var.c();
                        if (c == null) {
                            xz2.c(z23.d, "[ERROR] Template " + i2 + " not processed");
                            String str = this.b.g;
                            if (str != null && str.length() != 0) {
                                z = false;
                            }
                        } else {
                            Bitmap a2 = k33.a.a(c, (int) dy2.f(cVar.a(), c.getWidth(), 2.0f), (int) dy2.f(cVar.a(), c.getHeight(), 2.0f));
                            String p = this.b.p(templateModel);
                            try {
                                if (wz2.i(a2, p)) {
                                    xz2.c(z23.d, c25.C("Saved image file: ", p));
                                    this.a++;
                                    aVar = ry2.a;
                                } else {
                                    xz2.c(z23.d, "Failed saving image file");
                                    String str2 = this.b.g;
                                    if (str2 != null && str2.length() != 0) {
                                        z = false;
                                    }
                                    aVar = ry2.a;
                                }
                                aVar.g(a2);
                            } catch (Throwable th) {
                                ry2.a.g(a2);
                                throw th;
                                break;
                            }
                        }
                    } catch (f33 e) {
                        Throwable cause = e.getCause();
                        c25.m(cause);
                        xz2.b(z23.d, "AdUnitProcessor failed: ", cause);
                        this.b.g = "Template invalid exception";
                        this.b.i.e(e);
                    } catch (NullPointerException e2) {
                        xz2.b(z23.d, "Received NullPointerException", e2);
                        this.b.g = "Template processing null pointer exception";
                        this.b.i.e(e2);
                        return Boolean.FALSE;
                    } catch (Exception e3) {
                        xz2.b(z23.d, "Received Exception", e3);
                        this.b.g = "Template exception received";
                        this.b.i.e(e3);
                        return Boolean.FALSE;
                    } catch (OutOfMemoryError e4) {
                        xz2.c(z23.d, "[ERROR] Received dangerous out of memory error. Stop all the actions");
                        this.b.g = "Crashed with OutOfMemoryError";
                        this.b.i.e(e4);
                        return Boolean.FALSE;
                    }
                    if (i2 > size) {
                        break;
                    }
                    i = i2;
                }
            }
            return Boolean.TRUE;
        }

        @Override // android.os.AsyncTask
        /* renamed from: c */
        public void onPostExecute(@Nullable final Boolean bool) {
            xz2.c(z23.d, "Template processing finished");
            Handler handler = this.b.n;
            final z23 z23Var = this.b;
            handler.post(new Runnable() { // from class: com.p7700g.p99005.y23
                @Override // java.lang.Runnable
                public final void run() {
                    z23.b.e(bool, this, z23Var);
                }
            });
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            xz2.c(z23.d, "Template processing started");
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Context a() {
            return z23.f;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements wx2 {
        public d() {
            z23.this = r1;
        }

        @Override // com.p7700g.p99005.wx2
        public void a(@NotNull ez2 ez2Var) {
            c25.p(ez2Var, "cacheResModel");
            if (ez2Var.d().isEmpty()) {
                jy2 jy2Var = z23.this.m;
                if (jy2Var == null) {
                    return;
                }
                jy2Var.b("Template Asset download failed");
                return;
            }
            new b(z23.this).execute(z23.a.a());
        }
    }

    /* loaded from: classes3.dex */
    public static final class e implements wx2 {
        public final /* synthetic */ List<String> b;

        public e(List<String> list) {
            z23.this = r1;
            this.b = list;
        }

        @Override // com.p7700g.p99005.wx2
        public void a(@NotNull ez2 ez2Var) {
            c25.p(ez2Var, "cacheResModel");
            xz2.c(z23.d, "Templates download completed");
            if (ez2Var.d().isEmpty()) {
                xz2.c(z23.d, "All the templates download failed");
                jy2 jy2Var = z23.this.m;
                if (jy2Var == null) {
                    return;
                }
                jy2Var.b(c25.C("Template download failed - ", rs4.h3(ez2Var.b(), null, null, null, 0, null, null, 63, null)));
                return;
            }
            for (String str : ez2Var.d()) {
                byte[] d = z23.this.h.d(str);
                if (d == null) {
                    return;
                }
                try {
                    TemplateModel templateModel = (TemplateModel) rz2.a.a(new Object[0]).adapter(TemplateModel.class).fromJson(new String(d, f85.b));
                    if (templateModel != null) {
                        z23.this.l.put(str, templateModel);
                    }
                } catch (JsonDataException e) {
                    xz2.b(z23.d, "Template model creation error", e);
                } catch (IOException e2) {
                    xz2.b(z23.d, "Template Model creation error", e2);
                }
            }
            if (!z23.this.l.isEmpty()) {
                z23.this.o();
                return;
            }
            xz2.c(z23.d, "Template models not able to create");
            jy2 jy2Var2 = z23.this.m;
            if (jy2Var2 != null) {
                jy2Var2.b("Template json processing error");
            }
            z23.this.h.a(this.b);
        }
    }

    private z23(a aVar) {
        this.l = new HashMap<>();
        f = aVar.e();
        xx2 d2 = aVar.d();
        c25.m(d2);
        this.h = d2;
        zx2 f2 = aVar.f();
        c25.m(f2);
        this.i = f2;
        gz2 g = aVar.g();
        c25.m(g);
        this.j = g;
        HashMap<String, String> i = aVar.i();
        c25.m(i);
        this.k = i;
        jy2 h = aVar.h();
        c25.m(h);
        this.m = h;
        Looper myLooper = Looper.myLooper();
        c25.m(myLooper);
        this.n = new Handler(myLooper);
    }

    public /* synthetic */ z23(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    private final void n(Layer layer, List<String> list) {
        String p = layer.p();
        if (c25.g(p, "frame")) {
            list.add(layer.n());
        } else if (c25.g(p, "text")) {
            List<Operation> m = layer.m();
            c25.m(m);
            for (Operation operation : m) {
                if (c25.g(operation.l(), i33.a.d()) && operation.i() != null) {
                    xz2.c(d, c25.C("Text font added: ", operation.i()));
                    list.add(operation.i().toString());
                }
            }
        }
    }

    public final void o() {
        ArrayList arrayList = new ArrayList();
        for (TemplateModel templateModel : this.l.values()) {
            List<Layer> a2 = templateModel.a();
            List<Layer> b2 = templateModel.b();
            if (a2 != null) {
                for (Layer layer : a2) {
                    n(layer, arrayList);
                    if (layer.j() != -1 && b2 != null) {
                        for (Layer layer2 : b2) {
                            int j = layer.j();
                            Integer k = layer2.k();
                            if (k != null && j == k.intValue()) {
                                n(layer2, arrayList);
                            }
                        }
                    }
                }
            }
        }
        StringBuilder G = wo1.G("Downloading template assets size: ");
        G.append(arrayList.size());
        G.append(" template list: ");
        G.append(this.l.size());
        xz2.c(d, G.toString());
        if (arrayList.isEmpty()) {
            new b(this).execute(f);
        } else {
            this.h.c(arrayList, e, new d());
        }
    }

    public final String p(TemplateModel templateModel) {
        String str = null;
        for (Map.Entry<String, TemplateModel> entry : this.l.entrySet()) {
            String key = entry.getKey();
            if (entry.getValue() == templateModel) {
                str = key;
            }
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        HashMap<String, String> hashMap = this.k;
        c25.m(hashMap);
        for (Map.Entry<String, String> entry2 : hashMap.entrySet()) {
            String key2 = entry2.getKey();
            if (c25.g(entry2.getValue(), str)) {
                return key2;
            }
        }
        return "";
    }

    public final void q() {
        xz2.c(d, "Downloading template json");
        HashMap<String, String> hashMap = this.k;
        c25.m(hashMap);
        Collection<String> values = hashMap.values();
        c25.o(values, "unitPathMap!!.values");
        List<String> Q5 = rs4.Q5(values);
        this.h.c(Q5, e, new e(Q5));
    }
}