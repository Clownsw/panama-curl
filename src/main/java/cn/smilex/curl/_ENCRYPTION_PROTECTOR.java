// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _ENCRYPTION_PROTECTOR {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbTotalLength"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pUserSid"),
        Constants$root.C_POINTER$LAYOUT.withName("lpProtectorDescriptor")
    ).withName("_ENCRYPTION_PROTECTOR");
    public static MemoryLayout $LAYOUT() {
        return _ENCRYPTION_PROTECTOR.$struct$LAYOUT;
    }
    static final VarHandle cbTotalLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbTotalLength"));
    public static VarHandle cbTotalLength$VH() {
        return _ENCRYPTION_PROTECTOR.cbTotalLength$VH;
    }
    public static int cbTotalLength$get(MemorySegment seg) {
        return (int)_ENCRYPTION_PROTECTOR.cbTotalLength$VH.get(seg);
    }
    public static void cbTotalLength$set( MemorySegment seg, int x) {
        _ENCRYPTION_PROTECTOR.cbTotalLength$VH.set(seg, x);
    }
    public static int cbTotalLength$get(MemorySegment seg, long index) {
        return (int)_ENCRYPTION_PROTECTOR.cbTotalLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbTotalLength$set(MemorySegment seg, long index, int x) {
        _ENCRYPTION_PROTECTOR.cbTotalLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pUserSid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pUserSid"));
    public static VarHandle pUserSid$VH() {
        return _ENCRYPTION_PROTECTOR.pUserSid$VH;
    }
    public static MemoryAddress pUserSid$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_ENCRYPTION_PROTECTOR.pUserSid$VH.get(seg);
    }
    public static void pUserSid$set( MemorySegment seg, MemoryAddress x) {
        _ENCRYPTION_PROTECTOR.pUserSid$VH.set(seg, x);
    }
    public static MemoryAddress pUserSid$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_ENCRYPTION_PROTECTOR.pUserSid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pUserSid$set(MemorySegment seg, long index, MemoryAddress x) {
        _ENCRYPTION_PROTECTOR.pUserSid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpProtectorDescriptor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpProtectorDescriptor"));
    public static VarHandle lpProtectorDescriptor$VH() {
        return _ENCRYPTION_PROTECTOR.lpProtectorDescriptor$VH;
    }
    public static MemoryAddress lpProtectorDescriptor$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_ENCRYPTION_PROTECTOR.lpProtectorDescriptor$VH.get(seg);
    }
    public static void lpProtectorDescriptor$set( MemorySegment seg, MemoryAddress x) {
        _ENCRYPTION_PROTECTOR.lpProtectorDescriptor$VH.set(seg, x);
    }
    public static MemoryAddress lpProtectorDescriptor$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_ENCRYPTION_PROTECTOR.lpProtectorDescriptor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpProtectorDescriptor$set(MemorySegment seg, long index, MemoryAddress x) {
        _ENCRYPTION_PROTECTOR.lpProtectorDescriptor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


