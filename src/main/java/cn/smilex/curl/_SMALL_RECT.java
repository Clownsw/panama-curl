// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SMALL_RECT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("Left"),
        Constants$root.C_SHORT$LAYOUT.withName("Top"),
        Constants$root.C_SHORT$LAYOUT.withName("Right"),
        Constants$root.C_SHORT$LAYOUT.withName("Bottom")
    ).withName("_SMALL_RECT");
    public static MemoryLayout $LAYOUT() {
        return _SMALL_RECT.$struct$LAYOUT;
    }
    static final VarHandle Left$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Left"));
    public static VarHandle Left$VH() {
        return _SMALL_RECT.Left$VH;
    }
    public static short Left$get(MemorySegment seg) {
        return (short)_SMALL_RECT.Left$VH.get(seg);
    }
    public static void Left$set( MemorySegment seg, short x) {
        _SMALL_RECT.Left$VH.set(seg, x);
    }
    public static short Left$get(MemorySegment seg, long index) {
        return (short)_SMALL_RECT.Left$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Left$set(MemorySegment seg, long index, short x) {
        _SMALL_RECT.Left$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Top$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Top"));
    public static VarHandle Top$VH() {
        return _SMALL_RECT.Top$VH;
    }
    public static short Top$get(MemorySegment seg) {
        return (short)_SMALL_RECT.Top$VH.get(seg);
    }
    public static void Top$set( MemorySegment seg, short x) {
        _SMALL_RECT.Top$VH.set(seg, x);
    }
    public static short Top$get(MemorySegment seg, long index) {
        return (short)_SMALL_RECT.Top$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Top$set(MemorySegment seg, long index, short x) {
        _SMALL_RECT.Top$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Right$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Right"));
    public static VarHandle Right$VH() {
        return _SMALL_RECT.Right$VH;
    }
    public static short Right$get(MemorySegment seg) {
        return (short)_SMALL_RECT.Right$VH.get(seg);
    }
    public static void Right$set( MemorySegment seg, short x) {
        _SMALL_RECT.Right$VH.set(seg, x);
    }
    public static short Right$get(MemorySegment seg, long index) {
        return (short)_SMALL_RECT.Right$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Right$set(MemorySegment seg, long index, short x) {
        _SMALL_RECT.Right$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Bottom$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Bottom"));
    public static VarHandle Bottom$VH() {
        return _SMALL_RECT.Bottom$VH;
    }
    public static short Bottom$get(MemorySegment seg) {
        return (short)_SMALL_RECT.Bottom$VH.get(seg);
    }
    public static void Bottom$set( MemorySegment seg, short x) {
        _SMALL_RECT.Bottom$VH.set(seg, x);
    }
    public static short Bottom$get(MemorySegment seg, long index) {
        return (short)_SMALL_RECT.Bottom$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Bottom$set(MemorySegment seg, long index, short x) {
        _SMALL_RECT.Bottom$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


