// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _PUBLICKEYSTRUC {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("bType"),
        Constants$root.C_CHAR$LAYOUT.withName("bVersion"),
        Constants$root.C_SHORT$LAYOUT.withName("reserved"),
        Constants$root.C_LONG$LAYOUT.withName("aiKeyAlg")
    ).withName("_PUBLICKEYSTRUC");
    public static MemoryLayout $LAYOUT() {
        return _PUBLICKEYSTRUC.$struct$LAYOUT;
    }
    static final VarHandle bType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bType"));
    public static VarHandle bType$VH() {
        return _PUBLICKEYSTRUC.bType$VH;
    }
    public static byte bType$get(MemorySegment seg) {
        return (byte)_PUBLICKEYSTRUC.bType$VH.get(seg);
    }
    public static void bType$set( MemorySegment seg, byte x) {
        _PUBLICKEYSTRUC.bType$VH.set(seg, x);
    }
    public static byte bType$get(MemorySegment seg, long index) {
        return (byte)_PUBLICKEYSTRUC.bType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bType$set(MemorySegment seg, long index, byte x) {
        _PUBLICKEYSTRUC.bType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bVersion"));
    public static VarHandle bVersion$VH() {
        return _PUBLICKEYSTRUC.bVersion$VH;
    }
    public static byte bVersion$get(MemorySegment seg) {
        return (byte)_PUBLICKEYSTRUC.bVersion$VH.get(seg);
    }
    public static void bVersion$set( MemorySegment seg, byte x) {
        _PUBLICKEYSTRUC.bVersion$VH.set(seg, x);
    }
    public static byte bVersion$get(MemorySegment seg, long index) {
        return (byte)_PUBLICKEYSTRUC.bVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bVersion$set(MemorySegment seg, long index, byte x) {
        _PUBLICKEYSTRUC.bVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("reserved"));
    public static VarHandle reserved$VH() {
        return _PUBLICKEYSTRUC.reserved$VH;
    }
    public static short reserved$get(MemorySegment seg) {
        return (short)_PUBLICKEYSTRUC.reserved$VH.get(seg);
    }
    public static void reserved$set( MemorySegment seg, short x) {
        _PUBLICKEYSTRUC.reserved$VH.set(seg, x);
    }
    public static short reserved$get(MemorySegment seg, long index) {
        return (short)_PUBLICKEYSTRUC.reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved$set(MemorySegment seg, long index, short x) {
        _PUBLICKEYSTRUC.reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle aiKeyAlg$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("aiKeyAlg"));
    public static VarHandle aiKeyAlg$VH() {
        return _PUBLICKEYSTRUC.aiKeyAlg$VH;
    }
    public static int aiKeyAlg$get(MemorySegment seg) {
        return (int)_PUBLICKEYSTRUC.aiKeyAlg$VH.get(seg);
    }
    public static void aiKeyAlg$set( MemorySegment seg, int x) {
        _PUBLICKEYSTRUC.aiKeyAlg$VH.set(seg, x);
    }
    public static int aiKeyAlg$get(MemorySegment seg, long index) {
        return (int)_PUBLICKEYSTRUC.aiKeyAlg$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void aiKeyAlg$set(MemorySegment seg, long index, int x) {
        _PUBLICKEYSTRUC.aiKeyAlg$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


