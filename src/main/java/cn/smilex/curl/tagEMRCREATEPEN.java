// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagEMRCREATEPEN {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("iType"),
            Constants$root.C_LONG$LAYOUT.withName("nSize")
        ).withName("emr"),
        Constants$root.C_LONG$LAYOUT.withName("ihPen"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("lopnStyle"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("x"),
                Constants$root.C_LONG$LAYOUT.withName("y")
            ).withName("lopnWidth"),
            Constants$root.C_LONG$LAYOUT.withName("lopnColor")
        ).withName("lopn")
    ).withName("tagEMRCREATEPEN");
    public static MemoryLayout $LAYOUT() {
        return tagEMRCREATEPEN.$struct$LAYOUT;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle ihPen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ihPen"));
    public static VarHandle ihPen$VH() {
        return tagEMRCREATEPEN.ihPen$VH;
    }
    public static int ihPen$get(MemorySegment seg) {
        return (int)tagEMRCREATEPEN.ihPen$VH.get(seg);
    }
    public static void ihPen$set( MemorySegment seg, int x) {
        tagEMRCREATEPEN.ihPen$VH.set(seg, x);
    }
    public static int ihPen$get(MemorySegment seg, long index) {
        return (int)tagEMRCREATEPEN.ihPen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ihPen$set(MemorySegment seg, long index, int x) {
        tagEMRCREATEPEN.ihPen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment lopn$slice(MemorySegment seg) {
        return seg.asSlice(12, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


