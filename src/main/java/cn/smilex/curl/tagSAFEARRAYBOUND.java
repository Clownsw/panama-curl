// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagSAFEARRAYBOUND {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cElements"),
        Constants$root.C_LONG$LAYOUT.withName("lLbound")
    ).withName("tagSAFEARRAYBOUND");
    public static MemoryLayout $LAYOUT() {
        return tagSAFEARRAYBOUND.$struct$LAYOUT;
    }
    static final VarHandle cElements$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cElements"));
    public static VarHandle cElements$VH() {
        return tagSAFEARRAYBOUND.cElements$VH;
    }
    public static int cElements$get(MemorySegment seg) {
        return (int)tagSAFEARRAYBOUND.cElements$VH.get(seg);
    }
    public static void cElements$set( MemorySegment seg, int x) {
        tagSAFEARRAYBOUND.cElements$VH.set(seg, x);
    }
    public static int cElements$get(MemorySegment seg, long index) {
        return (int)tagSAFEARRAYBOUND.cElements$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cElements$set(MemorySegment seg, long index, int x) {
        tagSAFEARRAYBOUND.cElements$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lLbound$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lLbound"));
    public static VarHandle lLbound$VH() {
        return tagSAFEARRAYBOUND.lLbound$VH;
    }
    public static int lLbound$get(MemorySegment seg) {
        return (int)tagSAFEARRAYBOUND.lLbound$VH.get(seg);
    }
    public static void lLbound$set( MemorySegment seg, int x) {
        tagSAFEARRAYBOUND.lLbound$VH.set(seg, x);
    }
    public static int lLbound$get(MemorySegment seg, long index) {
        return (int)tagSAFEARRAYBOUND.lLbound$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lLbound$set(MemorySegment seg, long index, int x) {
        tagSAFEARRAYBOUND.lLbound$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


