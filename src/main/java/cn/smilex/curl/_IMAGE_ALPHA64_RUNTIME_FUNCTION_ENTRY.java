// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("BeginAddress"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("EndAddress"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ExceptionHandler"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("HandlerData"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("PrologEndAddress")
    ).withName("_IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY.$struct$LAYOUT;
    }
    static final VarHandle BeginAddress$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BeginAddress"));
    public static VarHandle BeginAddress$VH() {
        return _IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY.BeginAddress$VH;
    }
    public static long BeginAddress$get(MemorySegment seg) {
        return (long)_IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY.BeginAddress$VH.get(seg);
    }
    public static void BeginAddress$set( MemorySegment seg, long x) {
        _IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY.BeginAddress$VH.set(seg, x);
    }
    public static long BeginAddress$get(MemorySegment seg, long index) {
        return (long)_IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY.BeginAddress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BeginAddress$set(MemorySegment seg, long index, long x) {
        _IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY.BeginAddress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle EndAddress$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EndAddress"));
    public static VarHandle EndAddress$VH() {
        return _IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY.EndAddress$VH;
    }
    public static long EndAddress$get(MemorySegment seg) {
        return (long)_IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY.EndAddress$VH.get(seg);
    }
    public static void EndAddress$set( MemorySegment seg, long x) {
        _IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY.EndAddress$VH.set(seg, x);
    }
    public static long EndAddress$get(MemorySegment seg, long index) {
        return (long)_IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY.EndAddress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EndAddress$set(MemorySegment seg, long index, long x) {
        _IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY.EndAddress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ExceptionHandler$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ExceptionHandler"));
    public static VarHandle ExceptionHandler$VH() {
        return _IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY.ExceptionHandler$VH;
    }
    public static long ExceptionHandler$get(MemorySegment seg) {
        return (long)_IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY.ExceptionHandler$VH.get(seg);
    }
    public static void ExceptionHandler$set( MemorySegment seg, long x) {
        _IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY.ExceptionHandler$VH.set(seg, x);
    }
    public static long ExceptionHandler$get(MemorySegment seg, long index) {
        return (long)_IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY.ExceptionHandler$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ExceptionHandler$set(MemorySegment seg, long index, long x) {
        _IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY.ExceptionHandler$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle HandlerData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("HandlerData"));
    public static VarHandle HandlerData$VH() {
        return _IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY.HandlerData$VH;
    }
    public static long HandlerData$get(MemorySegment seg) {
        return (long)_IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY.HandlerData$VH.get(seg);
    }
    public static void HandlerData$set( MemorySegment seg, long x) {
        _IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY.HandlerData$VH.set(seg, x);
    }
    public static long HandlerData$get(MemorySegment seg, long index) {
        return (long)_IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY.HandlerData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HandlerData$set(MemorySegment seg, long index, long x) {
        _IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY.HandlerData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PrologEndAddress$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PrologEndAddress"));
    public static VarHandle PrologEndAddress$VH() {
        return _IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY.PrologEndAddress$VH;
    }
    public static long PrologEndAddress$get(MemorySegment seg) {
        return (long)_IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY.PrologEndAddress$VH.get(seg);
    }
    public static void PrologEndAddress$set( MemorySegment seg, long x) {
        _IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY.PrologEndAddress$VH.set(seg, x);
    }
    public static long PrologEndAddress$get(MemorySegment seg, long index) {
        return (long)_IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY.PrologEndAddress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PrologEndAddress$set(MemorySegment seg, long index, long x) {
        _IMAGE_ALPHA64_RUNTIME_FUNCTION_ENTRY.PrologEndAddress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


