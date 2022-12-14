// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _tagHIT_LOGGING_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwStructSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpszLoggedUrlName"),
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("wYear"),
            Constants$root.C_SHORT$LAYOUT.withName("wMonth"),
            Constants$root.C_SHORT$LAYOUT.withName("wDayOfWeek"),
            Constants$root.C_SHORT$LAYOUT.withName("wDay"),
            Constants$root.C_SHORT$LAYOUT.withName("wHour"),
            Constants$root.C_SHORT$LAYOUT.withName("wMinute"),
            Constants$root.C_SHORT$LAYOUT.withName("wSecond"),
            Constants$root.C_SHORT$LAYOUT.withName("wMilliseconds")
        ).withName("StartTime"),
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("wYear"),
            Constants$root.C_SHORT$LAYOUT.withName("wMonth"),
            Constants$root.C_SHORT$LAYOUT.withName("wDayOfWeek"),
            Constants$root.C_SHORT$LAYOUT.withName("wDay"),
            Constants$root.C_SHORT$LAYOUT.withName("wHour"),
            Constants$root.C_SHORT$LAYOUT.withName("wMinute"),
            Constants$root.C_SHORT$LAYOUT.withName("wSecond"),
            Constants$root.C_SHORT$LAYOUT.withName("wMilliseconds")
        ).withName("EndTime"),
        Constants$root.C_POINTER$LAYOUT.withName("lpszExtendedInfo")
    ).withName("_tagHIT_LOGGING_INFO");
    public static MemoryLayout $LAYOUT() {
        return _tagHIT_LOGGING_INFO.$struct$LAYOUT;
    }
    static final VarHandle dwStructSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwStructSize"));
    public static VarHandle dwStructSize$VH() {
        return _tagHIT_LOGGING_INFO.dwStructSize$VH;
    }
    public static int dwStructSize$get(MemorySegment seg) {
        return (int)_tagHIT_LOGGING_INFO.dwStructSize$VH.get(seg);
    }
    public static void dwStructSize$set( MemorySegment seg, int x) {
        _tagHIT_LOGGING_INFO.dwStructSize$VH.set(seg, x);
    }
    public static int dwStructSize$get(MemorySegment seg, long index) {
        return (int)_tagHIT_LOGGING_INFO.dwStructSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwStructSize$set(MemorySegment seg, long index, int x) {
        _tagHIT_LOGGING_INFO.dwStructSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpszLoggedUrlName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpszLoggedUrlName"));
    public static VarHandle lpszLoggedUrlName$VH() {
        return _tagHIT_LOGGING_INFO.lpszLoggedUrlName$VH;
    }
    public static MemoryAddress lpszLoggedUrlName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_tagHIT_LOGGING_INFO.lpszLoggedUrlName$VH.get(seg);
    }
    public static void lpszLoggedUrlName$set( MemorySegment seg, MemoryAddress x) {
        _tagHIT_LOGGING_INFO.lpszLoggedUrlName$VH.set(seg, x);
    }
    public static MemoryAddress lpszLoggedUrlName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_tagHIT_LOGGING_INFO.lpszLoggedUrlName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszLoggedUrlName$set(MemorySegment seg, long index, MemoryAddress x) {
        _tagHIT_LOGGING_INFO.lpszLoggedUrlName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment StartTime$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static MemorySegment EndTime$slice(MemorySegment seg) {
        return seg.asSlice(32, 16);
    }
    static final VarHandle lpszExtendedInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpszExtendedInfo"));
    public static VarHandle lpszExtendedInfo$VH() {
        return _tagHIT_LOGGING_INFO.lpszExtendedInfo$VH;
    }
    public static MemoryAddress lpszExtendedInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_tagHIT_LOGGING_INFO.lpszExtendedInfo$VH.get(seg);
    }
    public static void lpszExtendedInfo$set( MemorySegment seg, MemoryAddress x) {
        _tagHIT_LOGGING_INFO.lpszExtendedInfo$VH.set(seg, x);
    }
    public static MemoryAddress lpszExtendedInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_tagHIT_LOGGING_INFO.lpszExtendedInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszExtendedInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        _tagHIT_LOGGING_INFO.lpszExtendedInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


