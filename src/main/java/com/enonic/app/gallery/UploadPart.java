package com.enonic.app.gallery;

import org.apache.commons.fileupload.FileItem;

import com.google.common.io.ByteSource;
import com.google.common.io.ByteStreams;

public final class UploadPart
{
    private final FileItem part;

    public UploadPart( final FileItem part )
    {
        this.part = part;
    }

    public String getName()
    {
        return this.part.getName();
    }

    public String getContentType()
    {
        return this.part.getContentType();
    }

    public long getSize()
    {
        return this.part.getSize();
    }

    public ByteSource getBytes()
        throws Exception
    {
        final byte[] data = ByteStreams.toByteArray( this.part.getInputStream() );
        return ByteSource.wrap( data );
    }
}
