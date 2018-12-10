


import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.codehaus.jackson.map.util.JSONPObject;
import org.fkit.domain.Users_db;
import org.fkit.domain.student;
import org.fkit.factory.FKSqlSessionFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test
{

    public static void main(String[] args) throws IOException
    {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSession sqlSession = FKSqlSessionFactory.getSqlSession();

        List<student> studentResultMap = sqlSession.selectList("users_db.selectStudent");

        for(student stu:studentResultMap){
            System.out.println(JSONObject.toJSON(stu));
        }
    }
}
