// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CMSG_SIGNED_AND_ENVELOPED_ENCODE_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbSize"),
            Constants$root.C_LONG$LAYOUT.withName("cSigners"),
            Constants$root.C_POINTER$LAYOUT.withName("rgSigners"),
            Constants$root.C_LONG$LAYOUT.withName("cCertEncoded"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("rgCertEncoded"),
            Constants$root.C_LONG$LAYOUT.withName("cCrlEncoded"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("rgCrlEncoded")
        ).withName("SignedInfo"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbSize"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_LONG_LONG$LAYOUT.withName("hCryptProv"),
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("pszObjId"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("cbData"),
                    MemoryLayout.paddingLayout(32),
                    Constants$root.C_POINTER$LAYOUT.withName("pbData")
                ).withName("Parameters")
            ).withName("ContentEncryptionAlgorithm"),
            Constants$root.C_POINTER$LAYOUT.withName("pvEncryptionAuxInfo"),
            Constants$root.C_LONG$LAYOUT.withName("cRecipients"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("rgpRecipients")
        ).withName("EnvelopedInfo")
    ).withName("_CMSG_SIGNED_AND_ENVELOPED_ENCODE_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CMSG_SIGNED_AND_ENVELOPED_ENCODE_INFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CMSG_SIGNED_AND_ENVELOPED_ENCODE_INFO.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CMSG_SIGNED_AND_ENVELOPED_ENCODE_INFO.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _CMSG_SIGNED_AND_ENVELOPED_ENCODE_INFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CMSG_SIGNED_AND_ENVELOPED_ENCODE_INFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CMSG_SIGNED_AND_ENVELOPED_ENCODE_INFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment SignedInfo$slice(MemorySegment seg) {
        return seg.asSlice(8, 48);
    }
    public static MemorySegment EnvelopedInfo$slice(MemorySegment seg) {
        return seg.asSlice(56, 64);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

