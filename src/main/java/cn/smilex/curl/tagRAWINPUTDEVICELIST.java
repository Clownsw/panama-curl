// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagRAWINPUTDEVICELIST {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("hDevice"),
        Constants$root.C_LONG$LAYOUT.withName("dwType"),
        MemoryLayout.paddingLayout(32)
    ).withName("tagRAWINPUTDEVICELIST");
    public static MemoryLayout $LAYOUT() {
        return tagRAWINPUTDEVICELIST.$struct$LAYOUT;
    }
    static final VarHandle hDevice$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hDevice"));
    public static VarHandle hDevice$VH() {
        return tagRAWINPUTDEVICELIST.hDevice$VH;
    }
    public static MemoryAddress hDevice$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagRAWINPUTDEVICELIST.hDevice$VH.get(seg);
    }
    public static void hDevice$set( MemorySegment seg, MemoryAddress x) {
        tagRAWINPUTDEVICELIST.hDevice$VH.set(seg, x);
    }
    public static MemoryAddress hDevice$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagRAWINPUTDEVICELIST.hDevice$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hDevice$set(MemorySegment seg, long index, MemoryAddress x) {
        tagRAWINPUTDEVICELIST.hDevice$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwType"));
    public static VarHandle dwType$VH() {
        return tagRAWINPUTDEVICELIST.dwType$VH;
    }
    public static int dwType$get(MemorySegment seg) {
        return (int)tagRAWINPUTDEVICELIST.dwType$VH.get(seg);
    }
    public static void dwType$set( MemorySegment seg, int x) {
        tagRAWINPUTDEVICELIST.dwType$VH.set(seg, x);
    }
    public static int dwType$get(MemorySegment seg, long index) {
        return (int)tagRAWINPUTDEVICELIST.dwType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwType$set(MemorySegment seg, long index, int x) {
        tagRAWINPUTDEVICELIST.dwType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


