// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagEMR {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("iType"),
        Constants$root.C_LONG$LAYOUT.withName("nSize")
    ).withName("tagEMR");
    public static MemoryLayout $LAYOUT() {
        return tagEMR.$struct$LAYOUT;
    }
    static final VarHandle iType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iType"));
    public static VarHandle iType$VH() {
        return tagEMR.iType$VH;
    }
    public static int iType$get(MemorySegment seg) {
        return (int)tagEMR.iType$VH.get(seg);
    }
    public static void iType$set( MemorySegment seg, int x) {
        tagEMR.iType$VH.set(seg, x);
    }
    public static int iType$get(MemorySegment seg, long index) {
        return (int)tagEMR.iType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iType$set(MemorySegment seg, long index, int x) {
        tagEMR.iType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nSize"));
    public static VarHandle nSize$VH() {
        return tagEMR.nSize$VH;
    }
    public static int nSize$get(MemorySegment seg) {
        return (int)tagEMR.nSize$VH.get(seg);
    }
    public static void nSize$set( MemorySegment seg, int x) {
        tagEMR.nSize$VH.set(seg, x);
    }
    public static int nSize$get(MemorySegment seg, long index) {
        return (int)tagEMR.nSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nSize$set(MemorySegment seg, long index, int x) {
        tagEMR.nSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


