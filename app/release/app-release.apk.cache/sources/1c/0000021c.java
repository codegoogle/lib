package androidx.media;

import com.p7700g.p99005.i2;
import com.p7700g.p99005.la0;

@i2({i2.a.LIBRARY})
/* loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(la0 la0Var) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.U = (AudioAttributesImpl) la0Var.h0(audioAttributesCompat.U, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, la0 la0Var) {
        la0Var.j0(false, false);
        la0Var.m1(audioAttributesCompat.U, 1);
    }
}