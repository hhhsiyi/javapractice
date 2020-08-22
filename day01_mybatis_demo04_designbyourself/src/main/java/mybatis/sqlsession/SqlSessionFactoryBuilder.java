package mybatis.sqlsession;

import mybatis.cfg.Configuration;
import mybatis.sqlsession.defaults.DefaultSqlSessionFactory;
import mybatis.utils.XMLConfigBuilder;

import java.io.InputStream;

public class SqlSessionFactoryBuilder {
    /**
     * 根据参数的字节输入流
     * @param config
     * @return
     */
    public SqlSessionFactory build(InputStream config)
    {
        Configuration cfg = XMLConfigBuilder.loadConfiguration(config);
        return new DefaultSqlSessionFactory(cfg);
    }
}
