package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.o;
import com.p7700g.p99005.p;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.z1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final long A = 256;
    public static final int A0 = -1;
    public static final long B = 512;
    public static final int B0 = 0;
    public static final long C = 1024;
    public static final int C0 = 1;
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();
    public static final long D = 2048;
    public static final int D0 = 2;
    public static final long E = 4096;
    public static final int E0 = 0;
    public static final long F = 8192;
    public static final int F0 = 1;
    public static final long G = 16384;
    public static final int G0 = 2;
    public static final long H = 32768;
    public static final int H0 = 3;
    public static final long I = 65536;
    public static final int I0 = 4;
    public static final long J = 131072;
    public static final int J0 = 5;
    public static final long K = 262144;
    public static final int K0 = 6;
    @Deprecated
    public static final long L = 524288;
    public static final int L0 = 7;
    public static final long M = 1048576;
    public static final int M0 = 8;
    public static final long N = 2097152;
    public static final int N0 = 9;
    public static final int O = 0;
    public static final int O0 = 10;
    public static final int P = 1;
    public static final int P0 = 11;
    public static final int Q = 2;
    private static final int Q0 = 127;
    public static final int R = 3;
    private static final int R0 = 126;
    public static final int S = 4;
    public static final int T = 5;
    public static final int U = 6;
    public static final int V = 7;
    public static final int W = 8;
    public static final int X = 9;
    public static final int Y = 10;
    public static final int Z = 11;
    public static final long s = 1;
    public static final long t = 2;
    public static final long u = 4;
    public static final long u0 = -1;
    public static final long v = 8;
    public static final int v0 = -1;
    public static final long w = 16;
    public static final int w0 = 0;
    public static final long x = 32;
    public static final int x0 = 1;
    public static final long y = 64;
    public static final int y0 = 2;
    public static final long z = 128;
    public static final int z0 = 3;
    public final int S0;
    public final long T0;
    public final long U0;
    public final float V0;
    public final long W0;
    public final int X0;
    public final CharSequence Y0;
    public final long Z0;
    public List<CustomAction> a1;
    public final long b1;
    public final Bundle c1;
    private Object d1;

    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Actions {
    }

    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ErrorCode {
    }

    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface MediaKeyAction {
    }

    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface RepeatMode {
    }

    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ShuffleMode {
    }

    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface State {
    }

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<PlaybackStateCompat> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    public PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.S0 = i;
        this.T0 = j;
        this.U0 = j2;
        this.V0 = f;
        this.W0 = j3;
        this.X0 = i2;
        this.Y0 = charSequence;
        this.Z0 = j4;
        this.a1 = new ArrayList(list);
        this.b1 = j5;
        this.c1 = bundle;
    }

    public static PlaybackStateCompat c(Object obj) {
        ArrayList arrayList;
        if (obj != null) {
            List<Object> d = o.d(obj);
            if (d != null) {
                ArrayList arrayList2 = new ArrayList(d.size());
                for (Object obj2 : d) {
                    arrayList2.add(CustomAction.c(obj2));
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(o.i(obj), o.h(obj), o.c(obj), o.g(obj), o.a(obj), 0, o.e(obj), o.f(obj), arrayList, o.b(obj), Build.VERSION.SDK_INT >= 22 ? p.a(obj) : null);
            playbackStateCompat.d1 = obj;
            return playbackStateCompat;
        }
        return null;
    }

    public static int s(long j) {
        if (j == 4) {
            return 126;
        }
        if (j == 2) {
            return 127;
        }
        if (j == 32) {
            return 87;
        }
        if (j == 16) {
            return 88;
        }
        if (j == 1) {
            return 86;
        }
        if (j == 64) {
            return 90;
        }
        if (j == 8) {
            return 89;
        }
        return j == 512 ? 85 : 0;
    }

    public long d() {
        return this.W0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long e() {
        return this.b1;
    }

    public long g() {
        return this.U0;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public long i(Long l) {
        return Math.max(0L, this.T0 + (this.V0 * ((float) (l != null ? l.longValue() : SystemClock.elapsedRealtime() - this.Z0))));
    }

    public List<CustomAction> j() {
        return this.a1;
    }

    public int k() {
        return this.X0;
    }

    public CharSequence l() {
        return this.Y0;
    }

    @z1
    public Bundle m() {
        return this.c1;
    }

    public long n() {
        return this.Z0;
    }

    public float o() {
        return this.V0;
    }

    public Object p() {
        if (this.d1 == null) {
            ArrayList arrayList = null;
            if (this.a1 != null) {
                arrayList = new ArrayList(this.a1.size());
                for (CustomAction customAction : this.a1) {
                    arrayList.add(customAction.e());
                }
            }
            ArrayList arrayList2 = arrayList;
            if (Build.VERSION.SDK_INT >= 22) {
                this.d1 = p.b(this.S0, this.T0, this.U0, this.V0, this.W0, this.Y0, this.Z0, arrayList2, this.b1, this.c1);
            } else {
                this.d1 = o.j(this.S0, this.T0, this.U0, this.V0, this.W0, this.Y0, this.Z0, arrayList2, this.b1);
            }
        }
        return this.d1;
    }

    public long q() {
        return this.T0;
    }

    public int r() {
        return this.S0;
    }

    public String toString() {
        StringBuilder K2 = wo1.K("PlaybackState {", "state=");
        K2.append(this.S0);
        K2.append(", position=");
        K2.append(this.T0);
        K2.append(", buffered position=");
        K2.append(this.U0);
        K2.append(", speed=");
        K2.append(this.V0);
        K2.append(", updated=");
        K2.append(this.Z0);
        K2.append(", actions=");
        K2.append(this.W0);
        K2.append(", error code=");
        K2.append(this.X0);
        K2.append(", error message=");
        K2.append(this.Y0);
        K2.append(", custom actions=");
        K2.append(this.a1);
        K2.append(", active item id=");
        K2.append(this.b1);
        K2.append("}");
        return K2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.S0);
        parcel.writeLong(this.T0);
        parcel.writeFloat(this.V0);
        parcel.writeLong(this.Z0);
        parcel.writeLong(this.U0);
        parcel.writeLong(this.W0);
        TextUtils.writeToParcel(this.Y0, parcel, i);
        parcel.writeTypedList(this.a1);
        parcel.writeLong(this.b1);
        parcel.writeBundle(this.c1);
        parcel.writeInt(this.X0);
    }

    /* loaded from: classes.dex */
    public static final class Builder {
        private final List<CustomAction> a;
        private int b;
        private long c;
        private long d;
        private float e;
        private long f;
        private int g;
        private CharSequence h;
        private long i;
        private long j;
        private Bundle k;

        public Builder() {
            this.a = new ArrayList();
            this.j = -1L;
        }

        public Builder a(CustomAction customAction) {
            if (customAction != null) {
                this.a.add(customAction);
                return this;
            }
            throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat.");
        }

        public Builder b(String str, String str2, int i) {
            return a(new CustomAction(str, str2, i, null));
        }

        public PlaybackStateCompat c() {
            return new PlaybackStateCompat(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.a, this.j, this.k);
        }

        public Builder d(long j) {
            this.f = j;
            return this;
        }

        public Builder e(long j) {
            this.j = j;
            return this;
        }

        public Builder f(long j) {
            this.d = j;
            return this;
        }

        public Builder g(int i, CharSequence charSequence) {
            this.g = i;
            this.h = charSequence;
            return this;
        }

        public Builder h(CharSequence charSequence) {
            this.h = charSequence;
            return this;
        }

        public Builder i(Bundle bundle) {
            this.k = bundle;
            return this;
        }

        public Builder j(int i, long j, float f) {
            return k(i, j, f, SystemClock.elapsedRealtime());
        }

        public Builder k(int i, long j, float f, long j2) {
            this.b = i;
            this.c = j;
            this.i = j2;
            this.e = f;
            return this;
        }

        public Builder(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.a = arrayList;
            this.j = -1L;
            this.b = playbackStateCompat.S0;
            this.c = playbackStateCompat.T0;
            this.e = playbackStateCompat.V0;
            this.i = playbackStateCompat.Z0;
            this.d = playbackStateCompat.U0;
            this.f = playbackStateCompat.W0;
            this.g = playbackStateCompat.X0;
            this.h = playbackStateCompat.Y0;
            List<CustomAction> list = playbackStateCompat.a1;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.j = playbackStateCompat.b1;
            this.k = playbackStateCompat.c1;
        }
    }

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();
        private final String s;
        private final CharSequence t;
        private final int u;
        private final Bundle v;
        private Object w;

        /* loaded from: classes.dex */
        public static final class Builder {
            private final String a;
            private final CharSequence b;
            private final int c;
            private Bundle d;

            public Builder(String str, CharSequence charSequence, int i) {
                if (!TextUtils.isEmpty(str)) {
                    if (TextUtils.isEmpty(charSequence)) {
                        throw new IllegalArgumentException("You must specify a name to build a CustomAction.");
                    }
                    if (i != 0) {
                        this.a = str;
                        this.b = charSequence;
                        this.c = i;
                        return;
                    }
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction.");
                }
                throw new IllegalArgumentException("You must specify an action to build a CustomAction.");
            }

            public CustomAction a() {
                return new CustomAction(this.a, this.b, this.c, this.d);
            }

            public Builder b(Bundle bundle) {
                this.d = bundle;
                return this;
            }
        }

        /* loaded from: classes.dex */
        public static class a implements Parcelable.Creator<CustomAction> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.s = str;
            this.t = charSequence;
            this.u = i;
            this.v = bundle;
        }

        public static CustomAction c(Object obj) {
            if (obj != null) {
                CustomAction customAction = new CustomAction(o.a.a(obj), o.a.d(obj), o.a.c(obj), o.a.b(obj));
                customAction.w = obj;
                return customAction;
            }
            return null;
        }

        public String d() {
            return this.s;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public Object e() {
            Object obj = this.w;
            if (obj == null) {
                Object e = o.a.e(this.s, this.t, this.u, this.v);
                this.w = e;
                return e;
            }
            return obj;
        }

        public Bundle g() {
            return this.v;
        }

        public int i() {
            return this.u;
        }

        public CharSequence j() {
            return this.t;
        }

        public String toString() {
            StringBuilder G = wo1.G("Action:mName='");
            G.append((Object) this.t);
            G.append(", mIcon=");
            G.append(this.u);
            G.append(", mExtras=");
            G.append(this.v);
            return G.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.s);
            TextUtils.writeToParcel(this.t, parcel, i);
            parcel.writeInt(this.u);
            parcel.writeBundle(this.v);
        }

        public CustomAction(Parcel parcel) {
            this.s = parcel.readString();
            this.t = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.u = parcel.readInt();
            this.v = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.S0 = parcel.readInt();
        this.T0 = parcel.readLong();
        this.V0 = parcel.readFloat();
        this.Z0 = parcel.readLong();
        this.U0 = parcel.readLong();
        this.W0 = parcel.readLong();
        this.Y0 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.a1 = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.b1 = parcel.readLong();
        this.c1 = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.X0 = parcel.readInt();
    }
}