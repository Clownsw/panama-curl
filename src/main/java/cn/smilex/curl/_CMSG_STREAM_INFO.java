// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CMSG_STREAM_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbContent"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pfnStreamOutput"),
        Constants$root.C_POINTER$LAYOUT.withName("pvArg")
    ).withName("_CMSG_STREAM_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CMSG_STREAM_INFO.$struct$LAYOUT;
    }
    static final VarHandle cbContent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbContent"));
    public static VarHandle cbContent$VH() {
        return _CMSG_STREAM_INFO.cbContent$VH;
    }
    public static int cbContent$get(MemorySegment seg) {
        return (int)_CMSG_STREAM_INFO.cbContent$VH.get(seg);
    }
    public static void cbContent$set( MemorySegment seg, int x) {
        _CMSG_STREAM_INFO.cbContent$VH.set(seg, x);
    }
    public static int cbContent$get(MemorySegment seg, long index) {
        return (int)_CMSG_STREAM_INFO.cbContent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbContent$set(MemorySegment seg, long index, int x) {
        _CMSG_STREAM_INFO.cbContent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pfnStreamOutput$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pfnStreamOutput"));
    public static VarHandle pfnStreamOutput$VH() {
        return _CMSG_STREAM_INFO.pfnStreamOutput$VH;
    }
    public static MemoryAddress pfnStreamOutput$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CMSG_STREAM_INFO.pfnStreamOutput$VH.get(seg);
    }
    public static void pfnStreamOutput$set( MemorySegment seg, MemoryAddress x) {
        _CMSG_STREAM_INFO.pfnStreamOutput$VH.set(seg, x);
    }
    public static MemoryAddress pfnStreamOutput$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CMSG_STREAM_INFO.pfnStreamOutput$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnStreamOutput$set(MemorySegment seg, long index, MemoryAddress x) {
        _CMSG_STREAM_INFO.pfnStreamOutput$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PFN_CMSG_STREAM_OUTPUT pfnStreamOutput (MemorySegment segment, MemorySession session) {
        return PFN_CMSG_STREAM_OUTPUT.ofAddress(pfnStreamOutput$get(segment), session);
    }
    static final VarHandle pvArg$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pvArg"));
    public static VarHandle pvArg$VH() {
        return _CMSG_STREAM_INFO.pvArg$VH;
    }
    public static MemoryAddress pvArg$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CMSG_STREAM_INFO.pvArg$VH.get(seg);
    }
    public static void pvArg$set( MemorySegment seg, MemoryAddress x) {
        _CMSG_STREAM_INFO.pvArg$VH.set(seg, x);
    }
    public static MemoryAddress pvArg$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CMSG_STREAM_INFO.pvArg$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvArg$set(MemorySegment seg, long index, MemoryAddress x) {
        _CMSG_STREAM_INFO.pvArg$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


