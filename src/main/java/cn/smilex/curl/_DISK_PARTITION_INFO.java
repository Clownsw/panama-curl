// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _DISK_PARTITION_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("SizeOfPartitionInfo"),
        Constants$root.C_LONG$LAYOUT.withName("PartitionStyle"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Signature"),
                Constants$root.C_LONG$LAYOUT.withName("CheckSum")
            ).withName("Mbr"),
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("Data1"),
                    Constants$root.C_SHORT$LAYOUT.withName("Data2"),
                    Constants$root.C_SHORT$LAYOUT.withName("Data3"),
                    MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
                ).withName("DiskId")
            ).withName("Gpt")
        ).withName("$anon$0")
    ).withName("_DISK_PARTITION_INFO");
    public static MemoryLayout $LAYOUT() {
        return _DISK_PARTITION_INFO.$struct$LAYOUT;
    }
    static final VarHandle SizeOfPartitionInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SizeOfPartitionInfo"));
    public static VarHandle SizeOfPartitionInfo$VH() {
        return _DISK_PARTITION_INFO.SizeOfPartitionInfo$VH;
    }
    public static int SizeOfPartitionInfo$get(MemorySegment seg) {
        return (int)_DISK_PARTITION_INFO.SizeOfPartitionInfo$VH.get(seg);
    }
    public static void SizeOfPartitionInfo$set( MemorySegment seg, int x) {
        _DISK_PARTITION_INFO.SizeOfPartitionInfo$VH.set(seg, x);
    }
    public static int SizeOfPartitionInfo$get(MemorySegment seg, long index) {
        return (int)_DISK_PARTITION_INFO.SizeOfPartitionInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfPartitionInfo$set(MemorySegment seg, long index, int x) {
        _DISK_PARTITION_INFO.SizeOfPartitionInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PartitionStyle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PartitionStyle"));
    public static VarHandle PartitionStyle$VH() {
        return _DISK_PARTITION_INFO.PartitionStyle$VH;
    }
    public static int PartitionStyle$get(MemorySegment seg) {
        return (int)_DISK_PARTITION_INFO.PartitionStyle$VH.get(seg);
    }
    public static void PartitionStyle$set( MemorySegment seg, int x) {
        _DISK_PARTITION_INFO.PartitionStyle$VH.set(seg, x);
    }
    public static int PartitionStyle$get(MemorySegment seg, long index) {
        return (int)_DISK_PARTITION_INFO.PartitionStyle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PartitionStyle$set(MemorySegment seg, long index, int x) {
        _DISK_PARTITION_INFO.PartitionStyle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static class Mbr {

        static final  GroupLayout Mbr$struct$LAYOUT = MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Signature"),
            Constants$root.C_LONG$LAYOUT.withName("CheckSum")
        );
        public static MemoryLayout $LAYOUT() {
            return Mbr.Mbr$struct$LAYOUT;
        }
        static final VarHandle Signature$VH = Mbr$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Signature"));
        public static VarHandle Signature$VH() {
            return Mbr.Signature$VH;
        }
        public static int Signature$get(MemorySegment seg) {
            return (int)Mbr.Signature$VH.get(seg);
        }
        public static void Signature$set( MemorySegment seg, int x) {
            Mbr.Signature$VH.set(seg, x);
        }
        public static int Signature$get(MemorySegment seg, long index) {
            return (int)Mbr.Signature$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void Signature$set(MemorySegment seg, long index, int x) {
            Mbr.Signature$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle CheckSum$VH = Mbr$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CheckSum"));
        public static VarHandle CheckSum$VH() {
            return Mbr.CheckSum$VH;
        }
        public static int CheckSum$get(MemorySegment seg) {
            return (int)Mbr.CheckSum$VH.get(seg);
        }
        public static void CheckSum$set( MemorySegment seg, int x) {
            Mbr.CheckSum$VH.set(seg, x);
        }
        public static int CheckSum$get(MemorySegment seg, long index) {
            return (int)Mbr.CheckSum$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void CheckSum$set(MemorySegment seg, long index, int x) {
            Mbr.CheckSum$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment Mbr$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static class Gpt {

        static final  GroupLayout Gpt$struct$LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Data1"),
                Constants$root.C_SHORT$LAYOUT.withName("Data2"),
                Constants$root.C_SHORT$LAYOUT.withName("Data3"),
                MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
            ).withName("DiskId")
        );
        public static MemoryLayout $LAYOUT() {
            return Gpt.Gpt$struct$LAYOUT;
        }
        public static MemorySegment DiskId$slice(MemorySegment seg) {
            return seg.asSlice(0, 16);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment Gpt$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


