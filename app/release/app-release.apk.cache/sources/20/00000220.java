package androidx.media;

import android.os.Bundle;
import com.p7700g.p99005.x1;
import java.util.Arrays;

/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {
    public int a;
    public int b;
    public int c;
    public int d;

    public AudioAttributesImplBase() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = -1;
    }

    public static AudioAttributesImpl h(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new AudioAttributesImplBase(bundle.getInt(AudioAttributesCompat.R, 0), bundle.getInt(AudioAttributesCompat.S, 0), bundle.getInt(AudioAttributesCompat.Q, 0), bundle.getInt(AudioAttributesCompat.T, -1));
    }

    @Override // androidx.media.AudioAttributesImpl
    public int a() {
        int i = this.d;
        return i != -1 ? i : AudioAttributesCompat.j(false, this.c, this.a);
    }

    @Override // androidx.media.AudioAttributesImpl
    public int b() {
        return this.d;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int c() {
        int i = this.c;
        int a = a();
        if (a == 6) {
            i |= 4;
        } else if (a == 7) {
            i |= 1;
        }
        return i & AudioAttributesCompat.N;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int d() {
        return this.a;
    }

    @Override // androidx.media.AudioAttributesImpl
    public Object e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplBase) {
            AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
            return this.b == audioAttributesImplBase.f() && this.c == audioAttributesImplBase.c() && this.a == audioAttributesImplBase.d() && this.d == audioAttributesImplBase.d;
        }
        return false;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int f() {
        return this.b;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int g() {
        return AudioAttributesCompat.j(true, this.c, this.a);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.a), Integer.valueOf(this.d)});
    }

    @Override // androidx.media.AudioAttributesImpl
    @x1
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(AudioAttributesCompat.Q, this.a);
        bundle.putInt(AudioAttributesCompat.R, this.b);
        bundle.putInt(AudioAttributesCompat.S, this.c);
        int i = this.d;
        if (i != -1) {
            bundle.putInt(AudioAttributesCompat.T, i);
        }
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.d != -1) {
            sb.append(" stream=");
            sb.append(this.d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.n(this.a));
        sb.append(" content=");
        sb.append(this.b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.c).toUpperCase());
        return sb.toString();
    }

    public AudioAttributesImplBase(int i, int i2, int i3, int i4) {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = -1;
        this.b = i;
        this.c = i2;
        this.a = i3;
        this.d = i4;
    }
}