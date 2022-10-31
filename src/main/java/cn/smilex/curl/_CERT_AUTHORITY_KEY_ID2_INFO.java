// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CERT_AUTHORITY_KEY_ID2_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pbData")
        ).withName("KeyId"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cAltEntry"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("rgAltEntry")
        ).withName("AuthorityCertIssuer"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pbData")
        ).withName("AuthorityCertSerialNumber")
    ).withName("_CERT_AUTHORITY_KEY_ID2_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CERT_AUTHORITY_KEY_ID2_INFO.$struct$LAYOUT;
    }
    public static MemorySegment KeyId$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment AuthorityCertIssuer$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static MemorySegment AuthorityCertSerialNumber$slice(MemorySegment seg) {
        return seg.asSlice(32, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


