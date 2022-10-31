// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _STORAGE_ALLOCATE_BC_STREAM_INPUT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("RequestsPerPeriod"),
        Constants$root.C_LONG$LAYOUT.withName("Period"),
        Constants$root.C_CHAR$LAYOUT.withName("RetryFailures"),
        Constants$root.C_CHAR$LAYOUT.withName("Discardable"),
        MemoryLayout.sequenceLayout(2, Constants$root.C_CHAR$LAYOUT).withName("Reserved1"),
        Constants$root.C_LONG$LAYOUT.withName("AccessType"),
        Constants$root.C_LONG$LAYOUT.withName("AccessMode")
    ).withName("_STORAGE_ALLOCATE_BC_STREAM_INPUT");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_ALLOCATE_BC_STREAM_INPUT.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _STORAGE_ALLOCATE_BC_STREAM_INPUT.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_STORAGE_ALLOCATE_BC_STREAM_INPUT.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _STORAGE_ALLOCATE_BC_STREAM_INPUT.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_STORAGE_ALLOCATE_BC_STREAM_INPUT.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _STORAGE_ALLOCATE_BC_STREAM_INPUT.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RequestsPerPeriod$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RequestsPerPeriod"));
    public static VarHandle RequestsPerPeriod$VH() {
        return _STORAGE_ALLOCATE_BC_STREAM_INPUT.RequestsPerPeriod$VH;
    }
    public static int RequestsPerPeriod$get(MemorySegment seg) {
        return (int)_STORAGE_ALLOCATE_BC_STREAM_INPUT.RequestsPerPeriod$VH.get(seg);
    }
    public static void RequestsPerPeriod$set( MemorySegment seg, int x) {
        _STORAGE_ALLOCATE_BC_STREAM_INPUT.RequestsPerPeriod$VH.set(seg, x);
    }
    public static int RequestsPerPeriod$get(MemorySegment seg, long index) {
        return (int)_STORAGE_ALLOCATE_BC_STREAM_INPUT.RequestsPerPeriod$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RequestsPerPeriod$set(MemorySegment seg, long index, int x) {
        _STORAGE_ALLOCATE_BC_STREAM_INPUT.RequestsPerPeriod$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Period$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Period"));
    public static VarHandle Period$VH() {
        return _STORAGE_ALLOCATE_BC_STREAM_INPUT.Period$VH;
    }
    public static int Period$get(MemorySegment seg) {
        return (int)_STORAGE_ALLOCATE_BC_STREAM_INPUT.Period$VH.get(seg);
    }
    public static void Period$set( MemorySegment seg, int x) {
        _STORAGE_ALLOCATE_BC_STREAM_INPUT.Period$VH.set(seg, x);
    }
    public static int Period$get(MemorySegment seg, long index) {
        return (int)_STORAGE_ALLOCATE_BC_STREAM_INPUT.Period$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Period$set(MemorySegment seg, long index, int x) {
        _STORAGE_ALLOCATE_BC_STREAM_INPUT.Period$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RetryFailures$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RetryFailures"));
    public static VarHandle RetryFailures$VH() {
        return _STORAGE_ALLOCATE_BC_STREAM_INPUT.RetryFailures$VH;
    }
    public static byte RetryFailures$get(MemorySegment seg) {
        return (byte)_STORAGE_ALLOCATE_BC_STREAM_INPUT.RetryFailures$VH.get(seg);
    }
    public static void RetryFailures$set( MemorySegment seg, byte x) {
        _STORAGE_ALLOCATE_BC_STREAM_INPUT.RetryFailures$VH.set(seg, x);
    }
    public static byte RetryFailures$get(MemorySegment seg, long index) {
        return (byte)_STORAGE_ALLOCATE_BC_STREAM_INPUT.RetryFailures$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RetryFailures$set(MemorySegment seg, long index, byte x) {
        _STORAGE_ALLOCATE_BC_STREAM_INPUT.RetryFailures$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Discardable$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Discardable"));
    public static VarHandle Discardable$VH() {
        return _STORAGE_ALLOCATE_BC_STREAM_INPUT.Discardable$VH;
    }
    public static byte Discardable$get(MemorySegment seg) {
        return (byte)_STORAGE_ALLOCATE_BC_STREAM_INPUT.Discardable$VH.get(seg);
    }
    public static void Discardable$set( MemorySegment seg, byte x) {
        _STORAGE_ALLOCATE_BC_STREAM_INPUT.Discardable$VH.set(seg, x);
    }
    public static byte Discardable$get(MemorySegment seg, long index) {
        return (byte)_STORAGE_ALLOCATE_BC_STREAM_INPUT.Discardable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Discardable$set(MemorySegment seg, long index, byte x) {
        _STORAGE_ALLOCATE_BC_STREAM_INPUT.Discardable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved1$slice(MemorySegment seg) {
        return seg.asSlice(14, 2);
    }
    static final VarHandle AccessType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AccessType"));
    public static VarHandle AccessType$VH() {
        return _STORAGE_ALLOCATE_BC_STREAM_INPUT.AccessType$VH;
    }
    public static int AccessType$get(MemorySegment seg) {
        return (int)_STORAGE_ALLOCATE_BC_STREAM_INPUT.AccessType$VH.get(seg);
    }
    public static void AccessType$set( MemorySegment seg, int x) {
        _STORAGE_ALLOCATE_BC_STREAM_INPUT.AccessType$VH.set(seg, x);
    }
    public static int AccessType$get(MemorySegment seg, long index) {
        return (int)_STORAGE_ALLOCATE_BC_STREAM_INPUT.AccessType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AccessType$set(MemorySegment seg, long index, int x) {
        _STORAGE_ALLOCATE_BC_STREAM_INPUT.AccessType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AccessMode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AccessMode"));
    public static VarHandle AccessMode$VH() {
        return _STORAGE_ALLOCATE_BC_STREAM_INPUT.AccessMode$VH;
    }
    public static int AccessMode$get(MemorySegment seg) {
        return (int)_STORAGE_ALLOCATE_BC_STREAM_INPUT.AccessMode$VH.get(seg);
    }
    public static void AccessMode$set( MemorySegment seg, int x) {
        _STORAGE_ALLOCATE_BC_STREAM_INPUT.AccessMode$VH.set(seg, x);
    }
    public static int AccessMode$get(MemorySegment seg, long index) {
        return (int)_STORAGE_ALLOCATE_BC_STREAM_INPUT.AccessMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AccessMode$set(MemorySegment seg, long index, int x) {
        _STORAGE_ALLOCATE_BC_STREAM_INPUT.AccessMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


