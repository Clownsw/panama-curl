// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class servent {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("s_name"),
        Constants$root.C_POINTER$LAYOUT.withName("s_aliases"),
        Constants$root.C_POINTER$LAYOUT.withName("s_proto"),
        Constants$root.C_SHORT$LAYOUT.withName("s_port"),
        MemoryLayout.paddingLayout(48)
    ).withName("servent");
    public static MemoryLayout $LAYOUT() {
        return servent.$struct$LAYOUT;
    }
    static final VarHandle s_name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("s_name"));
    public static VarHandle s_name$VH() {
        return servent.s_name$VH;
    }
    public static MemoryAddress s_name$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)servent.s_name$VH.get(seg);
    }
    public static void s_name$set( MemorySegment seg, MemoryAddress x) {
        servent.s_name$VH.set(seg, x);
    }
    public static MemoryAddress s_name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)servent.s_name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void s_name$set(MemorySegment seg, long index, MemoryAddress x) {
        servent.s_name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle s_aliases$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("s_aliases"));
    public static VarHandle s_aliases$VH() {
        return servent.s_aliases$VH;
    }
    public static MemoryAddress s_aliases$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)servent.s_aliases$VH.get(seg);
    }
    public static void s_aliases$set( MemorySegment seg, MemoryAddress x) {
        servent.s_aliases$VH.set(seg, x);
    }
    public static MemoryAddress s_aliases$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)servent.s_aliases$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void s_aliases$set(MemorySegment seg, long index, MemoryAddress x) {
        servent.s_aliases$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle s_proto$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("s_proto"));
    public static VarHandle s_proto$VH() {
        return servent.s_proto$VH;
    }
    public static MemoryAddress s_proto$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)servent.s_proto$VH.get(seg);
    }
    public static void s_proto$set( MemorySegment seg, MemoryAddress x) {
        servent.s_proto$VH.set(seg, x);
    }
    public static MemoryAddress s_proto$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)servent.s_proto$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void s_proto$set(MemorySegment seg, long index, MemoryAddress x) {
        servent.s_proto$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle s_port$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("s_port"));
    public static VarHandle s_port$VH() {
        return servent.s_port$VH;
    }
    public static short s_port$get(MemorySegment seg) {
        return (short)servent.s_port$VH.get(seg);
    }
    public static void s_port$set( MemorySegment seg, short x) {
        servent.s_port$VH.set(seg, x);
    }
    public static short s_port$get(MemorySegment seg, long index) {
        return (short)servent.s_port$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void s_port$set(MemorySegment seg, long index, short x) {
        servent.s_port$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


