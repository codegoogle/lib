package androidx.media;

import com.p7700g.p99005.i2;
import com.p7700g.p99005.la0;

@i2({i2.a.LIBRARY})
/* loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(la0 la0Var) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = la0Var.M(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = la0Var.M(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = la0Var.M(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = la0Var.M(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, la0 la0Var) {
        la0Var.j0(false, false);
        la0Var.M0(audioAttributesImplBase.a, 1);
        la0Var.M0(audioAttributesImplBase.b, 2);
        la0Var.M0(audioAttributesImplBase.c, 3);
        la0Var.M0(audioAttributesImplBase.d, 4);
    }
}