// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _TXFS_START_RM_INFORMATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("LogContainerSize"),
        Constants$root.C_LONG$LAYOUT.withName("LogContainerCountMin"),
        Constants$root.C_LONG$LAYOUT.withName("LogContainerCountMax"),
        Constants$root.C_LONG$LAYOUT.withName("LogGrowthIncrement"),
        Constants$root.C_LONG$LAYOUT.withName("LogAutoShrinkPercentage"),
        Constants$root.C_LONG$LAYOUT.withName("TmLogPathOffset"),
        Constants$root.C_SHORT$LAYOUT.withName("TmLogPathLength"),
        Constants$root.C_SHORT$LAYOUT.withName("LoggingMode"),
        Constants$root.C_SHORT$LAYOUT.withName("LogPathLength"),
        Constants$root.C_SHORT$LAYOUT.withName("Reserved"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_SHORT$LAYOUT).withName("LogPath"),
        MemoryLayout.paddingLayout(16)
    ).withName("_TXFS_START_RM_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _TXFS_START_RM_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _TXFS_START_RM_INFORMATION.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_TXFS_START_RM_INFORMATION.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _TXFS_START_RM_INFORMATION.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_TXFS_START_RM_INFORMATION.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _TXFS_START_RM_INFORMATION.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LogContainerSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LogContainerSize"));
    public static VarHandle LogContainerSize$VH() {
        return _TXFS_START_RM_INFORMATION.LogContainerSize$VH;
    }
    public static long LogContainerSize$get(MemorySegment seg) {
        return (long)_TXFS_START_RM_INFORMATION.LogContainerSize$VH.get(seg);
    }
    public static void LogContainerSize$set( MemorySegment seg, long x) {
        _TXFS_START_RM_INFORMATION.LogContainerSize$VH.set(seg, x);
    }
    public static long LogContainerSize$get(MemorySegment seg, long index) {
        return (long)_TXFS_START_RM_INFORMATION.LogContainerSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LogContainerSize$set(MemorySegment seg, long index, long x) {
        _TXFS_START_RM_INFORMATION.LogContainerSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LogContainerCountMin$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LogContainerCountMin"));
    public static VarHandle LogContainerCountMin$VH() {
        return _TXFS_START_RM_INFORMATION.LogContainerCountMin$VH;
    }
    public static int LogContainerCountMin$get(MemorySegment seg) {
        return (int)_TXFS_START_RM_INFORMATION.LogContainerCountMin$VH.get(seg);
    }
    public static void LogContainerCountMin$set( MemorySegment seg, int x) {
        _TXFS_START_RM_INFORMATION.LogContainerCountMin$VH.set(seg, x);
    }
    public static int LogContainerCountMin$get(MemorySegment seg, long index) {
        return (int)_TXFS_START_RM_INFORMATION.LogContainerCountMin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LogContainerCountMin$set(MemorySegment seg, long index, int x) {
        _TXFS_START_RM_INFORMATION.LogContainerCountMin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LogContainerCountMax$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LogContainerCountMax"));
    public static VarHandle LogContainerCountMax$VH() {
        return _TXFS_START_RM_INFORMATION.LogContainerCountMax$VH;
    }
    public static int LogContainerCountMax$get(MemorySegment seg) {
        return (int)_TXFS_START_RM_INFORMATION.LogContainerCountMax$VH.get(seg);
    }
    public static void LogContainerCountMax$set( MemorySegment seg, int x) {
        _TXFS_START_RM_INFORMATION.LogContainerCountMax$VH.set(seg, x);
    }
    public static int LogContainerCountMax$get(MemorySegment seg, long index) {
        return (int)_TXFS_START_RM_INFORMATION.LogContainerCountMax$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LogContainerCountMax$set(MemorySegment seg, long index, int x) {
        _TXFS_START_RM_INFORMATION.LogContainerCountMax$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LogGrowthIncrement$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LogGrowthIncrement"));
    public static VarHandle LogGrowthIncrement$VH() {
        return _TXFS_START_RM_INFORMATION.LogGrowthIncrement$VH;
    }
    public static int LogGrowthIncrement$get(MemorySegment seg) {
        return (int)_TXFS_START_RM_INFORMATION.LogGrowthIncrement$VH.get(seg);
    }
    public static void LogGrowthIncrement$set( MemorySegment seg, int x) {
        _TXFS_START_RM_INFORMATION.LogGrowthIncrement$VH.set(seg, x);
    }
    public static int LogGrowthIncrement$get(MemorySegment seg, long index) {
        return (int)_TXFS_START_RM_INFORMATION.LogGrowthIncrement$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LogGrowthIncrement$set(MemorySegment seg, long index, int x) {
        _TXFS_START_RM_INFORMATION.LogGrowthIncrement$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LogAutoShrinkPercentage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LogAutoShrinkPercentage"));
    public static VarHandle LogAutoShrinkPercentage$VH() {
        return _TXFS_START_RM_INFORMATION.LogAutoShrinkPercentage$VH;
    }
    public static int LogAutoShrinkPercentage$get(MemorySegment seg) {
        return (int)_TXFS_START_RM_INFORMATION.LogAutoShrinkPercentage$VH.get(seg);
    }
    public static void LogAutoShrinkPercentage$set( MemorySegment seg, int x) {
        _TXFS_START_RM_INFORMATION.LogAutoShrinkPercentage$VH.set(seg, x);
    }
    public static int LogAutoShrinkPercentage$get(MemorySegment seg, long index) {
        return (int)_TXFS_START_RM_INFORMATION.LogAutoShrinkPercentage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LogAutoShrinkPercentage$set(MemorySegment seg, long index, int x) {
        _TXFS_START_RM_INFORMATION.LogAutoShrinkPercentage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TmLogPathOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TmLogPathOffset"));
    public static VarHandle TmLogPathOffset$VH() {
        return _TXFS_START_RM_INFORMATION.TmLogPathOffset$VH;
    }
    public static int TmLogPathOffset$get(MemorySegment seg) {
        return (int)_TXFS_START_RM_INFORMATION.TmLogPathOffset$VH.get(seg);
    }
    public static void TmLogPathOffset$set( MemorySegment seg, int x) {
        _TXFS_START_RM_INFORMATION.TmLogPathOffset$VH.set(seg, x);
    }
    public static int TmLogPathOffset$get(MemorySegment seg, long index) {
        return (int)_TXFS_START_RM_INFORMATION.TmLogPathOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TmLogPathOffset$set(MemorySegment seg, long index, int x) {
        _TXFS_START_RM_INFORMATION.TmLogPathOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TmLogPathLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TmLogPathLength"));
    public static VarHandle TmLogPathLength$VH() {
        return _TXFS_START_RM_INFORMATION.TmLogPathLength$VH;
    }
    public static short TmLogPathLength$get(MemorySegment seg) {
        return (short)_TXFS_START_RM_INFORMATION.TmLogPathLength$VH.get(seg);
    }
    public static void TmLogPathLength$set( MemorySegment seg, short x) {
        _TXFS_START_RM_INFORMATION.TmLogPathLength$VH.set(seg, x);
    }
    public static short TmLogPathLength$get(MemorySegment seg, long index) {
        return (short)_TXFS_START_RM_INFORMATION.TmLogPathLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TmLogPathLength$set(MemorySegment seg, long index, short x) {
        _TXFS_START_RM_INFORMATION.TmLogPathLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LoggingMode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LoggingMode"));
    public static VarHandle LoggingMode$VH() {
        return _TXFS_START_RM_INFORMATION.LoggingMode$VH;
    }
    public static short LoggingMode$get(MemorySegment seg) {
        return (short)_TXFS_START_RM_INFORMATION.LoggingMode$VH.get(seg);
    }
    public static void LoggingMode$set( MemorySegment seg, short x) {
        _TXFS_START_RM_INFORMATION.LoggingMode$VH.set(seg, x);
    }
    public static short LoggingMode$get(MemorySegment seg, long index) {
        return (short)_TXFS_START_RM_INFORMATION.LoggingMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LoggingMode$set(MemorySegment seg, long index, short x) {
        _TXFS_START_RM_INFORMATION.LoggingMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LogPathLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LogPathLength"));
    public static VarHandle LogPathLength$VH() {
        return _TXFS_START_RM_INFORMATION.LogPathLength$VH;
    }
    public static short LogPathLength$get(MemorySegment seg) {
        return (short)_TXFS_START_RM_INFORMATION.LogPathLength$VH.get(seg);
    }
    public static void LogPathLength$set( MemorySegment seg, short x) {
        _TXFS_START_RM_INFORMATION.LogPathLength$VH.set(seg, x);
    }
    public static short LogPathLength$get(MemorySegment seg, long index) {
        return (short)_TXFS_START_RM_INFORMATION.LogPathLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LogPathLength$set(MemorySegment seg, long index, short x) {
        _TXFS_START_RM_INFORMATION.LogPathLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _TXFS_START_RM_INFORMATION.Reserved$VH;
    }
    public static short Reserved$get(MemorySegment seg) {
        return (short)_TXFS_START_RM_INFORMATION.Reserved$VH.get(seg);
    }
    public static void Reserved$set( MemorySegment seg, short x) {
        _TXFS_START_RM_INFORMATION.Reserved$VH.set(seg, x);
    }
    public static short Reserved$get(MemorySegment seg, long index) {
        return (short)_TXFS_START_RM_INFORMATION.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, short x) {
        _TXFS_START_RM_INFORMATION.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment LogPath$slice(MemorySegment seg) {
        return seg.asSlice(44, 2);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


