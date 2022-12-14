// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagEMRPOLYTEXTOUTA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("iType"),
            Constants$root.C_LONG$LAYOUT.withName("nSize")
        ).withName("emr"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("left"),
            Constants$root.C_LONG$LAYOUT.withName("top"),
            Constants$root.C_LONG$LAYOUT.withName("right"),
            Constants$root.C_LONG$LAYOUT.withName("bottom")
        ).withName("rclBounds"),
        Constants$root.C_LONG$LAYOUT.withName("iGraphicsMode"),
        Constants$root.C_FLOAT$LAYOUT.withName("exScale"),
        Constants$root.C_FLOAT$LAYOUT.withName("eyScale"),
        Constants$root.C_LONG$LAYOUT.withName("cStrings"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("x"),
                Constants$root.C_LONG$LAYOUT.withName("y")
            ).withName("ptlReference"),
            Constants$root.C_LONG$LAYOUT.withName("nChars"),
            Constants$root.C_LONG$LAYOUT.withName("offString"),
            Constants$root.C_LONG$LAYOUT.withName("fOptions"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("left"),
                Constants$root.C_LONG$LAYOUT.withName("top"),
                Constants$root.C_LONG$LAYOUT.withName("right"),
                Constants$root.C_LONG$LAYOUT.withName("bottom")
            ).withName("rcl"),
            Constants$root.C_LONG$LAYOUT.withName("offDx")
        ).withName("tagEMRTEXT")).withName("aemrtext")
    ).withName("tagEMRPOLYTEXTOUTA");
    public static MemoryLayout $LAYOUT() {
        return tagEMRPOLYTEXTOUTA.$struct$LAYOUT;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment rclBounds$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    static final VarHandle iGraphicsMode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iGraphicsMode"));
    public static VarHandle iGraphicsMode$VH() {
        return tagEMRPOLYTEXTOUTA.iGraphicsMode$VH;
    }
    public static int iGraphicsMode$get(MemorySegment seg) {
        return (int)tagEMRPOLYTEXTOUTA.iGraphicsMode$VH.get(seg);
    }
    public static void iGraphicsMode$set( MemorySegment seg, int x) {
        tagEMRPOLYTEXTOUTA.iGraphicsMode$VH.set(seg, x);
    }
    public static int iGraphicsMode$get(MemorySegment seg, long index) {
        return (int)tagEMRPOLYTEXTOUTA.iGraphicsMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iGraphicsMode$set(MemorySegment seg, long index, int x) {
        tagEMRPOLYTEXTOUTA.iGraphicsMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle exScale$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("exScale"));
    public static VarHandle exScale$VH() {
        return tagEMRPOLYTEXTOUTA.exScale$VH;
    }
    public static float exScale$get(MemorySegment seg) {
        return (float)tagEMRPOLYTEXTOUTA.exScale$VH.get(seg);
    }
    public static void exScale$set( MemorySegment seg, float x) {
        tagEMRPOLYTEXTOUTA.exScale$VH.set(seg, x);
    }
    public static float exScale$get(MemorySegment seg, long index) {
        return (float)tagEMRPOLYTEXTOUTA.exScale$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void exScale$set(MemorySegment seg, long index, float x) {
        tagEMRPOLYTEXTOUTA.exScale$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle eyScale$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("eyScale"));
    public static VarHandle eyScale$VH() {
        return tagEMRPOLYTEXTOUTA.eyScale$VH;
    }
    public static float eyScale$get(MemorySegment seg) {
        return (float)tagEMRPOLYTEXTOUTA.eyScale$VH.get(seg);
    }
    public static void eyScale$set( MemorySegment seg, float x) {
        tagEMRPOLYTEXTOUTA.eyScale$VH.set(seg, x);
    }
    public static float eyScale$get(MemorySegment seg, long index) {
        return (float)tagEMRPOLYTEXTOUTA.eyScale$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void eyScale$set(MemorySegment seg, long index, float x) {
        tagEMRPOLYTEXTOUTA.eyScale$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cStrings$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cStrings"));
    public static VarHandle cStrings$VH() {
        return tagEMRPOLYTEXTOUTA.cStrings$VH;
    }
    public static int cStrings$get(MemorySegment seg) {
        return (int)tagEMRPOLYTEXTOUTA.cStrings$VH.get(seg);
    }
    public static void cStrings$set( MemorySegment seg, int x) {
        tagEMRPOLYTEXTOUTA.cStrings$VH.set(seg, x);
    }
    public static int cStrings$get(MemorySegment seg, long index) {
        return (int)tagEMRPOLYTEXTOUTA.cStrings$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cStrings$set(MemorySegment seg, long index, int x) {
        tagEMRPOLYTEXTOUTA.cStrings$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment aemrtext$slice(MemorySegment seg) {
        return seg.asSlice(40, 40);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


