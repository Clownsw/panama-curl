// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagFORMATETC {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("cfFormat"),
        MemoryLayout.paddingLayout(48),
        Constants$root.C_POINTER$LAYOUT.withName("ptd"),
        Constants$root.C_LONG$LAYOUT.withName("dwAspect"),
        Constants$root.C_LONG$LAYOUT.withName("lindex"),
        Constants$root.C_LONG$LAYOUT.withName("tymed"),
        MemoryLayout.paddingLayout(32)
    ).withName("tagFORMATETC");
    public static MemoryLayout $LAYOUT() {
        return tagFORMATETC.$struct$LAYOUT;
    }
    static final VarHandle cfFormat$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cfFormat"));
    public static VarHandle cfFormat$VH() {
        return tagFORMATETC.cfFormat$VH;
    }
    public static short cfFormat$get(MemorySegment seg) {
        return (short)tagFORMATETC.cfFormat$VH.get(seg);
    }
    public static void cfFormat$set( MemorySegment seg, short x) {
        tagFORMATETC.cfFormat$VH.set(seg, x);
    }
    public static short cfFormat$get(MemorySegment seg, long index) {
        return (short)tagFORMATETC.cfFormat$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cfFormat$set(MemorySegment seg, long index, short x) {
        tagFORMATETC.cfFormat$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ptd$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ptd"));
    public static VarHandle ptd$VH() {
        return tagFORMATETC.ptd$VH;
    }
    public static MemoryAddress ptd$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagFORMATETC.ptd$VH.get(seg);
    }
    public static void ptd$set( MemorySegment seg, MemoryAddress x) {
        tagFORMATETC.ptd$VH.set(seg, x);
    }
    public static MemoryAddress ptd$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagFORMATETC.ptd$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ptd$set(MemorySegment seg, long index, MemoryAddress x) {
        tagFORMATETC.ptd$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwAspect$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwAspect"));
    public static VarHandle dwAspect$VH() {
        return tagFORMATETC.dwAspect$VH;
    }
    public static int dwAspect$get(MemorySegment seg) {
        return (int)tagFORMATETC.dwAspect$VH.get(seg);
    }
    public static void dwAspect$set( MemorySegment seg, int x) {
        tagFORMATETC.dwAspect$VH.set(seg, x);
    }
    public static int dwAspect$get(MemorySegment seg, long index) {
        return (int)tagFORMATETC.dwAspect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwAspect$set(MemorySegment seg, long index, int x) {
        tagFORMATETC.dwAspect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lindex$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lindex"));
    public static VarHandle lindex$VH() {
        return tagFORMATETC.lindex$VH;
    }
    public static int lindex$get(MemorySegment seg) {
        return (int)tagFORMATETC.lindex$VH.get(seg);
    }
    public static void lindex$set( MemorySegment seg, int x) {
        tagFORMATETC.lindex$VH.set(seg, x);
    }
    public static int lindex$get(MemorySegment seg, long index) {
        return (int)tagFORMATETC.lindex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lindex$set(MemorySegment seg, long index, int x) {
        tagFORMATETC.lindex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tymed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tymed"));
    public static VarHandle tymed$VH() {
        return tagFORMATETC.tymed$VH;
    }
    public static int tymed$get(MemorySegment seg) {
        return (int)tagFORMATETC.tymed$VH.get(seg);
    }
    public static void tymed$set( MemorySegment seg, int x) {
        tagFORMATETC.tymed$VH.set(seg, x);
    }
    public static int tymed$get(MemorySegment seg, long index) {
        return (int)tagFORMATETC.tymed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tymed$set(MemorySegment seg, long index, int x) {
        tagFORMATETC.tymed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


