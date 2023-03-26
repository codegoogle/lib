package com.p7700g.p99005;

import com.p7700g.p99005.ym4;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.ParseException;
import javax.mail.util.ByteArrayDataSource;

/* compiled from: MimeMultipartProvider.java */
/* loaded from: classes3.dex */
public final class wt3 extends av3<MimeMultipart> {
    @Override // com.p7700g.p99005.in4
    public boolean c(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        return cls == MimeMultipart.class;
    }

    @Override // com.p7700g.p99005.jn4
    public boolean e(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        return cls == MimeMultipart.class;
    }

    @Override // com.p7700g.p99005.in4
    /* renamed from: k */
    public MimeMultipart b(Class<MimeMultipart> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, String> um4Var, InputStream inputStream) throws IOException {
        if (tm4Var == null) {
            tm4Var = new tm4("multipart", "form-data");
        }
        try {
            return new MimeMultipart(new ByteArrayDataSource(inputStream, tm4Var.toString()));
        } catch (ParseException e) {
            throw new lm4((Throwable) e, ym4.b.BAD_REQUEST);
        } catch (MessagingException e2) {
            throw new lm4((Throwable) e2, ym4.b.INTERNAL_SERVER_ERROR);
        }
    }

    @Override // com.p7700g.p99005.jn4
    /* renamed from: l */
    public void a(MimeMultipart mimeMultipart, Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, Object> um4Var, OutputStream outputStream) throws IOException {
        try {
            mimeMultipart.writeTo(outputStream);
        } catch (MessagingException e) {
            throw new lm4((Throwable) e, ym4.b.INTERNAL_SERVER_ERROR);
        }
    }
}