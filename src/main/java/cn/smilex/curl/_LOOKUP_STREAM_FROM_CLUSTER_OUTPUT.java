// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _LOOKUP_STREAM_FROM_CLUSTER_OUTPUT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Offset"),
        Constants$root.C_LONG$LAYOUT.withName("NumberOfMatches"),
        Constants$root.C_LONG$LAYOUT.withName("BufferSizeRequired")
    ).withName("_LOOKUP_STREAM_FROM_CLUSTER_OUTPUT");
    public static MemoryLayout $LAYOUT() {
        return _LOOKUP_STREAM_FROM_CLUSTER_OUTPUT.$struct$LAYOUT;
    }
    static final VarHandle Offset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Offset"));
    public static VarHandle Offset$VH() {
        return _LOOKUP_STREAM_FROM_CLUSTER_OUTPUT.Offset$VH;
    }
    public static int Offset$get(MemorySegment seg) {
        return (int)_LOOKUP_STREAM_FROM_CLUSTER_OUTPUT.Offset$VH.get(seg);
    }
    public static void Offset$set( MemorySegment seg, int x) {
        _LOOKUP_STREAM_FROM_CLUSTER_OUTPUT.Offset$VH.set(seg, x);
    }
    public static int Offset$get(MemorySegment seg, long index) {
        return (int)_LOOKUP_STREAM_FROM_CLUSTER_OUTPUT.Offset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Offset$set(MemorySegment seg, long index, int x) {
        _LOOKUP_STREAM_FROM_CLUSTER_OUTPUT.Offset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfMatches$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfMatches"));
    public static VarHandle NumberOfMatches$VH() {
        return _LOOKUP_STREAM_FROM_CLUSTER_OUTPUT.NumberOfMatches$VH;
    }
    public static int NumberOfMatches$get(MemorySegment seg) {
        return (int)_LOOKUP_STREAM_FROM_CLUSTER_OUTPUT.NumberOfMatches$VH.get(seg);
    }
    public static void NumberOfMatches$set( MemorySegment seg, int x) {
        _LOOKUP_STREAM_FROM_CLUSTER_OUTPUT.NumberOfMatches$VH.set(seg, x);
    }
    public static int NumberOfMatches$get(MemorySegment seg, long index) {
        return (int)_LOOKUP_STREAM_FROM_CLUSTER_OUTPUT.NumberOfMatches$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfMatches$set(MemorySegment seg, long index, int x) {
        _LOOKUP_STREAM_FROM_CLUSTER_OUTPUT.NumberOfMatches$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BufferSizeRequired$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BufferSizeRequired"));
    public static VarHandle BufferSizeRequired$VH() {
        return _LOOKUP_STREAM_FROM_CLUSTER_OUTPUT.BufferSizeRequired$VH;
    }
    public static int BufferSizeRequired$get(MemorySegment seg) {
        return (int)_LOOKUP_STREAM_FROM_CLUSTER_OUTPUT.BufferSizeRequired$VH.get(seg);
    }
    public static void BufferSizeRequired$set( MemorySegment seg, int x) {
        _LOOKUP_STREAM_FROM_CLUSTER_OUTPUT.BufferSizeRequired$VH.set(seg, x);
    }
    public static int BufferSizeRequired$get(MemorySegment seg, long index) {
        return (int)_LOOKUP_STREAM_FROM_CLUSTER_OUTPUT.BufferSizeRequired$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BufferSizeRequired$set(MemorySegment seg, long index, int x) {
        _LOOKUP_STREAM_FROM_CLUSTER_OUTPUT.BufferSizeRequired$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


