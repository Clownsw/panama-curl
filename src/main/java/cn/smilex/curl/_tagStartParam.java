// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _tagStartParam {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("iid"),
        Constants$root.C_POINTER$LAYOUT.withName("pIBindCtx"),
        Constants$root.C_POINTER$LAYOUT.withName("pItf")
    ).withName("_tagStartParam");
    public static MemoryLayout $LAYOUT() {
        return _tagStartParam.$struct$LAYOUT;
    }
    public static MemorySegment iid$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final VarHandle pIBindCtx$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pIBindCtx"));
    public static VarHandle pIBindCtx$VH() {
        return _tagStartParam.pIBindCtx$VH;
    }
    public static MemoryAddress pIBindCtx$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_tagStartParam.pIBindCtx$VH.get(seg);
    }
    public static void pIBindCtx$set( MemorySegment seg, MemoryAddress x) {
        _tagStartParam.pIBindCtx$VH.set(seg, x);
    }
    public static MemoryAddress pIBindCtx$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_tagStartParam.pIBindCtx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pIBindCtx$set(MemorySegment seg, long index, MemoryAddress x) {
        _tagStartParam.pIBindCtx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pItf$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pItf"));
    public static VarHandle pItf$VH() {
        return _tagStartParam.pItf$VH;
    }
    public static MemoryAddress pItf$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_tagStartParam.pItf$VH.get(seg);
    }
    public static void pItf$set( MemorySegment seg, MemoryAddress x) {
        _tagStartParam.pItf$VH.set(seg, x);
    }
    public static MemoryAddress pItf$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_tagStartParam.pItf$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pItf$set(MemorySegment seg, long index, MemoryAddress x) {
        _tagStartParam.pItf$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


