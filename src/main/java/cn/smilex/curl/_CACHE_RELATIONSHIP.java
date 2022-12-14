// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CACHE_RELATIONSHIP {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("Level"),
        Constants$root.C_CHAR$LAYOUT.withName("Associativity"),
        Constants$root.C_SHORT$LAYOUT.withName("LineSize"),
        Constants$root.C_LONG$LAYOUT.withName("CacheSize"),
        Constants$root.C_LONG$LAYOUT.withName("Type"),
        MemoryLayout.sequenceLayout(20, Constants$root.C_CHAR$LAYOUT).withName("Reserved"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("Mask"),
            Constants$root.C_SHORT$LAYOUT.withName("Group"),
            MemoryLayout.sequenceLayout(3, Constants$root.C_SHORT$LAYOUT).withName("Reserved")
        ).withName("GroupMask")
    ).withName("_CACHE_RELATIONSHIP");
    public static MemoryLayout $LAYOUT() {
        return _CACHE_RELATIONSHIP.$struct$LAYOUT;
    }
    static final VarHandle Level$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Level"));
    public static VarHandle Level$VH() {
        return _CACHE_RELATIONSHIP.Level$VH;
    }
    public static byte Level$get(MemorySegment seg) {
        return (byte)_CACHE_RELATIONSHIP.Level$VH.get(seg);
    }
    public static void Level$set( MemorySegment seg, byte x) {
        _CACHE_RELATIONSHIP.Level$VH.set(seg, x);
    }
    public static byte Level$get(MemorySegment seg, long index) {
        return (byte)_CACHE_RELATIONSHIP.Level$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Level$set(MemorySegment seg, long index, byte x) {
        _CACHE_RELATIONSHIP.Level$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Associativity$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Associativity"));
    public static VarHandle Associativity$VH() {
        return _CACHE_RELATIONSHIP.Associativity$VH;
    }
    public static byte Associativity$get(MemorySegment seg) {
        return (byte)_CACHE_RELATIONSHIP.Associativity$VH.get(seg);
    }
    public static void Associativity$set( MemorySegment seg, byte x) {
        _CACHE_RELATIONSHIP.Associativity$VH.set(seg, x);
    }
    public static byte Associativity$get(MemorySegment seg, long index) {
        return (byte)_CACHE_RELATIONSHIP.Associativity$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Associativity$set(MemorySegment seg, long index, byte x) {
        _CACHE_RELATIONSHIP.Associativity$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LineSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LineSize"));
    public static VarHandle LineSize$VH() {
        return _CACHE_RELATIONSHIP.LineSize$VH;
    }
    public static short LineSize$get(MemorySegment seg) {
        return (short)_CACHE_RELATIONSHIP.LineSize$VH.get(seg);
    }
    public static void LineSize$set( MemorySegment seg, short x) {
        _CACHE_RELATIONSHIP.LineSize$VH.set(seg, x);
    }
    public static short LineSize$get(MemorySegment seg, long index) {
        return (short)_CACHE_RELATIONSHIP.LineSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LineSize$set(MemorySegment seg, long index, short x) {
        _CACHE_RELATIONSHIP.LineSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CacheSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CacheSize"));
    public static VarHandle CacheSize$VH() {
        return _CACHE_RELATIONSHIP.CacheSize$VH;
    }
    public static int CacheSize$get(MemorySegment seg) {
        return (int)_CACHE_RELATIONSHIP.CacheSize$VH.get(seg);
    }
    public static void CacheSize$set( MemorySegment seg, int x) {
        _CACHE_RELATIONSHIP.CacheSize$VH.set(seg, x);
    }
    public static int CacheSize$get(MemorySegment seg, long index) {
        return (int)_CACHE_RELATIONSHIP.CacheSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CacheSize$set(MemorySegment seg, long index, int x) {
        _CACHE_RELATIONSHIP.CacheSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Type"));
    public static VarHandle Type$VH() {
        return _CACHE_RELATIONSHIP.Type$VH;
    }
    public static int Type$get(MemorySegment seg) {
        return (int)_CACHE_RELATIONSHIP.Type$VH.get(seg);
    }
    public static void Type$set( MemorySegment seg, int x) {
        _CACHE_RELATIONSHIP.Type$VH.set(seg, x);
    }
    public static int Type$get(MemorySegment seg, long index) {
        return (int)_CACHE_RELATIONSHIP.Type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Type$set(MemorySegment seg, long index, int x) {
        _CACHE_RELATIONSHIP.Type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved$slice(MemorySegment seg) {
        return seg.asSlice(12, 20);
    }
    public static MemorySegment GroupMask$slice(MemorySegment seg) {
        return seg.asSlice(32, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


