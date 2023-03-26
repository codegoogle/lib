package org.xbill.DNS;

import com.p7700g.p99005.gl4;
import com.p7700g.p99005.wo1;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.TreeSet;
import org.xbill.DNS.Tokenizer;

/* loaded from: classes4.dex */
public final class TypeBitmap implements Serializable {
    private static final long serialVersionUID = -125354057735389003L;
    private TreeSet types;

    private TypeBitmap() {
        this.types = new TreeSet();
    }

    private static void mapToWire(DNSOutput dNSOutput, TreeSet treeSet, int i) {
        int intValue = ((((Integer) treeSet.last()).intValue() & 255) / 8) + 1;
        int[] iArr = new int[intValue];
        dNSOutput.writeU8(i);
        dNSOutput.writeU8(intValue);
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            int intValue2 = ((Integer) it.next()).intValue();
            int i2 = (intValue2 & 255) / 8;
            iArr[i2] = (1 << (7 - (intValue2 % 8))) | iArr[i2];
        }
        for (int i3 = 0; i3 < intValue; i3++) {
            dNSOutput.writeU8(iArr[i3]);
        }
    }

    public boolean contains(int i) {
        return this.types.contains(Mnemonic.toInteger(i));
    }

    public boolean empty() {
        return this.types.isEmpty();
    }

    public int[] toArray() {
        int[] iArr = new int[this.types.size()];
        Iterator it = this.types.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = this.types.iterator();
        while (it.hasNext()) {
            stringBuffer.append(Type.string(((Integer) it.next()).intValue()));
            if (it.hasNext()) {
                stringBuffer.append(gl4.R);
            }
        }
        return stringBuffer.toString();
    }

    public void toWire(DNSOutput dNSOutput) {
        if (this.types.size() == 0) {
            return;
        }
        int i = -1;
        TreeSet treeSet = new TreeSet();
        Iterator it = this.types.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            int i2 = intValue >> 8;
            if (i2 != i) {
                if (treeSet.size() > 0) {
                    mapToWire(dNSOutput, treeSet, i);
                    treeSet.clear();
                }
                i = i2;
            }
            treeSet.add(Integer.valueOf(intValue));
        }
        mapToWire(dNSOutput, treeSet, i);
    }

    public TypeBitmap(int[] iArr) {
        this();
        for (int i = 0; i < iArr.length; i++) {
            Type.check(iArr[i]);
            this.types.add(Integer.valueOf(iArr[i]));
        }
    }

    public TypeBitmap(DNSInput dNSInput) throws WireParseException {
        this();
        while (dNSInput.remaining() > 0) {
            if (dNSInput.remaining() >= 2) {
                int readU8 = dNSInput.readU8();
                if (readU8 >= -1) {
                    int readU82 = dNSInput.readU8();
                    if (readU82 > dNSInput.remaining()) {
                        throw new WireParseException("invalid bitmap");
                    }
                    for (int i = 0; i < readU82; i++) {
                        int readU83 = dNSInput.readU8();
                        if (readU83 != 0) {
                            for (int i2 = 0; i2 < 8; i2++) {
                                if (((1 << (7 - i2)) & readU83) != 0) {
                                    this.types.add(Mnemonic.toInteger((i * 8) + (readU8 * 256) + i2));
                                }
                            }
                        }
                    }
                } else {
                    throw new WireParseException("invalid ordering");
                }
            } else {
                throw new WireParseException("invalid bitmap descriptor");
            }
        }
    }

    public TypeBitmap(Tokenizer tokenizer) throws IOException {
        this();
        while (true) {
            Tokenizer.Token token = tokenizer.get();
            if (!token.isString()) {
                tokenizer.unget();
                return;
            }
            int value = Type.value(token.value);
            if (value >= 0) {
                this.types.add(Mnemonic.toInteger(value));
            } else {
                StringBuilder G = wo1.G("Invalid type: ");
                G.append(token.value);
                throw tokenizer.exception(G.toString());
            }
        }
    }
}