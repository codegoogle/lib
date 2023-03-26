package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.la0;

@i2({i2.a.LIBRARY})
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(la0 la0Var) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.x = la0Var.M(iconCompat.x, 1);
        iconCompat.z = la0Var.t(iconCompat.z, 2);
        iconCompat.A = la0Var.W(iconCompat.A, 3);
        iconCompat.B = la0Var.M(iconCompat.B, 4);
        iconCompat.C = la0Var.M(iconCompat.C, 5);
        iconCompat.D = (ColorStateList) la0Var.W(iconCompat.D, 6);
        iconCompat.F = la0Var.d0(iconCompat.F, 7);
        iconCompat.G = la0Var.d0(iconCompat.G, 8);
        iconCompat.h();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, la0 la0Var) {
        la0Var.j0(true, true);
        iconCompat.i(la0Var.i());
        int i = iconCompat.x;
        if (-1 != i) {
            la0Var.M0(i, 1);
        }
        byte[] bArr = iconCompat.z;
        if (bArr != null) {
            la0Var.u0(bArr, 2);
        }
        Parcelable parcelable = iconCompat.A;
        if (parcelable != null) {
            la0Var.X0(parcelable, 3);
        }
        int i2 = iconCompat.B;
        if (i2 != 0) {
            la0Var.M0(i2, 4);
        }
        int i3 = iconCompat.C;
        if (i3 != 0) {
            la0Var.M0(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.D;
        if (colorStateList != null) {
            la0Var.X0(colorStateList, 6);
        }
        String str = iconCompat.F;
        if (str != null) {
            la0Var.f1(str, 7);
        }
        String str2 = iconCompat.G;
        if (str2 != null) {
            la0Var.f1(str2, 8);
        }
    }
}