// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _PARTITION_INFORMATION_EX {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("PartitionStyle"),
        MemoryLayout.paddingLayout(32),
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
        ).withName("StartingOffset"),
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
        ).withName("PartitionLength"),
        Constants$root.C_LONG$LAYOUT.withName("PartitionNumber"),
        Constants$root.C_CHAR$LAYOUT.withName("RewritePartition"),
        Constants$root.C_CHAR$LAYOUT.withName("IsServicePartition"),
        MemoryLayout.paddingLayout(16),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_CHAR$LAYOUT.withName("PartitionType"),
                Constants$root.C_CHAR$LAYOUT.withName("BootIndicator"),
                Constants$root.C_CHAR$LAYOUT.withName("RecognizedPartition"),
                MemoryLayout.paddingLayout(8),
                Constants$root.C_LONG$LAYOUT.withName("HiddenSectors"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("Data1"),
                    Constants$root.C_SHORT$LAYOUT.withName("Data2"),
                    Constants$root.C_SHORT$LAYOUT.withName("Data3"),
                    MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
                ).withName("PartitionId")
            ).withName("Mbr"),
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("Data1"),
                    Constants$root.C_SHORT$LAYOUT.withName("Data2"),
                    Constants$root.C_SHORT$LAYOUT.withName("Data3"),
                    MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
                ).withName("PartitionType"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("Data1"),
                    Constants$root.C_SHORT$LAYOUT.withName("Data2"),
                    Constants$root.C_SHORT$LAYOUT.withName("Data3"),
                    MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
                ).withName("PartitionId"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("Attributes"),
                MemoryLayout.sequenceLayout(36, Constants$root.C_SHORT$LAYOUT).withName("Name")
            ).withName("Gpt")
        ).withName("$anon$0")
    ).withName("_PARTITION_INFORMATION_EX");
    public static MemoryLayout $LAYOUT() {
        return _PARTITION_INFORMATION_EX.$struct$LAYOUT;
    }
    static final VarHandle PartitionStyle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PartitionStyle"));
    public static VarHandle PartitionStyle$VH() {
        return _PARTITION_INFORMATION_EX.PartitionStyle$VH;
    }
    public static int PartitionStyle$get(MemorySegment seg) {
        return (int)_PARTITION_INFORMATION_EX.PartitionStyle$VH.get(seg);
    }
    public static void PartitionStyle$set( MemorySegment seg, int x) {
        _PARTITION_INFORMATION_EX.PartitionStyle$VH.set(seg, x);
    }
    public static int PartitionStyle$get(MemorySegment seg, long index) {
        return (int)_PARTITION_INFORMATION_EX.PartitionStyle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PartitionStyle$set(MemorySegment seg, long index, int x) {
        _PARTITION_INFORMATION_EX.PartitionStyle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment StartingOffset$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static MemorySegment PartitionLength$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    static final VarHandle PartitionNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PartitionNumber"));
    public static VarHandle PartitionNumber$VH() {
        return _PARTITION_INFORMATION_EX.PartitionNumber$VH;
    }
    public static int PartitionNumber$get(MemorySegment seg) {
        return (int)_PARTITION_INFORMATION_EX.PartitionNumber$VH.get(seg);
    }
    public static void PartitionNumber$set( MemorySegment seg, int x) {
        _PARTITION_INFORMATION_EX.PartitionNumber$VH.set(seg, x);
    }
    public static int PartitionNumber$get(MemorySegment seg, long index) {
        return (int)_PARTITION_INFORMATION_EX.PartitionNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PartitionNumber$set(MemorySegment seg, long index, int x) {
        _PARTITION_INFORMATION_EX.PartitionNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RewritePartition$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RewritePartition"));
    public static VarHandle RewritePartition$VH() {
        return _PARTITION_INFORMATION_EX.RewritePartition$VH;
    }
    public static byte RewritePartition$get(MemorySegment seg) {
        return (byte)_PARTITION_INFORMATION_EX.RewritePartition$VH.get(seg);
    }
    public static void RewritePartition$set( MemorySegment seg, byte x) {
        _PARTITION_INFORMATION_EX.RewritePartition$VH.set(seg, x);
    }
    public static byte RewritePartition$get(MemorySegment seg, long index) {
        return (byte)_PARTITION_INFORMATION_EX.RewritePartition$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RewritePartition$set(MemorySegment seg, long index, byte x) {
        _PARTITION_INFORMATION_EX.RewritePartition$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle IsServicePartition$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IsServicePartition"));
    public static VarHandle IsServicePartition$VH() {
        return _PARTITION_INFORMATION_EX.IsServicePartition$VH;
    }
    public static byte IsServicePartition$get(MemorySegment seg) {
        return (byte)_PARTITION_INFORMATION_EX.IsServicePartition$VH.get(seg);
    }
    public static void IsServicePartition$set( MemorySegment seg, byte x) {
        _PARTITION_INFORMATION_EX.IsServicePartition$VH.set(seg, x);
    }
    public static byte IsServicePartition$get(MemorySegment seg, long index) {
        return (byte)_PARTITION_INFORMATION_EX.IsServicePartition$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IsServicePartition$set(MemorySegment seg, long index, byte x) {
        _PARTITION_INFORMATION_EX.IsServicePartition$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Mbr$slice(MemorySegment seg) {
        return seg.asSlice(32, 24);
    }
    public static MemorySegment Gpt$slice(MemorySegment seg) {
        return seg.asSlice(32, 112);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


