// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SD_CHANGE_MACHINE_SID_INPUT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("CurrentMachineSIDOffset"),
        Constants$root.C_SHORT$LAYOUT.withName("CurrentMachineSIDLength"),
        Constants$root.C_SHORT$LAYOUT.withName("NewMachineSIDOffset"),
        Constants$root.C_SHORT$LAYOUT.withName("NewMachineSIDLength")
    ).withName("_SD_CHANGE_MACHINE_SID_INPUT");
    public static MemoryLayout $LAYOUT() {
        return _SD_CHANGE_MACHINE_SID_INPUT.$struct$LAYOUT;
    }
    static final VarHandle CurrentMachineSIDOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CurrentMachineSIDOffset"));
    public static VarHandle CurrentMachineSIDOffset$VH() {
        return _SD_CHANGE_MACHINE_SID_INPUT.CurrentMachineSIDOffset$VH;
    }
    public static short CurrentMachineSIDOffset$get(MemorySegment seg) {
        return (short)_SD_CHANGE_MACHINE_SID_INPUT.CurrentMachineSIDOffset$VH.get(seg);
    }
    public static void CurrentMachineSIDOffset$set( MemorySegment seg, short x) {
        _SD_CHANGE_MACHINE_SID_INPUT.CurrentMachineSIDOffset$VH.set(seg, x);
    }
    public static short CurrentMachineSIDOffset$get(MemorySegment seg, long index) {
        return (short)_SD_CHANGE_MACHINE_SID_INPUT.CurrentMachineSIDOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CurrentMachineSIDOffset$set(MemorySegment seg, long index, short x) {
        _SD_CHANGE_MACHINE_SID_INPUT.CurrentMachineSIDOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CurrentMachineSIDLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CurrentMachineSIDLength"));
    public static VarHandle CurrentMachineSIDLength$VH() {
        return _SD_CHANGE_MACHINE_SID_INPUT.CurrentMachineSIDLength$VH;
    }
    public static short CurrentMachineSIDLength$get(MemorySegment seg) {
        return (short)_SD_CHANGE_MACHINE_SID_INPUT.CurrentMachineSIDLength$VH.get(seg);
    }
    public static void CurrentMachineSIDLength$set( MemorySegment seg, short x) {
        _SD_CHANGE_MACHINE_SID_INPUT.CurrentMachineSIDLength$VH.set(seg, x);
    }
    public static short CurrentMachineSIDLength$get(MemorySegment seg, long index) {
        return (short)_SD_CHANGE_MACHINE_SID_INPUT.CurrentMachineSIDLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CurrentMachineSIDLength$set(MemorySegment seg, long index, short x) {
        _SD_CHANGE_MACHINE_SID_INPUT.CurrentMachineSIDLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NewMachineSIDOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NewMachineSIDOffset"));
    public static VarHandle NewMachineSIDOffset$VH() {
        return _SD_CHANGE_MACHINE_SID_INPUT.NewMachineSIDOffset$VH;
    }
    public static short NewMachineSIDOffset$get(MemorySegment seg) {
        return (short)_SD_CHANGE_MACHINE_SID_INPUT.NewMachineSIDOffset$VH.get(seg);
    }
    public static void NewMachineSIDOffset$set( MemorySegment seg, short x) {
        _SD_CHANGE_MACHINE_SID_INPUT.NewMachineSIDOffset$VH.set(seg, x);
    }
    public static short NewMachineSIDOffset$get(MemorySegment seg, long index) {
        return (short)_SD_CHANGE_MACHINE_SID_INPUT.NewMachineSIDOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NewMachineSIDOffset$set(MemorySegment seg, long index, short x) {
        _SD_CHANGE_MACHINE_SID_INPUT.NewMachineSIDOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NewMachineSIDLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NewMachineSIDLength"));
    public static VarHandle NewMachineSIDLength$VH() {
        return _SD_CHANGE_MACHINE_SID_INPUT.NewMachineSIDLength$VH;
    }
    public static short NewMachineSIDLength$get(MemorySegment seg) {
        return (short)_SD_CHANGE_MACHINE_SID_INPUT.NewMachineSIDLength$VH.get(seg);
    }
    public static void NewMachineSIDLength$set( MemorySegment seg, short x) {
        _SD_CHANGE_MACHINE_SID_INPUT.NewMachineSIDLength$VH.set(seg, x);
    }
    public static short NewMachineSIDLength$get(MemorySegment seg, long index) {
        return (short)_SD_CHANGE_MACHINE_SID_INPUT.NewMachineSIDLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NewMachineSIDLength$set(MemorySegment seg, long index, short x) {
        _SD_CHANGE_MACHINE_SID_INPUT.NewMachineSIDLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


