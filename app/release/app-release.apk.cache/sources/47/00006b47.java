package org.xbill.DNS;

import com.p7700g.p99005.wo1;
import java.io.IOException;
import java.util.BitSet;
import org.xbill.DNS.Tokenizer;

/* loaded from: classes4.dex */
public class NXTRecord extends Record {
    private static final long serialVersionUID = -8851454400765507520L;
    private BitSet bitmap;
    private Name next;

    public NXTRecord() {
    }

    public BitSet getBitmap() {
        return this.bitmap;
    }

    public Name getNext() {
        return this.next;
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new NXTRecord();
    }

    @Override // org.xbill.DNS.Record
    public void rdataFromString(Tokenizer tokenizer, Name name) throws IOException {
        Tokenizer.Token token;
        this.next = tokenizer.getName(name);
        this.bitmap = new BitSet();
        while (true) {
            token = tokenizer.get();
            if (!token.isString()) {
                tokenizer.unget();
                return;
            }
            int value = Type.value(token.value, true);
            if (value <= 0 || value > 128) {
                break;
            }
            this.bitmap.set(value);
        }
        StringBuilder G = wo1.G("Invalid type: ");
        G.append(token.value);
        throw tokenizer.exception(G.toString());
    }

    @Override // org.xbill.DNS.Record
    public void rrFromWire(DNSInput dNSInput) throws IOException {
        this.next = new Name(dNSInput);
        this.bitmap = new BitSet();
        int remaining = dNSInput.remaining();
        for (int i = 0; i < remaining; i++) {
            int readU8 = dNSInput.readU8();
            for (int i2 = 0; i2 < 8; i2++) {
                if (((1 << (7 - i2)) & readU8) != 0) {
                    this.bitmap.set((i * 8) + i2);
                }
            }
        }
    }

    @Override // org.xbill.DNS.Record
    public String rrToString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.next);
        int length = this.bitmap.length();
        for (short s = 0; s < length; s = (short) (s + 1)) {
            if (this.bitmap.get(s)) {
                stringBuffer.append(" ");
                stringBuffer.append(Type.string(s));
            }
        }
        return stringBuffer.toString();
    }

    @Override // org.xbill.DNS.Record
    public void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        this.next.toWire(dNSOutput, null, z);
        int length = this.bitmap.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i |= this.bitmap.get(i2) ? 1 << (7 - (i2 % 8)) : 0;
            if (i2 % 8 == 7 || i2 == length - 1) {
                dNSOutput.writeU8(i);
                i = 0;
            }
        }
    }

    public NXTRecord(Name name, int i, long j, Name name2, BitSet bitSet) {
        super(name, 30, i, j);
        this.next = Record.checkName("next", name2);
        this.bitmap = bitSet;
    }
}