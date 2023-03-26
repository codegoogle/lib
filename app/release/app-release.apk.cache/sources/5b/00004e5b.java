package com.p7700g.p99005;

import android.view.ViewGroup;
import com.greedygame.mystique2.models.MediationType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface ld3 {
    @NotNull
    public static final a a = a.a;

    /* loaded from: classes3.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();

        /* renamed from: com.p7700g.p99005.ld3$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C0210a {
            public static final /* synthetic */ int[] a;

            static {
                MediationType.values();
                int[] iArr = new int[6];
                iArr[MediationType.ADMOB.ordinal()] = 1;
                iArr[MediationType.FACEBOOK.ordinal()] = 2;
                iArr[MediationType.S2S.ordinal()] = 3;
                a = iArr;
            }
        }

        private a() {
        }

        @Nullable
        public final ld3 a(@NotNull MediationType mediationType) {
            ld3 kd3Var;
            c25.p(mediationType, "mediationType");
            int i = C0210a.a[mediationType.ordinal()];
            if (i == 1) {
                kd3Var = new kd3(null, 1, null);
            } else if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return new pd3();
            } else {
                kd3Var = new md3(null, 1, null);
            }
            return kd3Var;
        }
    }

    @Nullable
    ViewGroup a(@NotNull ViewGroup viewGroup);
}