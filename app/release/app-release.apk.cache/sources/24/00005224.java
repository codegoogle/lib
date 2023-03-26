package com.p7700g.p99005;

import android.view.ViewGroup;
import com.greedygame.mystique2.models.MediationType;
import com.greedygame.mystique2.models.Template;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface nd3 {
    @NotNull
    public static final a b = a.a;

    /* loaded from: classes3.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();

        /* renamed from: com.p7700g.p99005.nd3$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C0219a {
            public static final /* synthetic */ int[] a;

            static {
                MediationType.values();
                int[] iArr = new int[6];
                iArr[MediationType.ADMOB.ordinal()] = 1;
                iArr[MediationType.FACEBOOK.ordinal()] = 2;
                iArr[MediationType.MOPUB.ordinal()] = 3;
                iArr[MediationType.S2S.ordinal()] = 4;
                a = iArr;
            }
        }

        private a() {
        }

        @Nullable
        public final nd3 a(@NotNull Template template, @NotNull MediationType mediationType) {
            c25.p(template, "template");
            c25.p(mediationType, "mediationType");
            if (c25.g(template.getImpression(), Boolean.FALSE)) {
                return null;
            }
            int i = C0219a.a[mediationType.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return new pd3();
                    }
                    return new od3(template);
                }
                return new md3(template);
            }
            return new kd3(template);
        }
    }

    @Nullable
    ViewGroup b(@NotNull ViewGroup viewGroup);
}