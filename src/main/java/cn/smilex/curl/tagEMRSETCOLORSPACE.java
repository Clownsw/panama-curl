// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagEMRSETCOLORSPACE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("iType"),
            Constants$root.C_LONG$LAYOUT.withName("nSize")
        ).withName("emr"),
        Constants$root.C_LONG$LAYOUT.withName("ihCS")
    ).withName("tagEMRSETCOLORSPACE");
    public static MemoryLayout $LAYOUT() {
        return tagEMRSETCOLORSPACE.$struct$LAYOUT;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle ihCS$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ihCS"));
    public static VarHandle ihCS$VH() {
        return tagEMRSETCOLORSPACE.ihCS$VH;
    }
    public static int ihCS$get(MemorySegment seg) {
        return (int)tagEMRSETCOLORSPACE.ihCS$VH.get(seg);
    }
    public static void ihCS$set( MemorySegment seg, int x) {
        tagEMRSETCOLORSPACE.ihCS$VH.set(seg, x);
    }
    public static int ihCS$get(MemorySegment seg, long index) {
        return (int)tagEMRSETCOLORSPACE.ihCS$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ihCS$set(MemorySegment seg, long index, int x) {
        tagEMRSETCOLORSPACE.ihCS$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


