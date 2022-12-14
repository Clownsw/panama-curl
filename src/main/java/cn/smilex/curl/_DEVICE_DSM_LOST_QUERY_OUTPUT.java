// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _DEVICE_DSM_LOST_QUERY_OUTPUT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Alignment"),
        Constants$root.C_LONG$LAYOUT.withName("NumberOfBits"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_LONG$LAYOUT).withName("BitMap")
    ).withName("_DEVICE_DSM_LOST_QUERY_OUTPUT");
    public static MemoryLayout $LAYOUT() {
        return _DEVICE_DSM_LOST_QUERY_OUTPUT.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _DEVICE_DSM_LOST_QUERY_OUTPUT.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_DEVICE_DSM_LOST_QUERY_OUTPUT.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _DEVICE_DSM_LOST_QUERY_OUTPUT.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_DEVICE_DSM_LOST_QUERY_OUTPUT.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _DEVICE_DSM_LOST_QUERY_OUTPUT.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _DEVICE_DSM_LOST_QUERY_OUTPUT.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_DEVICE_DSM_LOST_QUERY_OUTPUT.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _DEVICE_DSM_LOST_QUERY_OUTPUT.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_DEVICE_DSM_LOST_QUERY_OUTPUT.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _DEVICE_DSM_LOST_QUERY_OUTPUT.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Alignment$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Alignment"));
    public static VarHandle Alignment$VH() {
        return _DEVICE_DSM_LOST_QUERY_OUTPUT.Alignment$VH;
    }
    public static long Alignment$get(MemorySegment seg) {
        return (long)_DEVICE_DSM_LOST_QUERY_OUTPUT.Alignment$VH.get(seg);
    }
    public static void Alignment$set( MemorySegment seg, long x) {
        _DEVICE_DSM_LOST_QUERY_OUTPUT.Alignment$VH.set(seg, x);
    }
    public static long Alignment$get(MemorySegment seg, long index) {
        return (long)_DEVICE_DSM_LOST_QUERY_OUTPUT.Alignment$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Alignment$set(MemorySegment seg, long index, long x) {
        _DEVICE_DSM_LOST_QUERY_OUTPUT.Alignment$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfBits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfBits"));
    public static VarHandle NumberOfBits$VH() {
        return _DEVICE_DSM_LOST_QUERY_OUTPUT.NumberOfBits$VH;
    }
    public static int NumberOfBits$get(MemorySegment seg) {
        return (int)_DEVICE_DSM_LOST_QUERY_OUTPUT.NumberOfBits$VH.get(seg);
    }
    public static void NumberOfBits$set( MemorySegment seg, int x) {
        _DEVICE_DSM_LOST_QUERY_OUTPUT.NumberOfBits$VH.set(seg, x);
    }
    public static int NumberOfBits$get(MemorySegment seg, long index) {
        return (int)_DEVICE_DSM_LOST_QUERY_OUTPUT.NumberOfBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfBits$set(MemorySegment seg, long index, int x) {
        _DEVICE_DSM_LOST_QUERY_OUTPUT.NumberOfBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment BitMap$slice(MemorySegment seg) {
        return seg.asSlice(20, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


