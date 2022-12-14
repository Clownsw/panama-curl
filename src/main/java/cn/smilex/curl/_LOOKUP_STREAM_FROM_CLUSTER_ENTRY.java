// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _LOOKUP_STREAM_FROM_CLUSTER_ENTRY {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("OffsetToNext"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("Reserved"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("Cluster"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_SHORT$LAYOUT).withName("FileName"),
        MemoryLayout.paddingLayout(48)
    ).withName("_LOOKUP_STREAM_FROM_CLUSTER_ENTRY");
    public static MemoryLayout $LAYOUT() {
        return _LOOKUP_STREAM_FROM_CLUSTER_ENTRY.$struct$LAYOUT;
    }
    static final VarHandle OffsetToNext$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OffsetToNext"));
    public static VarHandle OffsetToNext$VH() {
        return _LOOKUP_STREAM_FROM_CLUSTER_ENTRY.OffsetToNext$VH;
    }
    public static int OffsetToNext$get(MemorySegment seg) {
        return (int)_LOOKUP_STREAM_FROM_CLUSTER_ENTRY.OffsetToNext$VH.get(seg);
    }
    public static void OffsetToNext$set( MemorySegment seg, int x) {
        _LOOKUP_STREAM_FROM_CLUSTER_ENTRY.OffsetToNext$VH.set(seg, x);
    }
    public static int OffsetToNext$get(MemorySegment seg, long index) {
        return (int)_LOOKUP_STREAM_FROM_CLUSTER_ENTRY.OffsetToNext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OffsetToNext$set(MemorySegment seg, long index, int x) {
        _LOOKUP_STREAM_FROM_CLUSTER_ENTRY.OffsetToNext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _LOOKUP_STREAM_FROM_CLUSTER_ENTRY.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_LOOKUP_STREAM_FROM_CLUSTER_ENTRY.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _LOOKUP_STREAM_FROM_CLUSTER_ENTRY.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_LOOKUP_STREAM_FROM_CLUSTER_ENTRY.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _LOOKUP_STREAM_FROM_CLUSTER_ENTRY.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static MemorySegment Cluster$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    public static MemorySegment FileName$slice(MemorySegment seg) {
        return seg.asSlice(24, 2);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


