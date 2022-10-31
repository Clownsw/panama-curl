// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _DEBUG_EVENT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwDebugEventCode"),
        Constants$root.C_LONG$LAYOUT.withName("dwProcessId"),
        Constants$root.C_LONG$LAYOUT.withName("dwThreadId"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("ExceptionCode"),
                    Constants$root.C_LONG$LAYOUT.withName("ExceptionFlags"),
                    Constants$root.C_POINTER$LAYOUT.withName("ExceptionRecord"),
                    Constants$root.C_POINTER$LAYOUT.withName("ExceptionAddress"),
                    Constants$root.C_LONG$LAYOUT.withName("NumberParameters"),
                    MemoryLayout.paddingLayout(32),
                    MemoryLayout.sequenceLayout(15, Constants$root.C_LONG_LONG$LAYOUT).withName("ExceptionInformation")
                ).withName("ExceptionRecord"),
                Constants$root.C_LONG$LAYOUT.withName("dwFirstChance"),
                MemoryLayout.paddingLayout(32)
            ).withName("Exception"),
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("hThread"),
                Constants$root.C_POINTER$LAYOUT.withName("lpThreadLocalBase"),
                Constants$root.C_POINTER$LAYOUT.withName("lpStartAddress")
            ).withName("CreateThread"),
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("hFile"),
                Constants$root.C_POINTER$LAYOUT.withName("hProcess"),
                Constants$root.C_POINTER$LAYOUT.withName("hThread"),
                Constants$root.C_POINTER$LAYOUT.withName("lpBaseOfImage"),
                Constants$root.C_LONG$LAYOUT.withName("dwDebugInfoFileOffset"),
                Constants$root.C_LONG$LAYOUT.withName("nDebugInfoSize"),
                Constants$root.C_POINTER$LAYOUT.withName("lpThreadLocalBase"),
                Constants$root.C_POINTER$LAYOUT.withName("lpStartAddress"),
                Constants$root.C_POINTER$LAYOUT.withName("lpImageName"),
                Constants$root.C_SHORT$LAYOUT.withName("fUnicode"),
                MemoryLayout.paddingLayout(48)
            ).withName("CreateProcessInfo"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("dwExitCode")
            ).withName("ExitThread"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("dwExitCode")
            ).withName("ExitProcess"),
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("hFile"),
                Constants$root.C_POINTER$LAYOUT.withName("lpBaseOfDll"),
                Constants$root.C_LONG$LAYOUT.withName("dwDebugInfoFileOffset"),
                Constants$root.C_LONG$LAYOUT.withName("nDebugInfoSize"),
                Constants$root.C_POINTER$LAYOUT.withName("lpImageName"),
                Constants$root.C_SHORT$LAYOUT.withName("fUnicode"),
                MemoryLayout.paddingLayout(48)
            ).withName("LoadDll"),
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("lpBaseOfDll")
            ).withName("UnloadDll"),
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("lpDebugStringData"),
                Constants$root.C_SHORT$LAYOUT.withName("fUnicode"),
                Constants$root.C_SHORT$LAYOUT.withName("nDebugStringLength"),
                MemoryLayout.paddingLayout(32)
            ).withName("DebugString"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("dwError"),
                Constants$root.C_LONG$LAYOUT.withName("dwType")
            ).withName("RipInfo")
        ).withName("u")
    ).withName("_DEBUG_EVENT");
    public static MemoryLayout $LAYOUT() {
        return _DEBUG_EVENT.$struct$LAYOUT;
    }
    static final VarHandle dwDebugEventCode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwDebugEventCode"));
    public static VarHandle dwDebugEventCode$VH() {
        return _DEBUG_EVENT.dwDebugEventCode$VH;
    }
    public static int dwDebugEventCode$get(MemorySegment seg) {
        return (int)_DEBUG_EVENT.dwDebugEventCode$VH.get(seg);
    }
    public static void dwDebugEventCode$set( MemorySegment seg, int x) {
        _DEBUG_EVENT.dwDebugEventCode$VH.set(seg, x);
    }
    public static int dwDebugEventCode$get(MemorySegment seg, long index) {
        return (int)_DEBUG_EVENT.dwDebugEventCode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwDebugEventCode$set(MemorySegment seg, long index, int x) {
        _DEBUG_EVENT.dwDebugEventCode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwProcessId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwProcessId"));
    public static VarHandle dwProcessId$VH() {
        return _DEBUG_EVENT.dwProcessId$VH;
    }
    public static int dwProcessId$get(MemorySegment seg) {
        return (int)_DEBUG_EVENT.dwProcessId$VH.get(seg);
    }
    public static void dwProcessId$set( MemorySegment seg, int x) {
        _DEBUG_EVENT.dwProcessId$VH.set(seg, x);
    }
    public static int dwProcessId$get(MemorySegment seg, long index) {
        return (int)_DEBUG_EVENT.dwProcessId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwProcessId$set(MemorySegment seg, long index, int x) {
        _DEBUG_EVENT.dwProcessId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwThreadId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwThreadId"));
    public static VarHandle dwThreadId$VH() {
        return _DEBUG_EVENT.dwThreadId$VH;
    }
    public static int dwThreadId$get(MemorySegment seg) {
        return (int)_DEBUG_EVENT.dwThreadId$VH.get(seg);
    }
    public static void dwThreadId$set( MemorySegment seg, int x) {
        _DEBUG_EVENT.dwThreadId$VH.set(seg, x);
    }
    public static int dwThreadId$get(MemorySegment seg, long index) {
        return (int)_DEBUG_EVENT.dwThreadId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwThreadId$set(MemorySegment seg, long index, int x) {
        _DEBUG_EVENT.dwThreadId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static class u {

        static final  GroupLayout u$union$LAYOUT = MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("ExceptionCode"),
                    Constants$root.C_LONG$LAYOUT.withName("ExceptionFlags"),
                    Constants$root.C_POINTER$LAYOUT.withName("ExceptionRecord"),
                    Constants$root.C_POINTER$LAYOUT.withName("ExceptionAddress"),
                    Constants$root.C_LONG$LAYOUT.withName("NumberParameters"),
                    MemoryLayout.paddingLayout(32),
                    MemoryLayout.sequenceLayout(15, Constants$root.C_LONG_LONG$LAYOUT).withName("ExceptionInformation")
                ).withName("ExceptionRecord"),
                Constants$root.C_LONG$LAYOUT.withName("dwFirstChance"),
                MemoryLayout.paddingLayout(32)
            ).withName("Exception"),
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("hThread"),
                Constants$root.C_POINTER$LAYOUT.withName("lpThreadLocalBase"),
                Constants$root.C_POINTER$LAYOUT.withName("lpStartAddress")
            ).withName("CreateThread"),
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("hFile"),
                Constants$root.C_POINTER$LAYOUT.withName("hProcess"),
                Constants$root.C_POINTER$LAYOUT.withName("hThread"),
                Constants$root.C_POINTER$LAYOUT.withName("lpBaseOfImage"),
                Constants$root.C_LONG$LAYOUT.withName("dwDebugInfoFileOffset"),
                Constants$root.C_LONG$LAYOUT.withName("nDebugInfoSize"),
                Constants$root.C_POINTER$LAYOUT.withName("lpThreadLocalBase"),
                Constants$root.C_POINTER$LAYOUT.withName("lpStartAddress"),
                Constants$root.C_POINTER$LAYOUT.withName("lpImageName"),
                Constants$root.C_SHORT$LAYOUT.withName("fUnicode"),
                MemoryLayout.paddingLayout(48)
            ).withName("CreateProcessInfo"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("dwExitCode")
            ).withName("ExitThread"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("dwExitCode")
            ).withName("ExitProcess"),
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("hFile"),
                Constants$root.C_POINTER$LAYOUT.withName("lpBaseOfDll"),
                Constants$root.C_LONG$LAYOUT.withName("dwDebugInfoFileOffset"),
                Constants$root.C_LONG$LAYOUT.withName("nDebugInfoSize"),
                Constants$root.C_POINTER$LAYOUT.withName("lpImageName"),
                Constants$root.C_SHORT$LAYOUT.withName("fUnicode"),
                MemoryLayout.paddingLayout(48)
            ).withName("LoadDll"),
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("lpBaseOfDll")
            ).withName("UnloadDll"),
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("lpDebugStringData"),
                Constants$root.C_SHORT$LAYOUT.withName("fUnicode"),
                Constants$root.C_SHORT$LAYOUT.withName("nDebugStringLength"),
                MemoryLayout.paddingLayout(32)
            ).withName("DebugString"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("dwError"),
                Constants$root.C_LONG$LAYOUT.withName("dwType")
            ).withName("RipInfo")
        );
        public static MemoryLayout $LAYOUT() {
            return u.u$union$LAYOUT;
        }
        public static MemorySegment Exception$slice(MemorySegment seg) {
            return seg.asSlice(0, 160);
        }
        public static MemorySegment CreateThread$slice(MemorySegment seg) {
            return seg.asSlice(0, 24);
        }
        public static MemorySegment CreateProcessInfo$slice(MemorySegment seg) {
            return seg.asSlice(0, 72);
        }
        public static MemorySegment ExitThread$slice(MemorySegment seg) {
            return seg.asSlice(0, 4);
        }
        public static MemorySegment ExitProcess$slice(MemorySegment seg) {
            return seg.asSlice(0, 4);
        }
        public static MemorySegment LoadDll$slice(MemorySegment seg) {
            return seg.asSlice(0, 40);
        }
        public static MemorySegment UnloadDll$slice(MemorySegment seg) {
            return seg.asSlice(0, 8);
        }
        public static MemorySegment DebugString$slice(MemorySegment seg) {
            return seg.asSlice(0, 16);
        }
        public static MemorySegment RipInfo$slice(MemorySegment seg) {
            return seg.asSlice(0, 8);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment u$slice(MemorySegment seg) {
        return seg.asSlice(16, 160);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


