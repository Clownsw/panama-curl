// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _WSAVersion {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwVersion"),
        Constants$root.C_LONG$LAYOUT.withName("ecHow")
    ).withName("_WSAVersion");
    public static MemoryLayout $LAYOUT() {
        return _WSAVersion.$struct$LAYOUT;
    }
    static final VarHandle dwVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwVersion"));
    public static VarHandle dwVersion$VH() {
        return _WSAVersion.dwVersion$VH;
    }
    public static int dwVersion$get(MemorySegment seg) {
        return (int)_WSAVersion.dwVersion$VH.get(seg);
    }
    public static void dwVersion$set( MemorySegment seg, int x) {
        _WSAVersion.dwVersion$VH.set(seg, x);
    }
    public static int dwVersion$get(MemorySegment seg, long index) {
        return (int)_WSAVersion.dwVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwVersion$set(MemorySegment seg, long index, int x) {
        _WSAVersion.dwVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ecHow$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ecHow"));
    public static VarHandle ecHow$VH() {
        return _WSAVersion.ecHow$VH;
    }
    public static int ecHow$get(MemorySegment seg) {
        return (int)_WSAVersion.ecHow$VH.get(seg);
    }
    public static void ecHow$set( MemorySegment seg, int x) {
        _WSAVersion.ecHow$VH.set(seg, x);
    }
    public static int ecHow$get(MemorySegment seg, long index) {
        return (int)_WSAVersion.ecHow$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ecHow$set(MemorySegment seg, long index, int x) {
        _WSAVersion.ecHow$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

