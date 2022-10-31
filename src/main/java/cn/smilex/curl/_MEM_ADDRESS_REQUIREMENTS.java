// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _MEM_ADDRESS_REQUIREMENTS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("LowestStartingAddress"),
        Constants$root.C_POINTER$LAYOUT.withName("HighestEndingAddress"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Alignment")
    ).withName("_MEM_ADDRESS_REQUIREMENTS");
    public static MemoryLayout $LAYOUT() {
        return _MEM_ADDRESS_REQUIREMENTS.$struct$LAYOUT;
    }
    static final VarHandle LowestStartingAddress$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LowestStartingAddress"));
    public static VarHandle LowestStartingAddress$VH() {
        return _MEM_ADDRESS_REQUIREMENTS.LowestStartingAddress$VH;
    }
    public static MemoryAddress LowestStartingAddress$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MEM_ADDRESS_REQUIREMENTS.LowestStartingAddress$VH.get(seg);
    }
    public static void LowestStartingAddress$set( MemorySegment seg, MemoryAddress x) {
        _MEM_ADDRESS_REQUIREMENTS.LowestStartingAddress$VH.set(seg, x);
    }
    public static MemoryAddress LowestStartingAddress$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MEM_ADDRESS_REQUIREMENTS.LowestStartingAddress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LowestStartingAddress$set(MemorySegment seg, long index, MemoryAddress x) {
        _MEM_ADDRESS_REQUIREMENTS.LowestStartingAddress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle HighestEndingAddress$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("HighestEndingAddress"));
    public static VarHandle HighestEndingAddress$VH() {
        return _MEM_ADDRESS_REQUIREMENTS.HighestEndingAddress$VH;
    }
    public static MemoryAddress HighestEndingAddress$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MEM_ADDRESS_REQUIREMENTS.HighestEndingAddress$VH.get(seg);
    }
    public static void HighestEndingAddress$set( MemorySegment seg, MemoryAddress x) {
        _MEM_ADDRESS_REQUIREMENTS.HighestEndingAddress$VH.set(seg, x);
    }
    public static MemoryAddress HighestEndingAddress$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MEM_ADDRESS_REQUIREMENTS.HighestEndingAddress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HighestEndingAddress$set(MemorySegment seg, long index, MemoryAddress x) {
        _MEM_ADDRESS_REQUIREMENTS.HighestEndingAddress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Alignment$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Alignment"));
    public static VarHandle Alignment$VH() {
        return _MEM_ADDRESS_REQUIREMENTS.Alignment$VH;
    }
    public static long Alignment$get(MemorySegment seg) {
        return (long)_MEM_ADDRESS_REQUIREMENTS.Alignment$VH.get(seg);
    }
    public static void Alignment$set( MemorySegment seg, long x) {
        _MEM_ADDRESS_REQUIREMENTS.Alignment$VH.set(seg, x);
    }
    public static long Alignment$get(MemorySegment seg, long index) {
        return (long)_MEM_ADDRESS_REQUIREMENTS.Alignment$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Alignment$set(MemorySegment seg, long index, long x) {
        _MEM_ADDRESS_REQUIREMENTS.Alignment$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


