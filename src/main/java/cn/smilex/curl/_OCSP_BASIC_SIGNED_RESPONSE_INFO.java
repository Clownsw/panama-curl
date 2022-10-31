// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _OCSP_BASIC_SIGNED_RESPONSE_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pbData")
        ).withName("ToBeSigned"),
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("pszObjId"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("cbData"),
                    MemoryLayout.paddingLayout(32),
                    Constants$root.C_POINTER$LAYOUT.withName("pbData")
                ).withName("Parameters")
            ).withName("SignatureAlgorithm"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("cbData"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("pbData"),
                Constants$root.C_LONG$LAYOUT.withName("cUnusedBits"),
                MemoryLayout.paddingLayout(32)
            ).withName("Signature"),
            Constants$root.C_LONG$LAYOUT.withName("cCertEncoded"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("rgCertEncoded")
        ).withName("SignatureInfo")
    ).withName("_OCSP_BASIC_SIGNED_RESPONSE_INFO");
    public static MemoryLayout $LAYOUT() {
        return _OCSP_BASIC_SIGNED_RESPONSE_INFO.$struct$LAYOUT;
    }
    public static MemorySegment ToBeSigned$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment SignatureInfo$slice(MemorySegment seg) {
        return seg.asSlice(16, 64);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


