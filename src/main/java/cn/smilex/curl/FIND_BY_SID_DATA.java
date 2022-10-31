// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class FIND_BY_SID_DATA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Restart"),
        MemoryLayout.structLayout(
            Constants$root.C_CHAR$LAYOUT.withName("Revision"),
            Constants$root.C_CHAR$LAYOUT.withName("SubAuthorityCount"),
            MemoryLayout.structLayout(
                MemoryLayout.sequenceLayout(6, Constants$root.C_CHAR$LAYOUT).withName("Value")
            ).withName("IdentifierAuthority"),
            MemoryLayout.sequenceLayout(1, Constants$root.C_LONG$LAYOUT).withName("SubAuthority")
        ).withName("Sid")
    );
    public static MemoryLayout $LAYOUT() {
        return FIND_BY_SID_DATA.$struct$LAYOUT;
    }
    static final VarHandle Restart$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Restart"));
    public static VarHandle Restart$VH() {
        return FIND_BY_SID_DATA.Restart$VH;
    }
    public static int Restart$get(MemorySegment seg) {
        return (int)FIND_BY_SID_DATA.Restart$VH.get(seg);
    }
    public static void Restart$set( MemorySegment seg, int x) {
        FIND_BY_SID_DATA.Restart$VH.set(seg, x);
    }
    public static int Restart$get(MemorySegment seg, long index) {
        return (int)FIND_BY_SID_DATA.Restart$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Restart$set(MemorySegment seg, long index, int x) {
        FIND_BY_SID_DATA.Restart$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Sid$slice(MemorySegment seg) {
        return seg.asSlice(4, 12);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


