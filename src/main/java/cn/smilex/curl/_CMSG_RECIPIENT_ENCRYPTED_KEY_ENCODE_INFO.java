// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CMSG_RECIPIENT_ENCRYPTED_KEY_ENCODE_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pbData"),
            Constants$root.C_LONG$LAYOUT.withName("cUnusedBits"),
            MemoryLayout.paddingLayout(32)
        ).withName("RecipientPublicKey"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("dwIdChoice"),
            MemoryLayout.paddingLayout(32),
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.structLayout(
                        Constants$root.C_LONG$LAYOUT.withName("cbData"),
                        MemoryLayout.paddingLayout(32),
                        Constants$root.C_POINTER$LAYOUT.withName("pbData")
                    ).withName("Issuer"),
                    MemoryLayout.structLayout(
                        Constants$root.C_LONG$LAYOUT.withName("cbData"),
                        MemoryLayout.paddingLayout(32),
                        Constants$root.C_POINTER$LAYOUT.withName("pbData")
                    ).withName("SerialNumber")
                ).withName("IssuerSerialNumber"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("cbData"),
                    MemoryLayout.paddingLayout(32),
                    Constants$root.C_POINTER$LAYOUT.withName("pbData")
                ).withName("KeyId"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("cbData"),
                    MemoryLayout.paddingLayout(32),
                    Constants$root.C_POINTER$LAYOUT.withName("pbData")
                ).withName("HashId")
            ).withName("$anon$0")
        ).withName("RecipientId"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("dwLowDateTime"),
            Constants$root.C_LONG$LAYOUT.withName("dwHighDateTime")
        ).withName("Date"),
        Constants$root.C_POINTER$LAYOUT.withName("pOtherAttr")
    ).withName("_CMSG_RECIPIENT_ENCRYPTED_KEY_ENCODE_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CMSG_RECIPIENT_ENCRYPTED_KEY_ENCODE_INFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CMSG_RECIPIENT_ENCRYPTED_KEY_ENCODE_INFO.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CMSG_RECIPIENT_ENCRYPTED_KEY_ENCODE_INFO.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _CMSG_RECIPIENT_ENCRYPTED_KEY_ENCODE_INFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CMSG_RECIPIENT_ENCRYPTED_KEY_ENCODE_INFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CMSG_RECIPIENT_ENCRYPTED_KEY_ENCODE_INFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment RecipientPublicKey$slice(MemorySegment seg) {
        return seg.asSlice(8, 24);
    }
    public static MemorySegment RecipientId$slice(MemorySegment seg) {
        return seg.asSlice(32, 40);
    }
    public static MemorySegment Date$slice(MemorySegment seg) {
        return seg.asSlice(72, 8);
    }
    static final VarHandle pOtherAttr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pOtherAttr"));
    public static VarHandle pOtherAttr$VH() {
        return _CMSG_RECIPIENT_ENCRYPTED_KEY_ENCODE_INFO.pOtherAttr$VH;
    }
    public static MemoryAddress pOtherAttr$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CMSG_RECIPIENT_ENCRYPTED_KEY_ENCODE_INFO.pOtherAttr$VH.get(seg);
    }
    public static void pOtherAttr$set( MemorySegment seg, MemoryAddress x) {
        _CMSG_RECIPIENT_ENCRYPTED_KEY_ENCODE_INFO.pOtherAttr$VH.set(seg, x);
    }
    public static MemoryAddress pOtherAttr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CMSG_RECIPIENT_ENCRYPTED_KEY_ENCODE_INFO.pOtherAttr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pOtherAttr$set(MemorySegment seg, long index, MemoryAddress x) {
        _CMSG_RECIPIENT_ENCRYPTED_KEY_ENCODE_INFO.pOtherAttr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


