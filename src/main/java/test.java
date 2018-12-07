


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.fkit.domain.Users_db;

import java.io.IOException;
import java.io.InputStream;

public class test
{

    public static void main(String[] args) throws IOException
    {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory build =
                new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();

        Users_db users_db = new Users_db("admin",23,"男");

        sqlSession.insert("users_db.save",users_db);
        sqlSession.commit();
        sqlSession.close();


    }
}
