// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagOBJECTDESCRIPTOR {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("clsid"),
        Constants$root.C_LONG$LAYOUT.withName("dwDrawAspect"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cx"),
            Constants$root.C_LONG$LAYOUT.withName("cy")
        ).withName("sizel"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("pointl"),
        Constants$root.C_LONG$LAYOUT.withName("dwStatus"),
        Constants$root.C_LONG$LAYOUT.withName("dwFullUserTypeName"),
        Constants$root.C_LONG$LAYOUT.withName("dwSrcOfCopy")
    ).withName("tagOBJECTDESCRIPTOR");
    public static MemoryLayout $LAYOUT() {
        return tagOBJECTDESCRIPTOR.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagOBJECTDESCRIPTOR.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagOBJECTDESCRIPTOR.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        tagOBJECTDESCRIPTOR.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagOBJECTDESCRIPTOR.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagOBJECTDESCRIPTOR.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment clsid$slice(MemorySegment seg) {
        return seg.asSlice(4, 16);
    }
    static final VarHandle dwDrawAspect$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwDrawAspect"));
    public static VarHandle dwDrawAspect$VH() {
        return tagOBJECTDESCRIPTOR.dwDrawAspect$VH;
    }
    public static int dwDrawAspect$get(MemorySegment seg) {
        return (int)tagOBJECTDESCRIPTOR.dwDrawAspect$VH.get(seg);
    }
    public static void dwDrawAspect$set( MemorySegment seg, int x) {
        tagOBJECTDESCRIPTOR.dwDrawAspect$VH.set(seg, x);
    }
    public static int dwDrawAspect$get(MemorySegment seg, long index) {
        return (int)tagOBJECTDESCRIPTOR.dwDrawAspect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwDrawAspect$set(MemorySegment seg, long index, int x) {
        tagOBJECTDESCRIPTOR.dwDrawAspect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment sizel$slice(MemorySegment seg) {
        return seg.asSlice(24, 8);
    }
    public static MemorySegment pointl$slice(MemorySegment seg) {
        return seg.asSlice(32, 8);
    }
    static final VarHandle dwStatus$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwStatus"));
    public static VarHandle dwStatus$VH() {
        return tagOBJECTDESCRIPTOR.dwStatus$VH;
    }
    public static int dwStatus$get(MemorySegment seg) {
        return (int)tagOBJECTDESCRIPTOR.dwStatus$VH.get(seg);
    }
    public static void dwStatus$set( MemorySegment seg, int x) {
        tagOBJECTDESCRIPTOR.dwStatus$VH.set(seg, x);
    }
    public static int dwStatus$get(MemorySegment seg, long index) {
        return (int)tagOBJECTDESCRIPTOR.dwStatus$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwStatus$set(MemorySegment seg, long index, int x) {
        tagOBJECTDESCRIPTOR.dwStatus$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFullUserTypeName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFullUserTypeName"));
    public static VarHandle dwFullUserTypeName$VH() {
        return tagOBJECTDESCRIPTOR.dwFullUserTypeName$VH;
    }
    public static int dwFullUserTypeName$get(MemorySegment seg) {
        return (int)tagOBJECTDESCRIPTOR.dwFullUserTypeName$VH.get(seg);
    }
    public static void dwFullUserTypeName$set( MemorySegment seg, int x) {
        tagOBJECTDESCRIPTOR.dwFullUserTypeName$VH.set(seg, x);
    }
    public static int dwFullUserTypeName$get(MemorySegment seg, long index) {
        return (int)tagOBJECTDESCRIPTOR.dwFullUserTypeName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFullUserTypeName$set(MemorySegment seg, long index, int x) {
        tagOBJECTDESCRIPTOR.dwFullUserTypeName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwSrcOfCopy$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSrcOfCopy"));
    public static VarHandle dwSrcOfCopy$VH() {
        return tagOBJECTDESCRIPTOR.dwSrcOfCopy$VH;
    }
    public static int dwSrcOfCopy$get(MemorySegment seg) {
        return (int)tagOBJECTDESCRIPTOR.dwSrcOfCopy$VH.get(seg);
    }
    public static void dwSrcOfCopy$set( MemorySegment seg, int x) {
        tagOBJECTDESCRIPTOR.dwSrcOfCopy$VH.set(seg, x);
    }
    public static int dwSrcOfCopy$get(MemorySegment seg, long index) {
        return (int)tagOBJECTDESCRIPTOR.dwSrcOfCopy$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSrcOfCopy$set(MemorySegment seg, long index, int x) {
        tagOBJECTDESCRIPTOR.dwSrcOfCopy$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


