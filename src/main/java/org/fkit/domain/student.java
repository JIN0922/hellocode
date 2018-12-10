package org.fkit.domain;

public class student
{
    private  Integer id;
    private  String name;
    private  String sex;
    private Integer age;
    private clazz  clazz;


    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    public org.fkit.domain.clazz getClazz()
    {
        return clazz;
    }

    public void setClazz(org.fkit.domain.clazz clazz)
    {
        this.clazz = clazz;
    }
}
