// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class protoent {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("p_name"),
        Constants$root.C_POINTER$LAYOUT.withName("p_aliases"),
        Constants$root.C_SHORT$LAYOUT.withName("p_proto"),
        MemoryLayout.paddingLayout(48)
    ).withName("protoent");
    public static MemoryLayout $LAYOUT() {
        return protoent.$struct$LAYOUT;
    }
    static final VarHandle p_name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("p_name"));
    public static VarHandle p_name$VH() {
        return protoent.p_name$VH;
    }
    public static MemoryAddress p_name$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)protoent.p_name$VH.get(seg);
    }
    public static void p_name$set( MemorySegment seg, MemoryAddress x) {
        protoent.p_name$VH.set(seg, x);
    }
    public static MemoryAddress p_name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)protoent.p_name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void p_name$set(MemorySegment seg, long index, MemoryAddress x) {
        protoent.p_name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle p_aliases$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("p_aliases"));
    public static VarHandle p_aliases$VH() {
        return protoent.p_aliases$VH;
    }
    public static MemoryAddress p_aliases$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)protoent.p_aliases$VH.get(seg);
    }
    public static void p_aliases$set( MemorySegment seg, MemoryAddress x) {
        protoent.p_aliases$VH.set(seg, x);
    }
    public static MemoryAddress p_aliases$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)protoent.p_aliases$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void p_aliases$set(MemorySegment seg, long index, MemoryAddress x) {
        protoent.p_aliases$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle p_proto$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("p_proto"));
    public static VarHandle p_proto$VH() {
        return protoent.p_proto$VH;
    }
    public static short p_proto$get(MemorySegment seg) {
        return (short)protoent.p_proto$VH.get(seg);
    }
    public static void p_proto$set( MemorySegment seg, short x) {
        protoent.p_proto$VH.set(seg, x);
    }
    public static short p_proto$get(MemorySegment seg, long index) {
        return (short)protoent.p_proto$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void p_proto$set(MemorySegment seg, long index, short x) {
        protoent.p_proto$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


