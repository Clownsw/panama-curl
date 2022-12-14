// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _UMS_SCHEDULER_STARTUP_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("UmsVersion"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("CompletionList"),
        Constants$root.C_POINTER$LAYOUT.withName("SchedulerProc"),
        Constants$root.C_POINTER$LAYOUT.withName("SchedulerParam")
    ).withName("_UMS_SCHEDULER_STARTUP_INFO");
    public static MemoryLayout $LAYOUT() {
        return _UMS_SCHEDULER_STARTUP_INFO.$struct$LAYOUT;
    }
    static final VarHandle UmsVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UmsVersion"));
    public static VarHandle UmsVersion$VH() {
        return _UMS_SCHEDULER_STARTUP_INFO.UmsVersion$VH;
    }
    public static int UmsVersion$get(MemorySegment seg) {
        return (int)_UMS_SCHEDULER_STARTUP_INFO.UmsVersion$VH.get(seg);
    }
    public static void UmsVersion$set( MemorySegment seg, int x) {
        _UMS_SCHEDULER_STARTUP_INFO.UmsVersion$VH.set(seg, x);
    }
    public static int UmsVersion$get(MemorySegment seg, long index) {
        return (int)_UMS_SCHEDULER_STARTUP_INFO.UmsVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UmsVersion$set(MemorySegment seg, long index, int x) {
        _UMS_SCHEDULER_STARTUP_INFO.UmsVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CompletionList$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CompletionList"));
    public static VarHandle CompletionList$VH() {
        return _UMS_SCHEDULER_STARTUP_INFO.CompletionList$VH;
    }
    public static MemoryAddress CompletionList$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_UMS_SCHEDULER_STARTUP_INFO.CompletionList$VH.get(seg);
    }
    public static void CompletionList$set( MemorySegment seg, MemoryAddress x) {
        _UMS_SCHEDULER_STARTUP_INFO.CompletionList$VH.set(seg, x);
    }
    public static MemoryAddress CompletionList$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_UMS_SCHEDULER_STARTUP_INFO.CompletionList$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CompletionList$set(MemorySegment seg, long index, MemoryAddress x) {
        _UMS_SCHEDULER_STARTUP_INFO.CompletionList$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SchedulerProc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SchedulerProc"));
    public static VarHandle SchedulerProc$VH() {
        return _UMS_SCHEDULER_STARTUP_INFO.SchedulerProc$VH;
    }
    public static MemoryAddress SchedulerProc$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_UMS_SCHEDULER_STARTUP_INFO.SchedulerProc$VH.get(seg);
    }
    public static void SchedulerProc$set( MemorySegment seg, MemoryAddress x) {
        _UMS_SCHEDULER_STARTUP_INFO.SchedulerProc$VH.set(seg, x);
    }
    public static MemoryAddress SchedulerProc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_UMS_SCHEDULER_STARTUP_INFO.SchedulerProc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SchedulerProc$set(MemorySegment seg, long index, MemoryAddress x) {
        _UMS_SCHEDULER_STARTUP_INFO.SchedulerProc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PUMS_SCHEDULER_ENTRY_POINT SchedulerProc (MemorySegment segment, MemorySession session) {
        return PUMS_SCHEDULER_ENTRY_POINT.ofAddress(SchedulerProc$get(segment), session);
    }
    static final VarHandle SchedulerParam$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SchedulerParam"));
    public static VarHandle SchedulerParam$VH() {
        return _UMS_SCHEDULER_STARTUP_INFO.SchedulerParam$VH;
    }
    public static MemoryAddress SchedulerParam$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_UMS_SCHEDULER_STARTUP_INFO.SchedulerParam$VH.get(seg);
    }
    public static void SchedulerParam$set( MemorySegment seg, MemoryAddress x) {
        _UMS_SCHEDULER_STARTUP_INFO.SchedulerParam$VH.set(seg, x);
    }
    public static MemoryAddress SchedulerParam$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_UMS_SCHEDULER_STARTUP_INFO.SchedulerParam$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SchedulerParam$set(MemorySegment seg, long index, MemoryAddress x) {
        _UMS_SCHEDULER_STARTUP_INFO.SchedulerParam$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


