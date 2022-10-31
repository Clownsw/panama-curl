// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _EXCEPTION_POINTERS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ExceptionRecord"),
        Constants$root.C_POINTER$LAYOUT.withName("ContextRecord")
    ).withName("_EXCEPTION_POINTERS");
    public static MemoryLayout $LAYOUT() {
        return _EXCEPTION_POINTERS.$struct$LAYOUT;
    }
    static final VarHandle ExceptionRecord$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ExceptionRecord"));
    public static VarHandle ExceptionRecord$VH() {
        return _EXCEPTION_POINTERS.ExceptionRecord$VH;
    }
    public static MemoryAddress ExceptionRecord$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_EXCEPTION_POINTERS.ExceptionRecord$VH.get(seg);
    }
    public static void ExceptionRecord$set( MemorySegment seg, MemoryAddress x) {
        _EXCEPTION_POINTERS.ExceptionRecord$VH.set(seg, x);
    }
    public static MemoryAddress ExceptionRecord$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_EXCEPTION_POINTERS.ExceptionRecord$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ExceptionRecord$set(MemorySegment seg, long index, MemoryAddress x) {
        _EXCEPTION_POINTERS.ExceptionRecord$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ContextRecord$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ContextRecord"));
    public static VarHandle ContextRecord$VH() {
        return _EXCEPTION_POINTERS.ContextRecord$VH;
    }
    public static MemoryAddress ContextRecord$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_EXCEPTION_POINTERS.ContextRecord$VH.get(seg);
    }
    public static void ContextRecord$set( MemorySegment seg, MemoryAddress x) {
        _EXCEPTION_POINTERS.ContextRecord$VH.set(seg, x);
    }
    public static MemoryAddress ContextRecord$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_EXCEPTION_POINTERS.ContextRecord$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ContextRecord$set(MemorySegment seg, long index, MemoryAddress x) {
        _EXCEPTION_POINTERS.ContextRecord$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


