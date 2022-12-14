// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _JOBOBJECT_IO_ATTRIBUTION_INFORMATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("ControlFlags"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("IoCount"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("TotalNonOverlappedQueueTime"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("TotalNonOverlappedServiceTime"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("TotalSize")
        ).withName("ReadStats"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("IoCount"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("TotalNonOverlappedQueueTime"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("TotalNonOverlappedServiceTime"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("TotalSize")
        ).withName("WriteStats")
    ).withName("_JOBOBJECT_IO_ATTRIBUTION_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _JOBOBJECT_IO_ATTRIBUTION_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle ControlFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ControlFlags"));
    public static VarHandle ControlFlags$VH() {
        return _JOBOBJECT_IO_ATTRIBUTION_INFORMATION.ControlFlags$VH;
    }
    public static int ControlFlags$get(MemorySegment seg) {
        return (int)_JOBOBJECT_IO_ATTRIBUTION_INFORMATION.ControlFlags$VH.get(seg);
    }
    public static void ControlFlags$set( MemorySegment seg, int x) {
        _JOBOBJECT_IO_ATTRIBUTION_INFORMATION.ControlFlags$VH.set(seg, x);
    }
    public static int ControlFlags$get(MemorySegment seg, long index) {
        return (int)_JOBOBJECT_IO_ATTRIBUTION_INFORMATION.ControlFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ControlFlags$set(MemorySegment seg, long index, int x) {
        _JOBOBJECT_IO_ATTRIBUTION_INFORMATION.ControlFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ReadStats$slice(MemorySegment seg) {
        return seg.asSlice(8, 32);
    }
    public static MemorySegment WriteStats$slice(MemorySegment seg) {
        return seg.asSlice(40, 32);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


