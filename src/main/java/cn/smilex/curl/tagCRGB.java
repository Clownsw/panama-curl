// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagCRGB {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("bRed"),
        Constants$root.C_CHAR$LAYOUT.withName("bGreen"),
        Constants$root.C_CHAR$LAYOUT.withName("bBlue"),
        Constants$root.C_CHAR$LAYOUT.withName("bExtra")
    ).withName("tagCRGB");
    public static MemoryLayout $LAYOUT() {
        return tagCRGB.$struct$LAYOUT;
    }
    static final VarHandle bRed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bRed"));
    public static VarHandle bRed$VH() {
        return tagCRGB.bRed$VH;
    }
    public static byte bRed$get(MemorySegment seg) {
        return (byte)tagCRGB.bRed$VH.get(seg);
    }
    public static void bRed$set( MemorySegment seg, byte x) {
        tagCRGB.bRed$VH.set(seg, x);
    }
    public static byte bRed$get(MemorySegment seg, long index) {
        return (byte)tagCRGB.bRed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bRed$set(MemorySegment seg, long index, byte x) {
        tagCRGB.bRed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bGreen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bGreen"));
    public static VarHandle bGreen$VH() {
        return tagCRGB.bGreen$VH;
    }
    public static byte bGreen$get(MemorySegment seg) {
        return (byte)tagCRGB.bGreen$VH.get(seg);
    }
    public static void bGreen$set( MemorySegment seg, byte x) {
        tagCRGB.bGreen$VH.set(seg, x);
    }
    public static byte bGreen$get(MemorySegment seg, long index) {
        return (byte)tagCRGB.bGreen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bGreen$set(MemorySegment seg, long index, byte x) {
        tagCRGB.bGreen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bBlue$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bBlue"));
    public static VarHandle bBlue$VH() {
        return tagCRGB.bBlue$VH;
    }
    public static byte bBlue$get(MemorySegment seg) {
        return (byte)tagCRGB.bBlue$VH.get(seg);
    }
    public static void bBlue$set( MemorySegment seg, byte x) {
        tagCRGB.bBlue$VH.set(seg, x);
    }
    public static byte bBlue$get(MemorySegment seg, long index) {
        return (byte)tagCRGB.bBlue$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bBlue$set(MemorySegment seg, long index, byte x) {
        tagCRGB.bBlue$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bExtra$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bExtra"));
    public static VarHandle bExtra$VH() {
        return tagCRGB.bExtra$VH;
    }
    public static byte bExtra$get(MemorySegment seg) {
        return (byte)tagCRGB.bExtra$VH.get(seg);
    }
    public static void bExtra$set( MemorySegment seg, byte x) {
        tagCRGB.bExtra$VH.set(seg, x);
    }
    public static byte bExtra$get(MemorySegment seg, long index) {
        return (byte)tagCRGB.bExtra$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bExtra$set(MemorySegment seg, long index, byte x) {
        tagCRGB.bExtra$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


