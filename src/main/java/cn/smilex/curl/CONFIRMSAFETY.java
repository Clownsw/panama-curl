// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class CONFIRMSAFETY {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("clsid"),
        Constants$root.C_POINTER$LAYOUT.withName("pUnk"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        MemoryLayout.paddingLayout(32)
    ).withName("CONFIRMSAFETY");
    public static MemoryLayout $LAYOUT() {
        return CONFIRMSAFETY.$struct$LAYOUT;
    }
    public static MemorySegment clsid$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final VarHandle pUnk$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pUnk"));
    public static VarHandle pUnk$VH() {
        return CONFIRMSAFETY.pUnk$VH;
    }
    public static MemoryAddress pUnk$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)CONFIRMSAFETY.pUnk$VH.get(seg);
    }
    public static void pUnk$set( MemorySegment seg, MemoryAddress x) {
        CONFIRMSAFETY.pUnk$VH.set(seg, x);
    }
    public static MemoryAddress pUnk$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)CONFIRMSAFETY.pUnk$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pUnk$set(MemorySegment seg, long index, MemoryAddress x) {
        CONFIRMSAFETY.pUnk$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return CONFIRMSAFETY.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)CONFIRMSAFETY.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        CONFIRMSAFETY.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)CONFIRMSAFETY.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        CONFIRMSAFETY.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

