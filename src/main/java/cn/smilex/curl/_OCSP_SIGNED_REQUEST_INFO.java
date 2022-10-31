// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _OCSP_SIGNED_REQUEST_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pbData")
        ).withName("ToBeSigned"),
        Constants$root.C_POINTER$LAYOUT.withName("pOptionalSignatureInfo")
    ).withName("_OCSP_SIGNED_REQUEST_INFO");
    public static MemoryLayout $LAYOUT() {
        return _OCSP_SIGNED_REQUEST_INFO.$struct$LAYOUT;
    }
    public static MemorySegment ToBeSigned$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final VarHandle pOptionalSignatureInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pOptionalSignatureInfo"));
    public static VarHandle pOptionalSignatureInfo$VH() {
        return _OCSP_SIGNED_REQUEST_INFO.pOptionalSignatureInfo$VH;
    }
    public static MemoryAddress pOptionalSignatureInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_OCSP_SIGNED_REQUEST_INFO.pOptionalSignatureInfo$VH.get(seg);
    }
    public static void pOptionalSignatureInfo$set( MemorySegment seg, MemoryAddress x) {
        _OCSP_SIGNED_REQUEST_INFO.pOptionalSignatureInfo$VH.set(seg, x);
    }
    public static MemoryAddress pOptionalSignatureInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_OCSP_SIGNED_REQUEST_INFO.pOptionalSignatureInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pOptionalSignatureInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        _OCSP_SIGNED_REQUEST_INFO.pOptionalSignatureInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


