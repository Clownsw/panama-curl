// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _PERF_INSTANCE_DEFINITION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("ByteLength"),
        Constants$root.C_LONG$LAYOUT.withName("ParentObjectTitleIndex"),
        Constants$root.C_LONG$LAYOUT.withName("ParentObjectInstance"),
        Constants$root.C_LONG$LAYOUT.withName("UniqueID"),
        Constants$root.C_LONG$LAYOUT.withName("NameOffset"),
        Constants$root.C_LONG$LAYOUT.withName("NameLength")
    ).withName("_PERF_INSTANCE_DEFINITION");
    public static MemoryLayout $LAYOUT() {
        return _PERF_INSTANCE_DEFINITION.$struct$LAYOUT;
    }
    static final VarHandle ByteLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ByteLength"));
    public static VarHandle ByteLength$VH() {
        return _PERF_INSTANCE_DEFINITION.ByteLength$VH;
    }
    public static int ByteLength$get(MemorySegment seg) {
        return (int)_PERF_INSTANCE_DEFINITION.ByteLength$VH.get(seg);
    }
    public static void ByteLength$set( MemorySegment seg, int x) {
        _PERF_INSTANCE_DEFINITION.ByteLength$VH.set(seg, x);
    }
    public static int ByteLength$get(MemorySegment seg, long index) {
        return (int)_PERF_INSTANCE_DEFINITION.ByteLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ByteLength$set(MemorySegment seg, long index, int x) {
        _PERF_INSTANCE_DEFINITION.ByteLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ParentObjectTitleIndex$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ParentObjectTitleIndex"));
    public static VarHandle ParentObjectTitleIndex$VH() {
        return _PERF_INSTANCE_DEFINITION.ParentObjectTitleIndex$VH;
    }
    public static int ParentObjectTitleIndex$get(MemorySegment seg) {
        return (int)_PERF_INSTANCE_DEFINITION.ParentObjectTitleIndex$VH.get(seg);
    }
    public static void ParentObjectTitleIndex$set( MemorySegment seg, int x) {
        _PERF_INSTANCE_DEFINITION.ParentObjectTitleIndex$VH.set(seg, x);
    }
    public static int ParentObjectTitleIndex$get(MemorySegment seg, long index) {
        return (int)_PERF_INSTANCE_DEFINITION.ParentObjectTitleIndex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ParentObjectTitleIndex$set(MemorySegment seg, long index, int x) {
        _PERF_INSTANCE_DEFINITION.ParentObjectTitleIndex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ParentObjectInstance$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ParentObjectInstance"));
    public static VarHandle ParentObjectInstance$VH() {
        return _PERF_INSTANCE_DEFINITION.ParentObjectInstance$VH;
    }
    public static int ParentObjectInstance$get(MemorySegment seg) {
        return (int)_PERF_INSTANCE_DEFINITION.ParentObjectInstance$VH.get(seg);
    }
    public static void ParentObjectInstance$set( MemorySegment seg, int x) {
        _PERF_INSTANCE_DEFINITION.ParentObjectInstance$VH.set(seg, x);
    }
    public static int ParentObjectInstance$get(MemorySegment seg, long index) {
        return (int)_PERF_INSTANCE_DEFINITION.ParentObjectInstance$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ParentObjectInstance$set(MemorySegment seg, long index, int x) {
        _PERF_INSTANCE_DEFINITION.ParentObjectInstance$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle UniqueID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UniqueID"));
    public static VarHandle UniqueID$VH() {
        return _PERF_INSTANCE_DEFINITION.UniqueID$VH;
    }
    public static int UniqueID$get(MemorySegment seg) {
        return (int)_PERF_INSTANCE_DEFINITION.UniqueID$VH.get(seg);
    }
    public static void UniqueID$set( MemorySegment seg, int x) {
        _PERF_INSTANCE_DEFINITION.UniqueID$VH.set(seg, x);
    }
    public static int UniqueID$get(MemorySegment seg, long index) {
        return (int)_PERF_INSTANCE_DEFINITION.UniqueID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UniqueID$set(MemorySegment seg, long index, int x) {
        _PERF_INSTANCE_DEFINITION.UniqueID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NameOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NameOffset"));
    public static VarHandle NameOffset$VH() {
        return _PERF_INSTANCE_DEFINITION.NameOffset$VH;
    }
    public static int NameOffset$get(MemorySegment seg) {
        return (int)_PERF_INSTANCE_DEFINITION.NameOffset$VH.get(seg);
    }
    public static void NameOffset$set( MemorySegment seg, int x) {
        _PERF_INSTANCE_DEFINITION.NameOffset$VH.set(seg, x);
    }
    public static int NameOffset$get(MemorySegment seg, long index) {
        return (int)_PERF_INSTANCE_DEFINITION.NameOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NameOffset$set(MemorySegment seg, long index, int x) {
        _PERF_INSTANCE_DEFINITION.NameOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NameLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NameLength"));
    public static VarHandle NameLength$VH() {
        return _PERF_INSTANCE_DEFINITION.NameLength$VH;
    }
    public static int NameLength$get(MemorySegment seg) {
        return (int)_PERF_INSTANCE_DEFINITION.NameLength$VH.get(seg);
    }
    public static void NameLength$set( MemorySegment seg, int x) {
        _PERF_INSTANCE_DEFINITION.NameLength$VH.set(seg, x);
    }
    public static int NameLength$get(MemorySegment seg, long index) {
        return (int)_PERF_INSTANCE_DEFINITION.NameLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NameLength$set(MemorySegment seg, long index, int x) {
        _PERF_INSTANCE_DEFINITION.NameLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


