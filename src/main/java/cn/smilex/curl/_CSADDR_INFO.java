// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CSADDR_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("lpSockaddr"),
            Constants$root.C_LONG$LAYOUT.withName("iSockaddrLength"),
            MemoryLayout.paddingLayout(32)
        ).withName("LocalAddr"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("lpSockaddr"),
            Constants$root.C_LONG$LAYOUT.withName("iSockaddrLength"),
            MemoryLayout.paddingLayout(32)
        ).withName("RemoteAddr"),
        Constants$root.C_LONG$LAYOUT.withName("iSocketType"),
        Constants$root.C_LONG$LAYOUT.withName("iProtocol")
    ).withName("_CSADDR_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CSADDR_INFO.$struct$LAYOUT;
    }
    public static MemorySegment LocalAddr$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment RemoteAddr$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    static final VarHandle iSocketType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iSocketType"));
    public static VarHandle iSocketType$VH() {
        return _CSADDR_INFO.iSocketType$VH;
    }
    public static int iSocketType$get(MemorySegment seg) {
        return (int)_CSADDR_INFO.iSocketType$VH.get(seg);
    }
    public static void iSocketType$set( MemorySegment seg, int x) {
        _CSADDR_INFO.iSocketType$VH.set(seg, x);
    }
    public static int iSocketType$get(MemorySegment seg, long index) {
        return (int)_CSADDR_INFO.iSocketType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iSocketType$set(MemorySegment seg, long index, int x) {
        _CSADDR_INFO.iSocketType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iProtocol$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iProtocol"));
    public static VarHandle iProtocol$VH() {
        return _CSADDR_INFO.iProtocol$VH;
    }
    public static int iProtocol$get(MemorySegment seg) {
        return (int)_CSADDR_INFO.iProtocol$VH.get(seg);
    }
    public static void iProtocol$set( MemorySegment seg, int x) {
        _CSADDR_INFO.iProtocol$VH.set(seg, x);
    }
    public static int iProtocol$get(MemorySegment seg, long index) {
        return (int)_CSADDR_INFO.iProtocol$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iProtocol$set(MemorySegment seg, long index, int x) {
        _CSADDR_INFO.iProtocol$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


