// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagRemSNB {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("ulCntStr"),
        Constants$root.C_LONG$LAYOUT.withName("ulCntChar"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_SHORT$LAYOUT).withName("rgString"),
        MemoryLayout.paddingLayout(16)
    ).withName("tagRemSNB");
    public static MemoryLayout $LAYOUT() {
        return tagRemSNB.$struct$LAYOUT;
    }
    static final VarHandle ulCntStr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulCntStr"));
    public static VarHandle ulCntStr$VH() {
        return tagRemSNB.ulCntStr$VH;
    }
    public static int ulCntStr$get(MemorySegment seg) {
        return (int)tagRemSNB.ulCntStr$VH.get(seg);
    }
    public static void ulCntStr$set( MemorySegment seg, int x) {
        tagRemSNB.ulCntStr$VH.set(seg, x);
    }
    public static int ulCntStr$get(MemorySegment seg, long index) {
        return (int)tagRemSNB.ulCntStr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulCntStr$set(MemorySegment seg, long index, int x) {
        tagRemSNB.ulCntStr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ulCntChar$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulCntChar"));
    public static VarHandle ulCntChar$VH() {
        return tagRemSNB.ulCntChar$VH;
    }
    public static int ulCntChar$get(MemorySegment seg) {
        return (int)tagRemSNB.ulCntChar$VH.get(seg);
    }
    public static void ulCntChar$set( MemorySegment seg, int x) {
        tagRemSNB.ulCntChar$VH.set(seg, x);
    }
    public static int ulCntChar$get(MemorySegment seg, long index) {
        return (int)tagRemSNB.ulCntChar$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulCntChar$set(MemorySegment seg, long index, int x) {
        tagRemSNB.ulCntChar$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment rgString$slice(MemorySegment seg) {
        return seg.asSlice(8, 2);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


