package com.facebook.ads.redexgen.X;

import android.media.AudioManager;
import android.os.Build;
import java.util.HashMap;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class UC implements InterfaceC04416i {
    public static String[] A02;
    public final /* synthetic */ UE A00;
    public final /* synthetic */ List A01;

    static {
        A00();
    }

    public static void A00() {
        A02 = new String[]{"8IgbQbzIeG7tuzbPw4WpTReJHEXOOBaI", "uwr3gwrpCwnsdPI6tcqzo06z5LPFYArK", "KUvtzgiNenvKoXYdIGr4T", "ebtfEWeeh2etvFgGs478sf7cOArxhZcn", "MQ8ux5tmWncWP0t9wyLsU5JzQOIFN", "7dBSxWLu4PAR6eol7PDhhjCLapQyD", "DfYXUN1CCnyCs44nd3kIcNIJOWqVY6eS", "5gEsKmvQZ2K3SsZVO0OSc0798tOlDhoK"};
    }

    public UC(UE ue, List list) {
        this.A00 = ue;
        this.A01 = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC04566x A50() {
        AbstractC04566x A03;
        C04406h c04406h;
        int streamKey;
        AudioManager audioManager;
        AudioManager audioManager2;
        AudioManager audioManager3;
        HashMap hashMap = new HashMap();
        int i = 0;
        while (true) {
            List list = this.A01;
            if (A02[2].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[7] = "wkxUGDPvutXhqdGlSbbbG0nh4qVsuIhH";
            strArr[1] = "9se0a2PCPvuNc9uYSGqMP0X6BOz38YUy";
            if (i < list.size()) {
                List list2 = this.A01;
                String[] strArr2 = A02;
                if (strArr2[5].length() != strArr2[4].length()) {
                    String[] strArr3 = A02;
                    strArr3[7] = "w6bkI8mcFJbdIq2JUa0cw0U5M6INIj0g";
                    strArr3[1] = "5vzP4JEpPTq7RU19xyhl907HqVfLv1o1";
                    c04406h = (C04406h) list2.get(i);
                    if (!c04406h.A02()) {
                        i++;
                    }
                    int intValue = ((Integer) c04406h.A01()).intValue();
                    if (Build.VERSION.SDK_INT >= 28) {
                        streamKey = -1;
                    } else {
                        audioManager3 = this.A00.A00;
                        streamKey = audioManager3.getStreamMinVolume(intValue);
                    }
                    audioManager = this.A00.A00;
                    int streamVolume = audioManager.getStreamVolume(intValue);
                    audioManager2 = this.A00.A00;
                    int currentVolume = audioManager2.getStreamMaxVolume(intValue);
                    UD audioStreamVolume = new UD(streamKey, streamVolume, currentVolume);
                    hashMap.put(Integer.valueOf(intValue), audioStreamVolume);
                    i++;
                } else {
                    String[] strArr4 = A02;
                    strArr4[0] = "CIZgFD3PxrctzWhUemjZg0F42IFR8Khz";
                    strArr4[3] = "vl3ScUwT7Dxtepa46leMofObvUClFSdC";
                    c04406h = (C04406h) list2.get(i);
                    if (!c04406h.A02()) {
                        i++;
                    }
                    int intValue2 = ((Integer) c04406h.A01()).intValue();
                    if (Build.VERSION.SDK_INT >= 28) {
                    }
                    audioManager = this.A00.A00;
                    int streamVolume2 = audioManager.getStreamVolume(intValue2);
                    audioManager2 = this.A00.A00;
                    int currentVolume2 = audioManager2.getStreamMaxVolume(intValue2);
                    UD audioStreamVolume2 = new UD(streamKey, streamVolume2, currentVolume2);
                    hashMap.put(Integer.valueOf(intValue2), audioStreamVolume2);
                    i++;
                }
            } else {
                A03 = this.A00.A03(hashMap);
                return A03;
            }
        }
    }
}