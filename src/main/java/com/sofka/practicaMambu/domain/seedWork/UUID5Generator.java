package com.sofka.practicaMambu.domain.seedWork;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public class UUID5Generator {
    public static UUID fromUTF8(String name) {
        return fromBytes(name.getBytes(Charset.forName("UTF-8")));
    }

    private static UUID fromBytes(byte[] name) {
        if (name == null) {
            throw new NullPointerException("name == null");
        }
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            return makeUUID(md.digest(name), 5);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    private static UUID makeUUID(byte[] hash, int version) {
        long mostSignificativeBit = peekLong(hash, 0, ByteOrder.BIG_ENDIAN);
        long leastSignificativeBit = peekLong(hash, 8, ByteOrder.BIG_ENDIAN);
        //Establecer version
        mostSignificativeBit &= ~(0xfL << 12);
        mostSignificativeBit |= ((long) version) << 12;
        //Establecer variant
        leastSignificativeBit &= ~(0x3L << 62);
        leastSignificativeBit |= 2L << 62;
        return new UUID(mostSignificativeBit, leastSignificativeBit);
    }

    private static long peekLong(final byte[] src, final int offset, final ByteOrder order) {
        long ans = 0;
        if (order == ByteOrder.BIG_ENDIAN) {
            for (int i = offset; i < offset + 8; i += 1) {
                ans <<= 8;
                ans |= src[i] & 0xffL;
            }
        } else {
            for (int i = offset + 7; i >= offset; i -= 1) {
                ans <<= 8;
                ans |= src[i] & 0xffL;
            }
        }
        return ans;
    }
}
