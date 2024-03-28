package exercise10;

public class Lecture
{
    //region Attributes
    private String name;
    private String lecturer;
    private String program;
    //endregion

    public Lecture(String name, String lecturer, String program)
    {
        this.name = name;
        this.lecturer = lecturer;
        this.program = program;
    }

    //region Getter and Setter
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getLecturer()
    {
        return lecturer;
    }

    public void setLecturer(String lecturer)
    {
        this.lecturer = lecturer;
    }

    public String getProgram()
    {
        return program;
    }
    //endregion

    public void setProgram(String program)
    {
        this.program = program;
    }

    @Override
    public String toString()
    {
        return name;
    }
}