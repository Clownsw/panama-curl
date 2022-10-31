// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _EFS_KEY_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwVersion"),
        Constants$root.C_LONG$LAYOUT.withName("Entropy"),
        Constants$root.C_LONG$LAYOUT.withName("Algorithm"),
        Constants$root.C_LONG$LAYOUT.withName("KeyLength")
    ).withName("_EFS_KEY_INFO");
    public static MemoryLayout $LAYOUT() {
        return _EFS_KEY_INFO.$struct$LAYOUT;
    }
    static final VarHandle dwVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwVersion"));
    public static VarHandle dwVersion$VH() {
        return _EFS_KEY_INFO.dwVersion$VH;
    }
    public static int dwVersion$get(MemorySegment seg) {
        return (int)_EFS_KEY_INFO.dwVersion$VH.get(seg);
    }
    public static void dwVersion$set( MemorySegment seg, int x) {
        _EFS_KEY_INFO.dwVersion$VH.set(seg, x);
    }
    public static int dwVersion$get(MemorySegment seg, long index) {
        return (int)_EFS_KEY_INFO.dwVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwVersion$set(MemorySegment seg, long index, int x) {
        _EFS_KEY_INFO.dwVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Entropy$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Entropy"));
    public static VarHandle Entropy$VH() {
        return _EFS_KEY_INFO.Entropy$VH;
    }
    public static int Entropy$get(MemorySegment seg) {
        return (int)_EFS_KEY_INFO.Entropy$VH.get(seg);
    }
    public static void Entropy$set( MemorySegment seg, int x) {
        _EFS_KEY_INFO.Entropy$VH.set(seg, x);
    }
    public static int Entropy$get(MemorySegment seg, long index) {
        return (int)_EFS_KEY_INFO.Entropy$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Entropy$set(MemorySegment seg, long index, int x) {
        _EFS_KEY_INFO.Entropy$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Algorithm$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Algorithm"));
    public static VarHandle Algorithm$VH() {
        return _EFS_KEY_INFO.Algorithm$VH;
    }
    public static int Algorithm$get(MemorySegment seg) {
        return (int)_EFS_KEY_INFO.Algorithm$VH.get(seg);
    }
    public static void Algorithm$set( MemorySegment seg, int x) {
        _EFS_KEY_INFO.Algorithm$VH.set(seg, x);
    }
    public static int Algorithm$get(MemorySegment seg, long index) {
        return (int)_EFS_KEY_INFO.Algorithm$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Algorithm$set(MemorySegment seg, long index, int x) {
        _EFS_KEY_INFO.Algorithm$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle KeyLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("KeyLength"));
    public static VarHandle KeyLength$VH() {
        return _EFS_KEY_INFO.KeyLength$VH;
    }
    public static int KeyLength$get(MemorySegment seg) {
        return (int)_EFS_KEY_INFO.KeyLength$VH.get(seg);
    }
    public static void KeyLength$set( MemorySegment seg, int x) {
        _EFS_KEY_INFO.KeyLength$VH.set(seg, x);
    }
    public static int KeyLength$get(MemorySegment seg, long index) {
        return (int)_EFS_KEY_INFO.KeyLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void KeyLength$set(MemorySegment seg, long index, int x) {
        _EFS_KEY_INFO.KeyLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


