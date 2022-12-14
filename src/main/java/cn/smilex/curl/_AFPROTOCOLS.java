// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _AFPROTOCOLS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("iAddressFamily"),
        Constants$root.C_LONG$LAYOUT.withName("iProtocol")
    ).withName("_AFPROTOCOLS");
    public static MemoryLayout $LAYOUT() {
        return _AFPROTOCOLS.$struct$LAYOUT;
    }
    static final VarHandle iAddressFamily$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iAddressFamily"));
    public static VarHandle iAddressFamily$VH() {
        return _AFPROTOCOLS.iAddressFamily$VH;
    }
    public static int iAddressFamily$get(MemorySegment seg) {
        return (int)_AFPROTOCOLS.iAddressFamily$VH.get(seg);
    }
    public static void iAddressFamily$set( MemorySegment seg, int x) {
        _AFPROTOCOLS.iAddressFamily$VH.set(seg, x);
    }
    public static int iAddressFamily$get(MemorySegment seg, long index) {
        return (int)_AFPROTOCOLS.iAddressFamily$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iAddressFamily$set(MemorySegment seg, long index, int x) {
        _AFPROTOCOLS.iAddressFamily$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iProtocol$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iProtocol"));
    public static VarHandle iProtocol$VH() {
        return _AFPROTOCOLS.iProtocol$VH;
    }
    public static int iProtocol$get(MemorySegment seg) {
        return (int)_AFPROTOCOLS.iProtocol$VH.get(seg);
    }
    public static void iProtocol$set( MemorySegment seg, int x) {
        _AFPROTOCOLS.iProtocol$VH.set(seg, x);
    }
    public static int iProtocol$get(MemorySegment seg, long index) {
        return (int)_AFPROTOCOLS.iProtocol$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iProtocol$set(MemorySegment seg, long index, int x) {
        _AFPROTOCOLS.iProtocol$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


