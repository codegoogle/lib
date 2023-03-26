package com.p7700g.p99005;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Strings.kt */
@vo4(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0019\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\u001a\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0000\u001a\u001c\u0010\f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001c\u0010\u0011\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001f\u0010\u0012\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0086\u0002\u001a\u001f\u0010\u0012\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0086\u0002\u001a\u0015\u0010\u0012\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0087\n\u001a\u0018\u0010\u0017\u001a\u00020\u0010*\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u0018\u0010\u0018\u001a\u00020\u0010*\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u001c\u0010\u0019\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001c\u0010\u0019\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a:\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001aE\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0010H\u0002¢\u0006\u0002\b!\u001a:\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u0012\u0010#\u001a\u00020\u0010*\u00020\u00022\u0006\u0010$\u001a\u00020\u0006\u001a7\u0010%\u001a\u0002H&\"\f\b\u0000\u0010'*\u00020\u0002*\u0002H&\"\u0004\b\u0001\u0010&*\u0002H'2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H&0)H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010*\u001a7\u0010+\u001a\u0002H&\"\f\b\u0000\u0010'*\u00020\u0002*\u0002H&\"\u0004\b\u0001\u0010&*\u0002H'2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H&0)H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010*\u001a&\u0010,\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a;\u0010,\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010 \u001a\u00020\u0010H\u0002¢\u0006\u0002\b.\u001a&\u0010,\u001a\u00020\u0006*\u00020\u00022\u0006\u0010/\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a&\u00100\u001a\u00020\u0006*\u00020\u00022\u0006\u00101\u001a\u0002022\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a,\u00100\u001a\u00020\u0006*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\r\u00103\u001a\u00020\u0010*\u00020\u0002H\u0087\b\u001a\r\u00104\u001a\u00020\u0010*\u00020\u0002H\u0087\b\u001a\r\u00105\u001a\u00020\u0010*\u00020\u0002H\u0087\b\u001a \u00106\u001a\u00020\u0010*\u0004\u0018\u00010\u0002H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a \u00107\u001a\u00020\u0010*\u0004\u0018\u00010\u0002H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a\r\u00108\u001a\u000209*\u00020\u0002H\u0086\u0002\u001a&\u0010:\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a&\u0010:\u001a\u00020\u0006*\u00020\u00022\u0006\u0010/\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a&\u0010;\u001a\u00020\u0006*\u00020\u00022\u0006\u00101\u001a\u0002022\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a,\u0010;\u001a\u00020\u0006*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u0010\u0010<\u001a\b\u0012\u0004\u0012\u00020\r0=*\u00020\u0002\u001a\u0010\u0010>\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u0002\u001a\u0015\u0010@\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0087\f\u001a\u000f\u0010A\u001a\u00020\r*\u0004\u0018\u00010\rH\u0087\b\u001a\u001c\u0010B\u001a\u00020\u0002*\u00020\u00022\u0006\u0010C\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u0014\u001a\u001c\u0010B\u001a\u00020\r*\u00020\r2\u0006\u0010C\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u0014\u001a\u001c\u0010E\u001a\u00020\u0002*\u00020\u00022\u0006\u0010C\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u0014\u001a\u001c\u0010E\u001a\u00020\r*\u00020\r2\u0006\u0010C\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u0014\u001aG\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00010=*\u00020\u00022\u000e\u0010G\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0H2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\bI\u0010J\u001a=\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00010=*\u00020\u00022\u0006\u0010G\u001a\u0002022\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0002\bI\u001a4\u0010K\u001a\u00020\u0010*\u00020\u00022\u0006\u0010L\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010M\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a\u0012\u0010N\u001a\u00020\u0002*\u00020\u00022\u0006\u0010O\u001a\u00020\u0002\u001a\u0012\u0010N\u001a\u00020\r*\u00020\r2\u0006\u0010O\u001a\u00020\u0002\u001a\u001a\u0010P\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006\u001a\u0012\u0010P\u001a\u00020\u0002*\u00020\u00022\u0006\u0010Q\u001a\u00020\u0001\u001a\u001d\u0010P\u001a\u00020\r*\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010P\u001a\u00020\r*\u00020\r2\u0006\u0010Q\u001a\u00020\u0001H\u0087\b\u001a\u0012\u0010R\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u001a\u0012\u0010R\u001a\u00020\r*\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0002\u001a\u0012\u0010S\u001a\u00020\u0002*\u00020\u00022\u0006\u0010T\u001a\u00020\u0002\u001a\u001a\u0010S\u001a\u00020\u0002*\u00020\u00022\u0006\u0010O\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u001a\u0012\u0010S\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u0002\u001a\u001a\u0010S\u001a\u00020\r*\u00020\r2\u0006\u0010O\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u001a.\u0010U\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0014\b\b\u0010V\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020\u00020WH\u0087\bø\u0001\u0000\u001a\u001d\u0010U\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010Y\u001a\u00020\rH\u0087\b\u001a$\u0010Z\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010Z\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010\\\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010\\\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010]\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010]\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010^\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010^\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001d\u0010_\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010Y\u001a\u00020\rH\u0087\b\u001a)\u0010`\u001a\u00020\r*\u00020\r2\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140WH\u0087\bø\u0001\u0000¢\u0006\u0002\ba\u001a)\u0010`\u001a\u00020\r*\u00020\r2\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00020WH\u0087\bø\u0001\u0000¢\u0006\u0002\bb\u001a\"\u0010c\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020\u0002\u001a\u001a\u0010c\u001a\u00020\u0002*\u00020\u00022\u0006\u0010Q\u001a\u00020\u00012\u0006\u0010Y\u001a\u00020\u0002\u001a%\u0010c\u001a\u00020\r*\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020\u0002H\u0087\b\u001a\u001d\u0010c\u001a\u00020\r*\u00020\r2\u0006\u0010Q\u001a\u00020\u00012\u0006\u0010Y\u001a\u00020\u0002H\u0087\b\u001a=\u0010d\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u00022\u0012\u0010G\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0H\"\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010e\u001a0\u0010d\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u00022\n\u0010G\u001a\u000202\"\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u001a/\u0010d\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u00022\u0006\u0010T\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0002\bf\u001a%\u0010d\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0087\b\u001a=\u0010g\u001a\b\u0012\u0004\u0012\u00020\r0=*\u00020\u00022\u0012\u0010G\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0H\"\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010h\u001a0\u0010g\u001a\b\u0012\u0004\u0012\u00020\r0=*\u00020\u00022\n\u0010G\u001a\u000202\"\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u001a%\u0010g\u001a\b\u0012\u0004\u0012\u00020\r0=*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0087\b\u001a\u001c\u0010i\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001c\u0010i\u001a\u00020\u0010*\u00020\u00022\u0006\u0010O\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a$\u0010i\u001a\u00020\u0010*\u00020\u00022\u0006\u0010O\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u0012\u0010j\u001a\u00020\u0002*\u00020\u00022\u0006\u0010Q\u001a\u00020\u0001\u001a\u001d\u0010j\u001a\u00020\u0002*\u00020\r2\u0006\u0010k\u001a\u00020\u00062\u0006\u0010l\u001a\u00020\u0006H\u0087\b\u001a\u001f\u0010m\u001a\u00020\r*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010-\u001a\u00020\u0006H\u0087\b\u001a\u0012\u0010m\u001a\u00020\r*\u00020\u00022\u0006\u0010Q\u001a\u00020\u0001\u001a\u0012\u0010m\u001a\u00020\r*\u00020\r2\u0006\u0010Q\u001a\u00020\u0001\u001a\u001c\u0010n\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010n\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010o\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010o\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010p\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010p\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010q\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010q\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\f\u0010r\u001a\u00020\u0010*\u00020\rH\u0007\u001a\u0013\u0010s\u001a\u0004\u0018\u00010\u0010*\u00020\rH\u0007¢\u0006\u0002\u0010t\u001a\n\u0010u\u001a\u00020\u0002*\u00020\u0002\u001a$\u0010u\u001a\u00020\u0002*\u00020\u00022\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010u\u001a\u00020\u0002*\u00020\u00022\n\u00101\u001a\u000202\"\u00020\u0014\u001a\r\u0010u\u001a\u00020\r*\u00020\rH\u0087\b\u001a$\u0010u\u001a\u00020\r*\u00020\r2\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010u\u001a\u00020\r*\u00020\r2\n\u00101\u001a\u000202\"\u00020\u0014\u001a\n\u0010w\u001a\u00020\u0002*\u00020\u0002\u001a$\u0010w\u001a\u00020\u0002*\u00020\u00022\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010w\u001a\u00020\u0002*\u00020\u00022\n\u00101\u001a\u000202\"\u00020\u0014\u001a\r\u0010w\u001a\u00020\r*\u00020\rH\u0087\b\u001a$\u0010w\u001a\u00020\r*\u00020\r2\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010w\u001a\u00020\r*\u00020\r2\n\u00101\u001a\u000202\"\u00020\u0014\u001a\n\u0010x\u001a\u00020\u0002*\u00020\u0002\u001a$\u0010x\u001a\u00020\u0002*\u00020\u00022\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010x\u001a\u00020\u0002*\u00020\u00022\n\u00101\u001a\u000202\"\u00020\u0014\u001a\r\u0010x\u001a\u00020\r*\u00020\rH\u0087\b\u001a$\u0010x\u001a\u00020\r*\u00020\r2\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010x\u001a\u00020\r*\u00020\r2\n\u00101\u001a\u000202\"\u00020\u0014\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006y"}, d2 = {"indices", "Lkotlin/ranges/IntRange;", "", "getIndices", "(Ljava/lang/CharSequence;)Lkotlin/ranges/IntRange;", "lastIndex", "", "getLastIndex", "(Ljava/lang/CharSequence;)I", "requireNonNegativeLimit", "", "limit", "commonPrefixWith", "", "other", "ignoreCase", "", "commonSuffixWith", "contains", "char", "", "regex", "Lkotlin/text/Regex;", "contentEqualsIgnoreCaseImpl", "contentEqualsImpl", "endsWith", "suffix", "findAnyOf", "Lkotlin/Pair;", "strings", "", "startIndex", "last", "findAnyOf$StringsKt__StringsKt", "findLastAnyOf", "hasSurrogatePairAt", la1.l, "ifBlank", "R", "C", "defaultValue", "Lkotlin/Function0;", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ifEmpty", "indexOf", "endIndex", "indexOf$StringsKt__StringsKt", "string", "indexOfAny", "chars", "", "isEmpty", "isNotBlank", "isNotEmpty", "isNullOrBlank", "isNullOrEmpty", "iterator", "Lkotlin/collections/CharIterator;", "lastIndexOf", "lastIndexOfAny", "lineSequence", "Lkotlin/sequences/Sequence;", "lines", "", "matches", "orEmpty", "padEnd", "length", "padChar", "padStart", "rangesDelimitedBy", "delimiters", "", "rangesDelimitedBy$StringsKt__StringsKt", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/Sequence;", "regionMatchesImpl", "thisOffset", "otherOffset", "removePrefix", "prefix", "removeRange", "range", "removeSuffix", "removeSurrounding", "delimiter", "replace", "transform", "Lkotlin/Function1;", "Lkotlin/text/MatchResult;", "replacement", "replaceAfter", "missingDelimiterValue", "replaceAfterLast", "replaceBefore", "replaceBeforeLast", "replaceFirst", "replaceFirstChar", "replaceFirstCharWithChar", "replaceFirstCharWithCharSequence", "replaceRange", "split", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "split$StringsKt__StringsKt", "splitToSequence", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lkotlin/sequences/Sequence;", "startsWith", "subSequence", com.anythink.expressad.foundation.d.c.bR, "end", "substring", "substringAfter", "substringAfterLast", "substringBefore", "substringBeforeLast", "toBooleanStrict", "toBooleanStrictOrNull", "(Ljava/lang/String;)Ljava/lang/Boolean;", "trim", "predicate", "trimEnd", "trimStart", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes3.dex */
public class c95 extends b95 {

    /* compiled from: Strings.kt */
    @vo4(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0005H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"kotlin/text/StringsKt__StringsKt$iterator$1", "Lkotlin/collections/CharIterator;", la1.l, "", "hasNext", "", "nextChar", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends fs4 {
        private int s;
        public final /* synthetic */ CharSequence t;

        public a(CharSequence charSequence) {
            this.t = charSequence;
        }

        @Override // com.p7700g.p99005.fs4
        public char b() {
            CharSequence charSequence = this.t;
            int i = this.s;
            this.s = i + 1;
            return charSequence.charAt(i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.s < this.t.length();
        }
    }

    /* compiled from: Strings.kt */
    @vo4(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "currentIndex", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends e25 implements j05<CharSequence, Integer, hp4<? extends Integer, ? extends Integer>> {
        public final /* synthetic */ char[] t;
        public final /* synthetic */ boolean u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(char[] cArr, boolean z) {
            super(2);
            this.t = cArr;
            this.u = z;
        }

        @Nullable
        public final hp4<Integer, Integer> a(@NotNull CharSequence charSequence, int i) {
            c25.p(charSequence, "$this$$receiver");
            int t3 = c95.t3(charSequence, this.t, i, this.u);
            if (t3 < 0) {
                return null;
            }
            return cq4.a(Integer.valueOf(t3), 1);
        }

        @Override // com.p7700g.p99005.j05
        public /* bridge */ /* synthetic */ hp4<? extends Integer, ? extends Integer> w3(CharSequence charSequence, Integer num) {
            return a(charSequence, num.intValue());
        }
    }

    /* compiled from: Strings.kt */
    @vo4(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "currentIndex", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends e25 implements j05<CharSequence, Integer, hp4<? extends Integer, ? extends Integer>> {
        public final /* synthetic */ List<String> t;
        public final /* synthetic */ boolean u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<String> list, boolean z) {
            super(2);
            this.t = list;
            this.u = z;
        }

        @Nullable
        public final hp4<Integer, Integer> a(@NotNull CharSequence charSequence, int i) {
            c25.p(charSequence, "$this$$receiver");
            hp4 d3 = c95.d3(charSequence, this.t, i, this.u, false);
            if (d3 != null) {
                return cq4.a(d3.m(), Integer.valueOf(((String) d3.n()).length()));
            }
            return null;
        }

        @Override // com.p7700g.p99005.j05
        public /* bridge */ /* synthetic */ hp4<? extends Integer, ? extends Integer> w3(CharSequence charSequence, Integer num) {
            return a(charSequence, num.intValue());
        }
    }

    /* compiled from: Strings.kt */
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lkotlin/ranges/IntRange;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d extends e25 implements f05<c55, String> {
        public final /* synthetic */ CharSequence t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(CharSequence charSequence) {
            super(1);
            this.t = charSequence;
        }

        @Override // com.p7700g.p99005.f05
        @NotNull
        /* renamed from: a */
        public final String M(@NotNull c55 c55Var) {
            c25.p(c55Var, "it");
            return c95.j5(this.t, c55Var);
        }
    }

    /* compiled from: Strings.kt */
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lkotlin/ranges/IntRange;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e extends e25 implements f05<c55, String> {
        public final /* synthetic */ CharSequence t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(CharSequence charSequence) {
            super(1);
            this.t = charSequence;
        }

        @Override // com.p7700g.p99005.f05
        @NotNull
        /* renamed from: a */
        public final String M(@NotNull c55 c55Var) {
            c25.p(c55Var, "it");
            return c95.j5(this.t, c55Var);
        }
    }

    @dx4
    private static final boolean A3(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static /* synthetic */ String A4(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return y4(str, str2, str3, str4);
    }

    public static /* synthetic */ String A5(String str, char c2, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return y5(str, c2, str2);
    }

    @NotNull
    public static final fs4 B3(@NotNull CharSequence charSequence) {
        c25.p(charSequence, "<this>");
        return new a(charSequence);
    }

    @NotNull
    public static final String B4(@NotNull String str, char c2, @NotNull String str2, @NotNull String str3) {
        c25.p(str, "<this>");
        c25.p(str2, "replacement");
        c25.p(str3, "missingDelimiterValue");
        int E3 = E3(str, c2, 0, false, 6, null);
        return E3 == -1 ? str3 : I4(str, 0, E3, str2).toString();
    }

    public static /* synthetic */ String B5(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return z5(str, str2, str3);
    }

    public static final int C3(@NotNull CharSequence charSequence, char c2, int i, boolean z) {
        c25.p(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c2, i);
        }
        return H3(charSequence, new char[]{c2}, i, z);
    }

    @NotNull
    public static final String C4(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        c25.p(str, "<this>");
        c25.p(str2, "delimiter");
        c25.p(str3, "replacement");
        c25.p(str4, "missingDelimiterValue");
        int F3 = F3(str, str2, 0, false, 6, null);
        return F3 == -1 ? str4 : I4(str, 0, F3, str3).toString();
    }

    @tp4(version = "1.5")
    public static final boolean C5(@NotNull String str) {
        c25.p(str, "<this>");
        if (c25.g(str, "true")) {
            return true;
        }
        if (c25.g(str, "false")) {
            return false;
        }
        throw new IllegalArgumentException(wo1.t("The string doesn't represent a boolean value: ", str));
    }

    public static final int D3(@NotNull CharSequence charSequence, @NotNull String str, int i, boolean z) {
        c25.p(charSequence, "<this>");
        c25.p(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(str, i);
        }
        return o3(charSequence, str, i, 0, z, true);
    }

    public static /* synthetic */ String D4(String str, char c2, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return B4(str, c2, str2, str3);
    }

    @tp4(version = "1.5")
    @Nullable
    public static final Boolean D5(@NotNull String str) {
        c25.p(str, "<this>");
        if (c25.g(str, "true")) {
            return Boolean.TRUE;
        }
        if (c25.g(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static /* synthetic */ int E3(CharSequence charSequence, char c2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = i3(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return C3(charSequence, c2, i, z);
    }

    public static /* synthetic */ String E4(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return C4(str, str2, str3, str4);
    }

    @NotNull
    public static final CharSequence E5(@NotNull CharSequence charSequence) {
        c25.p(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean r = d85.r(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!r) {
                    break;
                }
                length--;
            } else if (r) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static /* synthetic */ int F3(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = i3(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return D3(charSequence, str, i, z);
    }

    @dx4
    private static final String F4(CharSequence charSequence, o85 o85Var, String str) {
        c25.p(charSequence, "<this>");
        c25.p(o85Var, "regex");
        c25.p(str, "replacement");
        return o85Var.u(charSequence, str);
    }

    @NotNull
    public static final CharSequence F5(@NotNull CharSequence charSequence, @NotNull f05<? super Character, Boolean> f05Var) {
        c25.p(charSequence, "<this>");
        c25.p(f05Var, "predicate");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean booleanValue = ((Boolean) wo1.e(charSequence, !z ? i : length, f05Var)).booleanValue();
            if (z) {
                if (!booleanValue) {
                    break;
                }
                length--;
            } else if (booleanValue) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static final int G3(@NotNull CharSequence charSequence, @NotNull Collection<String> collection, int i, boolean z) {
        c25.p(charSequence, "<this>");
        c25.p(collection, "strings");
        hp4<Integer, String> d3 = d3(charSequence, collection, i, z, true);
        if (d3 != null) {
            return d3.m().intValue();
        }
        return -1;
    }

    @dr4(markerClass = {fo4.class})
    @fz4(name = "replaceFirstCharWithChar")
    @dx4
    @gp4
    @tp4(version = "1.5")
    private static final String G4(String str, f05<? super Character, Character> f05Var) {
        c25.p(str, "<this>");
        c25.p(f05Var, "transform");
        if (str.length() > 0) {
            char charValue = f05Var.M(Character.valueOf(str.charAt(0))).charValue();
            String substring = str.substring(1);
            c25.o(substring, "this as java.lang.String).substring(startIndex)");
            return charValue + substring;
        }
        return str;
    }

    @NotNull
    public static final CharSequence G5(@NotNull CharSequence charSequence, @NotNull char... cArr) {
        c25.p(charSequence, "<this>");
        c25.p(cArr, "chars");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean O8 = as4.O8(cArr, charSequence.charAt(!z ? i : length));
            if (z) {
                if (!O8) {
                    break;
                }
                length--;
            } else if (O8) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static final int H3(@NotNull CharSequence charSequence, @NotNull char[] cArr, int i, boolean z) {
        c25.p(charSequence, "<this>");
        c25.p(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(as4.wt(cArr), i);
        }
        for (int u = i55.u(i, i3(charSequence)); -1 < u; u--) {
            char charAt = charSequence.charAt(u);
            int length = cArr.length;
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (e85.J(cArr[i2], charAt, z)) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                return u;
            }
        }
        return -1;
    }

    @dr4(markerClass = {fo4.class})
    @fz4(name = "replaceFirstCharWithCharSequence")
    @dx4
    @gp4
    @tp4(version = "1.5")
    private static final String H4(String str, f05<? super Character, ? extends CharSequence> f05Var) {
        c25.p(str, "<this>");
        c25.p(f05Var, "transform");
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append((Object) f05Var.M(Character.valueOf(str.charAt(0))));
            String substring = str.substring(1);
            c25.o(substring, "this as java.lang.String).substring(startIndex)");
            sb.append(substring);
            return sb.toString();
        }
        return str;
    }

    @dx4
    private static final String H5(String str) {
        c25.p(str, "<this>");
        return E5(str).toString();
    }

    public static /* synthetic */ int I3(CharSequence charSequence, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = i3(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return G3(charSequence, collection, i, z);
    }

    @NotNull
    public static final CharSequence I4(@NotNull CharSequence charSequence, int i, int i2, @NotNull CharSequence charSequence2) {
        c25.p(charSequence, "<this>");
        c25.p(charSequence2, "replacement");
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i);
            c25.o(sb, "this.append(value, startIndex, endIndex)");
            sb.append(charSequence2);
            sb.append(charSequence, i2, charSequence.length());
            c25.o(sb, "this.append(value, startIndex, endIndex)");
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
    }

    @NotNull
    public static final String I5(@NotNull String str, @NotNull f05<? super Character, Boolean> f05Var) {
        c25.p(str, "<this>");
        c25.p(f05Var, "predicate");
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean booleanValue = f05Var.M(Character.valueOf(str.charAt(!z ? i : length))).booleanValue();
            if (z) {
                if (!booleanValue) {
                    break;
                }
                length--;
            } else if (booleanValue) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    public static /* synthetic */ int J3(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = i3(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return H3(charSequence, cArr, i, z);
    }

    @NotNull
    public static final CharSequence J4(@NotNull CharSequence charSequence, @NotNull c55 c55Var, @NotNull CharSequence charSequence2) {
        c25.p(charSequence, "<this>");
        c25.p(c55Var, "range");
        c25.p(charSequence2, "replacement");
        return I4(charSequence, c55Var.c().intValue(), c55Var.d().intValue() + 1, charSequence2);
    }

    @NotNull
    public static final String J5(@NotNull String str, @NotNull char... cArr) {
        c25.p(str, "<this>");
        c25.p(cArr, "chars");
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean O8 = as4.O8(cArr, str.charAt(!z ? i : length));
            if (z) {
                if (!O8) {
                    break;
                }
                length--;
            } else if (O8) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    @NotNull
    public static final g75<String> K3(@NotNull CharSequence charSequence) {
        c25.p(charSequence, "<this>");
        return Z4(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    @dx4
    private static final String K4(String str, int i, int i2, CharSequence charSequence) {
        c25.p(str, "<this>");
        c25.p(charSequence, "replacement");
        return I4(str, i, i2, charSequence).toString();
    }

    @NotNull
    public static final CharSequence K5(@NotNull CharSequence charSequence) {
        c25.p(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!d85.r(charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return "";
    }

    @NotNull
    public static final List<String> L3(@NotNull CharSequence charSequence) {
        c25.p(charSequence, "<this>");
        return o75.c3(K3(charSequence));
    }

    @dx4
    private static final String L4(String str, c55 c55Var, CharSequence charSequence) {
        c25.p(str, "<this>");
        c25.p(c55Var, "range");
        c25.p(charSequence, "replacement");
        return J4(str, c55Var, charSequence).toString();
    }

    @NotNull
    public static final CharSequence L5(@NotNull CharSequence charSequence, @NotNull f05<? super Character, Boolean> f05Var) {
        c25.p(charSequence, "<this>");
        c25.p(f05Var, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i = length - 1;
            if (!((Boolean) wo1.e(charSequence, length, f05Var)).booleanValue()) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i < 0) {
                return "";
            }
            length = i;
        }
    }

    @dx4
    private static final boolean M3(CharSequence charSequence, o85 o85Var) {
        c25.p(charSequence, "<this>");
        c25.p(o85Var, "regex");
        return o85Var.n(charSequence);
    }

    public static final void M4(int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(wo1.l("Limit must be non-negative, but was ", i).toString());
        }
    }

    @NotNull
    public static final CharSequence M5(@NotNull CharSequence charSequence, @NotNull char... cArr) {
        c25.p(charSequence, "<this>");
        c25.p(cArr, "chars");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!as4.O8(cArr, charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return "";
    }

    @NotNull
    public static final String N2(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z) {
        c25.p(charSequence, "<this>");
        c25.p(charSequence2, "other");
        int min = Math.min(charSequence.length(), charSequence2.length());
        int i = 0;
        while (i < min && e85.J(charSequence.charAt(i), charSequence2.charAt(i), z)) {
            i++;
        }
        int i2 = i - 1;
        if (j3(charSequence, i2) || j3(charSequence2, i2)) {
            i--;
        }
        return charSequence.subSequence(0, i).toString();
    }

    @dx4
    private static final String N3(String str) {
        return str == null ? "" : str;
    }

    @dx4
    private static final List<String> N4(CharSequence charSequence, o85 o85Var, int i) {
        c25.p(charSequence, "<this>");
        c25.p(o85Var, "regex");
        return o85Var.x(charSequence, i);
    }

    @dx4
    private static final String N5(String str) {
        c25.p(str, "<this>");
        return K5(str).toString();
    }

    public static /* synthetic */ String O2(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return N2(charSequence, charSequence2, z);
    }

    @NotNull
    public static final CharSequence O3(@NotNull CharSequence charSequence, int i, char c2) {
        c25.p(charSequence, "<this>");
        if (i >= 0) {
            if (i <= charSequence.length()) {
                return charSequence.subSequence(0, charSequence.length());
            }
            StringBuilder sb = new StringBuilder(i);
            sb.append(charSequence);
            ft4 it = new c55(1, i - charSequence.length()).iterator();
            while (it.hasNext()) {
                it.b();
                sb.append(c2);
            }
            return sb;
        }
        throw new IllegalArgumentException(wo1.n("Desired length ", i, " is less than zero."));
    }

    @NotNull
    public static final List<String> O4(@NotNull CharSequence charSequence, @NotNull char[] cArr, boolean z, int i) {
        c25.p(charSequence, "<this>");
        c25.p(cArr, "delimiters");
        if (cArr.length == 1) {
            return Q4(charSequence, String.valueOf(cArr[0]), z, i);
        }
        Iterable<c55> N = o75.N(Y3(charSequence, cArr, 0, z, i, 2, null));
        ArrayList arrayList = new ArrayList(ks4.Z(N, 10));
        for (c55 c55Var : N) {
            arrayList.add(j5(charSequence, c55Var));
        }
        return arrayList;
    }

    @NotNull
    public static final String O5(@NotNull String str, @NotNull f05<? super Character, Boolean> f05Var) {
        CharSequence charSequence;
        c25.p(str, "<this>");
        c25.p(f05Var, "predicate");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!f05Var.M(Character.valueOf(str.charAt(length))).booleanValue()) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                } else if (i < 0) {
                    break;
                } else {
                    length = i;
                }
            }
            return charSequence.toString();
        }
        charSequence = "";
        return charSequence.toString();
    }

    @NotNull
    public static final String P2(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z) {
        int length;
        c25.p(charSequence, "<this>");
        c25.p(charSequence2, "other");
        int length2 = charSequence.length();
        int min = Math.min(length2, charSequence2.length());
        int i = 0;
        while (i < min && e85.J(charSequence.charAt((length2 - i) - 1), charSequence2.charAt((length - i) - 1), z)) {
            i++;
        }
        if (j3(charSequence, (length2 - i) - 1) || j3(charSequence2, (length - i) - 1)) {
            i--;
        }
        return charSequence.subSequence(length2 - i, length2).toString();
    }

    @NotNull
    public static final String P3(@NotNull String str, int i, char c2) {
        c25.p(str, "<this>");
        return O3(str, i, c2).toString();
    }

    @NotNull
    public static final List<String> P4(@NotNull CharSequence charSequence, @NotNull String[] strArr, boolean z, int i) {
        c25.p(charSequence, "<this>");
        c25.p(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (!(str.length() == 0)) {
                return Q4(charSequence, str, z, i);
            }
        }
        Iterable<c55> N = o75.N(Z3(charSequence, strArr, 0, z, i, 2, null));
        ArrayList arrayList = new ArrayList(ks4.Z(N, 10));
        for (c55 c55Var : N) {
            arrayList.add(j5(charSequence, c55Var));
        }
        return arrayList;
    }

    @NotNull
    public static final String P5(@NotNull String str, @NotNull char... cArr) {
        CharSequence charSequence;
        c25.p(str, "<this>");
        c25.p(cArr, "chars");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!as4.O8(cArr, str.charAt(length))) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                } else if (i < 0) {
                    break;
                } else {
                    length = i;
                }
            }
            return charSequence.toString();
        }
        charSequence = "";
        return charSequence.toString();
    }

    public static /* synthetic */ String Q2(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return P2(charSequence, charSequence2, z);
    }

    public static /* synthetic */ CharSequence Q3(CharSequence charSequence, int i, char c2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c2 = gl4.R;
        }
        return O3(charSequence, i, c2);
    }

    private static final List<String> Q4(CharSequence charSequence, String str, boolean z, int i) {
        M4(i);
        int i2 = 0;
        int n3 = n3(charSequence, str, 0, z);
        if (n3 != -1 && i != 1) {
            boolean z2 = i > 0;
            ArrayList arrayList = new ArrayList(z2 ? i55.u(i, 10) : 10);
            do {
                arrayList.add(charSequence.subSequence(i2, n3).toString());
                i2 = str.length() + n3;
                if (z2 && arrayList.size() == i - 1) {
                    break;
                }
                n3 = n3(charSequence, str, i2, z);
            } while (n3 != -1);
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        return is4.l(charSequence.toString());
    }

    @NotNull
    public static final CharSequence Q5(@NotNull CharSequence charSequence) {
        c25.p(charSequence, "<this>");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!d85.r(charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    public static final boolean R2(@NotNull CharSequence charSequence, char c2, boolean z) {
        c25.p(charSequence, "<this>");
        return q3(charSequence, c2, 0, z, 2, null) >= 0;
    }

    public static /* synthetic */ String R3(String str, int i, char c2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c2 = gl4.R;
        }
        return P3(str, i, c2);
    }

    public static /* synthetic */ List R4(CharSequence charSequence, o85 o85Var, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        c25.p(charSequence, "<this>");
        c25.p(o85Var, "regex");
        return o85Var.x(charSequence, i);
    }

    @NotNull
    public static final CharSequence R5(@NotNull CharSequence charSequence, @NotNull f05<? super Character, Boolean> f05Var) {
        int m = wo1.m(charSequence, "<this>", f05Var, "predicate");
        for (int i = 0; i < m; i++) {
            if (!((Boolean) wo1.e(charSequence, i, f05Var)).booleanValue()) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    public static final boolean S2(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z) {
        c25.p(charSequence, "<this>");
        c25.p(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (r3(charSequence, (String) charSequence2, 0, z, 2, null) >= 0) {
                return true;
            }
        } else if (p3(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    @NotNull
    public static final CharSequence S3(@NotNull CharSequence charSequence, int i, char c2) {
        c25.p(charSequence, "<this>");
        if (i >= 0) {
            if (i <= charSequence.length()) {
                return charSequence.subSequence(0, charSequence.length());
            }
            StringBuilder sb = new StringBuilder(i);
            ft4 it = new c55(1, i - charSequence.length()).iterator();
            while (it.hasNext()) {
                it.b();
                sb.append(c2);
            }
            sb.append(charSequence);
            return sb;
        }
        throw new IllegalArgumentException(wo1.n("Desired length ", i, " is less than zero."));
    }

    public static /* synthetic */ List S4(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return O4(charSequence, cArr, z, i);
    }

    @NotNull
    public static final CharSequence S5(@NotNull CharSequence charSequence, @NotNull char... cArr) {
        c25.p(charSequence, "<this>");
        c25.p(cArr, "chars");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!as4.O8(cArr, charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    @dx4
    private static final boolean T2(CharSequence charSequence, o85 o85Var) {
        c25.p(charSequence, "<this>");
        c25.p(o85Var, "regex");
        return o85Var.b(charSequence);
    }

    @NotNull
    public static final String T3(@NotNull String str, int i, char c2) {
        c25.p(str, "<this>");
        return S3(str, i, c2).toString();
    }

    public static /* synthetic */ List T4(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return P4(charSequence, strArr, z, i);
    }

    @dx4
    private static final String T5(String str) {
        c25.p(str, "<this>");
        return Q5(str).toString();
    }

    public static /* synthetic */ boolean U2(CharSequence charSequence, char c2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return R2(charSequence, c2, z);
    }

    public static /* synthetic */ CharSequence U3(CharSequence charSequence, int i, char c2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c2 = gl4.R;
        }
        return S3(charSequence, i, c2);
    }

    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.6")
    private static final g75<String> U4(CharSequence charSequence, o85 o85Var, int i) {
        c25.p(charSequence, "<this>");
        c25.p(o85Var, "regex");
        return o85Var.A(charSequence, i);
    }

    @NotNull
    public static final String U5(@NotNull String str, @NotNull f05<? super Character, Boolean> f05Var) {
        CharSequence charSequence;
        c25.p(str, "<this>");
        c25.p(f05Var, "predicate");
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                charSequence = "";
                break;
            } else if (!f05Var.M(Character.valueOf(str.charAt(i))).booleanValue()) {
                charSequence = str.subSequence(i, str.length());
                break;
            } else {
                i++;
            }
        }
        return charSequence.toString();
    }

    public static /* synthetic */ boolean V2(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return S2(charSequence, charSequence2, z);
    }

    public static /* synthetic */ String V3(String str, int i, char c2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c2 = gl4.R;
        }
        return T3(str, i, c2);
    }

    @NotNull
    public static final g75<String> V4(@NotNull CharSequence charSequence, @NotNull char[] cArr, boolean z, int i) {
        c25.p(charSequence, "<this>");
        c25.p(cArr, "delimiters");
        return o75.k1(Y3(charSequence, cArr, 0, z, i, 2, null), new e(charSequence));
    }

    @NotNull
    public static final String V5(@NotNull String str, @NotNull char... cArr) {
        CharSequence charSequence;
        c25.p(str, "<this>");
        c25.p(cArr, "chars");
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                charSequence = "";
                break;
            } else if (!as4.O8(cArr, str.charAt(i))) {
                charSequence = str.subSequence(i, str.length());
                break;
            } else {
                i++;
            }
        }
        return charSequence.toString();
    }

    public static final boolean W2(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return b95.K1((String) charSequence, (String) charSequence2, true);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!e85.J(charSequence.charAt(i), charSequence2.charAt(i), true)) {
                return false;
            }
        }
        return true;
    }

    private static final g75<c55> W3(CharSequence charSequence, char[] cArr, int i, boolean z, int i2) {
        M4(i2);
        return new h85(charSequence, i, i2, new b(cArr, z));
    }

    @NotNull
    public static final g75<String> W4(@NotNull CharSequence charSequence, @NotNull String[] strArr, boolean z, int i) {
        c25.p(charSequence, "<this>");
        c25.p(strArr, "delimiters");
        return o75.k1(Z3(charSequence, strArr, 0, z, i, 2, null), new d(charSequence));
    }

    public static final boolean X2(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return c25.g(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    private static final g75<c55> X3(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        M4(i2);
        return new h85(charSequence, i, i2, new c(zr4.t(strArr), z));
    }

    public static /* synthetic */ g75 X4(CharSequence charSequence, o85 o85Var, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        c25.p(charSequence, "<this>");
        c25.p(o85Var, "regex");
        return o85Var.A(charSequence, i);
    }

    public static final boolean Y2(@NotNull CharSequence charSequence, char c2, boolean z) {
        c25.p(charSequence, "<this>");
        return charSequence.length() > 0 && e85.J(charSequence.charAt(i3(charSequence)), c2, z);
    }

    public static /* synthetic */ g75 Y3(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return W3(charSequence, cArr, i, z, i2);
    }

    public static /* synthetic */ g75 Y4(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return V4(charSequence, cArr, z, i);
    }

    public static final boolean Z2(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z) {
        c25.p(charSequence, "<this>");
        c25.p(charSequence2, "suffix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return b95.J1((String) charSequence, (String) charSequence2, false, 2, null);
        }
        return a4(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
    }

    public static /* synthetic */ g75 Z3(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return X3(charSequence, strArr, i, z, i2);
    }

    public static /* synthetic */ g75 Z4(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return W4(charSequence, strArr, z, i);
    }

    public static /* synthetic */ boolean a3(CharSequence charSequence, char c2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return Y2(charSequence, c2, z);
    }

    public static final boolean a4(@NotNull CharSequence charSequence, int i, @NotNull CharSequence charSequence2, int i2, int i3, boolean z) {
        c25.p(charSequence, "<this>");
        c25.p(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!e85.J(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean a5(@NotNull CharSequence charSequence, char c2, boolean z) {
        c25.p(charSequence, "<this>");
        return charSequence.length() > 0 && e85.J(charSequence.charAt(0), c2, z);
    }

    public static /* synthetic */ boolean b3(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return Z2(charSequence, charSequence2, z);
    }

    @NotNull
    public static final CharSequence b4(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        c25.p(charSequence, "<this>");
        c25.p(charSequence2, "prefix");
        if (f5(charSequence, charSequence2, false, 2, null)) {
            return charSequence.subSequence(charSequence2.length(), charSequence.length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    public static final boolean b5(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, int i, boolean z) {
        c25.p(charSequence, "<this>");
        c25.p(charSequence2, "prefix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return b95.t2((String) charSequence, (String) charSequence2, i, false, 4, null);
        }
        return a4(charSequence, i, charSequence2, 0, charSequence2.length(), z);
    }

    @Nullable
    public static final hp4<Integer, String> c3(@NotNull CharSequence charSequence, @NotNull Collection<String> collection, int i, boolean z) {
        c25.p(charSequence, "<this>");
        c25.p(collection, "strings");
        return d3(charSequence, collection, i, z, false);
    }

    @NotNull
    public static final String c4(@NotNull String str, @NotNull CharSequence charSequence) {
        c25.p(str, "<this>");
        c25.p(charSequence, "prefix");
        if (f5(str, charSequence, false, 2, null)) {
            String substring = str.substring(charSequence.length());
            c25.o(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        return str;
    }

    public static final boolean c5(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z) {
        c25.p(charSequence, "<this>");
        c25.p(charSequence2, "prefix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return b95.u2((String) charSequence, (String) charSequence2, false, 2, null);
        }
        return a4(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    public static final hp4<Integer, String> d3(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        Object obj;
        Object obj2;
        if (!z && collection.size() == 1) {
            String str = (String) rs4.a5(collection);
            int r3 = !z2 ? r3(charSequence, str, i, false, 4, null) : F3(charSequence, str, i, false, 4, null);
            if (r3 < 0) {
                return null;
            }
            return cq4.a(Integer.valueOf(r3), str);
        }
        a55 c55Var = !z2 ? new c55(i55.n(i, 0), charSequence.length()) : i55.W(i55.u(i, i3(charSequence)), 0);
        if (charSequence instanceof String) {
            int e2 = c55Var.e();
            int h = c55Var.h();
            int i2 = c55Var.i();
            if ((i2 > 0 && e2 <= h) || (i2 < 0 && h <= e2)) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        String str2 = (String) obj2;
                        if (b95.d2(str2, 0, (String) charSequence, e2, str2.length(), z)) {
                            break;
                        }
                    }
                    String str3 = (String) obj2;
                    if (str3 == null) {
                        if (e2 == h) {
                            break;
                        }
                        e2 += i2;
                    } else {
                        return cq4.a(Integer.valueOf(e2), str3);
                    }
                }
            }
        } else {
            int e3 = c55Var.e();
            int h2 = c55Var.h();
            int i3 = c55Var.i();
            if ((i3 > 0 && e3 <= h2) || (i3 < 0 && h2 <= e3)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        String str4 = (String) obj;
                        if (a4(str4, 0, charSequence, e3, str4.length(), z)) {
                            break;
                        }
                    }
                    String str5 = (String) obj;
                    if (str5 == null) {
                        if (e3 == h2) {
                            break;
                        }
                        e3 += i3;
                    } else {
                        return cq4.a(Integer.valueOf(e3), str5);
                    }
                }
            }
        }
        return null;
    }

    @NotNull
    public static final CharSequence d4(@NotNull CharSequence charSequence, int i, int i2) {
        c25.p(charSequence, "<this>");
        if (i2 < i) {
            throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
        } else if (i2 == i) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb = new StringBuilder(charSequence.length() - (i2 - i));
            sb.append(charSequence, 0, i);
            c25.o(sb, "this.append(value, startIndex, endIndex)");
            sb.append(charSequence, i2, charSequence.length());
            c25.o(sb, "this.append(value, startIndex, endIndex)");
            return sb;
        }
    }

    public static /* synthetic */ boolean d5(CharSequence charSequence, char c2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return a5(charSequence, c2, z);
    }

    public static /* synthetic */ hp4 e3(CharSequence charSequence, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return c3(charSequence, collection, i, z);
    }

    @NotNull
    public static final CharSequence e4(@NotNull CharSequence charSequence, @NotNull c55 c55Var) {
        c25.p(charSequence, "<this>");
        c25.p(c55Var, "range");
        return d4(charSequence, c55Var.c().intValue(), c55Var.d().intValue() + 1);
    }

    public static /* synthetic */ boolean e5(CharSequence charSequence, CharSequence charSequence2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return b5(charSequence, charSequence2, i, z);
    }

    @Nullable
    public static final hp4<Integer, String> f3(@NotNull CharSequence charSequence, @NotNull Collection<String> collection, int i, boolean z) {
        c25.p(charSequence, "<this>");
        c25.p(collection, "strings");
        return d3(charSequence, collection, i, z, true);
    }

    @dx4
    private static final String f4(String str, int i, int i2) {
        c25.p(str, "<this>");
        return d4(str, i, i2).toString();
    }

    public static /* synthetic */ boolean f5(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c5(charSequence, charSequence2, z);
    }

    public static /* synthetic */ hp4 g3(CharSequence charSequence, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = i3(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return f3(charSequence, collection, i, z);
    }

    @dx4
    private static final String g4(String str, c55 c55Var) {
        c25.p(str, "<this>");
        c25.p(c55Var, "range");
        return e4(str, c55Var).toString();
    }

    @NotNull
    public static final CharSequence g5(@NotNull CharSequence charSequence, @NotNull c55 c55Var) {
        c25.p(charSequence, "<this>");
        c25.p(c55Var, "range");
        return charSequence.subSequence(c55Var.c().intValue(), c55Var.d().intValue() + 1);
    }

    @NotNull
    public static final c55 h3(@NotNull CharSequence charSequence) {
        c25.p(charSequence, "<this>");
        return new c55(0, charSequence.length() - 1);
    }

    @NotNull
    public static final CharSequence h4(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        c25.p(charSequence, "<this>");
        c25.p(charSequence2, "suffix");
        if (b3(charSequence, charSequence2, false, 2, null)) {
            return charSequence.subSequence(0, charSequence.length() - charSequence2.length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @dx4
    @xn4(message = "Use parameters named startIndex and endIndex.", replaceWith = @op4(expression = "subSequence(startIndex = start, endIndex = end)", imports = {}))
    private static final CharSequence h5(String str, int i, int i2) {
        c25.p(str, "<this>");
        return str.subSequence(i, i2);
    }

    public static final int i3(@NotNull CharSequence charSequence) {
        c25.p(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    @NotNull
    public static final String i4(@NotNull String str, @NotNull CharSequence charSequence) {
        c25.p(str, "<this>");
        c25.p(charSequence, "suffix");
        if (b3(str, charSequence, false, 2, null)) {
            String substring = str.substring(0, str.length() - charSequence.length());
            c25.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    @dx4
    private static final String i5(CharSequence charSequence, int i, int i2) {
        c25.p(charSequence, "<this>");
        return charSequence.subSequence(i, i2).toString();
    }

    public static final boolean j3(@NotNull CharSequence charSequence, int i) {
        c25.p(charSequence, "<this>");
        return new c55(0, charSequence.length() + (-2)).o(i) && Character.isHighSurrogate(charSequence.charAt(i)) && Character.isLowSurrogate(charSequence.charAt(i + 1));
    }

    @NotNull
    public static final CharSequence j4(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        c25.p(charSequence, "<this>");
        c25.p(charSequence2, "delimiter");
        return k4(charSequence, charSequence2, charSequence2);
    }

    @NotNull
    public static final String j5(@NotNull CharSequence charSequence, @NotNull c55 c55Var) {
        c25.p(charSequence, "<this>");
        c25.p(c55Var, "range");
        return charSequence.subSequence(c55Var.c().intValue(), c55Var.d().intValue() + 1).toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dx4
    @tp4(version = "1.3")
    private static final <C extends CharSequence & R, R> R k3(C c2, uz4<? extends R> uz4Var) {
        c25.p(uz4Var, "defaultValue");
        return b95.U1(c2) ? uz4Var.x() : c2;
    }

    @NotNull
    public static final CharSequence k4(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3) {
        c25.p(charSequence, "<this>");
        c25.p(charSequence2, "prefix");
        c25.p(charSequence3, "suffix");
        if (charSequence.length() >= charSequence3.length() + charSequence2.length() && f5(charSequence, charSequence2, false, 2, null) && b3(charSequence, charSequence3, false, 2, null)) {
            return charSequence.subSequence(charSequence2.length(), charSequence.length() - charSequence3.length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @NotNull
    public static final String k5(@NotNull String str, @NotNull c55 c55Var) {
        c25.p(str, "<this>");
        c25.p(c55Var, "range");
        String substring = str.substring(c55Var.c().intValue(), c55Var.d().intValue() + 1);
        c25.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dx4
    @tp4(version = "1.3")
    private static final <C extends CharSequence & R, R> R l3(C c2, uz4<? extends R> uz4Var) {
        c25.p(uz4Var, "defaultValue");
        return c2.length() == 0 ? uz4Var.x() : c2;
    }

    @NotNull
    public static final String l4(@NotNull String str, @NotNull CharSequence charSequence) {
        c25.p(str, "<this>");
        c25.p(charSequence, "delimiter");
        return m4(str, charSequence, charSequence);
    }

    public static /* synthetic */ String l5(CharSequence charSequence, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = charSequence.length();
        }
        c25.p(charSequence, "<this>");
        return charSequence.subSequence(i, i2).toString();
    }

    public static final int m3(@NotNull CharSequence charSequence, char c2, int i, boolean z) {
        c25.p(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c2, i);
        }
        return t3(charSequence, new char[]{c2}, i, z);
    }

    @NotNull
    public static final String m4(@NotNull String str, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        c25.p(str, "<this>");
        c25.p(charSequence, "prefix");
        c25.p(charSequence2, "suffix");
        if (str.length() >= charSequence2.length() + charSequence.length() && f5(str, charSequence, false, 2, null) && b3(str, charSequence2, false, 2, null)) {
            String substring = str.substring(charSequence.length(), str.length() - charSequence2.length());
            c25.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    @NotNull
    public static final String m5(@NotNull String str, char c2, @NotNull String str2) {
        c25.p(str, "<this>");
        c25.p(str2, "missingDelimiterValue");
        int q3 = q3(str, c2, 0, false, 6, null);
        if (q3 == -1) {
            return str2;
        }
        String substring = str.substring(q3 + 1, str.length());
        c25.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final int n3(@NotNull CharSequence charSequence, @NotNull String str, int i, boolean z) {
        c25.p(charSequence, "<this>");
        c25.p(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return p3(charSequence, str, i, charSequence.length(), z, false, 16, null);
    }

    @dx4
    private static final String n4(CharSequence charSequence, o85 o85Var, String str) {
        c25.p(charSequence, "<this>");
        c25.p(o85Var, "regex");
        c25.p(str, "replacement");
        return o85Var.p(charSequence, str);
    }

    @NotNull
    public static final String n5(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        c25.p(str, "<this>");
        c25.p(str2, "delimiter");
        c25.p(str3, "missingDelimiterValue");
        int r3 = r3(str, str2, 0, false, 6, null);
        if (r3 == -1) {
            return str3;
        }
        String substring = str.substring(str2.length() + r3, str.length());
        c25.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    private static final int o3(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        a55 W;
        if (!z2) {
            W = new c55(i55.n(i, 0), i55.u(i2, charSequence.length()));
        } else {
            W = i55.W(i55.u(i, i3(charSequence)), i55.n(i2, 0));
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int e2 = W.e();
            int h = W.h();
            int i3 = W.i();
            if ((i3 <= 0 || e2 > h) && (i3 >= 0 || h > e2)) {
                return -1;
            }
            while (!b95.d2((String) charSequence2, 0, (String) charSequence, e2, charSequence2.length(), z)) {
                if (e2 == h) {
                    return -1;
                }
                e2 += i3;
            }
            return e2;
        }
        int e3 = W.e();
        int h2 = W.h();
        int i4 = W.i();
        if ((i4 <= 0 || e3 > h2) && (i4 >= 0 || h2 > e3)) {
            return -1;
        }
        while (!a4(charSequence2, 0, charSequence, e3, charSequence2.length(), z)) {
            if (e3 == h2) {
                return -1;
            }
            e3 += i4;
        }
        return e3;
    }

    @dx4
    private static final String o4(CharSequence charSequence, o85 o85Var, f05<? super m85, ? extends CharSequence> f05Var) {
        c25.p(charSequence, "<this>");
        c25.p(o85Var, "regex");
        c25.p(f05Var, "transform");
        return o85Var.t(charSequence, f05Var);
    }

    public static /* synthetic */ String o5(String str, char c2, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m5(str, c2, str2);
    }

    public static /* synthetic */ int p3(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        return o3(charSequence, charSequence2, i, i2, z, (i3 & 16) != 0 ? false : z2);
    }

    @NotNull
    public static final String p4(@NotNull String str, char c2, @NotNull String str2, @NotNull String str3) {
        c25.p(str, "<this>");
        c25.p(str2, "replacement");
        c25.p(str3, "missingDelimiterValue");
        int q3 = q3(str, c2, 0, false, 6, null);
        return q3 == -1 ? str3 : I4(str, q3 + 1, str.length(), str2).toString();
    }

    public static /* synthetic */ String p5(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return n5(str, str2, str3);
    }

    public static /* synthetic */ int q3(CharSequence charSequence, char c2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m3(charSequence, c2, i, z);
    }

    @NotNull
    public static final String q4(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        c25.p(str, "<this>");
        c25.p(str2, "delimiter");
        c25.p(str3, "replacement");
        c25.p(str4, "missingDelimiterValue");
        int r3 = r3(str, str2, 0, false, 6, null);
        return r3 == -1 ? str4 : I4(str, str2.length() + r3, str.length(), str3).toString();
    }

    @NotNull
    public static final String q5(@NotNull String str, char c2, @NotNull String str2) {
        c25.p(str, "<this>");
        c25.p(str2, "missingDelimiterValue");
        int E3 = E3(str, c2, 0, false, 6, null);
        if (E3 == -1) {
            return str2;
        }
        String substring = str.substring(E3 + 1, str.length());
        c25.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ int r3(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return n3(charSequence, str, i, z);
    }

    public static /* synthetic */ String r4(String str, char c2, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return p4(str, c2, str2, str3);
    }

    @NotNull
    public static final String r5(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        c25.p(str, "<this>");
        c25.p(str2, "delimiter");
        c25.p(str3, "missingDelimiterValue");
        int F3 = F3(str, str2, 0, false, 6, null);
        if (F3 == -1) {
            return str3;
        }
        String substring = str.substring(str2.length() + F3, str.length());
        c25.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final int s3(@NotNull CharSequence charSequence, @NotNull Collection<String> collection, int i, boolean z) {
        c25.p(charSequence, "<this>");
        c25.p(collection, "strings");
        hp4<Integer, String> d3 = d3(charSequence, collection, i, z, false);
        if (d3 != null) {
            return d3.m().intValue();
        }
        return -1;
    }

    public static /* synthetic */ String s4(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return q4(str, str2, str3, str4);
    }

    public static /* synthetic */ String s5(String str, char c2, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return q5(str, c2, str2);
    }

    public static final int t3(@NotNull CharSequence charSequence, @NotNull char[] cArr, int i, boolean z) {
        boolean z2;
        c25.p(charSequence, "<this>");
        c25.p(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(as4.wt(cArr), i);
        }
        ft4 it = new c55(i55.n(i, 0), i3(charSequence)).iterator();
        while (it.hasNext()) {
            int b2 = it.b();
            char charAt = charSequence.charAt(b2);
            int length = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z2 = false;
                    continue;
                    break;
                } else if (e85.J(cArr[i2], charAt, z)) {
                    z2 = true;
                    continue;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                return b2;
            }
        }
        return -1;
    }

    @NotNull
    public static final String t4(@NotNull String str, char c2, @NotNull String str2, @NotNull String str3) {
        c25.p(str, "<this>");
        c25.p(str2, "replacement");
        c25.p(str3, "missingDelimiterValue");
        int E3 = E3(str, c2, 0, false, 6, null);
        return E3 == -1 ? str3 : I4(str, E3 + 1, str.length(), str2).toString();
    }

    public static /* synthetic */ String t5(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return r5(str, str2, str3);
    }

    public static /* synthetic */ int u3(CharSequence charSequence, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return s3(charSequence, collection, i, z);
    }

    @NotNull
    public static final String u4(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        c25.p(str, "<this>");
        c25.p(str2, "delimiter");
        c25.p(str3, "replacement");
        c25.p(str4, "missingDelimiterValue");
        int F3 = F3(str, str2, 0, false, 6, null);
        return F3 == -1 ? str4 : I4(str, str2.length() + F3, str.length(), str3).toString();
    }

    @NotNull
    public static final String u5(@NotNull String str, char c2, @NotNull String str2) {
        c25.p(str, "<this>");
        c25.p(str2, "missingDelimiterValue");
        int q3 = q3(str, c2, 0, false, 6, null);
        if (q3 == -1) {
            return str2;
        }
        String substring = str.substring(0, q3);
        c25.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ int v3(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return t3(charSequence, cArr, i, z);
    }

    public static /* synthetic */ String v4(String str, char c2, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return t4(str, c2, str2, str3);
    }

    @NotNull
    public static final String v5(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        c25.p(str, "<this>");
        c25.p(str2, "delimiter");
        c25.p(str3, "missingDelimiterValue");
        int r3 = r3(str, str2, 0, false, 6, null);
        if (r3 == -1) {
            return str3;
        }
        String substring = str.substring(0, r3);
        c25.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @dx4
    private static final boolean w3(CharSequence charSequence) {
        c25.p(charSequence, "<this>");
        return charSequence.length() == 0;
    }

    public static /* synthetic */ String w4(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return u4(str, str2, str3, str4);
    }

    public static /* synthetic */ String w5(String str, char c2, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return u5(str, c2, str2);
    }

    @dx4
    private static final boolean x3(CharSequence charSequence) {
        c25.p(charSequence, "<this>");
        return !b95.U1(charSequence);
    }

    @NotNull
    public static final String x4(@NotNull String str, char c2, @NotNull String str2, @NotNull String str3) {
        c25.p(str, "<this>");
        c25.p(str2, "replacement");
        c25.p(str3, "missingDelimiterValue");
        int q3 = q3(str, c2, 0, false, 6, null);
        return q3 == -1 ? str3 : I4(str, 0, q3, str2).toString();
    }

    public static /* synthetic */ String x5(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return v5(str, str2, str3);
    }

    @dx4
    private static final boolean y3(CharSequence charSequence) {
        c25.p(charSequence, "<this>");
        return charSequence.length() > 0;
    }

    @NotNull
    public static final String y4(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        c25.p(str, "<this>");
        c25.p(str2, "delimiter");
        c25.p(str3, "replacement");
        c25.p(str4, "missingDelimiterValue");
        int r3 = r3(str, str2, 0, false, 6, null);
        return r3 == -1 ? str4 : I4(str, 0, r3, str3).toString();
    }

    @NotNull
    public static final String y5(@NotNull String str, char c2, @NotNull String str2) {
        c25.p(str, "<this>");
        c25.p(str2, "missingDelimiterValue");
        int E3 = E3(str, c2, 0, false, 6, null);
        if (E3 == -1) {
            return str2;
        }
        String substring = str.substring(0, E3);
        c25.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @dx4
    private static final boolean z3(CharSequence charSequence) {
        return charSequence == null || b95.U1(charSequence);
    }

    public static /* synthetic */ String z4(String str, char c2, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return x4(str, c2, str2, str3);
    }

    @NotNull
    public static final String z5(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        c25.p(str, "<this>");
        c25.p(str2, "delimiter");
        c25.p(str3, "missingDelimiterValue");
        int F3 = F3(str, str2, 0, false, 6, null);
        if (F3 == -1) {
            return str3;
        }
        String substring = str.substring(0, F3);
        c25.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}