// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagMCI_OVLY_WINDOW_PARMSA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("dwCallback"),
        Constants$root.C_POINTER$LAYOUT.withName("hWnd"),
        Constants$root.C_LONG$LAYOUT.withName("nCmdShow"),
        Constants$root.C_POINTER$LAYOUT.withName("lpstrText")
    ).withName("tagMCI_OVLY_WINDOW_PARMSA");
    public static MemoryLayout $LAYOUT() {
        return tagMCI_OVLY_WINDOW_PARMSA.$struct$LAYOUT;
    }
    static final VarHandle dwCallback$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwCallback"));
    public static VarHandle dwCallback$VH() {
        return tagMCI_OVLY_WINDOW_PARMSA.dwCallback$VH;
    }
    public static long dwCallback$get(MemorySegment seg) {
        return (long)tagMCI_OVLY_WINDOW_PARMSA.dwCallback$VH.get(seg);
    }
    public static void dwCallback$set( MemorySegment seg, long x) {
        tagMCI_OVLY_WINDOW_PARMSA.dwCallback$VH.set(seg, x);
    }
    public static long dwCallback$get(MemorySegment seg, long index) {
        return (long)tagMCI_OVLY_WINDOW_PARMSA.dwCallback$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCallback$set(MemorySegment seg, long index, long x) {
        tagMCI_OVLY_WINDOW_PARMSA.dwCallback$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hWnd$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hWnd"));
    public static VarHandle hWnd$VH() {
        return tagMCI_OVLY_WINDOW_PARMSA.hWnd$VH;
    }
    public static MemoryAddress hWnd$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagMCI_OVLY_WINDOW_PARMSA.hWnd$VH.get(seg);
    }
    public static void hWnd$set( MemorySegment seg, MemoryAddress x) {
        tagMCI_OVLY_WINDOW_PARMSA.hWnd$VH.set(seg, x);
    }
    public static MemoryAddress hWnd$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagMCI_OVLY_WINDOW_PARMSA.hWnd$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hWnd$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMCI_OVLY_WINDOW_PARMSA.hWnd$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nCmdShow$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nCmdShow"));
    public static VarHandle nCmdShow$VH() {
        return tagMCI_OVLY_WINDOW_PARMSA.nCmdShow$VH;
    }
    public static int nCmdShow$get(MemorySegment seg) {
        return (int)tagMCI_OVLY_WINDOW_PARMSA.nCmdShow$VH.get(seg);
    }
    public static void nCmdShow$set( MemorySegment seg, int x) {
        tagMCI_OVLY_WINDOW_PARMSA.nCmdShow$VH.set(seg, x);
    }
    public static int nCmdShow$get(MemorySegment seg, long index) {
        return (int)tagMCI_OVLY_WINDOW_PARMSA.nCmdShow$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nCmdShow$set(MemorySegment seg, long index, int x) {
        tagMCI_OVLY_WINDOW_PARMSA.nCmdShow$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrText$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstrText"));
    public static VarHandle lpstrText$VH() {
        return tagMCI_OVLY_WINDOW_PARMSA.lpstrText$VH;
    }
    public static MemoryAddress lpstrText$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagMCI_OVLY_WINDOW_PARMSA.lpstrText$VH.get(seg);
    }
    public static void lpstrText$set( MemorySegment seg, MemoryAddress x) {
        tagMCI_OVLY_WINDOW_PARMSA.lpstrText$VH.set(seg, x);
    }
    public static MemoryAddress lpstrText$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagMCI_OVLY_WINDOW_PARMSA.lpstrText$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrText$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMCI_OVLY_WINDOW_PARMSA.lpstrText$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


