// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagMIXERCONTROLDETAILS_LISTTEXTA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwParam1"),
        Constants$root.C_LONG$LAYOUT.withName("dwParam2"),
        MemoryLayout.sequenceLayout(64, Constants$root.C_CHAR$LAYOUT).withName("szName")
    ).withName("tagMIXERCONTROLDETAILS_LISTTEXTA");
    public static MemoryLayout $LAYOUT() {
        return tagMIXERCONTROLDETAILS_LISTTEXTA.$struct$LAYOUT;
    }
    static final VarHandle dwParam1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwParam1"));
    public static VarHandle dwParam1$VH() {
        return tagMIXERCONTROLDETAILS_LISTTEXTA.dwParam1$VH;
    }
    public static int dwParam1$get(MemorySegment seg) {
        return (int)tagMIXERCONTROLDETAILS_LISTTEXTA.dwParam1$VH.get(seg);
    }
    public static void dwParam1$set( MemorySegment seg, int x) {
        tagMIXERCONTROLDETAILS_LISTTEXTA.dwParam1$VH.set(seg, x);
    }
    public static int dwParam1$get(MemorySegment seg, long index) {
        return (int)tagMIXERCONTROLDETAILS_LISTTEXTA.dwParam1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwParam1$set(MemorySegment seg, long index, int x) {
        tagMIXERCONTROLDETAILS_LISTTEXTA.dwParam1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwParam2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwParam2"));
    public static VarHandle dwParam2$VH() {
        return tagMIXERCONTROLDETAILS_LISTTEXTA.dwParam2$VH;
    }
    public static int dwParam2$get(MemorySegment seg) {
        return (int)tagMIXERCONTROLDETAILS_LISTTEXTA.dwParam2$VH.get(seg);
    }
    public static void dwParam2$set( MemorySegment seg, int x) {
        tagMIXERCONTROLDETAILS_LISTTEXTA.dwParam2$VH.set(seg, x);
    }
    public static int dwParam2$get(MemorySegment seg, long index) {
        return (int)tagMIXERCONTROLDETAILS_LISTTEXTA.dwParam2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwParam2$set(MemorySegment seg, long index, int x) {
        tagMIXERCONTROLDETAILS_LISTTEXTA.dwParam2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szName$slice(MemorySegment seg) {
        return seg.asSlice(8, 64);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


