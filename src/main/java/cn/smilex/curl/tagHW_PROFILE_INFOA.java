// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagHW_PROFILE_INFOA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwDockInfo"),
        MemoryLayout.sequenceLayout(39, Constants$root.C_CHAR$LAYOUT).withName("szHwProfileGuid"),
        MemoryLayout.sequenceLayout(80, Constants$root.C_CHAR$LAYOUT).withName("szHwProfileName"),
        MemoryLayout.paddingLayout(8)
    ).withName("tagHW_PROFILE_INFOA");
    public static MemoryLayout $LAYOUT() {
        return tagHW_PROFILE_INFOA.$struct$LAYOUT;
    }
    static final VarHandle dwDockInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwDockInfo"));
    public static VarHandle dwDockInfo$VH() {
        return tagHW_PROFILE_INFOA.dwDockInfo$VH;
    }
    public static int dwDockInfo$get(MemorySegment seg) {
        return (int)tagHW_PROFILE_INFOA.dwDockInfo$VH.get(seg);
    }
    public static void dwDockInfo$set( MemorySegment seg, int x) {
        tagHW_PROFILE_INFOA.dwDockInfo$VH.set(seg, x);
    }
    public static int dwDockInfo$get(MemorySegment seg, long index) {
        return (int)tagHW_PROFILE_INFOA.dwDockInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwDockInfo$set(MemorySegment seg, long index, int x) {
        tagHW_PROFILE_INFOA.dwDockInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szHwProfileGuid$slice(MemorySegment seg) {
        return seg.asSlice(4, 39);
    }
    public static MemorySegment szHwProfileName$slice(MemorySegment seg) {
        return seg.asSlice(43, 80);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


