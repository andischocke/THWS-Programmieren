package exercise11;

public class UnionId extends Identification
{
    //region Attributes
    private String union;
    //endregion

    public UnionId(String prename, String surname, String gender, String union)
    {
        super(prename, surname, gender);
        this.union = union;
    }

    //region Getter and Setter
    public String getUnion()
    {
        return union;
    }
    //endregion

    public void setUnion(String union)
    {
        this.union = union;
    }

    @Override
    public String toString()
    {
        return String.format("%s Union: %s", super.toString(), union);
    }
}