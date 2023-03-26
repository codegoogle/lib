package com.p7700g.p99005;

import android.media.VolumeProvider;

/* compiled from: VolumeProviderCompatApi21.java */
@e2(21)
/* loaded from: classes.dex */
public class d20 {

    /* compiled from: VolumeProviderCompatApi21.java */
    /* loaded from: classes.dex */
    public static class a extends VolumeProvider {
        public final /* synthetic */ b a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2, int i3, b bVar) {
            super(i, i2, i3);
            this.a = bVar;
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i) {
            this.a.b(i);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i) {
            this.a.a(i);
        }
    }

    /* compiled from: VolumeProviderCompatApi21.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(int i);

        void b(int i);
    }

    private d20() {
    }

    public static Object a(int i, int i2, int i3, b bVar) {
        return new a(i, i2, i3, bVar);
    }

    public static void b(Object obj, int i) {
        ((VolumeProvider) obj).setCurrentVolume(i);
    }
}