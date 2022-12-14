// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _tagRemBINDINFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("szExtraInfo"),
        Constants$root.C_LONG$LAYOUT.withName("grfBindInfoF"),
        Constants$root.C_LONG$LAYOUT.withName("dwBindVerb"),
        Constants$root.C_POINTER$LAYOUT.withName("szCustomVerb"),
        Constants$root.C_LONG$LAYOUT.withName("cbstgmedData"),
        Constants$root.C_LONG$LAYOUT.withName("dwOptions"),
        Constants$root.C_LONG$LAYOUT.withName("dwOptionsFlags"),
        Constants$root.C_LONG$LAYOUT.withName("dwCodePage"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("nLength"),
            Constants$root.C_LONG$LAYOUT.withName("lpSecurityDescriptor"),
            Constants$root.C_LONG$LAYOUT.withName("bInheritHandle")
        ).withName("securityAttributes"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("iid"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pUnk"),
        Constants$root.C_LONG$LAYOUT.withName("dwReserved"),
        MemoryLayout.paddingLayout(32)
    ).withName("_tagRemBINDINFO");
    public static MemoryLayout $LAYOUT() {
        return _tagRemBINDINFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _tagRemBINDINFO.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_tagRemBINDINFO.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _tagRemBINDINFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_tagRemBINDINFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _tagRemBINDINFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle szExtraInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("szExtraInfo"));
    public static VarHandle szExtraInfo$VH() {
        return _tagRemBINDINFO.szExtraInfo$VH;
    }
    public static MemoryAddress szExtraInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_tagRemBINDINFO.szExtraInfo$VH.get(seg);
    }
    public static void szExtraInfo$set( MemorySegment seg, MemoryAddress x) {
        _tagRemBINDINFO.szExtraInfo$VH.set(seg, x);
    }
    public static MemoryAddress szExtraInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_tagRemBINDINFO.szExtraInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void szExtraInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        _tagRemBINDINFO.szExtraInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle grfBindInfoF$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("grfBindInfoF"));
    public static VarHandle grfBindInfoF$VH() {
        return _tagRemBINDINFO.grfBindInfoF$VH;
    }
    public static int grfBindInfoF$get(MemorySegment seg) {
        return (int)_tagRemBINDINFO.grfBindInfoF$VH.get(seg);
    }
    public static void grfBindInfoF$set( MemorySegment seg, int x) {
        _tagRemBINDINFO.grfBindInfoF$VH.set(seg, x);
    }
    public static int grfBindInfoF$get(MemorySegment seg, long index) {
        return (int)_tagRemBINDINFO.grfBindInfoF$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void grfBindInfoF$set(MemorySegment seg, long index, int x) {
        _tagRemBINDINFO.grfBindInfoF$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwBindVerb$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwBindVerb"));
    public static VarHandle dwBindVerb$VH() {
        return _tagRemBINDINFO.dwBindVerb$VH;
    }
    public static int dwBindVerb$get(MemorySegment seg) {
        return (int)_tagRemBINDINFO.dwBindVerb$VH.get(seg);
    }
    public static void dwBindVerb$set( MemorySegment seg, int x) {
        _tagRemBINDINFO.dwBindVerb$VH.set(seg, x);
    }
    public static int dwBindVerb$get(MemorySegment seg, long index) {
        return (int)_tagRemBINDINFO.dwBindVerb$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwBindVerb$set(MemorySegment seg, long index, int x) {
        _tagRemBINDINFO.dwBindVerb$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle szCustomVerb$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("szCustomVerb"));
    public static VarHandle szCustomVerb$VH() {
        return _tagRemBINDINFO.szCustomVerb$VH;
    }
    public static MemoryAddress szCustomVerb$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_tagRemBINDINFO.szCustomVerb$VH.get(seg);
    }
    public static void szCustomVerb$set( MemorySegment seg, MemoryAddress x) {
        _tagRemBINDINFO.szCustomVerb$VH.set(seg, x);
    }
    public static MemoryAddress szCustomVerb$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_tagRemBINDINFO.szCustomVerb$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void szCustomVerb$set(MemorySegment seg, long index, MemoryAddress x) {
        _tagRemBINDINFO.szCustomVerb$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbstgmedData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbstgmedData"));
    public static VarHandle cbstgmedData$VH() {
        return _tagRemBINDINFO.cbstgmedData$VH;
    }
    public static int cbstgmedData$get(MemorySegment seg) {
        return (int)_tagRemBINDINFO.cbstgmedData$VH.get(seg);
    }
    public static void cbstgmedData$set( MemorySegment seg, int x) {
        _tagRemBINDINFO.cbstgmedData$VH.set(seg, x);
    }
    public static int cbstgmedData$get(MemorySegment seg, long index) {
        return (int)_tagRemBINDINFO.cbstgmedData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbstgmedData$set(MemorySegment seg, long index, int x) {
        _tagRemBINDINFO.cbstgmedData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwOptions$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwOptions"));
    public static VarHandle dwOptions$VH() {
        return _tagRemBINDINFO.dwOptions$VH;
    }
    public static int dwOptions$get(MemorySegment seg) {
        return (int)_tagRemBINDINFO.dwOptions$VH.get(seg);
    }
    public static void dwOptions$set( MemorySegment seg, int x) {
        _tagRemBINDINFO.dwOptions$VH.set(seg, x);
    }
    public static int dwOptions$get(MemorySegment seg, long index) {
        return (int)_tagRemBINDINFO.dwOptions$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwOptions$set(MemorySegment seg, long index, int x) {
        _tagRemBINDINFO.dwOptions$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwOptionsFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwOptionsFlags"));
    public static VarHandle dwOptionsFlags$VH() {
        return _tagRemBINDINFO.dwOptionsFlags$VH;
    }
    public static int dwOptionsFlags$get(MemorySegment seg) {
        return (int)_tagRemBINDINFO.dwOptionsFlags$VH.get(seg);
    }
    public static void dwOptionsFlags$set( MemorySegment seg, int x) {
        _tagRemBINDINFO.dwOptionsFlags$VH.set(seg, x);
    }
    public static int dwOptionsFlags$get(MemorySegment seg, long index) {
        return (int)_tagRemBINDINFO.dwOptionsFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwOptionsFlags$set(MemorySegment seg, long index, int x) {
        _tagRemBINDINFO.dwOptionsFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwCodePage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwCodePage"));
    public static VarHandle dwCodePage$VH() {
        return _tagRemBINDINFO.dwCodePage$VH;
    }
    public static int dwCodePage$get(MemorySegment seg) {
        return (int)_tagRemBINDINFO.dwCodePage$VH.get(seg);
    }
    public static void dwCodePage$set( MemorySegment seg, int x) {
        _tagRemBINDINFO.dwCodePage$VH.set(seg, x);
    }
    public static int dwCodePage$get(MemorySegment seg, long index) {
        return (int)_tagRemBINDINFO.dwCodePage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCodePage$set(MemorySegment seg, long index, int x) {
        _tagRemBINDINFO.dwCodePage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment securityAttributes$slice(MemorySegment seg) {
        return seg.asSlice(48, 12);
    }
    public static MemorySegment iid$slice(MemorySegment seg) {
        return seg.asSlice(60, 16);
    }
    static final VarHandle pUnk$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pUnk"));
    public static VarHandle pUnk$VH() {
        return _tagRemBINDINFO.pUnk$VH;
    }
    public static MemoryAddress pUnk$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_tagRemBINDINFO.pUnk$VH.get(seg);
    }
    public static void pUnk$set( MemorySegment seg, MemoryAddress x) {
        _tagRemBINDINFO.pUnk$VH.set(seg, x);
    }
    public static MemoryAddress pUnk$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_tagRemBINDINFO.pUnk$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pUnk$set(MemorySegment seg, long index, MemoryAddress x) {
        _tagRemBINDINFO.pUnk$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwReserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwReserved"));
    public static VarHandle dwReserved$VH() {
        return _tagRemBINDINFO.dwReserved$VH;
    }
    public static int dwReserved$get(MemorySegment seg) {
        return (int)_tagRemBINDINFO.dwReserved$VH.get(seg);
    }
    public static void dwReserved$set( MemorySegment seg, int x) {
        _tagRemBINDINFO.dwReserved$VH.set(seg, x);
    }
    public static int dwReserved$get(MemorySegment seg, long index) {
        return (int)_tagRemBINDINFO.dwReserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwReserved$set(MemorySegment seg, long index, int x) {
        _tagRemBINDINFO.dwReserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


