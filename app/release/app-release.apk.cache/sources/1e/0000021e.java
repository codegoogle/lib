package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@TargetApi(21)
/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {
    private static final String a = "AudioAttributesCompat21";
    public static Method b;
    public AudioAttributes c;
    public int d;

    public AudioAttributesImplApi21() {
        this.d = -1;
    }

    public static AudioAttributesImpl h(Bundle bundle) {
        AudioAttributes audioAttributes;
        if (bundle == null || (audioAttributes = (AudioAttributes) bundle.getParcelable(AudioAttributesCompat.P)) == null) {
            return null;
        }
        return new AudioAttributesImplApi21(audioAttributes, bundle.getInt(AudioAttributesCompat.T, -1));
    }

    public static Method i() {
        try {
            if (b == null) {
                b = AudioAttributes.class.getMethod("toLegacyStreamType", AudioAttributes.class);
            }
            return b;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // androidx.media.AudioAttributesImpl
    public int a() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        Method i2 = i();
        if (i2 == null) {
            return -1;
        }
        try {
            return ((Integer) i2.invoke(null, this.c)).intValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return -1;
        }
    }

    @Override // androidx.media.AudioAttributesImpl
    public int b() {
        return this.d;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int c() {
        return this.c.getFlags();
    }

    @Override // androidx.media.AudioAttributesImpl
    public int d() {
        return this.c.getUsage();
    }

    @Override // androidx.media.AudioAttributesImpl
    public Object e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.c.equals(((AudioAttributesImplApi21) obj).c);
        }
        return false;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int f() {
        return this.c.getContentType();
    }

    @Override // androidx.media.AudioAttributesImpl
    public int g() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.c.getVolumeControlStream();
        }
        return AudioAttributesCompat.j(true, c(), d());
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    @Override // androidx.media.AudioAttributesImpl
    @x1
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(AudioAttributesCompat.P, this.c);
        int i = this.d;
        if (i != -1) {
            bundle.putInt(AudioAttributesCompat.T, i);
        }
        return bundle;
    }

    public String toString() {
        StringBuilder G = wo1.G("AudioAttributesCompat: audioattributes=");
        G.append(this.c);
        return G.toString();
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int i) {
        this.d = -1;
        this.c = audioAttributes;
        this.d = i;
    }
}