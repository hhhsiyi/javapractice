package mybatis.sqlsession.proxy;

import mybatis.cfg.Mapper;
import mybatis.utils.Executor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.util.Map;

public class MapperProxy implements InvocationHandler {
    private Map<String , Mapper>mappers;
    private Connection conn;
    public MapperProxy(Map<String ,Mapper>mappers,Connection conn)
    {
        this.mappers = mappers;
        this.conn = conn;
    }
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        String methodName = method.getName();
        String className = method.getDeclaringClass().getName();
        String key = className+".."+methodName;
        Mapper mapper = mappers.get(key);
        if(mapper==null)
        {
            throw new IllegalAccessException("传入的参数有问题");
        }

        return new Executor().selectList(mapper,conn);
    }
}
