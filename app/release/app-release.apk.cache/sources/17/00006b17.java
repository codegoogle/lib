package org.xbill.DNS;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes4.dex */
public abstract class EDNSOption {
    private final int code;

    /* loaded from: classes4.dex */
    public static class Code {
        public static final int CLIENT_SUBNET = 8;
        public static final int NSID = 3;
        private static Mnemonic codes;

        static {
            Mnemonic mnemonic = new Mnemonic("EDNS Option Codes", 2);
            codes = mnemonic;
            mnemonic.setMaximum(65535);
            codes.setPrefix("CODE");
            codes.setNumericAllowed(true);
            codes.add(3, "NSID");
            codes.add(8, "CLIENT_SUBNET");
        }

        private Code() {
        }

        public static String string(int i) {
            return codes.getText(i);
        }

        public static int value(String str) {
            return codes.getValue(str);
        }
    }

    public EDNSOption(int i) {
        this.code = Record.checkU16("code", i);
    }

    public static EDNSOption fromWire(DNSInput dNSInput) throws IOException {
        EDNSOption nSIDOption;
        int readU16 = dNSInput.readU16();
        int readU162 = dNSInput.readU16();
        if (dNSInput.remaining() >= readU162) {
            int active = dNSInput.getActive();
            dNSInput.setActive(readU162);
            if (readU16 == 3) {
                nSIDOption = new NSIDOption();
            } else if (readU16 != 8) {
                nSIDOption = new GenericEDNSOption(readU16);
            } else {
                nSIDOption = new ClientSubnetOption();
            }
            nSIDOption.optionFromWire(dNSInput);
            dNSInput.restoreActive(active);
            return nSIDOption;
        }
        throw new WireParseException("truncated option");
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof EDNSOption)) {
            return false;
        }
        EDNSOption eDNSOption = (EDNSOption) obj;
        if (this.code != eDNSOption.code) {
            return false;
        }
        return Arrays.equals(getData(), eDNSOption.getData());
    }

    public int getCode() {
        return this.code;
    }

    public byte[] getData() {
        DNSOutput dNSOutput = new DNSOutput();
        optionToWire(dNSOutput);
        return dNSOutput.toByteArray();
    }

    public int hashCode() {
        int i = 0;
        for (byte b : getData()) {
            i += (i << 3) + (b & 255);
        }
        return i;
    }

    public abstract void optionFromWire(DNSInput dNSInput) throws IOException;

    public abstract String optionToString();

    public abstract void optionToWire(DNSOutput dNSOutput);

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{");
        stringBuffer.append(Code.string(this.code));
        stringBuffer.append(": ");
        stringBuffer.append(optionToString());
        stringBuffer.append("}");
        return stringBuffer.toString();
    }

    public void toWire(DNSOutput dNSOutput) {
        dNSOutput.writeU16(this.code);
        int current = dNSOutput.current();
        dNSOutput.writeU16(0);
        optionToWire(dNSOutput);
        dNSOutput.writeU16At((dNSOutput.current() - current) - 2, current);
    }

    public byte[] toWire() throws IOException {
        DNSOutput dNSOutput = new DNSOutput();
        toWire(dNSOutput);
        return dNSOutput.toByteArray();
    }

    public static EDNSOption fromWire(byte[] bArr) throws IOException {
        return fromWire(new DNSInput(bArr));
    }
}