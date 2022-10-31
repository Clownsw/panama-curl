// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class PrintPropertiesCollection {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("numberOfProperties"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("propertiesCollection")
    );
    public static MemoryLayout $LAYOUT() {
        return PrintPropertiesCollection.$struct$LAYOUT;
    }
    static final VarHandle numberOfProperties$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("numberOfProperties"));
    public static VarHandle numberOfProperties$VH() {
        return PrintPropertiesCollection.numberOfProperties$VH;
    }
    public static int numberOfProperties$get(MemorySegment seg) {
        return (int)PrintPropertiesCollection.numberOfProperties$VH.get(seg);
    }
    public static void numberOfProperties$set( MemorySegment seg, int x) {
        PrintPropertiesCollection.numberOfProperties$VH.set(seg, x);
    }
    public static int numberOfProperties$get(MemorySegment seg, long index) {
        return (int)PrintPropertiesCollection.numberOfProperties$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void numberOfProperties$set(MemorySegment seg, long index, int x) {
        PrintPropertiesCollection.numberOfProperties$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle propertiesCollection$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("propertiesCollection"));
    public static VarHandle propertiesCollection$VH() {
        return PrintPropertiesCollection.propertiesCollection$VH;
    }
    public static MemoryAddress propertiesCollection$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)PrintPropertiesCollection.propertiesCollection$VH.get(seg);
    }
    public static void propertiesCollection$set( MemorySegment seg, MemoryAddress x) {
        PrintPropertiesCollection.propertiesCollection$VH.set(seg, x);
    }
    public static MemoryAddress propertiesCollection$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)PrintPropertiesCollection.propertiesCollection$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void propertiesCollection$set(MemorySegment seg, long index, MemoryAddress x) {
        PrintPropertiesCollection.propertiesCollection$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


