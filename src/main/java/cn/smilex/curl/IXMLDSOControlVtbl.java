// Generated by jextract

package cn.smilex;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IXMLDSOControlVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("GetTypeInfoCount"),
        Constants$root.C_POINTER$LAYOUT.withName("GetTypeInfo"),
        Constants$root.C_POINTER$LAYOUT.withName("GetIDsOfNames"),
        Constants$root.C_POINTER$LAYOUT.withName("Invoke"),
        Constants$root.C_POINTER$LAYOUT.withName("get_XMLDocument"),
        Constants$root.C_POINTER$LAYOUT.withName("put_XMLDocument"),
        Constants$root.C_POINTER$LAYOUT.withName("get_JavaDSOCompatible"),
        Constants$root.C_POINTER$LAYOUT.withName("put_JavaDSOCompatible"),
        Constants$root.C_POINTER$LAYOUT.withName("get_readyState")
    ).withName("IXMLDSOControlVtbl");
    public static MemoryLayout $LAYOUT() {
        return IXMLDSOControlVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IXMLDSOControlVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IXMLDSOControlVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IXMLDSOControlVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IXMLDSOControlVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IXMLDSOControlVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IXMLDSOControlVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IXMLDSOControlVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IXMLDSOControlVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IXMLDSOControlVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IXMLDSOControlVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IXMLDSOControlVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IXMLDSOControlVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IXMLDSOControlVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IXMLDSOControlVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IXMLDSOControlVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IXMLDSOControlVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IXMLDSOControlVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IXMLDSOControlVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IXMLDSOControlVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IXMLDSOControlVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IXMLDSOControlVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IXMLDSOControlVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IXMLDSOControlVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IXMLDSOControlVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor GetTypeInfoCount$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetTypeInfoCount$MH = RuntimeHelper.downcallHandle(
        IXMLDSOControlVtbl.GetTypeInfoCount$FUNC
    );
    public interface GetTypeInfoCount {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(GetTypeInfoCount fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetTypeInfoCount.class, fi, IXMLDSOControlVtbl.GetTypeInfoCount$FUNC, session);
        }
        static GetTypeInfoCount ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IXMLDSOControlVtbl.GetTypeInfoCount$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetTypeInfoCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetTypeInfoCount"));
    public static VarHandle GetTypeInfoCount$VH() {
        return IXMLDSOControlVtbl.GetTypeInfoCount$VH;
    }
    public static MemoryAddress GetTypeInfoCount$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IXMLDSOControlVtbl.GetTypeInfoCount$VH.get(seg);
    }
    public static void GetTypeInfoCount$set( MemorySegment seg, MemoryAddress x) {
        IXMLDSOControlVtbl.GetTypeInfoCount$VH.set(seg, x);
    }
    public static MemoryAddress GetTypeInfoCount$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IXMLDSOControlVtbl.GetTypeInfoCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetTypeInfoCount$set(MemorySegment seg, long index, MemoryAddress x) {
        IXMLDSOControlVtbl.GetTypeInfoCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetTypeInfoCount GetTypeInfoCount (MemorySegment segment, MemorySession session) {
        return GetTypeInfoCount.ofAddress(GetTypeInfoCount$get(segment), session);
    }
    static final FunctionDescriptor GetTypeInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetTypeInfo$MH = RuntimeHelper.downcallHandle(
        IXMLDSOControlVtbl.GetTypeInfo$FUNC
    );
    public interface GetTypeInfo {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, int _x2, java.lang.foreign.MemoryAddress _x3);
        static MemorySegment allocate(GetTypeInfo fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetTypeInfo.class, fi, IXMLDSOControlVtbl.GetTypeInfo$FUNC, session);
        }
        static GetTypeInfo ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, int __x2, java.lang.foreign.MemoryAddress __x3) -> {
                try {
                    return (int)IXMLDSOControlVtbl.GetTypeInfo$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2, (java.lang.foreign.Addressable)__x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetTypeInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetTypeInfo"));
    public static VarHandle GetTypeInfo$VH() {
        return IXMLDSOControlVtbl.GetTypeInfo$VH;
    }
    public static MemoryAddress GetTypeInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IXMLDSOControlVtbl.GetTypeInfo$VH.get(seg);
    }
    public static void GetTypeInfo$set( MemorySegment seg, MemoryAddress x) {
        IXMLDSOControlVtbl.GetTypeInfo$VH.set(seg, x);
    }
    public static MemoryAddress GetTypeInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IXMLDSOControlVtbl.GetTypeInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetTypeInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        IXMLDSOControlVtbl.GetTypeInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetTypeInfo GetTypeInfo (MemorySegment segment, MemorySession session) {
        return GetTypeInfo.ofAddress(GetTypeInfo$get(segment), session);
    }
    static final FunctionDescriptor GetIDsOfNames$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetIDsOfNames$MH = RuntimeHelper.downcallHandle(
        IXMLDSOControlVtbl.GetIDsOfNames$FUNC
    );
    public interface GetIDsOfNames {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, int _x3, int _x4, java.lang.foreign.MemoryAddress _x5);
        static MemorySegment allocate(GetIDsOfNames fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetIDsOfNames.class, fi, IXMLDSOControlVtbl.GetIDsOfNames$FUNC, session);
        }
        static GetIDsOfNames ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, int __x3, int __x4, java.lang.foreign.MemoryAddress __x5) -> {
                try {
                    return (int)IXMLDSOControlVtbl.GetIDsOfNames$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, __x3, __x4, (java.lang.foreign.Addressable)__x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetIDsOfNames$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetIDsOfNames"));
    public static VarHandle GetIDsOfNames$VH() {
        return IXMLDSOControlVtbl.GetIDsOfNames$VH;
    }
    public static MemoryAddress GetIDsOfNames$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IXMLDSOControlVtbl.GetIDsOfNames$VH.get(seg);
    }
    public static void GetIDsOfNames$set( MemorySegment seg, MemoryAddress x) {
        IXMLDSOControlVtbl.GetIDsOfNames$VH.set(seg, x);
    }
    public static MemoryAddress GetIDsOfNames$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IXMLDSOControlVtbl.GetIDsOfNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetIDsOfNames$set(MemorySegment seg, long index, MemoryAddress x) {
        IXMLDSOControlVtbl.GetIDsOfNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetIDsOfNames GetIDsOfNames (MemorySegment segment, MemorySession session) {
        return GetIDsOfNames.ofAddress(GetIDsOfNames$get(segment), session);
    }
    static final FunctionDescriptor Invoke$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Invoke$MH = RuntimeHelper.downcallHandle(
        IXMLDSOControlVtbl.Invoke$FUNC
    );
    public interface Invoke {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, java.lang.foreign.MemoryAddress _x2, int _x3, short _x4, java.lang.foreign.MemoryAddress _x5, java.lang.foreign.MemoryAddress _x6, java.lang.foreign.MemoryAddress _x7, java.lang.foreign.MemoryAddress _x8);
        static MemorySegment allocate(Invoke fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Invoke.class, fi, IXMLDSOControlVtbl.Invoke$FUNC, session);
        }
        static Invoke ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, java.lang.foreign.MemoryAddress __x2, int __x3, short __x4, java.lang.foreign.MemoryAddress __x5, java.lang.foreign.MemoryAddress __x6, java.lang.foreign.MemoryAddress __x7, java.lang.foreign.MemoryAddress __x8) -> {
                try {
                    return (int)IXMLDSOControlVtbl.Invoke$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, (java.lang.foreign.Addressable)__x2, __x3, __x4, (java.lang.foreign.Addressable)__x5, (java.lang.foreign.Addressable)__x6, (java.lang.foreign.Addressable)__x7, (java.lang.foreign.Addressable)__x8);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Invoke$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Invoke"));
    public static VarHandle Invoke$VH() {
        return IXMLDSOControlVtbl.Invoke$VH;
    }
    public static MemoryAddress Invoke$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IXMLDSOControlVtbl.Invoke$VH.get(seg);
    }
    public static void Invoke$set( MemorySegment seg, MemoryAddress x) {
        IXMLDSOControlVtbl.Invoke$VH.set(seg, x);
    }
    public static MemoryAddress Invoke$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IXMLDSOControlVtbl.Invoke$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Invoke$set(MemorySegment seg, long index, MemoryAddress x) {
        IXMLDSOControlVtbl.Invoke$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Invoke Invoke (MemorySegment segment, MemorySession session) {
        return Invoke.ofAddress(Invoke$get(segment), session);
    }
    static final FunctionDescriptor get_XMLDocument$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_XMLDocument$MH = RuntimeHelper.downcallHandle(
        IXMLDSOControlVtbl.get_XMLDocument$FUNC
    );
    public interface get_XMLDocument {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(get_XMLDocument fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_XMLDocument.class, fi, IXMLDSOControlVtbl.get_XMLDocument$FUNC, session);
        }
        static get_XMLDocument ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IXMLDSOControlVtbl.get_XMLDocument$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_XMLDocument$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_XMLDocument"));
    public static VarHandle get_XMLDocument$VH() {
        return IXMLDSOControlVtbl.get_XMLDocument$VH;
    }
    public static MemoryAddress get_XMLDocument$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IXMLDSOControlVtbl.get_XMLDocument$VH.get(seg);
    }
    public static void get_XMLDocument$set( MemorySegment seg, MemoryAddress x) {
        IXMLDSOControlVtbl.get_XMLDocument$VH.set(seg, x);
    }
    public static MemoryAddress get_XMLDocument$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IXMLDSOControlVtbl.get_XMLDocument$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_XMLDocument$set(MemorySegment seg, long index, MemoryAddress x) {
        IXMLDSOControlVtbl.get_XMLDocument$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_XMLDocument get_XMLDocument (MemorySegment segment, MemorySession session) {
        return get_XMLDocument.ofAddress(get_XMLDocument$get(segment), session);
    }
    static final FunctionDescriptor put_XMLDocument$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle put_XMLDocument$MH = RuntimeHelper.downcallHandle(
        IXMLDSOControlVtbl.put_XMLDocument$FUNC
    );
    public interface put_XMLDocument {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(put_XMLDocument fi, MemorySession session) {
            return RuntimeHelper.upcallStub(put_XMLDocument.class, fi, IXMLDSOControlVtbl.put_XMLDocument$FUNC, session);
        }
        static put_XMLDocument ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IXMLDSOControlVtbl.put_XMLDocument$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle put_XMLDocument$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("put_XMLDocument"));
    public static VarHandle put_XMLDocument$VH() {
        return IXMLDSOControlVtbl.put_XMLDocument$VH;
    }
    public static MemoryAddress put_XMLDocument$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IXMLDSOControlVtbl.put_XMLDocument$VH.get(seg);
    }
    public static void put_XMLDocument$set( MemorySegment seg, MemoryAddress x) {
        IXMLDSOControlVtbl.put_XMLDocument$VH.set(seg, x);
    }
    public static MemoryAddress put_XMLDocument$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IXMLDSOControlVtbl.put_XMLDocument$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void put_XMLDocument$set(MemorySegment seg, long index, MemoryAddress x) {
        IXMLDSOControlVtbl.put_XMLDocument$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static put_XMLDocument put_XMLDocument (MemorySegment segment, MemorySession session) {
        return put_XMLDocument.ofAddress(put_XMLDocument$get(segment), session);
    }
    static final FunctionDescriptor get_JavaDSOCompatible$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_JavaDSOCompatible$MH = RuntimeHelper.downcallHandle(
        IXMLDSOControlVtbl.get_JavaDSOCompatible$FUNC
    );
    public interface get_JavaDSOCompatible {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(get_JavaDSOCompatible fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_JavaDSOCompatible.class, fi, IXMLDSOControlVtbl.get_JavaDSOCompatible$FUNC, session);
        }
        static get_JavaDSOCompatible ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IXMLDSOControlVtbl.get_JavaDSOCompatible$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_JavaDSOCompatible$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_JavaDSOCompatible"));
    public static VarHandle get_JavaDSOCompatible$VH() {
        return IXMLDSOControlVtbl.get_JavaDSOCompatible$VH;
    }
    public static MemoryAddress get_JavaDSOCompatible$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IXMLDSOControlVtbl.get_JavaDSOCompatible$VH.get(seg);
    }
    public static void get_JavaDSOCompatible$set( MemorySegment seg, MemoryAddress x) {
        IXMLDSOControlVtbl.get_JavaDSOCompatible$VH.set(seg, x);
    }
    public static MemoryAddress get_JavaDSOCompatible$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IXMLDSOControlVtbl.get_JavaDSOCompatible$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_JavaDSOCompatible$set(MemorySegment seg, long index, MemoryAddress x) {
        IXMLDSOControlVtbl.get_JavaDSOCompatible$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_JavaDSOCompatible get_JavaDSOCompatible (MemorySegment segment, MemorySession session) {
        return get_JavaDSOCompatible.ofAddress(get_JavaDSOCompatible$get(segment), session);
    }
    static final FunctionDescriptor put_JavaDSOCompatible$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle put_JavaDSOCompatible$MH = RuntimeHelper.downcallHandle(
        IXMLDSOControlVtbl.put_JavaDSOCompatible$FUNC
    );
    public interface put_JavaDSOCompatible {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1);
        static MemorySegment allocate(put_JavaDSOCompatible fi, MemorySession session) {
            return RuntimeHelper.upcallStub(put_JavaDSOCompatible.class, fi, IXMLDSOControlVtbl.put_JavaDSOCompatible$FUNC, session);
        }
        static put_JavaDSOCompatible ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1) -> {
                try {
                    return (int)IXMLDSOControlVtbl.put_JavaDSOCompatible$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle put_JavaDSOCompatible$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("put_JavaDSOCompatible"));
    public static VarHandle put_JavaDSOCompatible$VH() {
        return IXMLDSOControlVtbl.put_JavaDSOCompatible$VH;
    }
    public static MemoryAddress put_JavaDSOCompatible$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IXMLDSOControlVtbl.put_JavaDSOCompatible$VH.get(seg);
    }
    public static void put_JavaDSOCompatible$set( MemorySegment seg, MemoryAddress x) {
        IXMLDSOControlVtbl.put_JavaDSOCompatible$VH.set(seg, x);
    }
    public static MemoryAddress put_JavaDSOCompatible$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IXMLDSOControlVtbl.put_JavaDSOCompatible$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void put_JavaDSOCompatible$set(MemorySegment seg, long index, MemoryAddress x) {
        IXMLDSOControlVtbl.put_JavaDSOCompatible$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static put_JavaDSOCompatible put_JavaDSOCompatible (MemorySegment segment, MemorySession session) {
        return put_JavaDSOCompatible.ofAddress(put_JavaDSOCompatible$get(segment), session);
    }
    static final FunctionDescriptor get_readyState$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_readyState$MH = RuntimeHelper.downcallHandle(
        IXMLDSOControlVtbl.get_readyState$FUNC
    );
    public interface get_readyState {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(get_readyState fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_readyState.class, fi, IXMLDSOControlVtbl.get_readyState$FUNC, session);
        }
        static get_readyState ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IXMLDSOControlVtbl.get_readyState$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_readyState$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_readyState"));
    public static VarHandle get_readyState$VH() {
        return IXMLDSOControlVtbl.get_readyState$VH;
    }
    public static MemoryAddress get_readyState$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IXMLDSOControlVtbl.get_readyState$VH.get(seg);
    }
    public static void get_readyState$set( MemorySegment seg, MemoryAddress x) {
        IXMLDSOControlVtbl.get_readyState$VH.set(seg, x);
    }
    public static MemoryAddress get_readyState$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IXMLDSOControlVtbl.get_readyState$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_readyState$set(MemorySegment seg, long index, MemoryAddress x) {
        IXMLDSOControlVtbl.get_readyState$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_readyState get_readyState (MemorySegment segment, MemorySession session) {
        return get_readyState.ofAddress(get_readyState$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


