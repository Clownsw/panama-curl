// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GENERIC_BINDING_ROUTINE_PAIR {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pfnBind"),
        Constants$root.C_POINTER$LAYOUT.withName("pfnUnbind")
    ).withName("_GENERIC_BINDING_ROUTINE_PAIR");
    public static MemoryLayout $LAYOUT() {
        return _GENERIC_BINDING_ROUTINE_PAIR.$struct$LAYOUT;
    }
    static final VarHandle pfnBind$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pfnBind"));
    public static VarHandle pfnBind$VH() {
        return _GENERIC_BINDING_ROUTINE_PAIR.pfnBind$VH;
    }
    public static MemoryAddress pfnBind$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GENERIC_BINDING_ROUTINE_PAIR.pfnBind$VH.get(seg);
    }
    public static void pfnBind$set( MemorySegment seg, MemoryAddress x) {
        _GENERIC_BINDING_ROUTINE_PAIR.pfnBind$VH.set(seg, x);
    }
    public static MemoryAddress pfnBind$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GENERIC_BINDING_ROUTINE_PAIR.pfnBind$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnBind$set(MemorySegment seg, long index, MemoryAddress x) {
        _GENERIC_BINDING_ROUTINE_PAIR.pfnBind$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GENERIC_BINDING_ROUTINE pfnBind (MemorySegment segment, MemorySession session) {
        return GENERIC_BINDING_ROUTINE.ofAddress(pfnBind$get(segment), session);
    }
    static final VarHandle pfnUnbind$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pfnUnbind"));
    public static VarHandle pfnUnbind$VH() {
        return _GENERIC_BINDING_ROUTINE_PAIR.pfnUnbind$VH;
    }
    public static MemoryAddress pfnUnbind$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GENERIC_BINDING_ROUTINE_PAIR.pfnUnbind$VH.get(seg);
    }
    public static void pfnUnbind$set( MemorySegment seg, MemoryAddress x) {
        _GENERIC_BINDING_ROUTINE_PAIR.pfnUnbind$VH.set(seg, x);
    }
    public static MemoryAddress pfnUnbind$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GENERIC_BINDING_ROUTINE_PAIR.pfnUnbind$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnUnbind$set(MemorySegment seg, long index, MemoryAddress x) {
        _GENERIC_BINDING_ROUTINE_PAIR.pfnUnbind$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GENERIC_UNBIND_ROUTINE pfnUnbind (MemorySegment segment, MemorySession session) {
        return GENERIC_UNBIND_ROUTINE.ofAddress(pfnUnbind$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


