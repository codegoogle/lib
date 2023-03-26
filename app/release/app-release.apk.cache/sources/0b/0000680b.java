package com.p7700g.p99005;

import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Iterator;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageInputStream;

/* compiled from: RenderedImageProvider.java */
@jm4({"image/*"})
@tl4({"image/*", tm4.x})
/* loaded from: classes3.dex */
public final class yt3 extends av3<RenderedImage> {
    private static final tm4 b = new tm4("image", tm4.g);

    private String k(String str) {
        Iterator imageWritersByMIMEType = ImageIO.getImageWritersByMIMEType(str);
        if (imageWritersByMIMEType.hasNext()) {
            return ((ImageWriter) imageWritersByMIMEType.next()).getOriginatingProvider().getFormatNames()[0];
        }
        return null;
    }

    private String l(tm4 tm4Var) {
        return k(tm4Var.toString());
    }

    @Override // com.p7700g.p99005.in4
    public boolean c(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        return RenderedImage.class == cls || BufferedImage.class == cls;
    }

    @Override // com.p7700g.p99005.jn4
    public boolean e(Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var) {
        return RenderedImage.class.isAssignableFrom(cls);
    }

    @Override // com.p7700g.p99005.in4
    /* renamed from: m */
    public RenderedImage b(Class<RenderedImage> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, String> um4Var, InputStream inputStream) throws IOException {
        if (b.e(tm4Var)) {
            Iterator imageReadersByMIMEType = ImageIO.getImageReadersByMIMEType(tm4Var.toString());
            if (imageReadersByMIMEType.hasNext()) {
                ImageReader imageReader = (ImageReader) imageReadersByMIMEType.next();
                ImageInputStream createImageInputStream = ImageIO.createImageInputStream(inputStream);
                imageReader.setInput(createImageInputStream, true, true);
                BufferedImage read = imageReader.read(0, imageReader.getDefaultReadParam());
                createImageInputStream.close();
                imageReader.dispose();
                return read;
            }
            throw new IOException("The image-based media type " + tm4Var + "is not supported for reading");
        }
        return ImageIO.read(inputStream);
    }

    @Override // com.p7700g.p99005.jn4
    /* renamed from: n */
    public void a(RenderedImage renderedImage, Class<?> cls, Type type, Annotation[] annotationArr, tm4 tm4Var, um4<String, Object> um4Var, OutputStream outputStream) throws IOException {
        String l = l(tm4Var);
        if (l != null) {
            ImageIO.write(renderedImage, l, outputStream);
            return;
        }
        throw new IOException("The image-based media type " + tm4Var + " is not supported for writing");
    }
}