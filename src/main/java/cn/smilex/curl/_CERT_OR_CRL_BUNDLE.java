// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CERT_OR_CRL_BUNDLE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cItem"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgItem")
    ).withName("_CERT_OR_CRL_BUNDLE");
    public static MemoryLayout $LAYOUT() {
        return _CERT_OR_CRL_BUNDLE.$struct$LAYOUT;
    }
    static final VarHandle cItem$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cItem"));
    public static VarHandle cItem$VH() {
        return _CERT_OR_CRL_BUNDLE.cItem$VH;
    }
    public static int cItem$get(MemorySegment seg) {
        return (int)_CERT_OR_CRL_BUNDLE.cItem$VH.get(seg);
    }
    public static void cItem$set( MemorySegment seg, int x) {
        _CERT_OR_CRL_BUNDLE.cItem$VH.set(seg, x);
    }
    public static int cItem$get(MemorySegment seg, long index) {
        return (int)_CERT_OR_CRL_BUNDLE.cItem$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cItem$set(MemorySegment seg, long index, int x) {
        _CERT_OR_CRL_BUNDLE.cItem$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgItem$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgItem"));
    public static VarHandle rgItem$VH() {
        return _CERT_OR_CRL_BUNDLE.rgItem$VH;
    }
    public static MemoryAddress rgItem$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_OR_CRL_BUNDLE.rgItem$VH.get(seg);
    }
    public static void rgItem$set( MemorySegment seg, MemoryAddress x) {
        _CERT_OR_CRL_BUNDLE.rgItem$VH.set(seg, x);
    }
    public static MemoryAddress rgItem$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_OR_CRL_BUNDLE.rgItem$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgItem$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_OR_CRL_BUNDLE.rgItem$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


