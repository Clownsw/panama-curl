// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagRECONVERTSTRING {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwVersion"),
        Constants$root.C_LONG$LAYOUT.withName("dwStrLen"),
        Constants$root.C_LONG$LAYOUT.withName("dwStrOffset"),
        Constants$root.C_LONG$LAYOUT.withName("dwCompStrLen"),
        Constants$root.C_LONG$LAYOUT.withName("dwCompStrOffset"),
        Constants$root.C_LONG$LAYOUT.withName("dwTargetStrLen"),
        Constants$root.C_LONG$LAYOUT.withName("dwTargetStrOffset")
    ).withName("tagRECONVERTSTRING");
    public static MemoryLayout $LAYOUT() {
        return tagRECONVERTSTRING.$struct$LAYOUT;
    }
    static final VarHandle dwSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSize"));
    public static VarHandle dwSize$VH() {
        return tagRECONVERTSTRING.dwSize$VH;
    }
    public static int dwSize$get(MemorySegment seg) {
        return (int)tagRECONVERTSTRING.dwSize$VH.get(seg);
    }
    public static void dwSize$set( MemorySegment seg, int x) {
        tagRECONVERTSTRING.dwSize$VH.set(seg, x);
    }
    public static int dwSize$get(MemorySegment seg, long index) {
        return (int)tagRECONVERTSTRING.dwSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSize$set(MemorySegment seg, long index, int x) {
        tagRECONVERTSTRING.dwSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwVersion"));
    public static VarHandle dwVersion$VH() {
        return tagRECONVERTSTRING.dwVersion$VH;
    }
    public static int dwVersion$get(MemorySegment seg) {
        return (int)tagRECONVERTSTRING.dwVersion$VH.get(seg);
    }
    public static void dwVersion$set( MemorySegment seg, int x) {
        tagRECONVERTSTRING.dwVersion$VH.set(seg, x);
    }
    public static int dwVersion$get(MemorySegment seg, long index) {
        return (int)tagRECONVERTSTRING.dwVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwVersion$set(MemorySegment seg, long index, int x) {
        tagRECONVERTSTRING.dwVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwStrLen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwStrLen"));
    public static VarHandle dwStrLen$VH() {
        return tagRECONVERTSTRING.dwStrLen$VH;
    }
    public static int dwStrLen$get(MemorySegment seg) {
        return (int)tagRECONVERTSTRING.dwStrLen$VH.get(seg);
    }
    public static void dwStrLen$set( MemorySegment seg, int x) {
        tagRECONVERTSTRING.dwStrLen$VH.set(seg, x);
    }
    public static int dwStrLen$get(MemorySegment seg, long index) {
        return (int)tagRECONVERTSTRING.dwStrLen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwStrLen$set(MemorySegment seg, long index, int x) {
        tagRECONVERTSTRING.dwStrLen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwStrOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwStrOffset"));
    public static VarHandle dwStrOffset$VH() {
        return tagRECONVERTSTRING.dwStrOffset$VH;
    }
    public static int dwStrOffset$get(MemorySegment seg) {
        return (int)tagRECONVERTSTRING.dwStrOffset$VH.get(seg);
    }
    public static void dwStrOffset$set( MemorySegment seg, int x) {
        tagRECONVERTSTRING.dwStrOffset$VH.set(seg, x);
    }
    public static int dwStrOffset$get(MemorySegment seg, long index) {
        return (int)tagRECONVERTSTRING.dwStrOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwStrOffset$set(MemorySegment seg, long index, int x) {
        tagRECONVERTSTRING.dwStrOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwCompStrLen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwCompStrLen"));
    public static VarHandle dwCompStrLen$VH() {
        return tagRECONVERTSTRING.dwCompStrLen$VH;
    }
    public static int dwCompStrLen$get(MemorySegment seg) {
        return (int)tagRECONVERTSTRING.dwCompStrLen$VH.get(seg);
    }
    public static void dwCompStrLen$set( MemorySegment seg, int x) {
        tagRECONVERTSTRING.dwCompStrLen$VH.set(seg, x);
    }
    public static int dwCompStrLen$get(MemorySegment seg, long index) {
        return (int)tagRECONVERTSTRING.dwCompStrLen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCompStrLen$set(MemorySegment seg, long index, int x) {
        tagRECONVERTSTRING.dwCompStrLen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwCompStrOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwCompStrOffset"));
    public static VarHandle dwCompStrOffset$VH() {
        return tagRECONVERTSTRING.dwCompStrOffset$VH;
    }
    public static int dwCompStrOffset$get(MemorySegment seg) {
        return (int)tagRECONVERTSTRING.dwCompStrOffset$VH.get(seg);
    }
    public static void dwCompStrOffset$set( MemorySegment seg, int x) {
        tagRECONVERTSTRING.dwCompStrOffset$VH.set(seg, x);
    }
    public static int dwCompStrOffset$get(MemorySegment seg, long index) {
        return (int)tagRECONVERTSTRING.dwCompStrOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCompStrOffset$set(MemorySegment seg, long index, int x) {
        tagRECONVERTSTRING.dwCompStrOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwTargetStrLen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwTargetStrLen"));
    public static VarHandle dwTargetStrLen$VH() {
        return tagRECONVERTSTRING.dwTargetStrLen$VH;
    }
    public static int dwTargetStrLen$get(MemorySegment seg) {
        return (int)tagRECONVERTSTRING.dwTargetStrLen$VH.get(seg);
    }
    public static void dwTargetStrLen$set( MemorySegment seg, int x) {
        tagRECONVERTSTRING.dwTargetStrLen$VH.set(seg, x);
    }
    public static int dwTargetStrLen$get(MemorySegment seg, long index) {
        return (int)tagRECONVERTSTRING.dwTargetStrLen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwTargetStrLen$set(MemorySegment seg, long index, int x) {
        tagRECONVERTSTRING.dwTargetStrLen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwTargetStrOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwTargetStrOffset"));
    public static VarHandle dwTargetStrOffset$VH() {
        return tagRECONVERTSTRING.dwTargetStrOffset$VH;
    }
    public static int dwTargetStrOffset$get(MemorySegment seg) {
        return (int)tagRECONVERTSTRING.dwTargetStrOffset$VH.get(seg);
    }
    public static void dwTargetStrOffset$set( MemorySegment seg, int x) {
        tagRECONVERTSTRING.dwTargetStrOffset$VH.set(seg, x);
    }
    public static int dwTargetStrOffset$get(MemorySegment seg, long index) {
        return (int)tagRECONVERTSTRING.dwTargetStrOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwTargetStrOffset$set(MemorySegment seg, long index, int x) {
        tagRECONVERTSTRING.dwTargetStrOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


