package exercise11;

public class Identification
{
    //region Attributes
    private String prename;
    private String surname;
    private String gender;
    //endregion

    //region Constructors
    public Identification(String prename, String surname, String gender)
    {
        this.prename = prename;
        this.surname = surname;
        this.gender = gender;
    }

    //region Getter and Setter
    public String getPrename()
    {
        return prename;
    }

    public void setPrename(String prename)
    {
        this.prename = prename;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public String getGender()
    {
        return gender;
    }
    //endregion

    public void setGender(String gender)
    {
        this.gender = gender;
    }
    //endregion

    @Override
    public String toString()
    {
        return String.format("%s %s (%s)", prename, surname, gender);
    }
}