// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _NDR_CS_ROUTINES {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pSizeConvertRoutines"),
        Constants$root.C_POINTER$LAYOUT.withName("pTagGettingRoutines")
    ).withName("_NDR_CS_ROUTINES");
    public static MemoryLayout $LAYOUT() {
        return _NDR_CS_ROUTINES.$struct$LAYOUT;
    }
    static final VarHandle pSizeConvertRoutines$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pSizeConvertRoutines"));
    public static VarHandle pSizeConvertRoutines$VH() {
        return _NDR_CS_ROUTINES.pSizeConvertRoutines$VH;
    }
    public static MemoryAddress pSizeConvertRoutines$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_NDR_CS_ROUTINES.pSizeConvertRoutines$VH.get(seg);
    }
    public static void pSizeConvertRoutines$set( MemorySegment seg, MemoryAddress x) {
        _NDR_CS_ROUTINES.pSizeConvertRoutines$VH.set(seg, x);
    }
    public static MemoryAddress pSizeConvertRoutines$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_NDR_CS_ROUTINES.pSizeConvertRoutines$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pSizeConvertRoutines$set(MemorySegment seg, long index, MemoryAddress x) {
        _NDR_CS_ROUTINES.pSizeConvertRoutines$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pTagGettingRoutines$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pTagGettingRoutines"));
    public static VarHandle pTagGettingRoutines$VH() {
        return _NDR_CS_ROUTINES.pTagGettingRoutines$VH;
    }
    public static MemoryAddress pTagGettingRoutines$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_NDR_CS_ROUTINES.pTagGettingRoutines$VH.get(seg);
    }
    public static void pTagGettingRoutines$set( MemorySegment seg, MemoryAddress x) {
        _NDR_CS_ROUTINES.pTagGettingRoutines$VH.set(seg, x);
    }
    public static MemoryAddress pTagGettingRoutines$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_NDR_CS_ROUTINES.pTagGettingRoutines$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pTagGettingRoutines$set(MemorySegment seg, long index, MemoryAddress x) {
        _NDR_CS_ROUTINES.pTagGettingRoutines$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


