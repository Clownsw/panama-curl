// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CRYPT_INTERFACE_REG {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwInterface"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_LONG$LAYOUT.withName("cFunctions"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgpszFunctions")
    ).withName("_CRYPT_INTERFACE_REG");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_INTERFACE_REG.$struct$LAYOUT;
    }
    static final VarHandle dwInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwInterface"));
    public static VarHandle dwInterface$VH() {
        return _CRYPT_INTERFACE_REG.dwInterface$VH;
    }
    public static int dwInterface$get(MemorySegment seg) {
        return (int)_CRYPT_INTERFACE_REG.dwInterface$VH.get(seg);
    }
    public static void dwInterface$set( MemorySegment seg, int x) {
        _CRYPT_INTERFACE_REG.dwInterface$VH.set(seg, x);
    }
    public static int dwInterface$get(MemorySegment seg, long index) {
        return (int)_CRYPT_INTERFACE_REG.dwInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwInterface$set(MemorySegment seg, long index, int x) {
        _CRYPT_INTERFACE_REG.dwInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return _CRYPT_INTERFACE_REG.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)_CRYPT_INTERFACE_REG.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        _CRYPT_INTERFACE_REG.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)_CRYPT_INTERFACE_REG.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        _CRYPT_INTERFACE_REG.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cFunctions$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cFunctions"));
    public static VarHandle cFunctions$VH() {
        return _CRYPT_INTERFACE_REG.cFunctions$VH;
    }
    public static int cFunctions$get(MemorySegment seg) {
        return (int)_CRYPT_INTERFACE_REG.cFunctions$VH.get(seg);
    }
    public static void cFunctions$set( MemorySegment seg, int x) {
        _CRYPT_INTERFACE_REG.cFunctions$VH.set(seg, x);
    }
    public static int cFunctions$get(MemorySegment seg, long index) {
        return (int)_CRYPT_INTERFACE_REG.cFunctions$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cFunctions$set(MemorySegment seg, long index, int x) {
        _CRYPT_INTERFACE_REG.cFunctions$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgpszFunctions$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgpszFunctions"));
    public static VarHandle rgpszFunctions$VH() {
        return _CRYPT_INTERFACE_REG.rgpszFunctions$VH;
    }
    public static MemoryAddress rgpszFunctions$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_INTERFACE_REG.rgpszFunctions$VH.get(seg);
    }
    public static void rgpszFunctions$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_INTERFACE_REG.rgpszFunctions$VH.set(seg, x);
    }
    public static MemoryAddress rgpszFunctions$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_INTERFACE_REG.rgpszFunctions$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgpszFunctions$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_INTERFACE_REG.rgpszFunctions$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


