// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class curl_header {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("name"),
        Constants$root.C_POINTER$LAYOUT.withName("value"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("amount"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("index"),
        Constants$root.C_LONG$LAYOUT.withName("origin"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("anchor")
    ).withName("curl_header");
    public static MemoryLayout $LAYOUT() {
        return curl_header.$struct$LAYOUT;
    }
    static final VarHandle name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("name"));
    public static VarHandle name$VH() {
        return curl_header.name$VH;
    }
    public static MemoryAddress name$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)curl_header.name$VH.get(seg);
    }
    public static void name$set( MemorySegment seg, MemoryAddress x) {
        curl_header.name$VH.set(seg, x);
    }
    public static MemoryAddress name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)curl_header.name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void name$set(MemorySegment seg, long index, MemoryAddress x) {
        curl_header.name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle value$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("value"));
    public static VarHandle value$VH() {
        return curl_header.value$VH;
    }
    public static MemoryAddress value$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)curl_header.value$VH.get(seg);
    }
    public static void value$set( MemorySegment seg, MemoryAddress x) {
        curl_header.value$VH.set(seg, x);
    }
    public static MemoryAddress value$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)curl_header.value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value$set(MemorySegment seg, long index, MemoryAddress x) {
        curl_header.value$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle amount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("amount"));
    public static VarHandle amount$VH() {
        return curl_header.amount$VH;
    }
    public static long amount$get(MemorySegment seg) {
        return (long)curl_header.amount$VH.get(seg);
    }
    public static void amount$set( MemorySegment seg, long x) {
        curl_header.amount$VH.set(seg, x);
    }
    public static long amount$get(MemorySegment seg, long index) {
        return (long)curl_header.amount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void amount$set(MemorySegment seg, long index, long x) {
        curl_header.amount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle index$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("index"));
    public static VarHandle index$VH() {
        return curl_header.index$VH;
    }
    public static long index$get(MemorySegment seg) {
        return (long)curl_header.index$VH.get(seg);
    }
    public static void index$set( MemorySegment seg, long x) {
        curl_header.index$VH.set(seg, x);
    }
    public static long index$get(MemorySegment seg, long index) {
        return (long)curl_header.index$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void index$set(MemorySegment seg, long index, long x) {
        curl_header.index$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle origin$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("origin"));
    public static VarHandle origin$VH() {
        return curl_header.origin$VH;
    }
    public static int origin$get(MemorySegment seg) {
        return (int)curl_header.origin$VH.get(seg);
    }
    public static void origin$set( MemorySegment seg, int x) {
        curl_header.origin$VH.set(seg, x);
    }
    public static int origin$get(MemorySegment seg, long index) {
        return (int)curl_header.origin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void origin$set(MemorySegment seg, long index, int x) {
        curl_header.origin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle anchor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("anchor"));
    public static VarHandle anchor$VH() {
        return curl_header.anchor$VH;
    }
    public static MemoryAddress anchor$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)curl_header.anchor$VH.get(seg);
    }
    public static void anchor$set( MemorySegment seg, MemoryAddress x) {
        curl_header.anchor$VH.set(seg, x);
    }
    public static MemoryAddress anchor$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)curl_header.anchor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void anchor$set(MemorySegment seg, long index, MemoryAddress x) {
        curl_header.anchor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


