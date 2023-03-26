package org.xbill.DNS;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.xbill.DNS.Tokenizer;

/* loaded from: classes4.dex */
public abstract class TXTBase extends Record {
    private static final long serialVersionUID = -4319510507246305931L;
    public List strings;

    public TXTBase() {
    }

    public List getStrings() {
        ArrayList arrayList = new ArrayList(this.strings.size());
        for (int i = 0; i < this.strings.size(); i++) {
            arrayList.add(Record.byteArrayToString((byte[]) this.strings.get(i), false));
        }
        return arrayList;
    }

    public List getStringsAsByteArrays() {
        return this.strings;
    }

    @Override // org.xbill.DNS.Record
    public void rdataFromString(Tokenizer tokenizer, Name name) throws IOException {
        this.strings = new ArrayList(2);
        while (true) {
            Tokenizer.Token token = tokenizer.get();
            if (!token.isString()) {
                tokenizer.unget();
                return;
            }
            try {
                this.strings.add(Record.byteArrayFromString(token.value));
            } catch (TextParseException e) {
                throw tokenizer.exception(e.getMessage());
            }
        }
    }

    @Override // org.xbill.DNS.Record
    public void rrFromWire(DNSInput dNSInput) throws IOException {
        this.strings = new ArrayList(2);
        while (dNSInput.remaining() > 0) {
            this.strings.add(dNSInput.readCountedString());
        }
    }

    @Override // org.xbill.DNS.Record
    public String rrToString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = this.strings.iterator();
        while (it.hasNext()) {
            stringBuffer.append(Record.byteArrayToString((byte[]) it.next(), true));
            if (it.hasNext()) {
                stringBuffer.append(" ");
            }
        }
        return stringBuffer.toString();
    }

    @Override // org.xbill.DNS.Record
    public void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        for (byte[] bArr : this.strings) {
            dNSOutput.writeCountedString(bArr);
        }
    }

    public TXTBase(Name name, int i, int i2, long j) {
        super(name, i, i2, j);
    }

    public TXTBase(Name name, int i, int i2, long j, List list) {
        super(name, i, i2, j);
        if (list != null) {
            this.strings = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    this.strings.add(Record.byteArrayFromString((String) it.next()));
                } catch (TextParseException e) {
                    throw new IllegalArgumentException(e.getMessage());
                }
            }
            return;
        }
        throw new IllegalArgumentException("strings must not be null");
    }

    public TXTBase(Name name, int i, int i2, long j, String str) {
        this(name, i, i2, j, Collections.singletonList(str));
    }
}