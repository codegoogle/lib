package org.xbill.DNS;

import com.p7700g.p99005.wo1;
import java.io.IOException;
import java.util.Random;

/* loaded from: classes4.dex */
public class Header implements Cloneable {
    public static final int LENGTH = 12;
    private static Random random = new Random();
    private int[] counts;
    private int flags;
    private int id;

    public Header(int i) {
        init();
        setID(i);
    }

    private static void checkFlag(int i) {
        if (!validFlag(i)) {
            throw new IllegalArgumentException(wo1.l("invalid flag bit ", i));
        }
    }

    private void init() {
        this.counts = new int[4];
        this.flags = 0;
        this.id = -1;
    }

    public static int setFlag(int i, int i2, boolean z) {
        checkFlag(i2);
        return z ? i | (1 << (15 - i2)) : i & (~(1 << (15 - i2)));
    }

    private static boolean validFlag(int i) {
        return i >= 0 && i <= 15 && Flags.isFlag(i);
    }

    public Object clone() {
        Header header = new Header();
        header.id = this.id;
        header.flags = this.flags;
        int[] iArr = this.counts;
        System.arraycopy(iArr, 0, header.counts, 0, iArr.length);
        return header;
    }

    public void decCount(int i) {
        int[] iArr = this.counts;
        if (iArr[i] != 0) {
            iArr[i] = iArr[i] - 1;
            return;
        }
        throw new IllegalStateException("DNS section count cannot be decremented");
    }

    public int getCount(int i) {
        return this.counts[i];
    }

    public boolean getFlag(int i) {
        checkFlag(i);
        return ((1 << (15 - i)) & this.flags) != 0;
    }

    public boolean[] getFlags() {
        boolean[] zArr = new boolean[16];
        for (int i = 0; i < 16; i++) {
            if (validFlag(i)) {
                zArr[i] = getFlag(i);
            }
        }
        return zArr;
    }

    public int getFlagsByte() {
        return this.flags;
    }

    public int getID() {
        int i;
        int i2 = this.id;
        if (i2 >= 0) {
            return i2;
        }
        synchronized (this) {
            if (this.id < 0) {
                this.id = random.nextInt(65535);
            }
            i = this.id;
        }
        return i;
    }

    public int getOpcode() {
        return (this.flags >> 11) & 15;
    }

    public int getRcode() {
        return this.flags & 15;
    }

    public void incCount(int i) {
        int[] iArr = this.counts;
        if (iArr[i] != 65535) {
            iArr[i] = iArr[i] + 1;
            return;
        }
        throw new IllegalStateException("DNS section count cannot be incremented");
    }

    public String printFlags() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 16; i++) {
            if (validFlag(i) && getFlag(i)) {
                stringBuffer.append(Flags.string(i));
                stringBuffer.append(" ");
            }
        }
        return stringBuffer.toString();
    }

    public void setCount(int i, int i2) {
        if (i2 >= 0 && i2 <= 65535) {
            this.counts[i] = i2;
            return;
        }
        throw new IllegalArgumentException(wo1.n("DNS section count ", i2, " is out of range"));
    }

    public void setID(int i) {
        if (i >= 0 && i <= 65535) {
            this.id = i;
            return;
        }
        throw new IllegalArgumentException(wo1.n("DNS message ID ", i, " is out of range"));
    }

    public void setOpcode(int i) {
        if (i >= 0 && i <= 15) {
            int i2 = this.flags & 34815;
            this.flags = i2;
            this.flags = (i << 11) | i2;
            return;
        }
        throw new IllegalArgumentException(wo1.n("DNS Opcode ", i, "is out of range"));
    }

    public void setRcode(int i) {
        if (i >= 0 && i <= 15) {
            int i2 = this.flags & (-16);
            this.flags = i2;
            this.flags = i | i2;
            return;
        }
        throw new IllegalArgumentException(wo1.n("DNS Rcode ", i, " is out of range"));
    }

    public String toString() {
        return toStringWithRcode(getRcode());
    }

    public String toStringWithRcode(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(";; ->>HEADER<<- ");
        StringBuilder G = wo1.G("opcode: ");
        G.append(Opcode.string(getOpcode()));
        stringBuffer.append(G.toString());
        stringBuffer.append(", status: " + Rcode.string(i));
        stringBuffer.append(", id: " + getID());
        stringBuffer.append("\n");
        stringBuffer.append(";; flags: " + printFlags());
        stringBuffer.append("; ");
        for (int i2 = 0; i2 < 4; i2++) {
            stringBuffer.append(Section.string(i2) + ": " + getCount(i2) + " ");
        }
        return stringBuffer.toString();
    }

    public void toWire(DNSOutput dNSOutput) {
        dNSOutput.writeU16(getID());
        dNSOutput.writeU16(this.flags);
        int i = 0;
        while (true) {
            int[] iArr = this.counts;
            if (i >= iArr.length) {
                return;
            }
            dNSOutput.writeU16(iArr[i]);
            i++;
        }
    }

    public void unsetFlag(int i) {
        checkFlag(i);
        this.flags = setFlag(this.flags, i, false);
    }

    public void setFlag(int i) {
        checkFlag(i);
        this.flags = setFlag(this.flags, i, true);
    }

    public Header() {
        init();
    }

    public byte[] toWire() {
        DNSOutput dNSOutput = new DNSOutput();
        toWire(dNSOutput);
        return dNSOutput.toByteArray();
    }

    public Header(DNSInput dNSInput) throws IOException {
        this(dNSInput.readU16());
        this.flags = dNSInput.readU16();
        int i = 0;
        while (true) {
            int[] iArr = this.counts;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = dNSInput.readU16();
            i++;
        }
    }

    public Header(byte[] bArr) throws IOException {
        this(new DNSInput(bArr));
    }
}