package org.fkit.factory;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class FKSqlSessionFactory
{

    private static SqlSessionFactory   qqlSessionFactory=null;


    static {
        try
        {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");

            qqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }



    public static SqlSession getSqlSession(){
        return qqlSessionFactory.openSession();
    }
    public static SqlSessionFactory getSqlSessionFactory(){
        return qqlSessionFactory;
    }
}
