// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CMSG_SIGNER_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwVersion"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pbData")
        ).withName("Issuer"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pbData")
        ).withName("SerialNumber"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("pszObjId"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("cbData"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("pbData")
            ).withName("Parameters")
        ).withName("HashAlgorithm"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("pszObjId"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("cbData"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("pbData")
            ).withName("Parameters")
        ).withName("HashEncryptionAlgorithm"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pbData")
        ).withName("EncryptedHash"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cAttr"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("rgAttr")
        ).withName("AuthAttrs"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cAttr"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("rgAttr")
        ).withName("UnauthAttrs")
    ).withName("_CMSG_SIGNER_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CMSG_SIGNER_INFO.$struct$LAYOUT;
    }
    static final VarHandle dwVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwVersion"));
    public static VarHandle dwVersion$VH() {
        return _CMSG_SIGNER_INFO.dwVersion$VH;
    }
    public static int dwVersion$get(MemorySegment seg) {
        return (int)_CMSG_SIGNER_INFO.dwVersion$VH.get(seg);
    }
    public static void dwVersion$set( MemorySegment seg, int x) {
        _CMSG_SIGNER_INFO.dwVersion$VH.set(seg, x);
    }
    public static int dwVersion$get(MemorySegment seg, long index) {
        return (int)_CMSG_SIGNER_INFO.dwVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwVersion$set(MemorySegment seg, long index, int x) {
        _CMSG_SIGNER_INFO.dwVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Issuer$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static MemorySegment SerialNumber$slice(MemorySegment seg) {
        return seg.asSlice(24, 16);
    }
    public static MemorySegment HashAlgorithm$slice(MemorySegment seg) {
        return seg.asSlice(40, 24);
    }
    public static MemorySegment HashEncryptionAlgorithm$slice(MemorySegment seg) {
        return seg.asSlice(64, 24);
    }
    public static MemorySegment EncryptedHash$slice(MemorySegment seg) {
        return seg.asSlice(88, 16);
    }
    public static MemorySegment AuthAttrs$slice(MemorySegment seg) {
        return seg.asSlice(104, 16);
    }
    public static MemorySegment UnauthAttrs$slice(MemorySegment seg) {
        return seg.asSlice(120, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


