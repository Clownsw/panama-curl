// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagMIXERLINECONTROLSW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbStruct"),
        Constants$root.C_LONG$LAYOUT.withName("dwLineID"),
        MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("dwControlID"),
            Constants$root.C_LONG$LAYOUT.withName("dwControlType")
        ).withName("$anon$0"),
        Constants$root.C_LONG$LAYOUT.withName("cControls"),
        Constants$root.C_LONG$LAYOUT.withName("cbmxctrl"),
        Constants$root.C_POINTER$LAYOUT.withName("pamxctrl")
    ).withName("tagMIXERLINECONTROLSW");
    public static MemoryLayout $LAYOUT() {
        return tagMIXERLINECONTROLSW.$struct$LAYOUT;
    }
    static final VarHandle cbStruct$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbStruct"));
    public static VarHandle cbStruct$VH() {
        return tagMIXERLINECONTROLSW.cbStruct$VH;
    }
    public static int cbStruct$get(MemorySegment seg) {
        return (int)tagMIXERLINECONTROLSW.cbStruct$VH.get(seg);
    }
    public static void cbStruct$set( MemorySegment seg, int x) {
        tagMIXERLINECONTROLSW.cbStruct$VH.set(seg, x);
    }
    public static int cbStruct$get(MemorySegment seg, long index) {
        return (int)tagMIXERLINECONTROLSW.cbStruct$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbStruct$set(MemorySegment seg, long index, int x) {
        tagMIXERLINECONTROLSW.cbStruct$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwLineID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwLineID"));
    public static VarHandle dwLineID$VH() {
        return tagMIXERLINECONTROLSW.dwLineID$VH;
    }
    public static int dwLineID$get(MemorySegment seg) {
        return (int)tagMIXERLINECONTROLSW.dwLineID$VH.get(seg);
    }
    public static void dwLineID$set( MemorySegment seg, int x) {
        tagMIXERLINECONTROLSW.dwLineID$VH.set(seg, x);
    }
    public static int dwLineID$get(MemorySegment seg, long index) {
        return (int)tagMIXERLINECONTROLSW.dwLineID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwLineID$set(MemorySegment seg, long index, int x) {
        tagMIXERLINECONTROLSW.dwLineID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwControlID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("dwControlID"));
    public static VarHandle dwControlID$VH() {
        return tagMIXERLINECONTROLSW.dwControlID$VH;
    }
    public static int dwControlID$get(MemorySegment seg) {
        return (int)tagMIXERLINECONTROLSW.dwControlID$VH.get(seg);
    }
    public static void dwControlID$set( MemorySegment seg, int x) {
        tagMIXERLINECONTROLSW.dwControlID$VH.set(seg, x);
    }
    public static int dwControlID$get(MemorySegment seg, long index) {
        return (int)tagMIXERLINECONTROLSW.dwControlID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwControlID$set(MemorySegment seg, long index, int x) {
        tagMIXERLINECONTROLSW.dwControlID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwControlType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("dwControlType"));
    public static VarHandle dwControlType$VH() {
        return tagMIXERLINECONTROLSW.dwControlType$VH;
    }
    public static int dwControlType$get(MemorySegment seg) {
        return (int)tagMIXERLINECONTROLSW.dwControlType$VH.get(seg);
    }
    public static void dwControlType$set( MemorySegment seg, int x) {
        tagMIXERLINECONTROLSW.dwControlType$VH.set(seg, x);
    }
    public static int dwControlType$get(MemorySegment seg, long index) {
        return (int)tagMIXERLINECONTROLSW.dwControlType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwControlType$set(MemorySegment seg, long index, int x) {
        tagMIXERLINECONTROLSW.dwControlType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cControls$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cControls"));
    public static VarHandle cControls$VH() {
        return tagMIXERLINECONTROLSW.cControls$VH;
    }
    public static int cControls$get(MemorySegment seg) {
        return (int)tagMIXERLINECONTROLSW.cControls$VH.get(seg);
    }
    public static void cControls$set( MemorySegment seg, int x) {
        tagMIXERLINECONTROLSW.cControls$VH.set(seg, x);
    }
    public static int cControls$get(MemorySegment seg, long index) {
        return (int)tagMIXERLINECONTROLSW.cControls$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cControls$set(MemorySegment seg, long index, int x) {
        tagMIXERLINECONTROLSW.cControls$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbmxctrl$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbmxctrl"));
    public static VarHandle cbmxctrl$VH() {
        return tagMIXERLINECONTROLSW.cbmxctrl$VH;
    }
    public static int cbmxctrl$get(MemorySegment seg) {
        return (int)tagMIXERLINECONTROLSW.cbmxctrl$VH.get(seg);
    }
    public static void cbmxctrl$set( MemorySegment seg, int x) {
        tagMIXERLINECONTROLSW.cbmxctrl$VH.set(seg, x);
    }
    public static int cbmxctrl$get(MemorySegment seg, long index) {
        return (int)tagMIXERLINECONTROLSW.cbmxctrl$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbmxctrl$set(MemorySegment seg, long index, int x) {
        tagMIXERLINECONTROLSW.cbmxctrl$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pamxctrl$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pamxctrl"));
    public static VarHandle pamxctrl$VH() {
        return tagMIXERLINECONTROLSW.pamxctrl$VH;
    }
    public static MemoryAddress pamxctrl$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagMIXERLINECONTROLSW.pamxctrl$VH.get(seg);
    }
    public static void pamxctrl$set( MemorySegment seg, MemoryAddress x) {
        tagMIXERLINECONTROLSW.pamxctrl$VH.set(seg, x);
    }
    public static MemoryAddress pamxctrl$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagMIXERLINECONTROLSW.pamxctrl$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pamxctrl$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMIXERLINECONTROLSW.pamxctrl$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


