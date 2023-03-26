package com.p7700g.p99005;

import android.net.Uri;
import android.text.TextUtils;
import com.p7700g.p99005.b35;
import com.p7700g.p99005.d23;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class hc3 {
    @NotNull
    public static final c a = new c(null);
    @NotNull
    private static final String b;
    @NotNull
    private static final String c;
    @NotNull
    private static final Map<String, List<b>> d;
    @NotNull
    private final File e;
    @NotNull
    private final HashMap<String, String> f;
    @NotNull
    private final Map<Integer, List<b>> g;

    /* loaded from: classes3.dex */
    public enum a {
        TEMPLATE,
        GENERAL
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(@NotNull ez2 ez2Var);
    }

    /* loaded from: classes3.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements d23.c {
        public final /* synthetic */ AtomicInteger a;
        public final /* synthetic */ hc3 b;
        public final /* synthetic */ AtomicBoolean c;
        public final /* synthetic */ List<String> d;
        public final /* synthetic */ b35.h<String> e;
        public final /* synthetic */ dz2 f;
        public final /* synthetic */ int g;

        public d(AtomicInteger atomicInteger, hc3 hc3Var, AtomicBoolean atomicBoolean, List<String> list, b35.h<String> hVar, dz2 dz2Var, int i) {
            this.a = atomicInteger;
            this.b = hc3Var;
            this.c = atomicBoolean;
            this.d = list;
            this.e = hVar;
            this.f = dz2Var;
            this.g = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p7700g.p99005.d23.c
        public synchronized void a(@NotNull String str, @NotNull String str2) {
            c25.p(str, "url");
            c25.p(str2, "fileError");
            boolean z = true;
            this.c.set(true);
            this.a.decrementAndGet();
            if (this.e.s.length() != 0) {
                z = false;
            }
            if (z) {
                this.e.s = str2;
            }
            this.d.add(str);
            xz2.c("AstMngr", "File storing error");
            if (this.a.get() == 0) {
                ez2 ez2Var = new ez2(this.c.get() ? fz2.FAILURE : fz2.SUCCESS, rs4.k4(this.f.a(), this.d), this.d, this.e.s);
                xz2.c("AstMngr", "Download completed");
                List<b> list = (List) this.b.g.get(Integer.valueOf(this.g));
                this.b.g.remove(Integer.valueOf(this.g));
                if (list != null) {
                    for (b bVar : list) {
                        bVar.a(ez2Var);
                    }
                }
            }
        }

        @Override // com.p7700g.p99005.d23.c
        public synchronized void b(@NotNull String str, @NotNull b53 b53Var) {
            c25.p(str, "url");
            c25.p(b53Var, "volleyError");
            xz2.c("AstMngr", "Failed to download url: " + str + " reason: " + b53Var);
            this.c.set(true);
            this.a.decrementAndGet();
            if (this.e.s.length() == 0) {
                this.e.s = "Download failed";
            }
            this.d.add(str);
            xz2.c("AstMngr", c25.C("Download failure for url: ", str));
            if (this.a.get() == 0) {
                ez2 ez2Var = new ez2(this.c.get() ? fz2.FAILURE : fz2.SUCCESS, rs4.k4(this.f.a(), this.d), this.d, this.e.s);
                xz2.c("AstMngr", "Download completed");
                List<b> list = (List) this.b.g.get(Integer.valueOf(this.g));
                this.b.g.remove(Integer.valueOf(this.g));
                if (list != null) {
                    for (b bVar : list) {
                        bVar.a(ez2Var);
                    }
                }
            }
        }

        @Override // com.p7700g.p99005.d23.c
        public synchronized void c(@NotNull String str, @Nullable byte[] bArr, @NotNull String str2) {
            c25.p(str, "url");
            c25.p(str2, la1.k);
            this.a.decrementAndGet();
            if (bArr != null) {
                xz2.c("AstMngr", "Download success for url: " + str + " and path: " + str2);
                File file = new File(str2);
                if (file.exists()) {
                    xz2.c("AstMngr", "File stored in Map");
                    HashMap hashMap = this.b.f;
                    String absolutePath = file.getAbsolutePath();
                    c25.o(absolutePath, "file.absolutePath");
                    hashMap.put(str, absolutePath);
                } else {
                    this.c.set(true);
                    this.d.add(str);
                    if (this.e.s.length() == 0) {
                        this.e.s = "File not exists after downloading";
                    }
                    xz2.c("AstMngr", "[ERROR] File not exists after downloading");
                }
            } else {
                this.d.add(str);
                if (this.e.s.length() == 0) {
                    this.e.s = "No data for downloading asset";
                }
                xz2.c("AstMngr", "Download failure for url: " + str + " and path: " + str2);
                this.c.set(true);
            }
            if (this.a.get() == 0) {
                ez2 ez2Var = new ez2(this.c.get() ? fz2.FAILURE : fz2.SUCCESS, rs4.k4(this.f.a(), this.d), this.d, this.e.s);
                xz2.c("AstMngr", "Download completed");
                List<b> list = (List) this.b.g.get(Integer.valueOf(this.g));
                this.b.g.remove(Integer.valueOf(this.g));
                if (list != null) {
                    for (b bVar : list) {
                        bVar.a(ez2Var);
                    }
                }
            }
        }
    }

    static {
        String str;
        String C = c25.C("templates", File.separator);
        b = C;
        c = C + "assets" + ((Object) str);
        d = new ConcurrentHashMap();
    }

    public hc3() {
        File c2 = h73.a.a().c();
        this.e = c2;
        this.f = new HashMap<>();
        this.g = new LinkedHashMap();
        c2.mkdirs();
    }

    private final File b(String str, String str2) {
        File file = new File(this.e, str);
        if (!file.exists()) {
            file.mkdirs();
        }
        String b2 = zz2.b(str2);
        xz2.c("AstMngr", c25.C("ResolvedPath: ", this.e));
        xz2.c("AstMngr", c25.C("Download url: ", str2));
        xz2.c("AstMngr", c25.C("AssetPath: ", new File(file, b2).getAbsolutePath()));
        return new File(file, b2);
    }

    public static /* synthetic */ void e(hc3 hc3Var, dz2 dz2Var, b bVar, a aVar, int i, Object obj) {
        if ((i & 4) != 0) {
            aVar = a.GENERAL;
        }
        hc3Var.d(dz2Var, bVar, aVar);
    }

    private final boolean i(String str) {
        xz2.c("AstMngr", "isCached url : " + str + gl4.R + this.f.containsKey(str));
        if (this.f.containsKey(str)) {
            boolean exists = new File(this.f.get(str)).exists();
            if (!exists) {
                this.f.remove(str);
            }
            return exists;
        }
        String b2 = zz2.b(str);
        if (b2 != null) {
            File file = new File(this.e, b2);
            boolean exists2 = file.exists();
            if (exists2) {
                HashMap<String, String> hashMap = this.f;
                String absolutePath = file.getAbsolutePath();
                c25.o(absolutePath, "filePath.absolutePath");
                hashMap.put(str, absolutePath);
            }
            return exists2;
        }
        return false;
    }

    @NotNull
    public final Uri a(@NotNull String str) {
        c25.p(str, "url");
        if (i(str)) {
            Uri parse = Uri.parse(this.f.get(str));
            xz2.c("AstMngr", "Returning cached path for url: " + str + " value: " + parse);
            c25.o(parse, "parse(pathMap[url]).also {\n                Logger.d(TAG, \"Returning cached path for url: $url value: $it\")\n            }");
            return parse;
        }
        Uri parse2 = Uri.parse("");
        c25.o(parse2, "parse(\"\")");
        return parse2;
    }

    public final void d(@NotNull dz2 dz2Var, @NotNull b bVar, @NotNull a aVar) {
        yq4 yq4Var;
        c25.p(dz2Var, "cacheReqModel");
        c25.p(bVar, "cacheListener");
        c25.p(aVar, "assetType");
        List<String> T5 = rs4.T5(dz2Var.a());
        int a2 = bc3.a(T5);
        if (this.g.get(Integer.valueOf(a2)) != null) {
            xz2.c("AstMngr", "Already downloading the assets");
            List<b> list = this.g.get(Integer.valueOf(a2));
            if (list == null) {
                return;
            }
            list.add(bVar);
            return;
        }
        this.g.put(Integer.valueOf(a2), js4.Q(bVar));
        LinkedHashSet linkedHashSet = new LinkedHashSet(T5);
        T5.clear();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!TextUtils.isEmpty(str)) {
                if (this.f.containsKey(str)) {
                    String str2 = this.f.get(str);
                    c25.m(str2);
                    if (!new File(str2).exists()) {
                        xz2.c("AstMngr", c25.C("File already in Map but somehow got deleted: ", str));
                        c25.o(str, "url");
                        T5.add(str);
                    }
                } else {
                    String c2 = dz2Var.c();
                    c25.o(str, "url");
                    File b2 = b(c2, str);
                    if (!b2.exists()) {
                        T5.add(str);
                    } else {
                        HashMap<String, String> hashMap = this.f;
                        String absolutePath = b2.getAbsolutePath();
                        c25.o(absolutePath, "assetPath.absolutePath");
                        hashMap.put(str, absolutePath);
                    }
                }
            }
        }
        if (T5.size() == 0) {
            xz2.c("AstMngr", "All the assets are already downloaded");
            List<b> list2 = this.g.get(Integer.valueOf(a2));
            this.g.remove(Integer.valueOf(a2));
            if (list2 == null) {
                return;
            }
            for (b bVar2 : list2) {
                bVar2.a(new ez2(fz2.SUCCESS, dz2Var.a(), js4.F(), null, 8, null));
            }
            return;
        }
        xz2.c("AstMngr", c25.C("Total units to download: ", Integer.valueOf(T5.size())));
        AtomicInteger atomicInteger = new AtomicInteger(T5.size());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ArrayList arrayList = new ArrayList();
        b35.h hVar = new b35.h();
        hVar.s = "";
        d dVar = new d(atomicInteger, this, atomicBoolean, arrayList, hVar, dz2Var, a2);
        for (String str3 : T5) {
            if (i(str3)) {
                xz2.c("AstMngr", c25.C("Url already cached: ", str3));
            } else {
                d23.a d2 = new d23.a(str3).b(dVar).d(dz2Var.b());
                String absolutePath2 = b(dz2Var.c(), str3).getAbsolutePath();
                c25.o(absolutePath2, "getAssetPath(cacheReqModel.subPath, url).absolutePath");
                d23.a c3 = d2.c(absolutePath2);
                if (aVar == a.TEMPLATE) {
                    c3.e(10000).f(2);
                }
                d23<yq4> a3 = c3.a();
                if (a3 == null) {
                    yq4Var = null;
                } else {
                    na3.s.a().c(a3);
                    yq4Var = yq4.a;
                }
                if (yq4Var == null) {
                    xz2.c("AstMngr", "Null Download Request");
                }
            }
        }
    }

    public final void f(@NotNull List<String> list) {
        c25.p(list, "urls");
        for (String str : list) {
            String uri = a(str).toString();
            c25.o(uri, "getCachedPath(url).toString()");
            if (uri.length() == 0) {
                return;
            }
            try {
                new File(uri).delete();
                this.f.remove(str);
            } catch (IOException e) {
                xz2.c("AstMngr", e.toString());
            }
        }
    }

    @Nullable
    public final byte[] h(@NotNull String str) {
        c25.p(str, "url");
        if (i(str)) {
            xz2.c("AstMngr", c25.C("Reading from file cached: ", str));
            try {
                FileInputStream fileInputStream = new FileInputStream(a(str).toString());
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                return bArr;
            } catch (FileNotFoundException e) {
                xz2.c("AstMngr", c25.C("[ERROR] Failed to read file from: ", e.getLocalizedMessage()));
            } catch (IOException e2) {
                xz2.c("AstMngr", c25.C("[ERROR] Failed to read file from: ", e2.getLocalizedMessage()));
                e2.printStackTrace();
            }
        }
        xz2.c("AstMngr", c25.C("Reading from file not cached or failed: ", str));
        return null;
    }
}