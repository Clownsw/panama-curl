// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _MIDL_INTERFACE_METHOD_PROPERTIES {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("MethodCount"),
        MemoryLayout.paddingLayout(48),
        Constants$root.C_POINTER$LAYOUT.withName("MethodProperties")
    ).withName("_MIDL_INTERFACE_METHOD_PROPERTIES");
    public static MemoryLayout $LAYOUT() {
        return _MIDL_INTERFACE_METHOD_PROPERTIES.$struct$LAYOUT;
    }
    static final VarHandle MethodCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MethodCount"));
    public static VarHandle MethodCount$VH() {
        return _MIDL_INTERFACE_METHOD_PROPERTIES.MethodCount$VH;
    }
    public static short MethodCount$get(MemorySegment seg) {
        return (short)_MIDL_INTERFACE_METHOD_PROPERTIES.MethodCount$VH.get(seg);
    }
    public static void MethodCount$set( MemorySegment seg, short x) {
        _MIDL_INTERFACE_METHOD_PROPERTIES.MethodCount$VH.set(seg, x);
    }
    public static short MethodCount$get(MemorySegment seg, long index) {
        return (short)_MIDL_INTERFACE_METHOD_PROPERTIES.MethodCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MethodCount$set(MemorySegment seg, long index, short x) {
        _MIDL_INTERFACE_METHOD_PROPERTIES.MethodCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MethodProperties$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MethodProperties"));
    public static VarHandle MethodProperties$VH() {
        return _MIDL_INTERFACE_METHOD_PROPERTIES.MethodProperties$VH;
    }
    public static MemoryAddress MethodProperties$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MIDL_INTERFACE_METHOD_PROPERTIES.MethodProperties$VH.get(seg);
    }
    public static void MethodProperties$set( MemorySegment seg, MemoryAddress x) {
        _MIDL_INTERFACE_METHOD_PROPERTIES.MethodProperties$VH.set(seg, x);
    }
    public static MemoryAddress MethodProperties$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MIDL_INTERFACE_METHOD_PROPERTIES.MethodProperties$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MethodProperties$set(MemorySegment seg, long index, MemoryAddress x) {
        _MIDL_INTERFACE_METHOD_PROPERTIES.MethodProperties$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


