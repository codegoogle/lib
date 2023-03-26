package com.facebook.ads.redexgen.X;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import java.util.ArrayList;

/* loaded from: assets/audience_network.dex */
public class UV implements InterfaceC04416i {
    public final /* synthetic */ UX A00;

    public UV(UX ux) {
        this.A00 = ux;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() throws Exception {
        BluetoothAdapter bluetoothAdapter;
        BluetoothAdapter bluetoothAdapter2;
        bluetoothAdapter = this.A00.A00;
        if (bluetoothAdapter == null) {
            return this.A00.A08(EnumC04526t.A06);
        }
        bluetoothAdapter2 = this.A00.A00;
        ArrayList arrayList = new ArrayList();
        for (BluetoothDevice bluetoothDevice : bluetoothAdapter2.getBondedDevices()) {
            arrayList.add(new UW(bluetoothDevice));
        }
        return this.A00.A0E(arrayList);
    }
}