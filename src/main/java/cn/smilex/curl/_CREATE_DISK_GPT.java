// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CREATE_DISK_GPT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("DiskId"),
        Constants$root.C_LONG$LAYOUT.withName("MaxPartitionCount")
    ).withName("_CREATE_DISK_GPT");
    public static MemoryLayout $LAYOUT() {
        return _CREATE_DISK_GPT.$struct$LAYOUT;
    }
    public static MemorySegment DiskId$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final VarHandle MaxPartitionCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaxPartitionCount"));
    public static VarHandle MaxPartitionCount$VH() {
        return _CREATE_DISK_GPT.MaxPartitionCount$VH;
    }
    public static int MaxPartitionCount$get(MemorySegment seg) {
        return (int)_CREATE_DISK_GPT.MaxPartitionCount$VH.get(seg);
    }
    public static void MaxPartitionCount$set( MemorySegment seg, int x) {
        _CREATE_DISK_GPT.MaxPartitionCount$VH.set(seg, x);
    }
    public static int MaxPartitionCount$get(MemorySegment seg, long index) {
        return (int)_CREATE_DISK_GPT.MaxPartitionCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxPartitionCount$set(MemorySegment seg, long index, int x) {
        _CREATE_DISK_GPT.MaxPartitionCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


