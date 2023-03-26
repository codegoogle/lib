package com.p7700g.p99005;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.anchorfree.sdk.SessionConfig;
import com.anchorfree.sdk.fireshield.RuntimeTypeAdapterFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TrafficRule.java */
/* loaded from: classes.dex */
public class a81 implements Parcelable {
    @x1
    private static final String t = "ip";
    @x1
    private static final String u = "udp";
    @x1
    private static final String v = "tcp";
    @x1
    @mw2("mode")
    private final String w;
    @x1
    @mw2("opts")
    private Map<String, Object> x;
    @x1
    public static final RuntimeTypeAdapterFactory<a81> s = RuntimeTypeAdapterFactory.of(a81.class, "type").registerSubtype(b.class, "assets").registerSubtype(e.class, o31.b).registerSubtype(i.class, xg1.v).registerSubtype(f.class, "ip").registerSubtype(g.class, "port-range").registerSubtype(h.class, "proto").registerSubtype(d.class, "domains");
    @x1
    public static final Parcelable.Creator<a81> CREATOR = new a();

    /* compiled from: TrafficRule.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<a81> {
        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: a */
        public a81 createFromParcel(@x1 Parcel parcel) {
            return new a81(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: b */
        public a81[] newArray(int i) {
            return new a81[i];
        }
    }

    /* compiled from: TrafficRule.java */
    /* loaded from: classes.dex */
    public static class c {
        @x1
        public String a;
        @x1
        public Map<String, Object> b;

        public c(@x1 String str, @x1 Map<String, Object> map) {
            this.a = str;
            this.b = map;
        }

        @x1
        @Deprecated
        public static c a() {
            return new c("block_dns", wo1.R("ip", "127.0.0.1"));
        }

        public static c b() {
            return new c("block_dns", wo1.R("ip", "127.0.0.1"));
        }

        @x1
        public static c c() {
            return new c(SessionConfig.ACTION_BLOCK_PKT, Collections.emptyMap());
        }

        @x1
        public static c d() {
            return new c("bypass", Collections.emptyMap());
        }

        @x1
        public static c l() {
            return new c("proxy_peer", Collections.emptyMap());
        }

        @x1
        public static c s() {
            return new c("vpn", Collections.emptyMap());
        }

        @x1
        public a81 e(@x1 String str) {
            return new b(this.a, this.b, str);
        }

        @x1
        public a81 f(@x1 List<String> list) {
            return new d(this.a, this.b, list);
        }

        @x1
        public a81 g(@x1 String str) {
            return new e(this.a, this.b, str);
        }

        @x1
        public a81 h(@x1 String str, int i) {
            return new f(this.a, this.b, str, i, 0);
        }

        @x1
        public a81 i(@x1 String str, int i, int i2) {
            return new f(this.a, this.b, str, i, i2);
        }

        @x1
        public a81 j(@x1 String str, int i, int i2, int i3) {
            return new g(this.a, this.b, str, i, i2, i3);
        }

        @x1
        public a81 k(@x1 @d2 int i) {
            return new i(this.a, this.b, i);
        }

        @x1
        public a81 m() {
            return new h(this.a, this.b, a81.v, 0, 0, 0);
        }

        @x1
        public a81 n(int i) {
            return new h(this.a, this.b, a81.v, i, 0, 0);
        }

        @x1
        public a81 o(int i, int i2) {
            return new h(this.a, this.b, a81.v, 0, i, i2);
        }

        @x1
        public a81 p() {
            return new h(this.a, this.b, a81.u, 0, 0, 0);
        }

        @x1
        public a81 q(int i) {
            return new h(this.a, this.b, a81.u, i, 0, 0);
        }

        @x1
        public a81 r(int i, int i2) {
            return new h(this.a, this.b, a81.u, 0, i, i2);
        }
    }

    public a81(@x1 String str, @x1 Map<String, Object> map) {
        this.w = str;
        this.x = map;
    }

    @z1
    public List<String> c(@x1 Context context) {
        return null;
    }

    @z1
    public File d(@x1 Context context, @x1 File file) {
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @x1
    public String e() {
        return this.w;
    }

    @x1
    public Map<String, Object> g() throws JSONException {
        return Collections.unmodifiableMap(this.x);
    }

    public boolean i() {
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i2) {
        parcel.writeString(this.w);
        parcel.writeMap(this.x);
    }

    /* compiled from: TrafficRule.java */
    /* loaded from: classes.dex */
    public static class b extends a81 {
        @mw2("name")
        private final String y;

        public b(@x1 Parcel parcel) {
            super(parcel);
            this.y = parcel.readString();
        }

        @Override // com.p7700g.p99005.a81
        @z1
        public List<String> c(@x1 Context context) {
            try {
                InputStream open = context.getAssets().open(this.y);
                List<String> asList = Arrays.asList(new String(o81.a(open)).split("\n"));
                open.close();
                return asList;
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }

        @Override // com.p7700g.p99005.a81
        @z1
        public File d(@x1 Context context, @x1 File file) {
            try {
                InputStream open = context.getAssets().open(this.y);
                File createTempFile = File.createTempFile("assets", "dns", file);
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                byte[] bArr = new byte[kb0.c];
                while (true) {
                    int read = open.read(bArr);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.close();
                        open.close();
                        return createTempFile;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override // com.p7700g.p99005.a81, android.os.Parcelable
        public void writeToParcel(@x1 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.y);
        }

        public b(@x1 String str, @x1 Map<String, Object> map, @x1 String str2) {
            super(str, map);
            this.y = str2;
        }
    }

    /* compiled from: TrafficRule.java */
    /* loaded from: classes.dex */
    public static class e extends a81 {
        @mw2(la1.k)
        private final String y;

        public e(@x1 Parcel parcel) {
            super(parcel);
            this.y = parcel.readString();
        }

        @Override // com.p7700g.p99005.a81
        @z1
        public List<String> c(@x1 Context context) {
            try {
                FileInputStream fileInputStream = new FileInputStream(this.y);
                List<String> asList = Arrays.asList(new String(o81.a(fileInputStream)).split("\n"));
                fileInputStream.close();
                return asList;
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }

        @Override // com.p7700g.p99005.a81
        @x1
        public File d(@x1 Context context, @x1 File file) {
            return new File(this.y);
        }

        @Override // com.p7700g.p99005.a81, android.os.Parcelable
        public void writeToParcel(@x1 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.y);
        }

        public e(@x1 String str, @x1 Map<String, Object> map, @x1 String str2) {
            super(str, map);
            this.y = str2;
        }
    }

    /* compiled from: TrafficRule.java */
    /* loaded from: classes.dex */
    public static class i extends a81 {
        @mw2(xg1.v)
        private final int y;

        public i(@x1 Parcel parcel) {
            super(parcel);
            this.y = parcel.readInt();
        }

        @Override // com.p7700g.p99005.a81
        @z1
        public File d(@x1 Context context, @x1 File file) {
            try {
                InputStream openRawResource = context.getResources().openRawResource(this.y);
                File createTempFile = File.createTempFile("assets", "dns", file);
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                byte[] bArr = new byte[kb0.c];
                while (true) {
                    int read = openRawResource.read(bArr);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.close();
                        openRawResource.close();
                        return createTempFile;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override // com.p7700g.p99005.a81, android.os.Parcelable
        public void writeToParcel(@x1 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.y);
        }

        public i(@x1 String str, @x1 Map<String, Object> map, @x1 int i) {
            super(str, map);
            this.y = i;
        }
    }

    /* compiled from: TrafficRule.java */
    /* loaded from: classes.dex */
    public static class d extends a81 {
        @x1
        @mw2("domains")
        private final List<String> y;

        public d(@x1 Parcel parcel) {
            super(parcel);
            ArrayList arrayList = new ArrayList();
            this.y = arrayList;
            parcel.readStringList(arrayList);
        }

        @Override // com.p7700g.p99005.a81
        @z1
        public List<String> c(@x1 Context context) {
            return this.y;
        }

        @Override // com.p7700g.p99005.a81
        @z1
        public File d(@x1 Context context, @x1 File file) {
            try {
                File createTempFile = File.createTempFile("domains", "dns", file);
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                for (String str : this.y) {
                    fileOutputStream.write(str.getBytes(Charset.forName("UTF-8")));
                    fileOutputStream.write("\n".getBytes(Charset.forName("UTF-8")));
                }
                fileOutputStream.close();
                return createTempFile;
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override // com.p7700g.p99005.a81, android.os.Parcelable
        public void writeToParcel(@x1 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeStringList(this.y);
        }

        public d(@x1 String str, @x1 Map<String, Object> map, @x1 List<String> list) {
            super(str, map);
            this.y = list;
        }
    }

    /* compiled from: TrafficRule.java */
    /* loaded from: classes.dex */
    public static class g extends f {
        @mw2("portLow")
        public final int B;
        @mw2("portHigh")
        public final int C;

        public g(@x1 String str, @x1 Map<String, Object> map, @x1 String str2, int i, int i2, int i3) {
            super(str, map, str2, i, 0);
            this.B = i2;
            this.C = i3;
        }

        @Override // com.p7700g.p99005.a81.f, com.p7700g.p99005.a81
        @x1
        public Map<String, Object> g() throws JSONException {
            HashMap hashMap = new HashMap(super.g());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("low", this.B);
            jSONObject.put("high", this.C);
            hashMap.put("port-range", jSONObject);
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // com.p7700g.p99005.a81.f, com.p7700g.p99005.a81
        public boolean i() {
            return false;
        }

        @Override // com.p7700g.p99005.a81.f, com.p7700g.p99005.a81, android.os.Parcelable
        public void writeToParcel(@x1 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.B);
            parcel.writeInt(this.C);
        }

        public g(@x1 Parcel parcel) {
            super(parcel);
            this.B = parcel.readInt();
            this.C = parcel.readInt();
        }
    }

    /* compiled from: TrafficRule.java */
    /* loaded from: classes.dex */
    public static class f extends a81 {
        @mw2("port")
        public final int A;
        @x1
        @mw2("ip")
        public final String y;
        @mw2("mask")
        public final int z;

        public f(@x1 String str, @x1 Map<String, Object> map, @x1 String str2, int i, int i2) {
            super(str, map);
            this.y = str2;
            this.z = i;
            this.A = i2;
        }

        @Override // com.p7700g.p99005.a81
        @x1
        public Map<String, Object> g() throws JSONException {
            HashMap hashMap = new HashMap(super.g());
            hashMap.put("ip", String.format(Locale.ENGLISH, "%s/%d", this.y, Integer.valueOf(this.z)));
            int i = this.A;
            if (i != 0) {
                hashMap.put("port", Integer.valueOf(i));
            }
            return hashMap;
        }

        @Override // com.p7700g.p99005.a81
        public boolean i() {
            return false;
        }

        @Override // com.p7700g.p99005.a81, android.os.Parcelable
        public void writeToParcel(@x1 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.y);
            parcel.writeInt(this.z);
            parcel.writeInt(this.A);
        }

        public f(@x1 Parcel parcel) {
            super(parcel);
            this.y = parcel.readString();
            this.z = parcel.readInt();
            this.A = parcel.readInt();
        }
    }

    public a81(@x1 Parcel parcel) {
        this.w = parcel.readString();
        HashMap hashMap = new HashMap();
        this.x = hashMap;
        parcel.readMap(hashMap, HashMap.class.getClassLoader());
    }

    /* compiled from: TrafficRule.java */
    /* loaded from: classes.dex */
    public static class h extends a81 {
        @mw2("portLow")
        public final int A;
        @mw2("portHigh")
        public final int B;
        @mw2("proto")
        public final String y;
        @mw2("port")
        public final int z;

        public h(@x1 String str, @x1 Map<String, Object> map, @x1 String str2, @x1 int i, @x1 int i2, @x1 int i3) {
            super(str, map);
            this.y = str2;
            this.z = i;
            this.A = i2;
            this.B = i3;
        }

        @Override // com.p7700g.p99005.a81
        @x1
        public Map<String, Object> g() throws JSONException {
            HashMap hashMap = new HashMap(super.g());
            hashMap.put("proto", this.y);
            int i = this.z;
            if (i != 0) {
                hashMap.put("port", Integer.valueOf(i));
            } else if (this.B != 0 && this.A != 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("low", this.A);
                jSONObject.put("high", this.B);
                hashMap.put("port-range", jSONObject);
            }
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // com.p7700g.p99005.a81
        public boolean i() {
            return false;
        }

        @Override // com.p7700g.p99005.a81, android.os.Parcelable
        public void writeToParcel(@x1 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.y);
            parcel.writeInt(this.z);
            parcel.writeInt(this.A);
            parcel.writeInt(this.B);
        }

        public h(@x1 Parcel parcel) {
            super(parcel);
            this.y = parcel.readString();
            this.z = parcel.readInt();
            this.A = parcel.readInt();
            this.B = parcel.readInt();
        }
    }
}