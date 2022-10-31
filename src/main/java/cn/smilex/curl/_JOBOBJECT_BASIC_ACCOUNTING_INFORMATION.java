// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _JOBOBJECT_BASIC_ACCOUNTING_INFORMATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
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
        ).withName("TotalUserTime"),
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
        ).withName("TotalKernelTime"),
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
        ).withName("ThisPeriodTotalUserTime"),
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
        ).withName("ThisPeriodTotalKernelTime"),
        Constants$root.C_LONG$LAYOUT.withName("TotalPageFaultCount"),
        Constants$root.C_LONG$LAYOUT.withName("TotalProcesses"),
        Constants$root.C_LONG$LAYOUT.withName("ActiveProcesses"),
        Constants$root.C_LONG$LAYOUT.withName("TotalTerminatedProcesses")
    ).withName("_JOBOBJECT_BASIC_ACCOUNTING_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _JOBOBJECT_BASIC_ACCOUNTING_INFORMATION.$struct$LAYOUT;
    }
    public static MemorySegment TotalUserTime$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment TotalKernelTime$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static MemorySegment ThisPeriodTotalUserTime$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    public static MemorySegment ThisPeriodTotalKernelTime$slice(MemorySegment seg) {
        return seg.asSlice(24, 8);
    }
    static final VarHandle TotalPageFaultCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TotalPageFaultCount"));
    public static VarHandle TotalPageFaultCount$VH() {
        return _JOBOBJECT_BASIC_ACCOUNTING_INFORMATION.TotalPageFaultCount$VH;
    }
    public static int TotalPageFaultCount$get(MemorySegment seg) {
        return (int)_JOBOBJECT_BASIC_ACCOUNTING_INFORMATION.TotalPageFaultCount$VH.get(seg);
    }
    public static void TotalPageFaultCount$set( MemorySegment seg, int x) {
        _JOBOBJECT_BASIC_ACCOUNTING_INFORMATION.TotalPageFaultCount$VH.set(seg, x);
    }
    public static int TotalPageFaultCount$get(MemorySegment seg, long index) {
        return (int)_JOBOBJECT_BASIC_ACCOUNTING_INFORMATION.TotalPageFaultCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TotalPageFaultCount$set(MemorySegment seg, long index, int x) {
        _JOBOBJECT_BASIC_ACCOUNTING_INFORMATION.TotalPageFaultCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TotalProcesses$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TotalProcesses"));
    public static VarHandle TotalProcesses$VH() {
        return _JOBOBJECT_BASIC_ACCOUNTING_INFORMATION.TotalProcesses$VH;
    }
    public static int TotalProcesses$get(MemorySegment seg) {
        return (int)_JOBOBJECT_BASIC_ACCOUNTING_INFORMATION.TotalProcesses$VH.get(seg);
    }
    public static void TotalProcesses$set( MemorySegment seg, int x) {
        _JOBOBJECT_BASIC_ACCOUNTING_INFORMATION.TotalProcesses$VH.set(seg, x);
    }
    public static int TotalProcesses$get(MemorySegment seg, long index) {
        return (int)_JOBOBJECT_BASIC_ACCOUNTING_INFORMATION.TotalProcesses$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TotalProcesses$set(MemorySegment seg, long index, int x) {
        _JOBOBJECT_BASIC_ACCOUNTING_INFORMATION.TotalProcesses$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ActiveProcesses$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ActiveProcesses"));
    public static VarHandle ActiveProcesses$VH() {
        return _JOBOBJECT_BASIC_ACCOUNTING_INFORMATION.ActiveProcesses$VH;
    }
    public static int ActiveProcesses$get(MemorySegment seg) {
        return (int)_JOBOBJECT_BASIC_ACCOUNTING_INFORMATION.ActiveProcesses$VH.get(seg);
    }
    public static void ActiveProcesses$set( MemorySegment seg, int x) {
        _JOBOBJECT_BASIC_ACCOUNTING_INFORMATION.ActiveProcesses$VH.set(seg, x);
    }
    public static int ActiveProcesses$get(MemorySegment seg, long index) {
        return (int)_JOBOBJECT_BASIC_ACCOUNTING_INFORMATION.ActiveProcesses$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ActiveProcesses$set(MemorySegment seg, long index, int x) {
        _JOBOBJECT_BASIC_ACCOUNTING_INFORMATION.ActiveProcesses$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TotalTerminatedProcesses$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TotalTerminatedProcesses"));
    public static VarHandle TotalTerminatedProcesses$VH() {
        return _JOBOBJECT_BASIC_ACCOUNTING_INFORMATION.TotalTerminatedProcesses$VH;
    }
    public static int TotalTerminatedProcesses$get(MemorySegment seg) {
        return (int)_JOBOBJECT_BASIC_ACCOUNTING_INFORMATION.TotalTerminatedProcesses$VH.get(seg);
    }
    public static void TotalTerminatedProcesses$set( MemorySegment seg, int x) {
        _JOBOBJECT_BASIC_ACCOUNTING_INFORMATION.TotalTerminatedProcesses$VH.set(seg, x);
    }
    public static int TotalTerminatedProcesses$get(MemorySegment seg, long index) {
        return (int)_JOBOBJECT_BASIC_ACCOUNTING_INFORMATION.TotalTerminatedProcesses$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TotalTerminatedProcesses$set(MemorySegment seg, long index, int x) {
        _JOBOBJECT_BASIC_ACCOUNTING_INFORMATION.TotalTerminatedProcesses$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


