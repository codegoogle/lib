package android.support.v4.media;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.wo1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    private static final float A = -1.0f;
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();
    private static final String s = "Rating";
    public static final int t = 0;
    public static final int u = 1;
    public static final int v = 2;
    public static final int w = 3;
    public static final int x = 4;
    public static final int y = 5;
    public static final int z = 6;
    private final int B;
    private final float C;
    private Object D;

    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface StarStyle {
    }

    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Style {
    }

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<RatingCompat> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    public RatingCompat(int i, float f) {
        this.B = i;
        this.C = f;
    }

    public static RatingCompat c(Object obj) {
        RatingCompat ratingCompat = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                        ratingCompat = m(rating.hasHeart());
                        break;
                    case 2:
                        ratingCompat = p(rating.isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat = o(ratingStyle, rating.getStarRating());
                        break;
                    case 6:
                        ratingCompat = n(rating.getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompat = q(ratingStyle);
            }
            ratingCompat.D = obj;
        }
        return ratingCompat;
    }

    public static RatingCompat m(boolean z2) {
        return new RatingCompat(1, z2 ? 1.0f : 0.0f);
    }

    public static RatingCompat n(float f) {
        if (f < 0.0f || f > 100.0f) {
            return null;
        }
        return new RatingCompat(6, f);
    }

    public static RatingCompat o(int i, float f) {
        float f2;
        if (i == 3) {
            f2 = 3.0f;
        } else if (i == 4) {
            f2 = 4.0f;
        } else if (i != 5) {
            return null;
        } else {
            f2 = 5.0f;
        }
        if (f < 0.0f || f > f2) {
            return null;
        }
        return new RatingCompat(i, f);
    }

    public static RatingCompat p(boolean z2) {
        return new RatingCompat(2, z2 ? 1.0f : 0.0f);
    }

    public static RatingCompat q(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i, -1.0f);
            default:
                return null;
        }
    }

    public float d() {
        if (this.B == 6 && k()) {
            return this.C;
        }
        return -1.0f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.B;
    }

    public Object e() {
        if (this.D == null) {
            if (k()) {
                int i = this.B;
                switch (i) {
                    case 1:
                        this.D = Rating.newHeartRating(j());
                        break;
                    case 2:
                        this.D = Rating.newThumbRating(l());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        this.D = Rating.newStarRating(i, i());
                        break;
                    case 6:
                        this.D = Rating.newPercentageRating(d());
                        break;
                    default:
                        return null;
                }
            } else {
                this.D = Rating.newUnratedRating(this.B);
            }
        }
        return this.D;
    }

    public int g() {
        return this.B;
    }

    public float i() {
        int i = this.B;
        if ((i == 3 || i == 4 || i == 5) && k()) {
            return this.C;
        }
        return -1.0f;
    }

    public boolean j() {
        return this.B == 1 && this.C == 1.0f;
    }

    public boolean k() {
        return this.C >= 0.0f;
    }

    public boolean l() {
        return this.B == 2 && this.C == 1.0f;
    }

    public String toString() {
        StringBuilder G = wo1.G("Rating:style=");
        G.append(this.B);
        G.append(" rating=");
        float f = this.C;
        G.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.B);
        parcel.writeFloat(this.C);
    }
}