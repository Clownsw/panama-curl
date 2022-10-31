// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _TOKEN_GROUPS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("GroupCount"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("Sid"),
            Constants$root.C_LONG$LAYOUT.withName("Attributes"),
            MemoryLayout.paddingLayout(32)
        ).withName("_SID_AND_ATTRIBUTES")).withName("Groups")
    ).withName("_TOKEN_GROUPS");
    public static MemoryLayout $LAYOUT() {
        return _TOKEN_GROUPS.$struct$LAYOUT;
    }
    static final VarHandle GroupCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GroupCount"));
    public static VarHandle GroupCount$VH() {
        return _TOKEN_GROUPS.GroupCount$VH;
    }
    public static int GroupCount$get(MemorySegment seg) {
        return (int)_TOKEN_GROUPS.GroupCount$VH.get(seg);
    }
    public static void GroupCount$set( MemorySegment seg, int x) {
        _TOKEN_GROUPS.GroupCount$VH.set(seg, x);
    }
    public static int GroupCount$get(MemorySegment seg, long index) {
        return (int)_TOKEN_GROUPS.GroupCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GroupCount$set(MemorySegment seg, long index, int x) {
        _TOKEN_GROUPS.GroupCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Groups$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

