package exercise10;

public class Student
{
    //region Attributes
    private String name;
    //endregion

    //region Constructors
    public Student(String name)
    {
        this.name = name;
    }

    //region Getter and Setter
    public String getName()
    {
        return name;
    }
    //endregion

    public void setName(String name)
    {
        this.name = name;
    }
    //endregion
}