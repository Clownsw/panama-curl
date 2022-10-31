// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CERT_HASHED_URL {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("pszObjId"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("cbData"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("pbData")
            ).withName("Parameters")
        ).withName("HashAlgorithm"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pbData")
        ).withName("Hash"),
        Constants$root.C_POINTER$LAYOUT.withName("pwszUrl")
    ).withName("_CERT_HASHED_URL");
    public static MemoryLayout $LAYOUT() {
        return _CERT_HASHED_URL.$struct$LAYOUT;
    }
    public static MemorySegment HashAlgorithm$slice(MemorySegment seg) {
        return seg.asSlice(0, 24);
    }
    public static MemorySegment Hash$slice(MemorySegment seg) {
        return seg.asSlice(24, 16);
    }
    static final VarHandle pwszUrl$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pwszUrl"));
    public static VarHandle pwszUrl$VH() {
        return _CERT_HASHED_URL.pwszUrl$VH;
    }
    public static MemoryAddress pwszUrl$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_HASHED_URL.pwszUrl$VH.get(seg);
    }
    public static void pwszUrl$set( MemorySegment seg, MemoryAddress x) {
        _CERT_HASHED_URL.pwszUrl$VH.set(seg, x);
    }
    public static MemoryAddress pwszUrl$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_HASHED_URL.pwszUrl$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pwszUrl$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_HASHED_URL.pwszUrl$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

