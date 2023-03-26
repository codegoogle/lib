package com.p7700g.p99005;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: DnsRule.java */
/* loaded from: classes.dex */
public class y51 implements Parcelable {
    @x1
    public static final Parcelable.Creator<y51> CREATOR = new a();
    @x1
    private final String s;
    @x1
    private Map<String, Object> t;

    /* compiled from: DnsRule.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<y51> {
        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: a */
        public y51 createFromParcel(@x1 Parcel parcel) {
            return new y51(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: b */
        public y51[] newArray(int i) {
            return new y51[i];
        }
    }

    public y51(@x1 String str, @x1 Map<String, Object> map) {
        this.s = str;
        this.t = map;
    }

    @z1
    public File c(@x1 Context context, @x1 File file) {
        return null;
    }

    @x1
    public String d() {
        return this.s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @x1
    public Map<String, Object> e() {
        return Collections.unmodifiableMap(this.t);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeString(this.s);
        parcel.writeMap(this.t);
    }

    /* compiled from: DnsRule.java */
    /* loaded from: classes.dex */
    public static class b extends y51 {
        private final String u;

        public b(@x1 Parcel parcel) {
            super(parcel);
            this.u = parcel.readString();
        }

        @Override // com.p7700g.p99005.y51
        @z1
        public File c(@x1 Context context, @x1 File file) {
            try {
                InputStream open = context.getAssets().open(this.u);
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

        @Override // com.p7700g.p99005.y51, android.os.Parcelable
        public void writeToParcel(@x1 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.u);
        }

        public b(@x1 String str, @x1 Map<String, Object> map, @x1 String str2) {
            super(str, map);
            this.u = str2;
        }
    }

    /* compiled from: DnsRule.java */
    /* loaded from: classes.dex */
    public static class d extends y51 {
        private final String u;

        public d(@x1 Parcel parcel) {
            super(parcel);
            this.u = parcel.readString();
        }

        @Override // com.p7700g.p99005.y51
        @x1
        public File c(@x1 Context context, @x1 File file) {
            return new File(this.u);
        }

        @Override // com.p7700g.p99005.y51, android.os.Parcelable
        public void writeToParcel(@x1 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.u);
        }

        public d(@x1 String str, @x1 Map<String, Object> map, @x1 String str2) {
            super(str, map);
            this.u = str2;
        }
    }

    /* compiled from: DnsRule.java */
    /* loaded from: classes.dex */
    public static class e extends y51 {
        private final int u;

        public e(@x1 Parcel parcel) {
            super(parcel);
            this.u = parcel.readInt();
        }

        @Override // com.p7700g.p99005.y51
        @z1
        public File c(@x1 Context context, @x1 File file) {
            try {
                InputStream openRawResource = context.getResources().openRawResource(this.u);
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

        @Override // com.p7700g.p99005.y51, android.os.Parcelable
        public void writeToParcel(@x1 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.u);
        }

        public e(@x1 String str, @x1 Map<String, Object> map, @x1 int i) {
            super(str, map);
            this.u = i;
        }
    }

    /* compiled from: DnsRule.java */
    /* loaded from: classes.dex */
    public static class c extends y51 {
        @x1
        private final List<String> u;

        public c(@x1 Parcel parcel) {
            super(parcel);
            LinkedList linkedList = new LinkedList();
            this.u = linkedList;
            parcel.readStringList(linkedList);
        }

        @Override // com.p7700g.p99005.y51
        @z1
        public File c(@x1 Context context, @x1 File file) {
            try {
                File createTempFile = File.createTempFile("domains", "dns", file);
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                for (String str : this.u) {
                    fileOutputStream.write(str.getBytes());
                    fileOutputStream.write("\n".getBytes());
                }
                fileOutputStream.close();
                return createTempFile;
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override // com.p7700g.p99005.y51, android.os.Parcelable
        public void writeToParcel(@x1 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeStringList(this.u);
        }

        public c(@x1 String str, @x1 Map<String, Object> map, @x1 List<String> list) {
            super(str, map);
            this.u = list;
        }
    }

    public y51(@x1 Parcel parcel) {
        this.s = parcel.readString();
        HashMap hashMap = new HashMap();
        this.t = hashMap;
        parcel.readMap(hashMap, HashMap.class.getClassLoader());
    }
}