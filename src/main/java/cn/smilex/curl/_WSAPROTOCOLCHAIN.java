// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _WSAPROTOCOLCHAIN {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("ChainLen"),
        MemoryLayout.sequenceLayout(7, Constants$root.C_LONG$LAYOUT).withName("ChainEntries")
    ).withName("_WSAPROTOCOLCHAIN");
    public static MemoryLayout $LAYOUT() {
        return _WSAPROTOCOLCHAIN.$struct$LAYOUT;
    }
    static final VarHandle ChainLen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ChainLen"));
    public static VarHandle ChainLen$VH() {
        return _WSAPROTOCOLCHAIN.ChainLen$VH;
    }
    public static int ChainLen$get(MemorySegment seg) {
        return (int)_WSAPROTOCOLCHAIN.ChainLen$VH.get(seg);
    }
    public static void ChainLen$set( MemorySegment seg, int x) {
        _WSAPROTOCOLCHAIN.ChainLen$VH.set(seg, x);
    }
    public static int ChainLen$get(MemorySegment seg, long index) {
        return (int)_WSAPROTOCOLCHAIN.ChainLen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ChainLen$set(MemorySegment seg, long index, int x) {
        _WSAPROTOCOLCHAIN.ChainLen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ChainEntries$slice(MemorySegment seg) {
        return seg.asSlice(4, 28);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


