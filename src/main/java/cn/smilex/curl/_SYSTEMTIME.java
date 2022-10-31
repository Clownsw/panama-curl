// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SYSTEMTIME {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("wYear"),
        Constants$root.C_SHORT$LAYOUT.withName("wMonth"),
        Constants$root.C_SHORT$LAYOUT.withName("wDayOfWeek"),
        Constants$root.C_SHORT$LAYOUT.withName("wDay"),
        Constants$root.C_SHORT$LAYOUT.withName("wHour"),
        Constants$root.C_SHORT$LAYOUT.withName("wMinute"),
        Constants$root.C_SHORT$LAYOUT.withName("wSecond"),
        Constants$root.C_SHORT$LAYOUT.withName("wMilliseconds")
    ).withName("_SYSTEMTIME");
    public static MemoryLayout $LAYOUT() {
        return _SYSTEMTIME.$struct$LAYOUT;
    }
    static final VarHandle wYear$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wYear"));
    public static VarHandle wYear$VH() {
        return _SYSTEMTIME.wYear$VH;
    }
    public static short wYear$get(MemorySegment seg) {
        return (short)_SYSTEMTIME.wYear$VH.get(seg);
    }
    public static void wYear$set( MemorySegment seg, short x) {
        _SYSTEMTIME.wYear$VH.set(seg, x);
    }
    public static short wYear$get(MemorySegment seg, long index) {
        return (short)_SYSTEMTIME.wYear$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wYear$set(MemorySegment seg, long index, short x) {
        _SYSTEMTIME.wYear$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wMonth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wMonth"));
    public static VarHandle wMonth$VH() {
        return _SYSTEMTIME.wMonth$VH;
    }
    public static short wMonth$get(MemorySegment seg) {
        return (short)_SYSTEMTIME.wMonth$VH.get(seg);
    }
    public static void wMonth$set( MemorySegment seg, short x) {
        _SYSTEMTIME.wMonth$VH.set(seg, x);
    }
    public static short wMonth$get(MemorySegment seg, long index) {
        return (short)_SYSTEMTIME.wMonth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wMonth$set(MemorySegment seg, long index, short x) {
        _SYSTEMTIME.wMonth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wDayOfWeek$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wDayOfWeek"));
    public static VarHandle wDayOfWeek$VH() {
        return _SYSTEMTIME.wDayOfWeek$VH;
    }
    public static short wDayOfWeek$get(MemorySegment seg) {
        return (short)_SYSTEMTIME.wDayOfWeek$VH.get(seg);
    }
    public static void wDayOfWeek$set( MemorySegment seg, short x) {
        _SYSTEMTIME.wDayOfWeek$VH.set(seg, x);
    }
    public static short wDayOfWeek$get(MemorySegment seg, long index) {
        return (short)_SYSTEMTIME.wDayOfWeek$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wDayOfWeek$set(MemorySegment seg, long index, short x) {
        _SYSTEMTIME.wDayOfWeek$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wDay$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wDay"));
    public static VarHandle wDay$VH() {
        return _SYSTEMTIME.wDay$VH;
    }
    public static short wDay$get(MemorySegment seg) {
        return (short)_SYSTEMTIME.wDay$VH.get(seg);
    }
    public static void wDay$set( MemorySegment seg, short x) {
        _SYSTEMTIME.wDay$VH.set(seg, x);
    }
    public static short wDay$get(MemorySegment seg, long index) {
        return (short)_SYSTEMTIME.wDay$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wDay$set(MemorySegment seg, long index, short x) {
        _SYSTEMTIME.wDay$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wHour$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wHour"));
    public static VarHandle wHour$VH() {
        return _SYSTEMTIME.wHour$VH;
    }
    public static short wHour$get(MemorySegment seg) {
        return (short)_SYSTEMTIME.wHour$VH.get(seg);
    }
    public static void wHour$set( MemorySegment seg, short x) {
        _SYSTEMTIME.wHour$VH.set(seg, x);
    }
    public static short wHour$get(MemorySegment seg, long index) {
        return (short)_SYSTEMTIME.wHour$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wHour$set(MemorySegment seg, long index, short x) {
        _SYSTEMTIME.wHour$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wMinute$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wMinute"));
    public static VarHandle wMinute$VH() {
        return _SYSTEMTIME.wMinute$VH;
    }
    public static short wMinute$get(MemorySegment seg) {
        return (short)_SYSTEMTIME.wMinute$VH.get(seg);
    }
    public static void wMinute$set( MemorySegment seg, short x) {
        _SYSTEMTIME.wMinute$VH.set(seg, x);
    }
    public static short wMinute$get(MemorySegment seg, long index) {
        return (short)_SYSTEMTIME.wMinute$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wMinute$set(MemorySegment seg, long index, short x) {
        _SYSTEMTIME.wMinute$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wSecond$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wSecond"));
    public static VarHandle wSecond$VH() {
        return _SYSTEMTIME.wSecond$VH;
    }
    public static short wSecond$get(MemorySegment seg) {
        return (short)_SYSTEMTIME.wSecond$VH.get(seg);
    }
    public static void wSecond$set( MemorySegment seg, short x) {
        _SYSTEMTIME.wSecond$VH.set(seg, x);
    }
    public static short wSecond$get(MemorySegment seg, long index) {
        return (short)_SYSTEMTIME.wSecond$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wSecond$set(MemorySegment seg, long index, short x) {
        _SYSTEMTIME.wSecond$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wMilliseconds$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wMilliseconds"));
    public static VarHandle wMilliseconds$VH() {
        return _SYSTEMTIME.wMilliseconds$VH;
    }
    public static short wMilliseconds$get(MemorySegment seg) {
        return (short)_SYSTEMTIME.wMilliseconds$VH.get(seg);
    }
    public static void wMilliseconds$set( MemorySegment seg, short x) {
        _SYSTEMTIME.wMilliseconds$VH.set(seg, x);
    }
    public static short wMilliseconds$get(MemorySegment seg, long index) {
        return (short)_SYSTEMTIME.wMilliseconds$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wMilliseconds$set(MemorySegment seg, long index, short x) {
        _SYSTEMTIME.wMilliseconds$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


