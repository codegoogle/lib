package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.j;
import com.p7700g.p99005.k;
import com.p7700g.p99005.z1;

/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final String A = "android.media.extra.DOWNLOAD_STATUS";
    public static final long B = 0;
    public static final long C = 1;
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();
    public static final long D = 2;
    @i2({i2.a.LIBRARY_GROUP})
    public static final String E = "android.support.v4.media.description.MEDIA_URI";
    @i2({i2.a.LIBRARY_GROUP})
    public static final String F = "android.support.v4.media.description.NULL_BUNDLE_FLAG";
    public static final String s = "android.media.extra.BT_FOLDER_TYPE";
    public static final long t = 0;
    public static final long u = 1;
    public static final long v = 2;
    public static final long w = 3;
    public static final long x = 4;
    public static final long y = 5;
    public static final long z = 6;
    private final String G;
    private final CharSequence H;
    private final CharSequence I;
    private final CharSequence J;
    private final Bitmap K;
    private final Uri L;
    private final Bundle M;
    private final Uri N;
    private Object O;

    /* loaded from: classes.dex */
    public static final class Builder {
        private String a;
        private CharSequence b;
        private CharSequence c;
        private CharSequence d;
        private Bitmap e;
        private Uri f;
        private Bundle g;
        private Uri h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }

        public Builder b(@z1 CharSequence charSequence) {
            this.d = charSequence;
            return this;
        }

        public Builder c(@z1 Bundle bundle) {
            this.g = bundle;
            return this;
        }

        public Builder d(@z1 Bitmap bitmap) {
            this.e = bitmap;
            return this;
        }

        public Builder e(@z1 Uri uri) {
            this.f = uri;
            return this;
        }

        public Builder f(@z1 String str) {
            this.a = str;
            return this;
        }

        public Builder g(@z1 Uri uri) {
            this.h = uri;
            return this;
        }

        public Builder h(@z1 CharSequence charSequence) {
            this.c = charSequence;
            return this;
        }

        public Builder i(@z1 CharSequence charSequence) {
            this.b = charSequence;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<MediaDescriptionCompat> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.c(j.a(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.G = str;
        this.H = charSequence;
        this.I = charSequence2;
        this.J = charSequence3;
        this.K = bitmap;
        this.L = uri;
        this.M = bundle;
        this.N = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MediaDescriptionCompat c(Object obj) {
        Uri uri;
        Bundle bundle = null;
        if (obj != null) {
            int i = Build.VERSION.SDK_INT;
            Builder builder = new Builder();
            builder.f(j.f(obj));
            builder.i(j.h(obj));
            builder.h(j.g(obj));
            builder.b(j.b(obj));
            builder.d(j.d(obj));
            builder.e(j.e(obj));
            Bundle c = j.c(obj);
            if (c != null) {
                MediaSessionCompat.b(c);
                uri = (Uri) c.getParcelable(E);
            } else {
                uri = null;
            }
            if (uri != null) {
                if (!c.containsKey(F) || c.size() != 2) {
                    c.remove(E);
                    c.remove(F);
                }
                builder.c(bundle);
                if (uri == null) {
                    builder.g(uri);
                } else if (i >= 23) {
                    builder.g(k.a(obj));
                }
                MediaDescriptionCompat a2 = builder.a();
                a2.O = obj;
                return a2;
            }
            bundle = c;
            builder.c(bundle);
            if (uri == null) {
            }
            MediaDescriptionCompat a22 = builder.a();
            a22.O = obj;
            return a22;
        }
        return null;
    }

    @z1
    public CharSequence d() {
        return this.J;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @z1
    public Bundle e() {
        return this.M;
    }

    @z1
    public Bitmap g() {
        return this.K;
    }

    @z1
    public Uri i() {
        return this.L;
    }

    public Object j() {
        Object obj = this.O;
        if (obj == null) {
            int i = Build.VERSION.SDK_INT;
            Object b = j.a.b();
            j.a.g(b, this.G);
            j.a.i(b, this.H);
            j.a.h(b, this.I);
            j.a.c(b, this.J);
            j.a.e(b, this.K);
            j.a.f(b, this.L);
            Bundle bundle = this.M;
            if (i < 23 && this.N != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                    bundle.putBoolean(F, true);
                }
                bundle.putParcelable(E, this.N);
            }
            j.a.d(b, bundle);
            if (i >= 23) {
                k.a.a(b, this.N);
            }
            Object a2 = j.a.a(b);
            this.O = a2;
            return a2;
        }
        return obj;
    }

    @z1
    public String k() {
        return this.G;
    }

    @z1
    public Uri l() {
        return this.N;
    }

    @z1
    public CharSequence m() {
        return this.I;
    }

    @z1
    public CharSequence n() {
        return this.H;
    }

    public String toString() {
        return ((Object) this.H) + ", " + ((Object) this.I) + ", " + ((Object) this.J);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        j.i(j(), parcel, i);
    }

    public MediaDescriptionCompat(Parcel parcel) {
        this.G = parcel.readString();
        this.H = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.I = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.J = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.K = (Bitmap) parcel.readParcelable(classLoader);
        this.L = (Uri) parcel.readParcelable(classLoader);
        this.M = parcel.readBundle(classLoader);
        this.N = (Uri) parcel.readParcelable(classLoader);
    }
}