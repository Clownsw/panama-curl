// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SYSTEM_CPU_SET_INFORMATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("Type"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Id"),
                Constants$root.C_SHORT$LAYOUT.withName("Group"),
                Constants$root.C_CHAR$LAYOUT.withName("LogicalProcessorIndex"),
                Constants$root.C_CHAR$LAYOUT.withName("CoreIndex"),
                Constants$root.C_CHAR$LAYOUT.withName("LastLevelCacheIndex"),
                Constants$root.C_CHAR$LAYOUT.withName("NumaNodeIndex"),
                Constants$root.C_CHAR$LAYOUT.withName("EfficiencyClass"),
                MemoryLayout.unionLayout(
                    Constants$root.C_CHAR$LAYOUT.withName("AllFlags"),
                    MemoryLayout.structLayout(
                        MemoryLayout.structLayout(
                            MemoryLayout.paddingLayout(1).withName("Parked"),
                            MemoryLayout.paddingLayout(1).withName("Allocated"),
                            MemoryLayout.paddingLayout(1).withName("AllocatedToTargetProcess"),
                            MemoryLayout.paddingLayout(1).withName("RealTime"),
                            MemoryLayout.paddingLayout(4).withName("ReservedFlags")
                        )
                    ).withName("$anon$0")
                ).withName("$anon$0"),
                MemoryLayout.unionLayout(
                    Constants$root.C_LONG$LAYOUT.withName("Reserved"),
                    Constants$root.C_CHAR$LAYOUT.withName("SchedulingClass")
                ).withName("$anon$1"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("AllocationTag")
            ).withName("CpuSet")
        ).withName("$anon$0")
    ).withName("_SYSTEM_CPU_SET_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _SYSTEM_CPU_SET_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _SYSTEM_CPU_SET_INFORMATION.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_SYSTEM_CPU_SET_INFORMATION.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _SYSTEM_CPU_SET_INFORMATION.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_SYSTEM_CPU_SET_INFORMATION.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _SYSTEM_CPU_SET_INFORMATION.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Type"));
    public static VarHandle Type$VH() {
        return _SYSTEM_CPU_SET_INFORMATION.Type$VH;
    }
    public static int Type$get(MemorySegment seg) {
        return (int)_SYSTEM_CPU_SET_INFORMATION.Type$VH.get(seg);
    }
    public static void Type$set( MemorySegment seg, int x) {
        _SYSTEM_CPU_SET_INFORMATION.Type$VH.set(seg, x);
    }
    public static int Type$get(MemorySegment seg, long index) {
        return (int)_SYSTEM_CPU_SET_INFORMATION.Type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Type$set(MemorySegment seg, long index, int x) {
        _SYSTEM_CPU_SET_INFORMATION.Type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static class CpuSet {

        static final  GroupLayout CpuSet$struct$LAYOUT = MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Id"),
            Constants$root.C_SHORT$LAYOUT.withName("Group"),
            Constants$root.C_CHAR$LAYOUT.withName("LogicalProcessorIndex"),
            Constants$root.C_CHAR$LAYOUT.withName("CoreIndex"),
            Constants$root.C_CHAR$LAYOUT.withName("LastLevelCacheIndex"),
            Constants$root.C_CHAR$LAYOUT.withName("NumaNodeIndex"),
            Constants$root.C_CHAR$LAYOUT.withName("EfficiencyClass"),
            MemoryLayout.unionLayout(
                Constants$root.C_CHAR$LAYOUT.withName("AllFlags"),
                MemoryLayout.structLayout(
                    MemoryLayout.structLayout(
                        MemoryLayout.paddingLayout(1).withName("Parked"),
                        MemoryLayout.paddingLayout(1).withName("Allocated"),
                        MemoryLayout.paddingLayout(1).withName("AllocatedToTargetProcess"),
                        MemoryLayout.paddingLayout(1).withName("RealTime"),
                        MemoryLayout.paddingLayout(4).withName("ReservedFlags")
                    )
                ).withName("$anon$0")
            ).withName("$anon$0"),
            MemoryLayout.unionLayout(
                Constants$root.C_LONG$LAYOUT.withName("Reserved"),
                Constants$root.C_CHAR$LAYOUT.withName("SchedulingClass")
            ).withName("$anon$1"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("AllocationTag")
        );
        public static MemoryLayout $LAYOUT() {
            return CpuSet.CpuSet$struct$LAYOUT;
        }
        static final VarHandle Id$VH = CpuSet$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Id"));
        public static VarHandle Id$VH() {
            return CpuSet.Id$VH;
        }
        public static int Id$get(MemorySegment seg) {
            return (int)CpuSet.Id$VH.get(seg);
        }
        public static void Id$set( MemorySegment seg, int x) {
            CpuSet.Id$VH.set(seg, x);
        }
        public static int Id$get(MemorySegment seg, long index) {
            return (int)CpuSet.Id$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void Id$set(MemorySegment seg, long index, int x) {
            CpuSet.Id$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle Group$VH = CpuSet$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Group"));
        public static VarHandle Group$VH() {
            return CpuSet.Group$VH;
        }
        public static short Group$get(MemorySegment seg) {
            return (short)CpuSet.Group$VH.get(seg);
        }
        public static void Group$set( MemorySegment seg, short x) {
            CpuSet.Group$VH.set(seg, x);
        }
        public static short Group$get(MemorySegment seg, long index) {
            return (short)CpuSet.Group$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void Group$set(MemorySegment seg, long index, short x) {
            CpuSet.Group$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle LogicalProcessorIndex$VH = CpuSet$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LogicalProcessorIndex"));
        public static VarHandle LogicalProcessorIndex$VH() {
            return CpuSet.LogicalProcessorIndex$VH;
        }
        public static byte LogicalProcessorIndex$get(MemorySegment seg) {
            return (byte)CpuSet.LogicalProcessorIndex$VH.get(seg);
        }
        public static void LogicalProcessorIndex$set( MemorySegment seg, byte x) {
            CpuSet.LogicalProcessorIndex$VH.set(seg, x);
        }
        public static byte LogicalProcessorIndex$get(MemorySegment seg, long index) {
            return (byte)CpuSet.LogicalProcessorIndex$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void LogicalProcessorIndex$set(MemorySegment seg, long index, byte x) {
            CpuSet.LogicalProcessorIndex$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle CoreIndex$VH = CpuSet$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CoreIndex"));
        public static VarHandle CoreIndex$VH() {
            return CpuSet.CoreIndex$VH;
        }
        public static byte CoreIndex$get(MemorySegment seg) {
            return (byte)CpuSet.CoreIndex$VH.get(seg);
        }
        public static void CoreIndex$set( MemorySegment seg, byte x) {
            CpuSet.CoreIndex$VH.set(seg, x);
        }
        public static byte CoreIndex$get(MemorySegment seg, long index) {
            return (byte)CpuSet.CoreIndex$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void CoreIndex$set(MemorySegment seg, long index, byte x) {
            CpuSet.CoreIndex$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle LastLevelCacheIndex$VH = CpuSet$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LastLevelCacheIndex"));
        public static VarHandle LastLevelCacheIndex$VH() {
            return CpuSet.LastLevelCacheIndex$VH;
        }
        public static byte LastLevelCacheIndex$get(MemorySegment seg) {
            return (byte)CpuSet.LastLevelCacheIndex$VH.get(seg);
        }
        public static void LastLevelCacheIndex$set( MemorySegment seg, byte x) {
            CpuSet.LastLevelCacheIndex$VH.set(seg, x);
        }
        public static byte LastLevelCacheIndex$get(MemorySegment seg, long index) {
            return (byte)CpuSet.LastLevelCacheIndex$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void LastLevelCacheIndex$set(MemorySegment seg, long index, byte x) {
            CpuSet.LastLevelCacheIndex$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle NumaNodeIndex$VH = CpuSet$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumaNodeIndex"));
        public static VarHandle NumaNodeIndex$VH() {
            return CpuSet.NumaNodeIndex$VH;
        }
        public static byte NumaNodeIndex$get(MemorySegment seg) {
            return (byte)CpuSet.NumaNodeIndex$VH.get(seg);
        }
        public static void NumaNodeIndex$set( MemorySegment seg, byte x) {
            CpuSet.NumaNodeIndex$VH.set(seg, x);
        }
        public static byte NumaNodeIndex$get(MemorySegment seg, long index) {
            return (byte)CpuSet.NumaNodeIndex$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void NumaNodeIndex$set(MemorySegment seg, long index, byte x) {
            CpuSet.NumaNodeIndex$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle EfficiencyClass$VH = CpuSet$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EfficiencyClass"));
        public static VarHandle EfficiencyClass$VH() {
            return CpuSet.EfficiencyClass$VH;
        }
        public static byte EfficiencyClass$get(MemorySegment seg) {
            return (byte)CpuSet.EfficiencyClass$VH.get(seg);
        }
        public static void EfficiencyClass$set( MemorySegment seg, byte x) {
            CpuSet.EfficiencyClass$VH.set(seg, x);
        }
        public static byte EfficiencyClass$get(MemorySegment seg, long index) {
            return (byte)CpuSet.EfficiencyClass$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void EfficiencyClass$set(MemorySegment seg, long index, byte x) {
            CpuSet.EfficiencyClass$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle AllFlags$VH = CpuSet$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("AllFlags"));
        public static VarHandle AllFlags$VH() {
            return CpuSet.AllFlags$VH;
        }
        public static byte AllFlags$get(MemorySegment seg) {
            return (byte)CpuSet.AllFlags$VH.get(seg);
        }
        public static void AllFlags$set( MemorySegment seg, byte x) {
            CpuSet.AllFlags$VH.set(seg, x);
        }
        public static byte AllFlags$get(MemorySegment seg, long index) {
            return (byte)CpuSet.AllFlags$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void AllFlags$set(MemorySegment seg, long index, byte x) {
            CpuSet.AllFlags$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle Reserved$VH = CpuSet$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("Reserved"));
        public static VarHandle Reserved$VH() {
            return CpuSet.Reserved$VH;
        }
        public static int Reserved$get(MemorySegment seg) {
            return (int)CpuSet.Reserved$VH.get(seg);
        }
        public static void Reserved$set( MemorySegment seg, int x) {
            CpuSet.Reserved$VH.set(seg, x);
        }
        public static int Reserved$get(MemorySegment seg, long index) {
            return (int)CpuSet.Reserved$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void Reserved$set(MemorySegment seg, long index, int x) {
            CpuSet.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle SchedulingClass$VH = CpuSet$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("SchedulingClass"));
        public static VarHandle SchedulingClass$VH() {
            return CpuSet.SchedulingClass$VH;
        }
        public static byte SchedulingClass$get(MemorySegment seg) {
            return (byte)CpuSet.SchedulingClass$VH.get(seg);
        }
        public static void SchedulingClass$set( MemorySegment seg, byte x) {
            CpuSet.SchedulingClass$VH.set(seg, x);
        }
        public static byte SchedulingClass$get(MemorySegment seg, long index) {
            return (byte)CpuSet.SchedulingClass$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void SchedulingClass$set(MemorySegment seg, long index, byte x) {
            CpuSet.SchedulingClass$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle AllocationTag$VH = CpuSet$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AllocationTag"));
        public static VarHandle AllocationTag$VH() {
            return CpuSet.AllocationTag$VH;
        }
        public static long AllocationTag$get(MemorySegment seg) {
            return (long)CpuSet.AllocationTag$VH.get(seg);
        }
        public static void AllocationTag$set( MemorySegment seg, long x) {
            CpuSet.AllocationTag$VH.set(seg, x);
        }
        public static long AllocationTag$get(MemorySegment seg, long index) {
            return (long)CpuSet.AllocationTag$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void AllocationTag$set(MemorySegment seg, long index, long x) {
            CpuSet.AllocationTag$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment CpuSet$slice(MemorySegment seg) {
        return seg.asSlice(8, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


