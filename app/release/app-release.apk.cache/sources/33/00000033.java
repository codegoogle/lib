package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.q7;
import com.p7700g.p99005.wo1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Set;

/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final String A = "android.media.metadata.COMPILATION";
    public static final String B = "android.media.metadata.DATE";
    public static final String C = "android.media.metadata.YEAR";
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    public static final String D = "android.media.metadata.GENRE";
    public static final String E = "android.media.metadata.TRACK_NUMBER";
    public static final String F = "android.media.metadata.NUM_TRACKS";
    public static final String G = "android.media.metadata.DISC_NUMBER";
    public static final String H = "android.media.metadata.ALBUM_ARTIST";
    public static final String I = "android.media.metadata.ART";
    public static final String J = "android.media.metadata.ART_URI";
    public static final String K = "android.media.metadata.ALBUM_ART";
    public static final String L = "android.media.metadata.ALBUM_ART_URI";
    public static final String M = "android.media.metadata.USER_RATING";
    public static final String N = "android.media.metadata.RATING";
    public static final String O = "android.media.metadata.DISPLAY_TITLE";
    public static final String P = "android.media.metadata.DISPLAY_SUBTITLE";
    public static final String Q = "android.media.metadata.DISPLAY_DESCRIPTION";
    public static final String R = "android.media.metadata.DISPLAY_ICON";
    public static final String S = "android.media.metadata.DISPLAY_ICON_URI";
    public static final String T = "android.media.metadata.MEDIA_ID";
    public static final String U = "android.media.metadata.MEDIA_URI";
    public static final String V = "android.media.metadata.BT_FOLDER_TYPE";
    public static final String W = "android.media.metadata.ADVERTISEMENT";
    public static final String X = "android.media.metadata.DOWNLOAD_STATUS";
    public static final int Y = 0;
    public static final int Z = 1;
    private static final String s = "MediaMetadata";
    public static final String t = "android.media.metadata.TITLE";
    public static final String u = "android.media.metadata.ARTIST";
    public static final int u0 = 2;
    public static final String v = "android.media.metadata.DURATION";
    public static final int v0 = 3;
    public static final String w = "android.media.metadata.ALBUM";
    public static final q7<String, Integer> w0;
    public static final String x = "android.media.metadata.AUTHOR";
    private static final String[] x0;
    public static final String y = "android.media.metadata.WRITER";
    private static final String[] y0;
    public static final String z = "android.media.metadata.COMPOSER";
    private static final String[] z0;
    public final Bundle A0;
    private Object B0;
    private MediaDescriptionCompat C0;

    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface BitmapKey {
    }

    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface LongKey {
    }

    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface RatingKey {
    }

    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface TextKey {
    }

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<MediaMetadataCompat> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    static {
        q7<String, Integer> q7Var = new q7<>();
        w0 = q7Var;
        q7Var.put(t, 1);
        q7Var.put(u, 1);
        q7Var.put(v, 0);
        q7Var.put(w, 1);
        q7Var.put(x, 1);
        q7Var.put(y, 1);
        q7Var.put(z, 1);
        q7Var.put(A, 1);
        q7Var.put(B, 1);
        q7Var.put(C, 0);
        q7Var.put(D, 1);
        q7Var.put(E, 0);
        q7Var.put(F, 0);
        q7Var.put(G, 0);
        q7Var.put(H, 1);
        q7Var.put(I, 2);
        q7Var.put(J, 1);
        q7Var.put(K, 2);
        q7Var.put(L, 1);
        q7Var.put(M, 3);
        q7Var.put(N, 3);
        q7Var.put(O, 1);
        q7Var.put(P, 1);
        q7Var.put(Q, 1);
        q7Var.put(R, 2);
        q7Var.put(S, 1);
        q7Var.put(T, 1);
        q7Var.put(V, 0);
        q7Var.put(U, 1);
        q7Var.put(W, 0);
        q7Var.put(X, 0);
        x0 = new String[]{t, u, w, H, y, x, z};
        y0 = new String[]{R, I, K};
        z0 = new String[]{S, J, L};
        CREATOR = new a();
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.A0 = bundle2;
        MediaSessionCompat.b(bundle2);
    }

    public static MediaMetadataCompat d(Object obj) {
        if (obj != null) {
            Parcel obtain = Parcel.obtain();
            MediaMetadataCompatApi21.g(obj, obtain, 0);
            obtain.setDataPosition(0);
            MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.B0 = obj;
            return createFromParcel;
        }
        return null;
    }

    public boolean c(String str) {
        return this.A0.containsKey(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bitmap e(String str) {
        try {
            return (Bitmap) this.A0.getParcelable(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public Bundle g() {
        return new Bundle(this.A0);
    }

    public MediaDescriptionCompat i() {
        Bitmap bitmap;
        Uri uri;
        MediaDescriptionCompat mediaDescriptionCompat = this.C0;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        String m = m(T);
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence n = n(O);
        if (TextUtils.isEmpty(n)) {
            int i = 0;
            int i2 = 0;
            while (i < 3) {
                String[] strArr = x0;
                if (i2 >= strArr.length) {
                    break;
                }
                int i3 = i2 + 1;
                CharSequence n2 = n(strArr[i2]);
                if (!TextUtils.isEmpty(n2)) {
                    charSequenceArr[i] = n2;
                    i++;
                }
                i2 = i3;
            }
        } else {
            charSequenceArr[0] = n;
            charSequenceArr[1] = n(P);
            charSequenceArr[2] = n(Q);
        }
        int i4 = 0;
        while (true) {
            String[] strArr2 = y0;
            if (i4 >= strArr2.length) {
                bitmap = null;
                break;
            }
            bitmap = e(strArr2[i4]);
            if (bitmap != null) {
                break;
            }
            i4++;
        }
        int i5 = 0;
        while (true) {
            String[] strArr3 = z0;
            if (i5 >= strArr3.length) {
                uri = null;
                break;
            }
            String m2 = m(strArr3[i5]);
            if (!TextUtils.isEmpty(m2)) {
                uri = Uri.parse(m2);
                break;
            }
            i5++;
        }
        String m3 = m(U);
        Uri parse = TextUtils.isEmpty(m3) ? null : Uri.parse(m3);
        MediaDescriptionCompat.Builder builder = new MediaDescriptionCompat.Builder();
        builder.f(m);
        builder.i(charSequenceArr[0]);
        builder.h(charSequenceArr[1]);
        builder.b(charSequenceArr[2]);
        builder.d(bitmap);
        builder.e(uri);
        builder.g(parse);
        Bundle bundle = new Bundle();
        if (this.A0.containsKey(V)) {
            bundle.putLong(MediaDescriptionCompat.s, j(V));
        }
        if (this.A0.containsKey(X)) {
            bundle.putLong(MediaDescriptionCompat.A, j(X));
        }
        if (!bundle.isEmpty()) {
            builder.c(bundle);
        }
        MediaDescriptionCompat a2 = builder.a();
        this.C0 = a2;
        return a2;
    }

    public long j(String str) {
        return this.A0.getLong(str, 0L);
    }

    public Object k() {
        if (this.B0 == null) {
            Parcel obtain = Parcel.obtain();
            writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            this.B0 = MediaMetadataCompatApi21.a(obtain);
            obtain.recycle();
        }
        return this.B0;
    }

    public RatingCompat l(String str) {
        try {
            return RatingCompat.c(this.A0.getParcelable(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public String m(String str) {
        CharSequence charSequence = this.A0.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public CharSequence n(String str) {
        return this.A0.getCharSequence(str);
    }

    public Set<String> o() {
        return this.A0.keySet();
    }

    public int p() {
        return this.A0.size();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.A0);
    }

    /* loaded from: classes.dex */
    public static final class Builder {
        private final Bundle a;

        public Builder() {
            this.a = new Bundle();
        }

        private Bitmap g(Bitmap bitmap, int i) {
            float f = i;
            float min = Math.min(f / bitmap.getWidth(), f / bitmap.getHeight());
            return Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
        }

        public MediaMetadataCompat a() {
            return new MediaMetadataCompat(this.a);
        }

        public Builder b(String str, Bitmap bitmap) {
            q7<String, Integer> q7Var = MediaMetadataCompat.w0;
            if (q7Var.containsKey(str) && q7Var.get(str).intValue() != 2) {
                throw new IllegalArgumentException(wo1.u("The ", str, " key cannot be used to put a Bitmap"));
            }
            this.a.putParcelable(str, bitmap);
            return this;
        }

        public Builder c(String str, long j) {
            q7<String, Integer> q7Var = MediaMetadataCompat.w0;
            if (q7Var.containsKey(str) && q7Var.get(str).intValue() != 0) {
                throw new IllegalArgumentException(wo1.u("The ", str, " key cannot be used to put a long"));
            }
            this.a.putLong(str, j);
            return this;
        }

        public Builder d(String str, RatingCompat ratingCompat) {
            q7<String, Integer> q7Var = MediaMetadataCompat.w0;
            if (q7Var.containsKey(str) && q7Var.get(str).intValue() != 3) {
                throw new IllegalArgumentException(wo1.u("The ", str, " key cannot be used to put a Rating"));
            }
            this.a.putParcelable(str, (Parcelable) ratingCompat.e());
            return this;
        }

        public Builder e(String str, String str2) {
            q7<String, Integer> q7Var = MediaMetadataCompat.w0;
            if (q7Var.containsKey(str) && q7Var.get(str).intValue() != 1) {
                throw new IllegalArgumentException(wo1.u("The ", str, " key cannot be used to put a String"));
            }
            this.a.putCharSequence(str, str2);
            return this;
        }

        public Builder f(String str, CharSequence charSequence) {
            q7<String, Integer> q7Var = MediaMetadataCompat.w0;
            if (q7Var.containsKey(str) && q7Var.get(str).intValue() != 1) {
                throw new IllegalArgumentException(wo1.u("The ", str, " key cannot be used to put a CharSequence"));
            }
            this.a.putCharSequence(str, charSequence);
            return this;
        }

        public Builder(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle = new Bundle(mediaMetadataCompat.A0);
            this.a = bundle;
            MediaSessionCompat.b(bundle);
        }

        @i2({i2.a.LIBRARY_GROUP})
        public Builder(MediaMetadataCompat mediaMetadataCompat, int i) {
            this(mediaMetadataCompat);
            for (String str : this.a.keySet()) {
                Object obj = this.a.get(str);
                if (obj instanceof Bitmap) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap.getHeight() > i || bitmap.getWidth() > i) {
                        b(str, g(bitmap, i));
                    }
                }
            }
        }
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.A0 = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }
}