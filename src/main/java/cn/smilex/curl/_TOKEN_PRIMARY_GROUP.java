// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _TOKEN_PRIMARY_GROUP {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("PrimaryGroup")
    ).withName("_TOKEN_PRIMARY_GROUP");
    public static MemoryLayout $LAYOUT() {
        return _TOKEN_PRIMARY_GROUP.$struct$LAYOUT;
    }
    static final VarHandle PrimaryGroup$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PrimaryGroup"));
    public static VarHandle PrimaryGroup$VH() {
        return _TOKEN_PRIMARY_GROUP.PrimaryGroup$VH;
    }
    public static MemoryAddress PrimaryGroup$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_TOKEN_PRIMARY_GROUP.PrimaryGroup$VH.get(seg);
    }
    public static void PrimaryGroup$set( MemorySegment seg, MemoryAddress x) {
        _TOKEN_PRIMARY_GROUP.PrimaryGroup$VH.set(seg, x);
    }
    public static MemoryAddress PrimaryGroup$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_TOKEN_PRIMARY_GROUP.PrimaryGroup$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PrimaryGroup$set(MemorySegment seg, long index, MemoryAddress x) {
        _TOKEN_PRIMARY_GROUP.PrimaryGroup$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

