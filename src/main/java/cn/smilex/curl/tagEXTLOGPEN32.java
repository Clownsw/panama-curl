// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagEXTLOGPEN32 {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("elpPenStyle"),
        Constants$root.C_LONG$LAYOUT.withName("elpWidth"),
        Constants$root.C_LONG$LAYOUT.withName("elpBrushStyle"),
        Constants$root.C_LONG$LAYOUT.withName("elpColor"),
        Constants$root.C_LONG$LAYOUT.withName("elpHatch"),
        Constants$root.C_LONG$LAYOUT.withName("elpNumEntries"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_LONG$LAYOUT).withName("elpStyleEntry")
    ).withName("tagEXTLOGPEN32");
    public static MemoryLayout $LAYOUT() {
        return tagEXTLOGPEN32.$struct$LAYOUT;
    }
    static final VarHandle elpPenStyle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("elpPenStyle"));
    public static VarHandle elpPenStyle$VH() {
        return tagEXTLOGPEN32.elpPenStyle$VH;
    }
    public static int elpPenStyle$get(MemorySegment seg) {
        return (int)tagEXTLOGPEN32.elpPenStyle$VH.get(seg);
    }
    public static void elpPenStyle$set( MemorySegment seg, int x) {
        tagEXTLOGPEN32.elpPenStyle$VH.set(seg, x);
    }
    public static int elpPenStyle$get(MemorySegment seg, long index) {
        return (int)tagEXTLOGPEN32.elpPenStyle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void elpPenStyle$set(MemorySegment seg, long index, int x) {
        tagEXTLOGPEN32.elpPenStyle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle elpWidth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("elpWidth"));
    public static VarHandle elpWidth$VH() {
        return tagEXTLOGPEN32.elpWidth$VH;
    }
    public static int elpWidth$get(MemorySegment seg) {
        return (int)tagEXTLOGPEN32.elpWidth$VH.get(seg);
    }
    public static void elpWidth$set( MemorySegment seg, int x) {
        tagEXTLOGPEN32.elpWidth$VH.set(seg, x);
    }
    public static int elpWidth$get(MemorySegment seg, long index) {
        return (int)tagEXTLOGPEN32.elpWidth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void elpWidth$set(MemorySegment seg, long index, int x) {
        tagEXTLOGPEN32.elpWidth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle elpBrushStyle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("elpBrushStyle"));
    public static VarHandle elpBrushStyle$VH() {
        return tagEXTLOGPEN32.elpBrushStyle$VH;
    }
    public static int elpBrushStyle$get(MemorySegment seg) {
        return (int)tagEXTLOGPEN32.elpBrushStyle$VH.get(seg);
    }
    public static void elpBrushStyle$set( MemorySegment seg, int x) {
        tagEXTLOGPEN32.elpBrushStyle$VH.set(seg, x);
    }
    public static int elpBrushStyle$get(MemorySegment seg, long index) {
        return (int)tagEXTLOGPEN32.elpBrushStyle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void elpBrushStyle$set(MemorySegment seg, long index, int x) {
        tagEXTLOGPEN32.elpBrushStyle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle elpColor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("elpColor"));
    public static VarHandle elpColor$VH() {
        return tagEXTLOGPEN32.elpColor$VH;
    }
    public static int elpColor$get(MemorySegment seg) {
        return (int)tagEXTLOGPEN32.elpColor$VH.get(seg);
    }
    public static void elpColor$set( MemorySegment seg, int x) {
        tagEXTLOGPEN32.elpColor$VH.set(seg, x);
    }
    public static int elpColor$get(MemorySegment seg, long index) {
        return (int)tagEXTLOGPEN32.elpColor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void elpColor$set(MemorySegment seg, long index, int x) {
        tagEXTLOGPEN32.elpColor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle elpHatch$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("elpHatch"));
    public static VarHandle elpHatch$VH() {
        return tagEXTLOGPEN32.elpHatch$VH;
    }
    public static int elpHatch$get(MemorySegment seg) {
        return (int)tagEXTLOGPEN32.elpHatch$VH.get(seg);
    }
    public static void elpHatch$set( MemorySegment seg, int x) {
        tagEXTLOGPEN32.elpHatch$VH.set(seg, x);
    }
    public static int elpHatch$get(MemorySegment seg, long index) {
        return (int)tagEXTLOGPEN32.elpHatch$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void elpHatch$set(MemorySegment seg, long index, int x) {
        tagEXTLOGPEN32.elpHatch$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle elpNumEntries$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("elpNumEntries"));
    public static VarHandle elpNumEntries$VH() {
        return tagEXTLOGPEN32.elpNumEntries$VH;
    }
    public static int elpNumEntries$get(MemorySegment seg) {
        return (int)tagEXTLOGPEN32.elpNumEntries$VH.get(seg);
    }
    public static void elpNumEntries$set( MemorySegment seg, int x) {
        tagEXTLOGPEN32.elpNumEntries$VH.set(seg, x);
    }
    public static int elpNumEntries$get(MemorySegment seg, long index) {
        return (int)tagEXTLOGPEN32.elpNumEntries$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void elpNumEntries$set(MemorySegment seg, long index, int x) {
        tagEXTLOGPEN32.elpNumEntries$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment elpStyleEntry$slice(MemorySegment seg) {
        return seg.asSlice(24, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


