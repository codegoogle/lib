package com.facebook.ads.redexgen.X;

import android.view.Surface;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.checkerframework.checker.nullness.qual.MonotonicNonNull;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.facebook.ads.redexgen.X.Xj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1108Xj implements AS, E1, BB, J4, FW, HG, Bs {
    public static String[] A05;
    @MonotonicNonNull
    public AX A00;
    public final I4 A03;
    public final CopyOnWriteArraySet<InterfaceC0541Ao> A04 = new CopyOnWriteArraySet<>();
    public final C0538Al A02 = new C0538Al();
    public final C0535Ai A01 = new C0535Ai();

    static {
        A06();
    }

    public static void A06() {
        A05 = new String[]{"oWxliEG", "84CCzfJSWHAMzlT", "dVPYU5AFfnLld9", "202VfNqPV04zLFr42xUQnFXcv", "6C2OHs0d6U2aNpx0mThNdUqCMJf7H", "j36hHuSQknS9Y2BeP2DWP06EygcBzL55", "WN9koNHhTr4SbLKtJDKTY2JTPC", "f2Eog"};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:202)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:124)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:564)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.HG
    public final void A90(int i, long j, long j2) {
        A01();
        Iterator<InterfaceC0541Ao> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public C1108Xj(@Nullable AX ax, I4 i4) {
        this.A00 = ax;
        this.A03 = (I4) I1.A01(i4);
    }

    private C0540An A00() {
        return A05(this.A02.A04());
    }

    private C0540An A01() {
        return A05(this.A02.A05());
    }

    private C0540An A02() {
        return A05(this.A02.A06());
    }

    private C0540An A03() {
        return A05(this.A02.A07());
    }

    private final C0540An A04(int i, @Nullable FG fg) {
        long j;
        I1.A01(this.A00);
        long A4r = this.A03.A4r();
        AbstractC0536Aj timeline = this.A00.A5v();
        if (i == this.A00.A5w()) {
            if (fg != null && fg.A02()) {
                if (this.A00.A5q() == fg.A00 && this.A00.A5r() == fg.A01) {
                    j = this.A00.A5t();
                } else {
                    j = 0;
                }
            } else {
                j = this.A00.A5o();
            }
        } else if (i >= timeline.A02() || (fg != null && fg.A02())) {
            j = 0;
        } else {
            j = timeline.A0C(i, this.A01).A00();
        }
        return new C0540An(A4r, timeline, i, fg, j, this.A00.A5t(), this.A00.A5X() - this.A00.A5o());
    }

    private C0540An A05(@Nullable C0539Am c0539Am) {
        if (c0539Am == null) {
            int A5w = ((AX) I1.A01(this.A00)).A5w();
            return A04(A5w, this.A02.A08(A5w));
        }
        return A04(c0539Am.A00, c0539Am.A01);
    }

    public final void A07() {
        if (!this.A02.A0G()) {
            C0540An A02 = A02();
            this.A02.A0A();
            Iterator<InterfaceC0541Ao> it = this.A04.iterator();
            while (it.hasNext()) {
                InterfaceC0541Ao next = it.next();
                String[] strArr = A05;
                if (strArr[1].length() == strArr[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A05;
                strArr2[1] = "PBkwxeOlbvYzAOz";
                strArr2[4] = "zMCnce58Qhbdr93RoMzV7EOLVlkYq";
                next.onSeekStarted(A02);
            }
        }
    }

    public final void A08() {
        ArrayList arrayList;
        arrayList = this.A02.A05;
        Iterator it = new ArrayList(arrayList).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A05;
            if (strArr[1].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[0] = "gG2PlvUwOW39eC8R";
            strArr2[0] = "gG2PlvUwOW39eC8R";
            if (hasNext) {
                C0539Am mediaPeriod = (C0539Am) it.next();
                AAB(mediaPeriod.A00, mediaPeriod.A01);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.BB
    public final void A8u(String str, long j, long j2) {
        C0540An eventTime = A03();
        Iterator<InterfaceC0541Ao> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInitialized(eventTime, 1, str, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BB
    public final void A8v(C0557Be c0557Be) {
        C0540An A00 = A00();
        Iterator<InterfaceC0541Ao> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderDisabled(A00, 1, c0557Be);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BB
    public final void A8w(C0557Be c0557Be) {
        C0540An A02 = A02();
        Iterator<InterfaceC0541Ao> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderEnabled(A02, 1, c0557Be);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BB
    public final void A8x(Format format) {
        C0540An A03 = A03();
        Iterator<InterfaceC0541Ao> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInputFormatChanged(A03, 1, format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BB
    public final void A8y(int i) {
        C0540An A03 = A03();
        Iterator<InterfaceC0541Ao> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onAudioSessionId(A03, i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BB
    public final void A8z(int i, long j, long j2) {
        C0540An A03 = A03();
        Iterator<InterfaceC0541Ao> it = this.A04.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A05[2].length() == 13) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[1] = "uqo4gq1KBxiMktN";
            strArr[4] = "Ndm2ibG2UK8Su1apjnSt0jhcojAUZ";
            if (hasNext) {
                it.next().onAudioUnderrun(A03, i, j, j2);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.FW
    public final void A9O(int i, @Nullable FG fg, FV fv) {
        C0540An A04 = A04(i, fg);
        Iterator<InterfaceC0541Ao> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDownstreamFormatChanged(A04, fv);
        }
    }

    @Override // com.facebook.ads.redexgen.X.Bs
    public final void A9P() {
        C0540An A03 = A03();
        Iterator<InterfaceC0541Ao> it = this.A04.iterator();
        while (it.hasNext()) {
            InterfaceC0541Ao listener = it.next();
            listener.onDrmKeysLoaded(A03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.Bs
    public final void A9Q() {
        C0540An A03 = A03();
        Iterator<InterfaceC0541Ao> it = this.A04.iterator();
        while (it.hasNext()) {
            InterfaceC0541Ao listener = it.next();
            listener.onDrmKeysRemoved(A03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.Bs
    public final void A9R() {
        C0540An A03 = A03();
        Iterator<InterfaceC0541Ao> it = this.A04.iterator();
        while (it.hasNext()) {
            InterfaceC0541Ao listener = it.next();
            listener.onDrmKeysRestored(A03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.Bs
    public final void A9S(Exception exc) {
        C0540An A03 = A03();
        Iterator<InterfaceC0541Ao> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDrmSessionManagerError(A03, exc);
        }
    }

    @Override // com.facebook.ads.redexgen.X.J4
    public final void A9T(int i, long j) {
        C0540An A00 = A00();
        Iterator<InterfaceC0541Ao> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDroppedVideoFrames(A00, i, j);
        }
    }

    @Override // com.facebook.ads.redexgen.X.FW
    public final void A9w(int i, @Nullable FG fg, FU fu, FV fv) {
        A04(i, fg);
        Iterator<InterfaceC0541Ao> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.facebook.ads.redexgen.X.FW
    public final void A9y(int i, @Nullable FG fg, FU fu, FV fv) {
        A04(i, fg);
        Iterator<InterfaceC0541Ao> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.facebook.ads.redexgen.X.FW
    public final void AA1(int i, @Nullable FG fg, FU fu, FV fv, IOException iOException, boolean z) {
        C0540An A04 = A04(i, fg);
        Iterator<InterfaceC0541Ao> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onLoadError(A04, fu, fv, iOException, z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.FW
    public final void AA3(int i, @Nullable FG fg, FU fu, FV fv) {
        A04(i, fg);
        Iterator<InterfaceC0541Ao> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final void AA5(boolean z) {
        C0540An A02 = A02();
        Iterator<InterfaceC0541Ao> it = this.A04.iterator();
        while (it.hasNext()) {
            InterfaceC0541Ao next = it.next();
            if (A05[2].length() == 13) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[5] = "61iKEbH7Elk598B8IvoVeyiFcghmzjBq";
            strArr[5] = "61iKEbH7Elk598B8IvoVeyiFcghmzjBq";
            next.onLoadingChanged(A02, z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.FW
    public final void AAA(int i, FG fg) {
        this.A02.A0C(i, fg);
        C0540An A04 = A04(i, fg);
        Iterator<InterfaceC0541Ao> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onMediaPeriodCreated(A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.FW
    public final void AAB(int i, FG fg) {
        this.A02.A0D(i, fg);
        C0540An A04 = A04(i, fg);
        Iterator<InterfaceC0541Ao> it = this.A04.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A05;
            if (strArr[7].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[1] = "xQuAJnMHmsnkUtn";
            strArr2[4] = "I7nuhInD03G6TyFgZN1tEp7XA66Po";
            if (hasNext) {
                it.next().onMediaPeriodReleased(A04);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.E1
    public final void AAE(Metadata metadata) {
        C0540An A02 = A02();
        Iterator<InterfaceC0541Ao> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onMetadata(A02, metadata);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final void AAT(AP ap) {
        C0540An A02 = A02();
        Iterator<InterfaceC0541Ao> it = this.A04.iterator();
        while (it.hasNext()) {
            InterfaceC0541Ao next = it.next();
            if (A05[5].charAt(25) != 'g') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[5] = "6kCd761y4Sm0JC2HIy7vlDu4Zge9adCZ";
            strArr[5] = "6kCd761y4Sm0JC2HIy7vlDu4Zge9adCZ";
            next.onPlaybackParametersChanged(A02, ap);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final void AAV(A4 a4) {
        C0540An A02 = A02();
        Iterator<InterfaceC0541Ao> it = this.A04.iterator();
        while (it.hasNext()) {
            InterfaceC0541Ao next = it.next();
            String[] strArr = A05;
            if (strArr[7].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[3] = "4uLQlqFUz3TKu9PUP8Ua0";
            strArr2[3] = "4uLQlqFUz3TKu9PUP8Ua0";
            next.onPlayerError(A02, a4);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final void AAX(boolean z, int i) {
        C0540An A02 = A02();
        Iterator<InterfaceC0541Ao> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onPlayerStateChanged(A02, z, i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final void AAZ(int i) {
        this.A02.A0B(i);
        C0540An A02 = A02();
        Iterator<InterfaceC0541Ao> it = this.A04.iterator();
        while (it.hasNext()) {
            InterfaceC0541Ao listener = it.next();
            listener.onPositionDiscontinuity(A02, i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.FW
    public final void AAh(int i, FG fg) {
        this.A02.A0E(i, fg);
        C0540An A04 = A04(i, fg);
        Iterator<InterfaceC0541Ao> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onReadingStarted(A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.J4
    public final void AAk(Surface surface) {
        C0540An A03 = A03();
        Iterator<InterfaceC0541Ao> it = this.A04.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A05;
            if (strArr[1].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[0] = "zEYrHw08cBp169ZitgaAlaUGutwvX";
            strArr2[0] = "zEYrHw08cBp169ZitgaAlaUGutwvX";
            if (hasNext) {
                it.next().onRenderedFirstFrame(A03, surface);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final void AAu() {
        if (this.A02.A0G()) {
            this.A02.A09();
            C0540An A02 = A02();
            Iterator<InterfaceC0541Ao> it = this.A04.iterator();
            while (it.hasNext()) {
                InterfaceC0541Ao listener = it.next();
                listener.onSeekProcessed(A02);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final void AB6(AbstractC0536Aj abstractC0536Aj, @Nullable Object obj, int i) {
        this.A02.A0F(abstractC0536Aj);
        C0540An A02 = A02();
        Iterator<InterfaceC0541Ao> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onTimelineChanged(A02, i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AS
    public final void AB7(TrackGroupArray trackGroupArray, H9 h9) {
        C0540An A02 = A02();
        Iterator<InterfaceC0541Ao> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onTracksChanged(A02, trackGroupArray, h9);
        }
    }

    @Override // com.facebook.ads.redexgen.X.J4
    public final void ABF(String str, long j, long j2) {
        C0540An eventTime = A03();
        Iterator<InterfaceC0541Ao> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInitialized(eventTime, 2, str, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.J4
    public final void ABG(C0557Be c0557Be) {
        C0540An A00 = A00();
        Iterator<InterfaceC0541Ao> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderDisabled(A00, 2, c0557Be);
        }
    }

    @Override // com.facebook.ads.redexgen.X.J4
    public final void ABH(C0557Be c0557Be) {
        C0540An A02 = A02();
        Iterator<InterfaceC0541Ao> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderEnabled(A02, 2, c0557Be);
        }
    }

    @Override // com.facebook.ads.redexgen.X.J4
    public final void ABJ(Format format) {
        C0540An A03 = A03();
        Iterator<InterfaceC0541Ao> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInputFormatChanged(A03, 2, format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.J4
    public final void ABM(int i, int i2, int i3, float f) {
        C0540An A03 = A03();
        Iterator<InterfaceC0541Ao> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onVideoSizeChanged(A03, i, i2, i3, f);
        }
    }
}