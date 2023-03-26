package androidx.media;

import android.media.AudioAttributes;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.la0;

@i2({i2.a.LIBRARY})
/* loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(la0 la0Var) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.c = (AudioAttributes) la0Var.W(audioAttributesImplApi21.c, 1);
        audioAttributesImplApi21.d = la0Var.M(audioAttributesImplApi21.d, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, la0 la0Var) {
        la0Var.j0(false, false);
        la0Var.X0(audioAttributesImplApi21.c, 1);
        la0Var.M0(audioAttributesImplApi21.d, 2);
    }
}