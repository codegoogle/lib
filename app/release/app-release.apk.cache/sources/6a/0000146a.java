package com.facebook.ads.redexgen.X;

import android.bluetooth.BluetoothAdapter;

/* loaded from: assets/audience_network.dex */
public class UU implements InterfaceC04416i {
    public final /* synthetic */ UX A00;

    public UU(UX ux) {
        this.A00 = ux;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        BluetoothAdapter bluetoothAdapter;
        BluetoothAdapter bluetoothAdapter2;
        bluetoothAdapter = this.A00.A00;
        if (bluetoothAdapter == null) {
            return this.A00.A08(EnumC04526t.A06);
        }
        UX ux = this.A00;
        bluetoothAdapter2 = ux.A00;
        return ux.A09(bluetoothAdapter2.getName());
    }
}