// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CRYPT_VERIFY_CERT_SIGN_STRONG_PROPERTIES_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pbData")
        ).withName("CertSignHashCNGAlgPropData"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pbData")
        ).withName("CertIssuerPubKeyBitLengthPropData")
    ).withName("_CRYPT_VERIFY_CERT_SIGN_STRONG_PROPERTIES_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_VERIFY_CERT_SIGN_STRONG_PROPERTIES_INFO.$struct$LAYOUT;
    }
    public static MemorySegment CertSignHashCNGAlgPropData$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment CertIssuerPubKeyBitLengthPropData$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


