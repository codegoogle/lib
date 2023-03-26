package androidx.media;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseIntArray;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.oa0;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class AudioAttributesCompat implements oa0 {
    public static boolean A = false;
    private static final int[] B;
    public static final int C = 1;
    public static final int D = 2;
    public static final int E = 4;
    public static final int F = 8;
    public static final int G = 16;
    public static final int H = 32;
    public static final int I = 64;
    public static final int J = 128;
    public static final int K = 256;
    public static final int L = 512;
    public static final int M = 1023;
    public static final int N = 273;
    public static final int O = -1;
    public static final String P = "androidx.media.audio_attrs.FRAMEWORKS";
    public static final String Q = "androidx.media.audio_attrs.USAGE";
    public static final String R = "androidx.media.audio_attrs.CONTENT_TYPE";
    public static final String S = "androidx.media.audio_attrs.FLAGS";
    public static final String T = "androidx.media.audio_attrs.LEGACY_STREAM_TYPE";
    private static final String a = "AudioAttributesCompat";
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    public static final int k = 4;
    public static final int l = 5;
    public static final int m = 6;
    public static final int n = 7;
    public static final int o = 8;
    public static final int p = 9;
    public static final int q = 10;
    public static final int r = 11;
    public static final int s = 12;
    public static final int t = 13;
    public static final int u = 14;
    private static final int v = 15;
    public static final int w = 16;
    private static final int x = 1;
    private static final int y = 2;
    private static final SparseIntArray z;
    public AudioAttributesImpl U;

    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public static final int a = 6;
        public static final int b = 7;
        public static final int c = 9;
        public static final int d = 10;

        private c() {
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        z = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
        B = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    public AudioAttributesCompat() {
    }

    @i2({i2.a.LIBRARY_GROUP})
    public static AudioAttributesCompat h(Bundle bundle) {
        AudioAttributesImpl h2 = AudioAttributesImplApi21.h(bundle);
        if (h2 == null) {
            return null;
        }
        return new AudioAttributesCompat(h2);
    }

    @i2({i2.a.LIBRARY_GROUP})
    public static void i(boolean z2) {
        A = z2;
    }

    public static int j(boolean z2, int i2, int i3) {
        if ((i2 & 1) == 1) {
            return z2 ? 1 : 7;
        } else if ((i2 & 4) == 4) {
            return z2 ? 0 : 6;
        } else {
            switch (i3) {
                case 0:
                    return z2 ? Integer.MIN_VALUE : 3;
                case 1:
                case 12:
                case 14:
                case 16:
                    return 3;
                case 2:
                    return 0;
                case 3:
                    return z2 ? 0 : 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                case 11:
                    return 10;
                case 13:
                    return 1;
                case 15:
                default:
                    if (z2) {
                        throw new IllegalArgumentException(wo1.n("Unknown usage value ", i3, " in audio attributes"));
                    }
                    return 3;
            }
        }
    }

    public static int k(boolean z2, AudioAttributesCompat audioAttributesCompat) {
        return j(z2, audioAttributesCompat.c(), audioAttributesCompat.d());
    }

    public static int m(int i2) {
        switch (i2) {
            case 0:
                return 2;
            case 1:
            case 7:
                return 13;
            case 2:
                return 6;
            case 3:
                return 1;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 2;
            case 8:
                return 3;
            case 9:
            default:
                return 0;
            case 10:
                return 11;
        }
    }

    public static String n(int i2) {
        switch (i2) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 15:
            default:
                return wo1.l("unknown usage ", i2);
            case 16:
                return "USAGE_ASSISTANT";
        }
    }

    @z1
    public static AudioAttributesCompat o(@x1 Object obj) {
        if (A) {
            return null;
        }
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21((AudioAttributes) obj);
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.U = audioAttributesImplApi21;
        return audioAttributesCompat;
    }

    public int a() {
        return this.U.a();
    }

    public int b() {
        return this.U.b();
    }

    public int c() {
        return this.U.c();
    }

    public int d() {
        return this.U.d();
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesCompat) {
            AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
            AudioAttributesImpl audioAttributesImpl = this.U;
            if (audioAttributesImpl == null) {
                return audioAttributesCompat.U == null;
            }
            return audioAttributesImpl.equals(audioAttributesCompat.U);
        }
        return false;
    }

    public int f() {
        return this.U.f();
    }

    public int g() {
        return this.U.g();
    }

    public int hashCode() {
        return this.U.hashCode();
    }

    @z1
    public Object l() {
        return this.U.e();
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public Bundle toBundle() {
        return this.U.toBundle();
    }

    public String toString() {
        return this.U.toString();
    }

    public AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.U = audioAttributesImpl;
    }

    /* loaded from: classes.dex */
    public static class d {
        private int a;
        private int b;
        private int c;
        private int d;

        public d() {
            this.a = 0;
            this.b = 0;
            this.c = 0;
            this.d = -1;
        }

        public AudioAttributesCompat a() {
            AudioAttributesImpl audioAttributesImplBase;
            if (!AudioAttributesCompat.A) {
                AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.b).setFlags(this.c).setUsage(this.a);
                int i = this.d;
                if (i != -1) {
                    usage.setLegacyStreamType(i);
                }
                audioAttributesImplBase = new AudioAttributesImplApi21(usage.build(), this.d);
            } else {
                audioAttributesImplBase = new AudioAttributesImplBase(this.b, this.c, this.a, this.d);
            }
            return new AudioAttributesCompat(audioAttributesImplBase);
        }

        public d b(int i) {
            if (i != 0 && i != 1 && i != 2 && i != 3 && i != 4) {
                this.a = 0;
            } else {
                this.b = i;
            }
            return this;
        }

        public d c(int i) {
            this.c = (i & 1023) | this.c;
            return this;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public d d(int i) {
            switch (i) {
                case 0:
                    this.b = 1;
                    break;
                case 1:
                    this.b = 4;
                    break;
                case 2:
                    this.b = 4;
                    break;
                case 3:
                    this.b = 2;
                    break;
                case 4:
                    this.b = 4;
                    break;
                case 5:
                    this.b = 4;
                    break;
                case 6:
                    this.b = 1;
                    this.c |= 4;
                    break;
                case 7:
                    this.c = 1 | this.c;
                    this.b = 4;
                    break;
                case 8:
                    this.b = 4;
                    break;
                case 9:
                    this.b = 4;
                    break;
                case 10:
                    this.b = 1;
                    break;
            }
            this.a = AudioAttributesCompat.m(i);
            return this;
        }

        public d e(int i) {
            if (i != 10) {
                this.d = i;
                return d(i);
            }
            throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
        }

        public d f(int i) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    this.a = i;
                    break;
                case 16:
                    if (!AudioAttributesCompat.A && Build.VERSION.SDK_INT > 25) {
                        this.a = i;
                        break;
                    } else {
                        this.a = 12;
                        break;
                    }
                default:
                    this.a = 0;
                    break;
            }
            return this;
        }

        public d(AudioAttributesCompat audioAttributesCompat) {
            this.a = 0;
            this.b = 0;
            this.c = 0;
            this.d = -1;
            this.a = audioAttributesCompat.d();
            this.b = audioAttributesCompat.f();
            this.c = audioAttributesCompat.c();
            this.d = audioAttributesCompat.b();
        }
    }
}