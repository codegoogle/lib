package com.anchorfree.vpnsdk.vpnservice.credentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.p7700g.p99005.bc1;
import com.p7700g.p99005.en1;
import com.p7700g.p99005.gc1;
import com.p7700g.p99005.jo1;
import com.p7700g.p99005.pe1;
import com.p7700g.p99005.ve1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.xu0;
import com.p7700g.p99005.z1;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class AutoTransportSwitcher implements jo1 {
    private static final String a = "transport_index";
    @x1
    private List<String> b = Collections.emptyList();

    /* loaded from: classes2.dex */
    public static class SwitchTransportOnErrorHandler extends pe1 {
        public static final Parcelable.Creator<SwitchTransportOnErrorHandler> CREATOR = new a();

        /* loaded from: classes2.dex */
        public class a implements Parcelable.Creator<SwitchTransportOnErrorHandler> {
            @Override // android.os.Parcelable.Creator
            @x1
            /* renamed from: a */
            public SwitchTransportOnErrorHandler createFromParcel(@x1 Parcel parcel) {
                return new SwitchTransportOnErrorHandler(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @x1
            /* renamed from: b */
            public SwitchTransportOnErrorHandler[] newArray(int i) {
                return new SwitchTransportOnErrorHandler[i];
            }
        }

        private boolean k(@x1 en1 en1Var) {
            return en1Var == en1.CONNECTING_VPN || en1Var == en1.CONNECTING_CREDENTIALS || en1Var == en1.CONNECTING_PERMISSIONS;
        }

        @Override // com.p7700g.p99005.pe1
        public boolean d(@x1 ve1 ve1Var, @x1 gc1 gc1Var, @x1 en1 en1Var, int i) {
            return super.d(ve1Var, gc1Var, en1Var, i) && k(en1Var) && !(gc1Var instanceof bc1);
        }

        @Override // com.p7700g.p99005.pe1
        public void g(@x1 ve1 ve1Var, @x1 gc1 gc1Var, int i) {
            Bundle d = ve1Var.d();
            Bundle bundle = new Bundle();
            bundle.putAll(d);
            bundle.putInt(AutoTransportSwitcher.a, d.getInt(AutoTransportSwitcher.a, 0) + 1);
            e().K(ve1Var.l(bundle), xu0.e.g);
        }

        public SwitchTransportOnErrorHandler(int i) {
            super(i);
        }

        private SwitchTransportOnErrorHandler(@x1 Parcel parcel) {
            super(parcel);
        }
    }

    @Override // com.p7700g.p99005.jo1
    @z1
    public String a(@x1 Bundle bundle) {
        int i = bundle.getInt(a, 0);
        List<String> list = this.b;
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public void b(@x1 List<String> list) {
        this.b = Collections.unmodifiableList(list);
    }
}