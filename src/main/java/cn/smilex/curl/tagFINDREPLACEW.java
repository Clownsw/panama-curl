// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagFINDREPLACEW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("lStructSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("hwndOwner"),
        Constants$root.C_POINTER$LAYOUT.withName("hInstance"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpstrFindWhat"),
        Constants$root.C_POINTER$LAYOUT.withName("lpstrReplaceWith"),
        Constants$root.C_SHORT$LAYOUT.withName("wFindWhatLen"),
        Constants$root.C_SHORT$LAYOUT.withName("wReplaceWithLen"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("lCustData"),
        Constants$root.C_POINTER$LAYOUT.withName("lpfnHook"),
        Constants$root.C_POINTER$LAYOUT.withName("lpTemplateName")
    ).withName("tagFINDREPLACEW");
    public static MemoryLayout $LAYOUT() {
        return tagFINDREPLACEW.$struct$LAYOUT;
    }
    static final VarHandle lStructSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lStructSize"));
    public static VarHandle lStructSize$VH() {
        return tagFINDREPLACEW.lStructSize$VH;
    }
    public static int lStructSize$get(MemorySegment seg) {
        return (int)tagFINDREPLACEW.lStructSize$VH.get(seg);
    }
    public static void lStructSize$set( MemorySegment seg, int x) {
        tagFINDREPLACEW.lStructSize$VH.set(seg, x);
    }
    public static int lStructSize$get(MemorySegment seg, long index) {
        return (int)tagFINDREPLACEW.lStructSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lStructSize$set(MemorySegment seg, long index, int x) {
        tagFINDREPLACEW.lStructSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndOwner$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwndOwner"));
    public static VarHandle hwndOwner$VH() {
        return tagFINDREPLACEW.hwndOwner$VH;
    }
    public static MemoryAddress hwndOwner$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagFINDREPLACEW.hwndOwner$VH.get(seg);
    }
    public static void hwndOwner$set( MemorySegment seg, MemoryAddress x) {
        tagFINDREPLACEW.hwndOwner$VH.set(seg, x);
    }
    public static MemoryAddress hwndOwner$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagFINDREPLACEW.hwndOwner$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndOwner$set(MemorySegment seg, long index, MemoryAddress x) {
        tagFINDREPLACEW.hwndOwner$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hInstance$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hInstance"));
    public static VarHandle hInstance$VH() {
        return tagFINDREPLACEW.hInstance$VH;
    }
    public static MemoryAddress hInstance$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagFINDREPLACEW.hInstance$VH.get(seg);
    }
    public static void hInstance$set( MemorySegment seg, MemoryAddress x) {
        tagFINDREPLACEW.hInstance$VH.set(seg, x);
    }
    public static MemoryAddress hInstance$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagFINDREPLACEW.hInstance$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hInstance$set(MemorySegment seg, long index, MemoryAddress x) {
        tagFINDREPLACEW.hInstance$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return tagFINDREPLACEW.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)tagFINDREPLACEW.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        tagFINDREPLACEW.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)tagFINDREPLACEW.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        tagFINDREPLACEW.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrFindWhat$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstrFindWhat"));
    public static VarHandle lpstrFindWhat$VH() {
        return tagFINDREPLACEW.lpstrFindWhat$VH;
    }
    public static MemoryAddress lpstrFindWhat$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagFINDREPLACEW.lpstrFindWhat$VH.get(seg);
    }
    public static void lpstrFindWhat$set( MemorySegment seg, MemoryAddress x) {
        tagFINDREPLACEW.lpstrFindWhat$VH.set(seg, x);
    }
    public static MemoryAddress lpstrFindWhat$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagFINDREPLACEW.lpstrFindWhat$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrFindWhat$set(MemorySegment seg, long index, MemoryAddress x) {
        tagFINDREPLACEW.lpstrFindWhat$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrReplaceWith$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstrReplaceWith"));
    public static VarHandle lpstrReplaceWith$VH() {
        return tagFINDREPLACEW.lpstrReplaceWith$VH;
    }
    public static MemoryAddress lpstrReplaceWith$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagFINDREPLACEW.lpstrReplaceWith$VH.get(seg);
    }
    public static void lpstrReplaceWith$set( MemorySegment seg, MemoryAddress x) {
        tagFINDREPLACEW.lpstrReplaceWith$VH.set(seg, x);
    }
    public static MemoryAddress lpstrReplaceWith$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagFINDREPLACEW.lpstrReplaceWith$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrReplaceWith$set(MemorySegment seg, long index, MemoryAddress x) {
        tagFINDREPLACEW.lpstrReplaceWith$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wFindWhatLen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wFindWhatLen"));
    public static VarHandle wFindWhatLen$VH() {
        return tagFINDREPLACEW.wFindWhatLen$VH;
    }
    public static short wFindWhatLen$get(MemorySegment seg) {
        return (short)tagFINDREPLACEW.wFindWhatLen$VH.get(seg);
    }
    public static void wFindWhatLen$set( MemorySegment seg, short x) {
        tagFINDREPLACEW.wFindWhatLen$VH.set(seg, x);
    }
    public static short wFindWhatLen$get(MemorySegment seg, long index) {
        return (short)tagFINDREPLACEW.wFindWhatLen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wFindWhatLen$set(MemorySegment seg, long index, short x) {
        tagFINDREPLACEW.wFindWhatLen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wReplaceWithLen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wReplaceWithLen"));
    public static VarHandle wReplaceWithLen$VH() {
        return tagFINDREPLACEW.wReplaceWithLen$VH;
    }
    public static short wReplaceWithLen$get(MemorySegment seg) {
        return (short)tagFINDREPLACEW.wReplaceWithLen$VH.get(seg);
    }
    public static void wReplaceWithLen$set( MemorySegment seg, short x) {
        tagFINDREPLACEW.wReplaceWithLen$VH.set(seg, x);
    }
    public static short wReplaceWithLen$get(MemorySegment seg, long index) {
        return (short)tagFINDREPLACEW.wReplaceWithLen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wReplaceWithLen$set(MemorySegment seg, long index, short x) {
        tagFINDREPLACEW.wReplaceWithLen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lCustData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lCustData"));
    public static VarHandle lCustData$VH() {
        return tagFINDREPLACEW.lCustData$VH;
    }
    public static long lCustData$get(MemorySegment seg) {
        return (long)tagFINDREPLACEW.lCustData$VH.get(seg);
    }
    public static void lCustData$set( MemorySegment seg, long x) {
        tagFINDREPLACEW.lCustData$VH.set(seg, x);
    }
    public static long lCustData$get(MemorySegment seg, long index) {
        return (long)tagFINDREPLACEW.lCustData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lCustData$set(MemorySegment seg, long index, long x) {
        tagFINDREPLACEW.lCustData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpfnHook$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpfnHook"));
    public static VarHandle lpfnHook$VH() {
        return tagFINDREPLACEW.lpfnHook$VH;
    }
    public static MemoryAddress lpfnHook$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagFINDREPLACEW.lpfnHook$VH.get(seg);
    }
    public static void lpfnHook$set( MemorySegment seg, MemoryAddress x) {
        tagFINDREPLACEW.lpfnHook$VH.set(seg, x);
    }
    public static MemoryAddress lpfnHook$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagFINDREPLACEW.lpfnHook$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfnHook$set(MemorySegment seg, long index, MemoryAddress x) {
        tagFINDREPLACEW.lpfnHook$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPFRHOOKPROC lpfnHook (MemorySegment segment, MemorySession session) {
        return LPFRHOOKPROC.ofAddress(lpfnHook$get(segment), session);
    }
    static final VarHandle lpTemplateName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpTemplateName"));
    public static VarHandle lpTemplateName$VH() {
        return tagFINDREPLACEW.lpTemplateName$VH;
    }
    public static MemoryAddress lpTemplateName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagFINDREPLACEW.lpTemplateName$VH.get(seg);
    }
    public static void lpTemplateName$set( MemorySegment seg, MemoryAddress x) {
        tagFINDREPLACEW.lpTemplateName$VH.set(seg, x);
    }
    public static MemoryAddress lpTemplateName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagFINDREPLACEW.lpTemplateName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpTemplateName$set(MemorySegment seg, long index, MemoryAddress x) {
        tagFINDREPLACEW.lpTemplateName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


