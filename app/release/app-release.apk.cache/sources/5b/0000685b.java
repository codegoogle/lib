package com.p7700g.p99005;

import android.content.Context;
import android.media.session.MediaSessionManager;
import com.p7700g.p99005.x10;

/* compiled from: MediaSessionManagerImplApi28.java */
@e2(28)
/* loaded from: classes.dex */
public class z10 extends y10 {
    public MediaSessionManager h;

    public z10(Context context) {
        super(context);
        this.h = (MediaSessionManager) context.getSystemService("media_session");
    }

    @Override // com.p7700g.p99005.y10, com.p7700g.p99005.a20, com.p7700g.p99005.x10.a
    public boolean a(x10.c cVar) {
        if (cVar instanceof a) {
            return this.h.isTrustedForMediaControl(((a) cVar).a);
        }
        return false;
    }

    /* compiled from: MediaSessionManagerImplApi28.java */
    /* loaded from: classes.dex */
    public static final class a implements x10.c {
        public final MediaSessionManager.RemoteUserInfo a;

        public a(String str, int i, int i2) {
            this.a = new MediaSessionManager.RemoteUserInfo(str, i, i2);
        }

        @Override // com.p7700g.p99005.x10.c
        public int a() {
            return this.a.getUid();
        }

        @Override // com.p7700g.p99005.x10.c
        public int b() {
            return this.a.getPid();
        }

        @Override // com.p7700g.p99005.x10.c
        public String e() {
            return this.a.getPackageName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.a.equals(((a) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return ep.b(this.a);
        }

        public a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            this.a = remoteUserInfo;
        }
    }
}