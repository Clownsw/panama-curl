// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _QUOTA_LIMITS_EX {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("PagedPoolLimit"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("NonPagedPoolLimit"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("MinimumWorkingSetSize"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("MaximumWorkingSetSize"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("PagefileLimit"),
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
        ).withName("TimeLimit"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("WorkingSetLimit"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Reserved2"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Reserved3"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Reserved4"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("RateData"),
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.paddingLayout(7).withName("RatePercent"),
                    MemoryLayout.paddingLayout(25).withName("Reserved0")
                )
            ).withName("$anon$0")
        ).withName("CpuRateLimit")
    ).withName("_QUOTA_LIMITS_EX");
    public static MemoryLayout $LAYOUT() {
        return _QUOTA_LIMITS_EX.$struct$LAYOUT;
    }
    static final VarHandle PagedPoolLimit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PagedPoolLimit"));
    public static VarHandle PagedPoolLimit$VH() {
        return _QUOTA_LIMITS_EX.PagedPoolLimit$VH;
    }
    public static long PagedPoolLimit$get(MemorySegment seg) {
        return (long)_QUOTA_LIMITS_EX.PagedPoolLimit$VH.get(seg);
    }
    public static void PagedPoolLimit$set( MemorySegment seg, long x) {
        _QUOTA_LIMITS_EX.PagedPoolLimit$VH.set(seg, x);
    }
    public static long PagedPoolLimit$get(MemorySegment seg, long index) {
        return (long)_QUOTA_LIMITS_EX.PagedPoolLimit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PagedPoolLimit$set(MemorySegment seg, long index, long x) {
        _QUOTA_LIMITS_EX.PagedPoolLimit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NonPagedPoolLimit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NonPagedPoolLimit"));
    public static VarHandle NonPagedPoolLimit$VH() {
        return _QUOTA_LIMITS_EX.NonPagedPoolLimit$VH;
    }
    public static long NonPagedPoolLimit$get(MemorySegment seg) {
        return (long)_QUOTA_LIMITS_EX.NonPagedPoolLimit$VH.get(seg);
    }
    public static void NonPagedPoolLimit$set( MemorySegment seg, long x) {
        _QUOTA_LIMITS_EX.NonPagedPoolLimit$VH.set(seg, x);
    }
    public static long NonPagedPoolLimit$get(MemorySegment seg, long index) {
        return (long)_QUOTA_LIMITS_EX.NonPagedPoolLimit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NonPagedPoolLimit$set(MemorySegment seg, long index, long x) {
        _QUOTA_LIMITS_EX.NonPagedPoolLimit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MinimumWorkingSetSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MinimumWorkingSetSize"));
    public static VarHandle MinimumWorkingSetSize$VH() {
        return _QUOTA_LIMITS_EX.MinimumWorkingSetSize$VH;
    }
    public static long MinimumWorkingSetSize$get(MemorySegment seg) {
        return (long)_QUOTA_LIMITS_EX.MinimumWorkingSetSize$VH.get(seg);
    }
    public static void MinimumWorkingSetSize$set( MemorySegment seg, long x) {
        _QUOTA_LIMITS_EX.MinimumWorkingSetSize$VH.set(seg, x);
    }
    public static long MinimumWorkingSetSize$get(MemorySegment seg, long index) {
        return (long)_QUOTA_LIMITS_EX.MinimumWorkingSetSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinimumWorkingSetSize$set(MemorySegment seg, long index, long x) {
        _QUOTA_LIMITS_EX.MinimumWorkingSetSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MaximumWorkingSetSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaximumWorkingSetSize"));
    public static VarHandle MaximumWorkingSetSize$VH() {
        return _QUOTA_LIMITS_EX.MaximumWorkingSetSize$VH;
    }
    public static long MaximumWorkingSetSize$get(MemorySegment seg) {
        return (long)_QUOTA_LIMITS_EX.MaximumWorkingSetSize$VH.get(seg);
    }
    public static void MaximumWorkingSetSize$set( MemorySegment seg, long x) {
        _QUOTA_LIMITS_EX.MaximumWorkingSetSize$VH.set(seg, x);
    }
    public static long MaximumWorkingSetSize$get(MemorySegment seg, long index) {
        return (long)_QUOTA_LIMITS_EX.MaximumWorkingSetSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaximumWorkingSetSize$set(MemorySegment seg, long index, long x) {
        _QUOTA_LIMITS_EX.MaximumWorkingSetSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PagefileLimit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PagefileLimit"));
    public static VarHandle PagefileLimit$VH() {
        return _QUOTA_LIMITS_EX.PagefileLimit$VH;
    }
    public static long PagefileLimit$get(MemorySegment seg) {
        return (long)_QUOTA_LIMITS_EX.PagefileLimit$VH.get(seg);
    }
    public static void PagefileLimit$set( MemorySegment seg, long x) {
        _QUOTA_LIMITS_EX.PagefileLimit$VH.set(seg, x);
    }
    public static long PagefileLimit$get(MemorySegment seg, long index) {
        return (long)_QUOTA_LIMITS_EX.PagefileLimit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PagefileLimit$set(MemorySegment seg, long index, long x) {
        _QUOTA_LIMITS_EX.PagefileLimit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment TimeLimit$slice(MemorySegment seg) {
        return seg.asSlice(40, 8);
    }
    static final VarHandle WorkingSetLimit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("WorkingSetLimit"));
    public static VarHandle WorkingSetLimit$VH() {
        return _QUOTA_LIMITS_EX.WorkingSetLimit$VH;
    }
    public static long WorkingSetLimit$get(MemorySegment seg) {
        return (long)_QUOTA_LIMITS_EX.WorkingSetLimit$VH.get(seg);
    }
    public static void WorkingSetLimit$set( MemorySegment seg, long x) {
        _QUOTA_LIMITS_EX.WorkingSetLimit$VH.set(seg, x);
    }
    public static long WorkingSetLimit$get(MemorySegment seg, long index) {
        return (long)_QUOTA_LIMITS_EX.WorkingSetLimit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void WorkingSetLimit$set(MemorySegment seg, long index, long x) {
        _QUOTA_LIMITS_EX.WorkingSetLimit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved2"));
    public static VarHandle Reserved2$VH() {
        return _QUOTA_LIMITS_EX.Reserved2$VH;
    }
    public static long Reserved2$get(MemorySegment seg) {
        return (long)_QUOTA_LIMITS_EX.Reserved2$VH.get(seg);
    }
    public static void Reserved2$set( MemorySegment seg, long x) {
        _QUOTA_LIMITS_EX.Reserved2$VH.set(seg, x);
    }
    public static long Reserved2$get(MemorySegment seg, long index) {
        return (long)_QUOTA_LIMITS_EX.Reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved2$set(MemorySegment seg, long index, long x) {
        _QUOTA_LIMITS_EX.Reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved3"));
    public static VarHandle Reserved3$VH() {
        return _QUOTA_LIMITS_EX.Reserved3$VH;
    }
    public static long Reserved3$get(MemorySegment seg) {
        return (long)_QUOTA_LIMITS_EX.Reserved3$VH.get(seg);
    }
    public static void Reserved3$set( MemorySegment seg, long x) {
        _QUOTA_LIMITS_EX.Reserved3$VH.set(seg, x);
    }
    public static long Reserved3$get(MemorySegment seg, long index) {
        return (long)_QUOTA_LIMITS_EX.Reserved3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved3$set(MemorySegment seg, long index, long x) {
        _QUOTA_LIMITS_EX.Reserved3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved4$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved4"));
    public static VarHandle Reserved4$VH() {
        return _QUOTA_LIMITS_EX.Reserved4$VH;
    }
    public static long Reserved4$get(MemorySegment seg) {
        return (long)_QUOTA_LIMITS_EX.Reserved4$VH.get(seg);
    }
    public static void Reserved4$set( MemorySegment seg, long x) {
        _QUOTA_LIMITS_EX.Reserved4$VH.set(seg, x);
    }
    public static long Reserved4$get(MemorySegment seg, long index) {
        return (long)_QUOTA_LIMITS_EX.Reserved4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved4$set(MemorySegment seg, long index, long x) {
        _QUOTA_LIMITS_EX.Reserved4$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _QUOTA_LIMITS_EX.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_QUOTA_LIMITS_EX.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _QUOTA_LIMITS_EX.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_QUOTA_LIMITS_EX.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _QUOTA_LIMITS_EX.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment CpuRateLimit$slice(MemorySegment seg) {
        return seg.asSlice(84, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


