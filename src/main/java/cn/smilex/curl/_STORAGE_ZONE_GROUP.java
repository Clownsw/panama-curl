// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _STORAGE_ZONE_GROUP {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("ZoneCount"),
        Constants$root.C_LONG$LAYOUT.withName("ZoneType"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ZoneSize")
    ).withName("_STORAGE_ZONE_GROUP");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_ZONE_GROUP.$struct$LAYOUT;
    }
    static final VarHandle ZoneCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ZoneCount"));
    public static VarHandle ZoneCount$VH() {
        return _STORAGE_ZONE_GROUP.ZoneCount$VH;
    }
    public static int ZoneCount$get(MemorySegment seg) {
        return (int)_STORAGE_ZONE_GROUP.ZoneCount$VH.get(seg);
    }
    public static void ZoneCount$set( MemorySegment seg, int x) {
        _STORAGE_ZONE_GROUP.ZoneCount$VH.set(seg, x);
    }
    public static int ZoneCount$get(MemorySegment seg, long index) {
        return (int)_STORAGE_ZONE_GROUP.ZoneCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ZoneCount$set(MemorySegment seg, long index, int x) {
        _STORAGE_ZONE_GROUP.ZoneCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ZoneType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ZoneType"));
    public static VarHandle ZoneType$VH() {
        return _STORAGE_ZONE_GROUP.ZoneType$VH;
    }
    public static int ZoneType$get(MemorySegment seg) {
        return (int)_STORAGE_ZONE_GROUP.ZoneType$VH.get(seg);
    }
    public static void ZoneType$set( MemorySegment seg, int x) {
        _STORAGE_ZONE_GROUP.ZoneType$VH.set(seg, x);
    }
    public static int ZoneType$get(MemorySegment seg, long index) {
        return (int)_STORAGE_ZONE_GROUP.ZoneType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ZoneType$set(MemorySegment seg, long index, int x) {
        _STORAGE_ZONE_GROUP.ZoneType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ZoneSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ZoneSize"));
    public static VarHandle ZoneSize$VH() {
        return _STORAGE_ZONE_GROUP.ZoneSize$VH;
    }
    public static long ZoneSize$get(MemorySegment seg) {
        return (long)_STORAGE_ZONE_GROUP.ZoneSize$VH.get(seg);
    }
    public static void ZoneSize$set( MemorySegment seg, long x) {
        _STORAGE_ZONE_GROUP.ZoneSize$VH.set(seg, x);
    }
    public static long ZoneSize$get(MemorySegment seg, long index) {
        return (long)_STORAGE_ZONE_GROUP.ZoneSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ZoneSize$set(MemorySegment seg, long index, long x) {
        _STORAGE_ZONE_GROUP.ZoneSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

