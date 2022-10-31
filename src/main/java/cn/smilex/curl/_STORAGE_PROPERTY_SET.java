// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _STORAGE_PROPERTY_SET {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("PropertyId"),
        Constants$root.C_LONG$LAYOUT.withName("SetType"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("AdditionalParameters"),
        MemoryLayout.paddingLayout(24)
    ).withName("_STORAGE_PROPERTY_SET");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_PROPERTY_SET.$struct$LAYOUT;
    }
    static final VarHandle PropertyId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PropertyId"));
    public static VarHandle PropertyId$VH() {
        return _STORAGE_PROPERTY_SET.PropertyId$VH;
    }
    public static int PropertyId$get(MemorySegment seg) {
        return (int)_STORAGE_PROPERTY_SET.PropertyId$VH.get(seg);
    }
    public static void PropertyId$set( MemorySegment seg, int x) {
        _STORAGE_PROPERTY_SET.PropertyId$VH.set(seg, x);
    }
    public static int PropertyId$get(MemorySegment seg, long index) {
        return (int)_STORAGE_PROPERTY_SET.PropertyId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PropertyId$set(MemorySegment seg, long index, int x) {
        _STORAGE_PROPERTY_SET.PropertyId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SetType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SetType"));
    public static VarHandle SetType$VH() {
        return _STORAGE_PROPERTY_SET.SetType$VH;
    }
    public static int SetType$get(MemorySegment seg) {
        return (int)_STORAGE_PROPERTY_SET.SetType$VH.get(seg);
    }
    public static void SetType$set( MemorySegment seg, int x) {
        _STORAGE_PROPERTY_SET.SetType$VH.set(seg, x);
    }
    public static int SetType$get(MemorySegment seg, long index) {
        return (int)_STORAGE_PROPERTY_SET.SetType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetType$set(MemorySegment seg, long index, int x) {
        _STORAGE_PROPERTY_SET.SetType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment AdditionalParameters$slice(MemorySegment seg) {
        return seg.asSlice(8, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


