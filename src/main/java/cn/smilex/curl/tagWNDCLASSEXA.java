// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagWNDCLASSEXA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("style"),
        Constants$root.C_POINTER$LAYOUT.withName("lpfnWndProc"),
        Constants$root.C_LONG$LAYOUT.withName("cbClsExtra"),
        Constants$root.C_LONG$LAYOUT.withName("cbWndExtra"),
        Constants$root.C_POINTER$LAYOUT.withName("hInstance"),
        Constants$root.C_POINTER$LAYOUT.withName("hIcon"),
        Constants$root.C_POINTER$LAYOUT.withName("hCursor"),
        Constants$root.C_POINTER$LAYOUT.withName("hbrBackground"),
        Constants$root.C_POINTER$LAYOUT.withName("lpszMenuName"),
        Constants$root.C_POINTER$LAYOUT.withName("lpszClassName"),
        Constants$root.C_POINTER$LAYOUT.withName("hIconSm")
    ).withName("tagWNDCLASSEXA");
    public static MemoryLayout $LAYOUT() {
        return tagWNDCLASSEXA.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagWNDCLASSEXA.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagWNDCLASSEXA.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        tagWNDCLASSEXA.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagWNDCLASSEXA.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagWNDCLASSEXA.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle style$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("style"));
    public static VarHandle style$VH() {
        return tagWNDCLASSEXA.style$VH;
    }
    public static int style$get(MemorySegment seg) {
        return (int)tagWNDCLASSEXA.style$VH.get(seg);
    }
    public static void style$set( MemorySegment seg, int x) {
        tagWNDCLASSEXA.style$VH.set(seg, x);
    }
    public static int style$get(MemorySegment seg, long index) {
        return (int)tagWNDCLASSEXA.style$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void style$set(MemorySegment seg, long index, int x) {
        tagWNDCLASSEXA.style$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpfnWndProc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpfnWndProc"));
    public static VarHandle lpfnWndProc$VH() {
        return tagWNDCLASSEXA.lpfnWndProc$VH;
    }
    public static MemoryAddress lpfnWndProc$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagWNDCLASSEXA.lpfnWndProc$VH.get(seg);
    }
    public static void lpfnWndProc$set( MemorySegment seg, MemoryAddress x) {
        tagWNDCLASSEXA.lpfnWndProc$VH.set(seg, x);
    }
    public static MemoryAddress lpfnWndProc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagWNDCLASSEXA.lpfnWndProc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfnWndProc$set(MemorySegment seg, long index, MemoryAddress x) {
        tagWNDCLASSEXA.lpfnWndProc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static WNDPROC lpfnWndProc (MemorySegment segment, MemorySession session) {
        return WNDPROC.ofAddress(lpfnWndProc$get(segment), session);
    }
    static final VarHandle cbClsExtra$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbClsExtra"));
    public static VarHandle cbClsExtra$VH() {
        return tagWNDCLASSEXA.cbClsExtra$VH;
    }
    public static int cbClsExtra$get(MemorySegment seg) {
        return (int)tagWNDCLASSEXA.cbClsExtra$VH.get(seg);
    }
    public static void cbClsExtra$set( MemorySegment seg, int x) {
        tagWNDCLASSEXA.cbClsExtra$VH.set(seg, x);
    }
    public static int cbClsExtra$get(MemorySegment seg, long index) {
        return (int)tagWNDCLASSEXA.cbClsExtra$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbClsExtra$set(MemorySegment seg, long index, int x) {
        tagWNDCLASSEXA.cbClsExtra$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbWndExtra$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbWndExtra"));
    public static VarHandle cbWndExtra$VH() {
        return tagWNDCLASSEXA.cbWndExtra$VH;
    }
    public static int cbWndExtra$get(MemorySegment seg) {
        return (int)tagWNDCLASSEXA.cbWndExtra$VH.get(seg);
    }
    public static void cbWndExtra$set( MemorySegment seg, int x) {
        tagWNDCLASSEXA.cbWndExtra$VH.set(seg, x);
    }
    public static int cbWndExtra$get(MemorySegment seg, long index) {
        return (int)tagWNDCLASSEXA.cbWndExtra$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbWndExtra$set(MemorySegment seg, long index, int x) {
        tagWNDCLASSEXA.cbWndExtra$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hInstance$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hInstance"));
    public static VarHandle hInstance$VH() {
        return tagWNDCLASSEXA.hInstance$VH;
    }
    public static MemoryAddress hInstance$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagWNDCLASSEXA.hInstance$VH.get(seg);
    }
    public static void hInstance$set( MemorySegment seg, MemoryAddress x) {
        tagWNDCLASSEXA.hInstance$VH.set(seg, x);
    }
    public static MemoryAddress hInstance$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagWNDCLASSEXA.hInstance$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hInstance$set(MemorySegment seg, long index, MemoryAddress x) {
        tagWNDCLASSEXA.hInstance$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hIcon$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hIcon"));
    public static VarHandle hIcon$VH() {
        return tagWNDCLASSEXA.hIcon$VH;
    }
    public static MemoryAddress hIcon$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagWNDCLASSEXA.hIcon$VH.get(seg);
    }
    public static void hIcon$set( MemorySegment seg, MemoryAddress x) {
        tagWNDCLASSEXA.hIcon$VH.set(seg, x);
    }
    public static MemoryAddress hIcon$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagWNDCLASSEXA.hIcon$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hIcon$set(MemorySegment seg, long index, MemoryAddress x) {
        tagWNDCLASSEXA.hIcon$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hCursor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hCursor"));
    public static VarHandle hCursor$VH() {
        return tagWNDCLASSEXA.hCursor$VH;
    }
    public static MemoryAddress hCursor$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagWNDCLASSEXA.hCursor$VH.get(seg);
    }
    public static void hCursor$set( MemorySegment seg, MemoryAddress x) {
        tagWNDCLASSEXA.hCursor$VH.set(seg, x);
    }
    public static MemoryAddress hCursor$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagWNDCLASSEXA.hCursor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hCursor$set(MemorySegment seg, long index, MemoryAddress x) {
        tagWNDCLASSEXA.hCursor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hbrBackground$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hbrBackground"));
    public static VarHandle hbrBackground$VH() {
        return tagWNDCLASSEXA.hbrBackground$VH;
    }
    public static MemoryAddress hbrBackground$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagWNDCLASSEXA.hbrBackground$VH.get(seg);
    }
    public static void hbrBackground$set( MemorySegment seg, MemoryAddress x) {
        tagWNDCLASSEXA.hbrBackground$VH.set(seg, x);
    }
    public static MemoryAddress hbrBackground$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagWNDCLASSEXA.hbrBackground$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hbrBackground$set(MemorySegment seg, long index, MemoryAddress x) {
        tagWNDCLASSEXA.hbrBackground$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpszMenuName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpszMenuName"));
    public static VarHandle lpszMenuName$VH() {
        return tagWNDCLASSEXA.lpszMenuName$VH;
    }
    public static MemoryAddress lpszMenuName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagWNDCLASSEXA.lpszMenuName$VH.get(seg);
    }
    public static void lpszMenuName$set( MemorySegment seg, MemoryAddress x) {
        tagWNDCLASSEXA.lpszMenuName$VH.set(seg, x);
    }
    public static MemoryAddress lpszMenuName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagWNDCLASSEXA.lpszMenuName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszMenuName$set(MemorySegment seg, long index, MemoryAddress x) {
        tagWNDCLASSEXA.lpszMenuName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpszClassName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpszClassName"));
    public static VarHandle lpszClassName$VH() {
        return tagWNDCLASSEXA.lpszClassName$VH;
    }
    public static MemoryAddress lpszClassName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagWNDCLASSEXA.lpszClassName$VH.get(seg);
    }
    public static void lpszClassName$set( MemorySegment seg, MemoryAddress x) {
        tagWNDCLASSEXA.lpszClassName$VH.set(seg, x);
    }
    public static MemoryAddress lpszClassName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagWNDCLASSEXA.lpszClassName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszClassName$set(MemorySegment seg, long index, MemoryAddress x) {
        tagWNDCLASSEXA.lpszClassName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hIconSm$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hIconSm"));
    public static VarHandle hIconSm$VH() {
        return tagWNDCLASSEXA.hIconSm$VH;
    }
    public static MemoryAddress hIconSm$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagWNDCLASSEXA.hIconSm$VH.get(seg);
    }
    public static void hIconSm$set( MemorySegment seg, MemoryAddress x) {
        tagWNDCLASSEXA.hIconSm$VH.set(seg, x);
    }
    public static MemoryAddress hIconSm$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagWNDCLASSEXA.hIconSm$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hIconSm$set(MemorySegment seg, long index, MemoryAddress x) {
        tagWNDCLASSEXA.hIconSm$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


